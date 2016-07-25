package tools;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class RegressionFinder 
{
	public static void main(String[] args) throws Exception 
	{
		ArrayList<String> resultIDs = new ArrayList<String>();
		ArrayList<String> potentialFiles = new ArrayList<String>();
		
		//String xmlDirectory = "C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML";
		String xmlDirectory = "C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML";
		
		File oldDirectory = new File(xmlDirectory);
		xmlDirectory = oldDirectory.getAbsolutePath();

		ArrayList<String> fileNames = new ArrayList<String>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("CFG: ");
        String cfgName = br.readLine().trim().toUpperCase();
        
		Files.walk(Paths.get(xmlDirectory)).forEach(filePath -> {
			if (Files.isRegularFile(filePath)) {
				fileNames.add(filePath.toString());
			}
		});
		
		
		for (String fileName : fileNames) 
		{
			if (fileName.endsWith("calls.txt") || fileName.endsWith("Results.txt")  )
				continue;
			if (fileName.toUpperCase().contains(cfgName))
				potentialFiles.add(fileName);
		}
		if (potentialFiles.isEmpty())
		{
			System.out.println("File not found.");
			return;
		}
		String fileName = null;
		if (potentialFiles.size()>1)
		{
			int i=0;
			System.out.println("Select specific file:");
			for (String aName : potentialFiles)
			{
				
				System.out.println("Option:"+i+" "+aName);
				i++;
			}
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.print("Enter option: ");
			String fileIndex = br.readLine();
			fileName = potentialFiles.get(Integer.valueOf(fileIndex));
			System.out.println("Selected: "+fileName);
		}
		if (fileName==null)
		{
			System.out.println("File not found.");
			return;
		}
		System.out.print("Enter line number: ");
		String lineNumber = br.readLine().trim();
		
		
		findTests(resultIDs, fileName, lineNumber);
		
		for (String tests : resultIDs)
		{
			System.out.println("Retest :"+tests);
		}
	}

	private static void findTests(ArrayList<String> resultIDs, String fileName, String lineNumber)
			throws ParserConfigurationException, SAXException, IOException {
		File file = new File(fileName);
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
					for (int j=0; j<nodeTestIDList.getLength(); j++)
					{	
						Node idValNode = nodeTestIDList.item(j);
						if (idValNode.getNodeType() == Node.ELEMENT_NODE && idValNode.hasChildNodes())
						{
							String valuePair[] = idValNode.getTextContent().split("@");
							if (lineSource.equals(lineNumber))
							{
								if (!resultIDs.contains(valuePair[0]))
									resultIDs.add(valuePair[0]);
							}
						}
					}
				}
			}
		}
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
