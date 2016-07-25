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



public class CoverageMiner 
{
	public static void main(String[] args) throws Exception 
	{
		ArrayList<String> results = new ArrayList<String>();
		ArrayList<String> resultIDs = new ArrayList<String>();
		
		//String xmlDirectory = "C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML";
		String xmlDirectory = "C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML";
		
		ArrayList<String> fileNames = new ArrayList<String>();

		Files.walk(Paths.get(xmlDirectory)).forEach(filePath -> {
			if (Files.isRegularFile(filePath)) {
				fileNames.add(filePath.toString());
			}
		});
		
		int edgesInFile = 0;
		int edgesTouchedFile = 0;
		
		int finalTotal = 0;
		int finalTouched = 0;
		
		for (String fileName : fileNames) 
		{
			if (fileName.endsWith("calls.txt") || fileName.endsWith("Results.txt")  )
				continue;
			File file = new File(fileName);
			
			results.add(fileName.replace(xmlDirectory, ""));
			resultIDs = new ArrayList<String>();
			
			edgesInFile = 0;
			edgesTouchedFile = 0;
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			
			NodeList nodeList = doc.getElementsByTagName("Edge");
			
			for (int i = 0; i < nodeList.getLength(); i++) 
			{		
				Node nNode = nodeList.item(i);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) 
				{
					Element eElement = (Element) nNode;
					
					edgesInFile++;
					
					Node aNode= eElement.getElementsByTagName("ID").item(0);
					Element eIDElement = (Element) aNode;

					if (aNode.getNodeType() == Node.ELEMENT_NODE)
					{
						NodeList nodeTestIDList = eIDElement.getElementsByTagName("Val");
						if (nodeTestIDList.getLength() >0)
							edgesTouchedFile++;
					}
				}
			}
			
				finalTotal+=edgesInFile;
				finalTouched+=edgesTouchedFile;
				double percent = ((double)edgesTouchedFile/(double)edgesInFile)*100;
				System.out.println(fileName.replace(xmlDirectory, ""));
				
				
				results.add("Edges touched:"+edgesTouchedFile+". Total edges in CFG: "+edgesInFile+". %"+percent);
				System.out.println("Edges Touched:"+edgesTouchedFile+". Total Edges in File: "+edgesInFile+". %"+percent);
			
		}
		FileWriter writer = new FileWriter(xmlDirectory + File.separator
				+ "Results.txt");
		for (String resultLine : results) {
			writer.write(resultLine + System.lineSeparator());
		}
		
		double finalPercent = ((double)finalTouched/(double)finalTotal)*100;
		writer.write("Total Covered: " + finalPercent +"%");
		System.out.println("Total Covered: " + finalPercent +"%");
		System.out.println("Total Edges Covered: " + finalTouched);
		System.out.println("Total Edges: " + finalTotal);
		writer.close();
	}
}
