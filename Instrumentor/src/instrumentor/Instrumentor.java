package instrumentor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import org.xml.sax.SAXException;

public class Instrumentor 
{
	private String teamFolder;
	public String getTeamFolder() 
	{
		return teamFolder;
	}
	public void setTeamFolder(String teamFolder) 
	{
		this.teamFolder = teamFolder;
	}
	
	private String teamXMLFolder;
	public String getTeamXMLFolder() 
	{
		return teamXMLFolder;
	}
	public void setTeamXMLFolder(String teamXMLFolder) 
	{
		this.teamXMLFolder = teamXMLFolder;
	}
	
	private File getFile(String fileLocation, String fileName) 
	{
		File folder = new File(fileLocation);
		File[] matchingFiles = folder.listFiles(new FilenameFilter()
			{
			    public boolean accept(File dir, String name) 
			    {
			        return name.startsWith(fileName);
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
	private ArrayList<String> getFileNames(String directory) throws IOException 
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
			 
	private String getNodeValue(String tagName, NodeList nodes ) {
	    for ( int x = 0; x < nodes.getLength(); x++ ) {
	        Node node = nodes.item(x);
	        if (node.getNodeName().equalsIgnoreCase(tagName)) {
	            NodeList childNodes = node.getChildNodes();
	            for (int y = 0; y < childNodes.getLength(); y++ ) {
	                Node data = childNodes.item(y);
	                if ( data.getNodeType() == Node.TEXT_NODE )
	                    return data.getNodeValue();
	            }
	        }
	    }
	    return "";
	}
	 
	private HashMap<String, String> buildNodeMap(Document doc) 
	{
		HashMap<String, String> nodeMap = new HashMap<String, String>();		
		NodeList nodes = doc.getElementsByTagName("Node");
		for (int i=0; i<nodes.getLength(); i++)
	    {
	    	Node aNode = nodes.item(i);
	    	NodeList children = aNode.getChildNodes();
	    	String Name = getNodeValue("Name", children);
	    	String Line = getNodeValue("Line", children);
	    	nodeMap.put(Name, Line);
	    }
		return nodeMap;
	}

	private Document getDoc(File cfgFile) {
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
			doc = db.parse(cfgFile);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return doc;
	}
	private ArrayList<String> generateInstrumentationList(Document doc) {
		ArrayList<String> edgeList = new ArrayList<String>();
	    HashMap<String, String> nodeMap = buildNodeMap(doc);   
	    NodeList edges = doc.getElementsByTagName("Edge");
	    for (int i=0; i<edges.getLength(); i++)
	    {
	    	Node anEdge = edges.item(i);
	    	NodeList edgeChildren = anEdge.getChildNodes();
	    	String edgeSource = getNodeValue("Source", edgeChildren);
	    	String edgeTarget = getNodeValue("Target", edgeChildren);
	    	String edgeBoolean = getNodeValue("Boolean", edgeChildren);
	    	
	    	String lineSource = nodeMap.get(edgeSource);
	    	String lineTarget = nodeMap.get(edgeTarget);
	    	
	    	edgeList.add(lineSource+","+lineTarget+","+edgeBoolean);
	    }
		return edgeList;
	}
	
	private void copyFolder(File src, File dest) throws IOException {

		if (src.isDirectory()) {

			// if directory not exists, create it
			if (!dest.exists()) {
				dest.mkdir();
				System.out.println("Directory copied from " + src + "  to "
						+ dest);
			}

			// list all the directory contents
			String files[] = src.list();

			for (String file : files) {
				// construct the src and dest file structure
				File srcFile = new File(src, file);
				File destFile = new File(dest, file);
				// recursive copy
				copyFolder(srcFile, destFile);
			}

		} else {
			// if file, then copy it
			// Use bytes stream to support all file types
			InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dest);

			byte[] buffer = new byte[1024];

			int length;
			// copy the file content in bytes
			while ((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
			}

			in.close();
			out.close();
			System.out.println("File copied from " + src + " to " + dest);
		}
	}

	private void archiveTeamCode() throws IOException 
	{
		delete(new File(getTeamFolder()));
		File codeDir = new File(getTeamFolder()+"-OriginalCode");
		File newCodeDir = new File(getTeamFolder());
		copyFolder(codeDir, newCodeDir);
	}
	
	public static void delete(File file) throws IOException {

		if (file.isDirectory()) {

			// directory is empty, then delete it
			if (file.list().length == 0) {

				file.delete();
				System.out.println("Directory is deleted : "
						+ file.getAbsolutePath());

			} else {

				// list all the directory contents
				String files[] = file.list();

				for (String temp : files) {
					// construct the file structure
					File fileDelete = new File(file, temp);

					// recursive delete
					delete(fileDelete);
				}

				// check the directory again, if empty then delete it
				if (file.list().length == 0) {
					file.delete();
					System.out.println("Directory is deleted : "
							+ file.getAbsolutePath());
				}
			}

		} else {
			// if file, then delete it
			file.delete();
			System.out.println("File is deleted : " + file.getAbsolutePath());
		}
	}
	
	private ArrayList<String> readFileToArray(File file) {
		ArrayList<String> input = new ArrayList<String>();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String text = null;
			while ((text = reader.readLine()) != null) {
				input.add(text);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
			}
		}
		return input;
	}
	
	
	private String getFileName(String file) {
		String name;
		name = file.substring(file.lastIndexOf(System.getProperty("file.separator"))+1);
		return name;
	}
	
	private String getDirectory(String file) {
		String name = getFileName(file);
		String dir = file;
		dir = dir.replace(name, "");
		return dir;
	}
	
	private HashMap<String, String> createMark(String fromLine, String toLine, ArrayList<String> code, HashMap<String, String> newCode, String fileName)
	{	
		String insertCode ="";

		insertCode = "InstrumentingCode.mark(\""+getDirectory(fileName)+"\",\""+getFileName(fileName)+"\",\""+fromLine+"\",\""+toLine+"\");";		
		insertCode=insertCode.replace(System.getProperty("file.separator"), System.getProperty("file.separator")+System.getProperty("file.separator"));
		
		newCode.put(toLine, insertCode);
		
		return newCode;
	}
	
	private HashMap<String, String> createExitMark(String fromLine, String toLine, ArrayList<String> code, HashMap<String, String> newCode, String fileName)
	{	
		String insertCode ="";

		insertCode = "InstrumentingCode.mark(\""+getDirectory(fileName)+"\",\""+getFileName(fileName)+"\",\""+fromLine+"\",\""+toLine+"\");";		
		insertCode=insertCode.replace(System.getProperty("file.separator"), System.getProperty("file.separator")+System.getProperty("file.separator"));
		
		newCode.put(fromLine, insertCode);
		
		return newCode;
	}

	private HashMap<String, String> createStartMark(String fromLine, String toLine, ArrayList<String> code, HashMap<String, String> newCode, String fileName)
	{	
		String insertCode ="";
		
		insertCode = "InstrumentingCode.mark(\""+getDirectory(fileName)+"\",\""+getFileName(fileName)+"\",\""+fromLine+"\",\""+toLine+"\");";		
		insertCode=insertCode.replace(System.getProperty("file.separator"), System.getProperty("file.separator")+System.getProperty("file.separator"));
		
		newCode.put(toLine, insertCode);
		
		return newCode;
	}
	
	
	public void saveFile(File codeFile, ArrayList<String> code)
	{
		FileWriter writer = null;
		try {
			writer = new FileWriter(codeFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(String line : code)
		{
			try {
				writer.write(line + System.lineSeparator());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void createInstrumentation(ArrayList<String> edgeList, File codeFile, File cfgFile) {
		ArrayList<String> codeLines = readFileToArray(codeFile);
		
		HashMap<String, String> newCodeLines = new HashMap<String, String>();
		for (String edge : edgeList)
		{
			String[] edgeValues = edge.split(",");
			if (!edgeValues[0].contains("START") && !edgeValues[0].contains("EXIT") )
				newCodeLines = createMark(edgeValues[0], edgeValues[1], codeLines, newCodeLines, cfgFile.getAbsolutePath());	
		}
		ArrayList<String> newCode = new ArrayList<String>();
		newCode = instrumentEdgesToFile(codeLines, newCodeLines);
		saveFile(codeFile, newCode);
	}
	private String getJavaName(String fileName)
	{
		String name=getDirectory(fileName);
		name = name.substring(0, name.length()-1);
		name = getFileName(name);
		return name;
	}
	public static void main(String[] args) throws Exception
	{
		Instrumentor instrumentor = new Instrumentor();
		instrumentor.setTeamXMLFolder("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML");
		instrumentor.setTeamFolder("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\T2");
		
		//instrumentor.setTeamXMLFolder("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		//instrumentor.setTeamFolder("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\SimpleLTLGenerator");
		
		instrumentor.archiveTeamCode();
		
		ArrayList<String> allCFGs=instrumentor.getFileNames(instrumentor.getTeamXMLFolder());
		ArrayList<String> allFiles = instrumentor.getFileNames(instrumentor.getTeamFolder());
		allFiles =(ArrayList<String>) allFiles.stream().filter(p -> p.endsWith("java")).collect(Collectors.toList());
		
		iterateAllCFGs(instrumentor, allCFGs, allFiles);
	}
	private static void iterateAllCFGs(Instrumentor instrumentor, ArrayList<String> allCFGs,
			ArrayList<String> allFiles) {
		for (String cfgName : allCFGs)
		{
			if (cfgName.contains("ClassInit().xml"))
				continue;
			File cfgFile = instrumentor.getFile(instrumentor.getDirectory(cfgName), instrumentor.getFileName(cfgName));
			Document doc = instrumentor.getDoc(cfgFile);
		    ArrayList<String> edgeList = instrumentor.generateInstrumentationList(doc);
		
		    String javaName = instrumentor.getJavaName(cfgName)+".java";
		    for (String file : allFiles)
		    {
		    	if (file.contains(javaName))
		    	{
			    	File codeFile = instrumentor.getFile(instrumentor.getDirectory(file), instrumentor.getFileName(file));
			    	
			    	instrumentor.createExitInstrumentation(edgeList, codeFile, cfgFile);	
			    	instrumentor.createInstrumentation(edgeList, codeFile, cfgFile);
			    	instrumentor.createOriginInstrumentation(codeFile, cfgFile);
			    	instrumentor.createStartingInstrumentation(edgeList, codeFile, cfgFile);
			    }
		    }
		}
	}

	private void createOriginInstrumentation(File codeFile, File cfgFile) {
		ArrayList<String> codeLines = readFileToArray(codeFile);
		String methodToFind = cfgFile.getName();
		methodToFind = " "+methodToFind.substring(0, methodToFind.lastIndexOf("("));

		HashMap<String, String> newCodeLines = new HashMap<String, String>();
		for (String Line : codeLines)
		{
			if (Line.contains(methodToFind) && !(Line.endsWith(";")) && !(Line.endsWith("}")) && !(Line.contains(" class ")))
			{
				int n = codeLines.indexOf(Line);
				
				while (!codeLines.get(n).contains("{"))
					n++;
				if (codeLines.get(n+1).trim().startsWith("super"))
					n++;
				
				String lineN = String.valueOf(n+1);
				newCodeLines.put(lineN, "InstrumentingCode.saveOrigin();");
			}
		}
		
		ArrayList<String> newCode = new ArrayList<String>();
		newCode = instrumentOriginToFile(codeLines, newCodeLines);
		saveFile(codeFile, newCode);
	}
	private void createStartingInstrumentation(ArrayList<String> edgeList, File codeFile, File cfgFile) {
		ArrayList<String> codeLines = readFileToArray(codeFile);
		
		HashMap<String, String> newStartLines = new HashMap<String, String>();
		for (String edge : edgeList)
		{
			String[] edgeValues = edge.split(",");
			if (edgeValues[0].contains("START"))
			{				
				newStartLines = createStartMark(edgeValues[0], edgeValues[1], codeLines, newStartLines, cfgFile.getAbsolutePath());
				break;
			}
		}
		ArrayList<String> newCode = new ArrayList<String>();
		newCode = instrumentStartEdgesToFile(codeLines, newStartLines);
		saveFile(codeFile, newCode);
	}
	private void createExitInstrumentation(ArrayList<String> edgeList, File codeFile, File cfgFile) {
		ArrayList<String> codeLines = readFileToArray(codeFile);
		
		HashMap<String, String> newExitLines = new HashMap<String, String>();
		for (String edge : edgeList)
		{
			String[] edgeValues = edge.split(",");
			if (edgeValues[1].contains("EXIT"))
			{				
				newExitLines = createExitMark(edgeValues[0], edgeValues[1], codeLines, newExitLines, cfgFile.getAbsolutePath());
			}
		}
		ArrayList<String> newCode = new ArrayList<String>();
		newCode = instrumentExitEdgesToFile(codeLines, newExitLines);
		saveFile(codeFile, newCode);
	}
	
	private ArrayList<String> instrumentOriginToFile(ArrayList<String> code, HashMap<String, String> newCode)
	{
		ArrayList<String> newFile = new ArrayList<String>();
		
		Integer lineCounter = 0;
		for (String line : code)
		{				
			lineCounter++;
			if (newCode.get(lineCounter.toString())!=null)
			{				
				if (!line.contains("InstrumentingCode.saveOrigin();"))
				{
					line = line.replace("{", "{"+newCode.get(lineCounter.toString()));
				}
			}
			
			newFile.add(line);
		}
		return newFile;
	}
	private ArrayList<String> instrumentEdgesToFile(ArrayList<String> code, HashMap<String, String> newCode)
	{
		ArrayList<String> newFile = new ArrayList<String>();

		Integer lineCounter = 0;
		
		for (String line : code)
		{			
			lineCounter++;
			if (newCode.get(lineCounter.toString())!=null)
			{				
				if (!line.trim().contains("class ") && !line.contains("protected "))
				{
					if (line.trim().startsWith("{") )
						line = line + newCode.get(lineCounter.toString());
					else
						line = newCode.get(lineCounter.toString()) + line;
				}
			}
			newFile.add(line);
		}
		return newFile;
	}
	private ArrayList<String> instrumentStartEdgesToFile(ArrayList<String> code, HashMap<String, String> newCode)
	{
		ArrayList<String> newFile = new ArrayList<String>();
		
		Integer lineCounter = 0;
		
		for (String line : code)
		{				
			lineCounter++;
			if (newCode.get(lineCounter.toString())!=null)
			{	
				if (!line.contains("class ") )
					line =  line + newCode.get(lineCounter.toString());
			}
			newFile.add(line);
		}
		return newFile;
	}
	private ArrayList<String> instrumentExitEdgesToFile(ArrayList<String> code, HashMap<String, String> newCode)
	{
		ArrayList<String> newFile = new ArrayList<String>();
		
		Integer lineCounter = 0;
		
		for (String line : code)
		{				
			lineCounter++;
			if (newCode.get(lineCounter.toString())!=null && !line.contains("class "))
			{				
				line = newCode.get(lineCounter.toString()) + line;
			}
			if (line.contains("package") && !line.contains("import instrumentor.InstrumentingCode;"))
				line+=" import instrumentor.InstrumentingCode;";
			if (line.contains("main(String[] args)") && (!line.contains("public static void setFiles(String testID, String teamFolder)")) && !(line.trim().startsWith("//")))
				line="public static void setFiles(String testID, String teamFolder) {	InstrumentingCode.testID = testID;	InstrumentingCode.teamFolder = teamFolder; 	}" +
						"public static void saveFiles() {	InstrumentingCode.saveToFiles();}"+ line;
			newFile.add(line);
		}
		return newFile;
	}
}
