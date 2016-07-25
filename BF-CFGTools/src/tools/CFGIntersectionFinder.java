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

public class CFGIntersectionFinder 
{
	private static String xmlDirectory;
	
	public static void main(String[] args) throws Exception 
	{
		HashMap<Integer, String> execPathsIDs = new HashMap<Integer,String>();
		
		xmlDirectory = "C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML";
		//xmlDirectory = "C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Test ID: ");
        String s = br.readLine();  
        Set<String> testIDs = new HashSet<String>(Arrays.asList(s.split(" "))); 
        
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
		
		ArrayList<String> intersectionList = new ArrayList<String> (Arrays.asList(execPathsIDs.get(stringIPs.get(0)).split(";")));
		Set<String> duplicateLessList = new HashSet<String>(intersectionList);
		intersectionList.clear();
		intersectionList.addAll(duplicateLessList);
		
		for (Integer step: stringIPs)
		{
			System.out.println(intersectionList.size());
			ArrayList<String> pathIDs = new ArrayList<String> (Arrays.asList(execPathsIDs.get(step).split(";")));
			
			intersectionList = intersection(intersectionList, pathIDs);
		}
		//System.out.println(intersectionList.size());
		for (String line : intersectionList)
			System.out.println(line);		
	}
	
	public static ArrayList<String> intersection(ArrayList<String> list1, ArrayList<String> list2) {
		ArrayList<String> list = new ArrayList<String>();

        for (String e : list1) {
            if(list2.contains(e)) {
                list.add(e);
            }
        }

        return list;
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
			
			Element originNode = (Element) doc.getElementsByTagName("Origin").item(0);
			NodeList originNodeList = originNode.getElementsByTagName("Val");
			
			populateOrigin(execPathsIDs, testIDs, fileName, originNodeList);
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
				String newLine = splitOverTest[0]  + "->" + fileName.replace(xmlDirectory, "");
				
				if (testIDs.contains(splitOverTest[1]))
				{
					if (execPathsIDs.get(Integer.valueOf(splitOverTest[1])) !=null)
						execPathsIDs.put(Integer.valueOf(splitOverTest[1]), execPathsIDs.get(Integer.valueOf(splitOverTest[1]))+";"+newLine);
					else
						execPathsIDs.put(Integer.valueOf(splitOverTest[1]), newLine);
				}
			}
		}
	}
}
