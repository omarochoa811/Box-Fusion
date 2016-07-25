package tools;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class VerificationGapMiner 
{
	public static void main(String[] args) throws Exception 
	{
		ArrayList<String> results = new ArrayList<String>();
		ArrayList<String> resultIDs = new ArrayList<String>();
		
		String xmlDirectory = "C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML";
		//String xmlDirectory = "C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML";
		
		File oldDirectory = new File(xmlDirectory);
		xmlDirectory = oldDirectory.getAbsolutePath();

		ArrayList<String> fileNames = new ArrayList<String>();

		Files.walk(Paths.get(xmlDirectory)).forEach(filePath -> {
			if (Files.isRegularFile(filePath)) {
				fileNames.add(filePath.toString());
			}
		});
		

		
		for (String fileName : fileNames) 
		{
			if (fileName.endsWith("calls.txt") || fileName.endsWith("Results.txt")  )
				continue;
			File file = new File(fileName);
			
			results.add(fileName);
			resultIDs = new ArrayList<String>();
			
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			
			NodeList edgeList = doc.getElementsByTagName("Edge");
			NodeList nodeList = doc.getElementsByTagName("Node");
			
			for (int i = 0; i < edgeList.getLength(); i++) 
			{		
				Node nNode = edgeList.item(i);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) 
				{
					Element eElement = (Element) nNode;
					
					String nodeSource = eElement.getElementsByTagName("Source").item(0).getTextContent();
					String nodeTarget = eElement.getElementsByTagName("Target").item(0).getTextContent();
					
					String lineSource = getNodeLineNumber(nodeList, nodeSource);
					String lineTarget = getNodeLineNumber(nodeList, nodeTarget);
					
					Node aNode= eElement.getElementsByTagName("ID").item(0);
					Element eIDElement = (Element) aNode;

					if (aNode.getNodeType() == Node.ELEMENT_NODE)
					{
						NodeList nodeTestIDList = eIDElement.getElementsByTagName("Val");
						if (nodeTestIDList.getLength() == 0)
						{
							System.out.println(fileName.replace(xmlDirectory, "")+" GAP @ " + lineSource + " -> " + lineTarget );
						}
					}
				}
			}
		}
		/*
		FileWriter writer = new FileWriter(xmlDirectory + File.separator
				+ "Results.txt");
		for (String resultLine : results) {
			writer.write(resultLine + System.lineSeparator());
		}
		
		double finalPercent = ((double)finalTouched/(double)finalTotal)*100;
		writer.write("Total Covered: " + finalPercent +"%");
		writer.close();
		*/
	}
	
	private static String getNodeLineNumber(NodeList nodeList, String nodeID) 
	{
		String lineNumber="";
		for (int i = 0; i < nodeList.getLength(); i++) 
		{
			Node nNode = nodeList.item(i);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) 
			{
				Element eElement = (Element) nNode;
				lineNumber = eElement.getElementsByTagName("Line").item(0).getTextContent();
				String nodeName = eElement.getElementsByTagName("Name").item(0).getTextContent();			
				
				if (nodeID.equalsIgnoreCase(nodeName))
				{
					break;
				}
			}
		}
		return lineNumber;
	}
}
