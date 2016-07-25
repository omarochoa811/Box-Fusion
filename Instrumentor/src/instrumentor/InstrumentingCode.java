package instrumentor;

import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class InstrumentingCode {
	public static String testID;
	private static String markString="";
	private static String originString="";
	public static String teamFolder;
	public static String calls="";
	private static String previousLine="";
	private static Integer globalCounter=0;
	private static Stack lineStack = new Stack();
	
	private static File getFile(String fileLocation, String fileName) 
	{
		File folder = new File(fileLocation);
		File[] matchingFiles = folder.listFiles(new FilenameFilter()
			{
			    public boolean accept(File dir, String name) 
			    {
			        return name.startsWith(fileName) && name.endsWith("xml");
			    }
			}
		);
		
		File file = null;
		if (matchingFiles.length < 2)
		{
			file = matchingFiles[0];
		}
		return file;
	}
	
	private static String getNodeName(NodeList nodeList, String line) 
	{
		String nodeName="";
		for (int i = 0; i < nodeList.getLength(); i++) 
		{
			Node nNode = nodeList.item(i);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) 
			{
				Element eElement = (Element) nNode;
				String lineNumber = eElement.getElementsByTagName("Line").item(0).getTextContent();
				nodeName = eElement.getElementsByTagName("Name").item(0).getTextContent();			
				
				if (line.equalsIgnoreCase(lineNumber))
				{
					break;
				}
			}
		}
		return nodeName;
	}
	
	private static Document geDoc(File file) {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = null;
		try {
			db = dbf.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Document doc = null;
		try {
			doc = db.parse(file);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return doc;
	}
	
	private static void markEdge(String fileLocation, String fileName, String fromLine, String toLine, int count)
	{	
		String[] splitLine = toLine.split(":");
		String newToLine = splitLine[0];
		
		File file = getFile(fileLocation, fileName);
		Document doc = geDoc(file);
		NodeList nodeList = doc.getElementsByTagName("Node");
		
		String fromSource = getNodeName(nodeList, fromLine);	
		String toTarget = getNodeName(nodeList, newToLine);
		
		nodeList = doc.getElementsByTagName("Edge");
		
		for (int i = 0; i < nodeList.getLength(); i++) 
		{
			Node nNode = nodeList.item(i);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) 
			{
				Element eElement = (Element) nNode;
				String nodeSource = eElement.getElementsByTagName("Source").item(0).getTextContent();
				String nodeTarget = eElement.getElementsByTagName("Target").item(0).getTextContent();
				if ((nodeSource.equalsIgnoreCase(fromSource)) && (nodeTarget.equalsIgnoreCase(toTarget)))
				{
					NodeList edgeNodes = nNode.getChildNodes();
					
					Element idElement = (Element) edgeNodes.item(3);
					
					for (int c = 0; c<count; c++)
					{
						Element value = doc.createElement("Val");
						value.appendChild(doc.createTextNode(testID+"@"+splitLine[1]));
						idElement.appendChild(value);					
					}
					break;
				}			
			}
		}
		writeCFG(file, doc);
	}
	private static void writeCFG(File file, Document doc) throws TransformerFactoryConfigurationError {
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = null;
		try {
			transformer = transformerFactory.newTransformer();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DOMSource sourceDOM = new DOMSource(doc);
		StreamResult result = new StreamResult(new File(file.getPath()));
		try {
			transformer.transform(sourceDOM, result);
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	public static void saveToFiles()
	{
		String[] markStringLines = markString.split(";");
		markString = "";

		List<String> stringLines = Arrays.asList(markStringLines);
	
		while (!stringLines.isEmpty())
		{
			String line = stringLines.get(0);
			int count = Collections.frequency(stringLines, line);
			String[] parameters = stringLines.get(0).split("#");
			
			markEdge(parameters[0],parameters[1],parameters[2],parameters[3],count);
			
			stringLines = stringLines.stream()
				    .filter(p -> !p.equals(line)).collect(Collectors.toList());
		}
		
		String[] originStringLines = originString.split(";");
		originString = "";

		List<String> originLines = Arrays.asList(originStringLines);
	
		while (!originLines.isEmpty() && originLines.get(0)!="")
		{
			String line = originLines.get(0);
			int count = Collections.frequency(originLines, line);
			String[] parameters = line.split("#");
			if (!line.contains("null") && !line.contains("<init>"))
			{

				File cfgFile = findCFG(parameters[0], parameters[1], parameters[2]);
				setOrigin(cfgFile, parameters[3]+"."+parameters[4]+":"+parameters[5]+"@"+parameters[6], count);
			}
							
			originLines = originLines.stream()
				    .filter(p -> !p.equals(line)).collect(Collectors.toList());
		}
		try 
		{
			File file = new File(teamFolder+"\\calls.txt");
			FileWriter fileWriter = new FileWriter(file,true);
			fileWriter.write("------------------------------"+testID+"------------------------------"+System.lineSeparator());
			fileWriter.write(calls);
			fileWriter.flush();
			fileWriter.close();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		calls="";
		globalCounter = 0;
		lineStack = new Stack();
	}
	public static void mark(String fileLocation, String fileName, String fromLine, String toLine)
	{		
			
		if (fromLine.equals(previousLine) || (fromLine.equals("START")))
		{
			markString+=fileLocation+"#"+fileName+"#"+fromLine+"#"+toLine+":"+globalCounter+";";
			calls+=testID+":"+fileName+"#"+fromLine+"#"+toLine+"@"+globalCounter+System.lineSeparator();
		}
		else
		{
			markString+=fileLocation+"#"+fileName+"#"+previousLine+"#"+toLine+":"+globalCounter+";";
			calls+=testID+":"+fileName+"#"+previousLine+"#"+toLine+"@"+globalCounter+System.lineSeparator();
		}
		previousLine = toLine;
		
		if (toLine.equals("EXIT") && !lineStack.isEmpty())
			previousLine = lineStack.pop().toString();
		
			
		globalCounter++;
	}
	
	public static void markOrigin(String calleeClass, String calleeMethod, String callerClass, String callerMethod, String testID)
	{
		originString+=teamFolder+"#"+calleeClass+"#"+calleeMethod+"#"+callerClass+"#"+callerMethod+"#"+testID+"#"+globalCounter + ";";
		calls+=testID+":"+callerClass+"."+callerMethod+"->"+calleeClass+"."+calleeMethod+"@"+globalCounter+System.lineSeparator();
		globalCounter++;
	}
	private static File findCFG(String fileLocation, String className, String methodName) 
	{
		ArrayList<String> fileNames = new ArrayList<String>();
		try {
			fileNames = getFileNames(fileLocation);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		File cfgFile = null;
		for(String fileString : fileNames)
		{
			if (fileString.contains(className) && fileString.contains(methodName))
			{
				cfgFile = new File(fileString);
				break;
			}
		}	
		return cfgFile;		
	}

	private static ArrayList<String> getFileNames(String directory) throws IOException 
	{
		ArrayList<String> fileNames = new ArrayList<String>();
		Files.walk(Paths.get(directory)).forEach(filePath -> 
			{
				if (Files.isRegularFile(filePath)) 
				{
					fileNames.add(filePath.toString());
				}
			}
		);
		return fileNames;
	}
	
	private static void setOrigin(File CFG, String from, int count)
	{
		Document doc = geDoc(CFG);
		NodeList originNodeList = doc.getElementsByTagName("Origin");
		
		for (int i = 0; i < originNodeList.getLength(); i++) 
		{
			Node nNode = originNodeList.item(i);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) 
			{
				for (int c = 0; c<count; c++)
				{
					Element origin = (Element) nNode;		
					Element value = doc.createElement("Val");
					value.appendChild(doc.createTextNode(from));
					origin.appendChild(value);			
				}
				break;
			}
		}
		writeCFG(CFG, doc);
	}
	
	public static void saveOrigin()
	{
		String callerClass = Thread.currentThread().getStackTrace()[3].getClassName(); 
		callerClass = callerClass.substring(callerClass.lastIndexOf(".")+1); 
		String callerMethod = Thread.currentThread().getStackTrace()[3].getMethodName(); 
		
		String calleeClass = Thread.currentThread().getStackTrace()[2].getClassName(); 
		calleeClass = calleeClass.substring(calleeClass.lastIndexOf(".")+1); 
		String calleeMethod = Thread.currentThread().getStackTrace()[2].getMethodName(); 
		lineStack.push(previousLine);
		markOrigin(calleeClass, calleeMethod, callerClass, callerMethod, testID);
	}
}
