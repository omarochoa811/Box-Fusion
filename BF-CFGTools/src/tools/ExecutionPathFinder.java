package tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ExecutionPathFinder 
{
	private static String xmlDirectory;
	
	public static void main(String[] args) throws Exception 
	{
		HashMap<Integer, String> execPathsIDs = new HashMap<Integer,String>();
		
		//xmlDirectory = "C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML";
		xmlDirectory = "C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Test ID: ");
        String s = br.readLine();  
        Set<String> testIDs = new HashSet<String>(Arrays.asList(s.split(" "))); 
        if (testIDs.size()>1)
		{
        	System.out.println("Too many Test IDs.");
        	return;
		}
		File oldDirectory = new File(xmlDirectory);
		xmlDirectory = oldDirectory.getAbsolutePath();

		ArrayList<String> fileNames = new ArrayList<String>();

		Files.walk(Paths.get(xmlDirectory)).forEach(filePath -> {
			if (Files.isRegularFile(filePath)) {
				fileNames.add(filePath.toString());
			}
		});
		
		getAllPathsForTest(execPathsIDs, fileNames, testIDs);
		ArrayList<Integer> stringIPs = new ArrayList<Integer>();
		stringIPs.addAll(execPathsIDs.keySet());
		
		if (testIDs.size()<2)
		{
			for (Integer step: stringIPs)
			{
				System.out.println("Step "+step+" "+ execPathsIDs.get(step));
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

	private static void getAllPathsForTest(HashMap<Integer, String> execPathsIDs, ArrayList<String> fileNames, Set<String> testIDs)
			throws ParserConfigurationException, SAXException, IOException {
		for (String fileName : fileNames) 
		{
			if (fileName.endsWith("calls.txt") || fileName.endsWith("Results.txt")  )
				continue;
			File file = new File(fileName);
			
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			
			NodeList edgeList = doc.getElementsByTagName("Edge");
			NodeList nodeList = doc.getElementsByTagName("Node");
			
			populateEdges(execPathsIDs, testIDs, file, edgeList, nodeList);
			
			Element originNode = (Element) doc.getElementsByTagName("Origin").item(0);
			NodeList originNodeList = originNode.getElementsByTagName("Val");
			
			populateOrigin(execPathsIDs, testIDs, fileName.replace(xmlDirectory, ""), originNodeList);
		}
	}

	private static void populateOrigin(HashMap<Integer, String> execPathsIDs, Set<String> testIDs, String fileName,
			NodeList originNodeList) {
		for (int k = 0; k < originNodeList.getLength(); k++) 
		{		
			Node oNode = originNodeList.item(k);
			if (oNode.getNodeType() == Node.ELEMENT_NODE) 
			{ 
				Element eElement = (Element) oNode;
				String[] splitGlobal = eElement.getTextContent().split("@");
				String[] splitOverTest = splitGlobal[0].split(":");
				String newLine = splitOverTest[0]  + "->" + fileName;
				
				if (testIDs.contains(splitOverTest[1]))
				{
					execPathsIDs.put(Integer.valueOf(splitGlobal[1]), newLine);
				}
			}
		}
	}

	private static void populateEdges(HashMap<Integer, String> execPathsIDs, Set<String> testIDs, File file,
			NodeList edgeList, NodeList nodeList) {
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
							if (testIDs.contains(valuePair[0]))
							{ 
								String ins = file.getName().replace(xmlDirectory, "")+" Line:" + lineSource + " -> Line:" + lineTarget;
								
								execPathsIDs.put(Integer.valueOf(valuePair[1]), ins);
							}	
						}
					}
				}
			}
		}
	}
}
