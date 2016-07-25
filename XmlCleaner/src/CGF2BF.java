import javax.xml.parsers.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.xml.sax.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.w3c.dom.*;

public class CGF2BF {
	public static void main(String[] args) throws Exception {
		String xmlDirectory = "C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML";
		String archDirectory = "C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-Archived";
		
		//String xmlDirectory = "C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML";
		//String archDirectory = "C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-Archived";
		
		File oldDirectory = new File(xmlDirectory);
		xmlDirectory = oldDirectory.getAbsolutePath();
		delete(oldDirectory);

		File newFolderName = new File(archDirectory);
		archDirectory = newFolderName.getAbsolutePath();
		
		File newFolder = new File(xmlDirectory);
		newFolderName.renameTo(newFolder);

		ArrayList<String> methodList = new ArrayList<String>();

		File srcFolder = new File(xmlDirectory);
		File destFolder = new File(xmlDirectory.replace("-XML", "-Archived"));
		if (!destFolder.exists()) {
			copyFolder(srcFolder, destFolder);
		}
		ArrayList<String> fileNames = new ArrayList<String>();

		Files.walk(Paths.get(xmlDirectory)).forEach(filePath -> {
			if (Files.isRegularFile(filePath)) {
				fileNames.add(filePath.toString());
			}
		});

		for (String fileName : fileNames) {
			File file = new File(fileName);
			System.out.println("Working on: "+fileName);
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();

			db.setEntityResolver(new EntityResolver() {
				@Override
				public InputSource resolveEntity(String publicId,
						String systemId) throws SAXException, IOException {
					if (systemId.contains("GraphXML.dtd")) {
						return new InputSource(new StringReader(""));
					} else {
						return null;
					}
				}
			});

			Document doc = db.parse(file);

			DocumentBuilderFactory docFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			Document newDoc = docBuilder.newDocument();
			Element rootElement = newDoc.createElement("CFG");
			newDoc.appendChild(rootElement);

			NodeList nodeList = doc.getElementsByTagName("node");

			for (int temp = 0; temp < nodeList.getLength(); temp++) {
				Node nNode = nodeList.item(temp);
				//System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;

					Element node = newDoc.createElement("Node");
					rootElement.appendChild(node);

					Element name = newDoc.createElement("Name");
					name.appendChild(newDoc.createTextNode(eElement
							.getAttribute("name")));
					node.appendChild(name);

					Element line = newDoc.createElement("Line");
					line.appendChild(newDoc.createTextNode(eElement
							.getElementsByTagName("label").item(0)
							.getTextContent()));
					node.appendChild(line);

					//System.out.println("Name:" + eElement.getAttribute("name"));
					//System.out.println("Line:"
						//	+ eElement.getElementsByTagName("label").item(0)
							//		.getTextContent());
				}
			}

			NodeList edgeList = doc.getElementsByTagName("edge");

			for (int temp = 0; temp < edgeList.getLength(); temp++) {
				Node nNode = edgeList.item(temp);
				//System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;

					Element edge = newDoc.createElement("Edge");
					rootElement.appendChild(edge);

					Element source = newDoc.createElement("Source");
					source.appendChild(newDoc.createTextNode(eElement
							.getAttribute("source")));
					edge.appendChild(source);

					Element target = newDoc.createElement("Target");
					target.appendChild(newDoc.createTextNode(eElement
							.getAttribute("target")));
					edge.appendChild(target);

					Element boolValue = newDoc.createElement("Boolean");
					String value = eElement
							.getElementsByTagName("label").item(0)
							.getTextContent();
					if (value.contains("true"))
						value="false";
					else if (value.contains("false"))
						value="true";
					boolValue.appendChild(newDoc.createTextNode(value));
					edge.appendChild(boolValue);

					Element id = newDoc.createElement("ID");
					edge.appendChild(id);

					System.out.println("Source:"
							+ eElement.getAttribute("source"));
					System.out.println("Target:"
							+ eElement.getAttribute("target"));
					System.out.println("Boolean:"
							+ eElement.getElementsByTagName("label").item(0)
									.getTextContent());
				}
			}

			Element origin = newDoc.createElement("Origin");
			rootElement.appendChild(origin);
			String newName = fileName;
			String endName = fileName.substring(newName
					.lastIndexOf(File.separator));
			String constructorName = endName;
			String newFileName = endName.replace(
					endName.substring(1, endName.indexOf(".") + 1), "");
			String methodName = newFileName.substring(0,
					newFileName.indexOf(")") + 1);
			
			String className = file.getName();
			className = className.substring(0, className.indexOf("."));
			if (methodName.contains("init")) {
				methodName = constructorName.replace("V.src.graph", "");
				
			}
			
			methodName = methodName.replace("(C", "(;C");
			methodName = methodName.replace("(I", "(;I");
			methodName = expandPrimitive(methodName, ";I", ",I;");
			methodName = expandPrimitive(methodName, ";C", ",C;");						
			methodName = methodName.replace(";",",");
			methodName = methodName.replace(",)",")");
			methodName = methodName.replace("(L","(");

			String packageName = fileName.replace(xmlDirectory, "");
			packageName = packageName.substring(0, packageName.lastIndexOf(File.separator)+1);

			methodName = methodName.replace(".clinit(", "ClassInit(");
			methodName = methodName.replace(".init", "");
			
			methodList.add((packageName + className + methodName.replace(File.separator, ":")));

			newFileName = methodName.replace(".xml", "") + ".xml";
		
			newName = newName.replace(endName, newFileName);

			TransformerFactory transformerFactory = TransformerFactory
					.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource sourceDOM = new DOMSource(newDoc);
			StreamResult result = new StreamResult(new File(newName));
			transformer.transform(sourceDOM, result);
			if (!methodName.equalsIgnoreCase(constructorName)) {
				file.delete();
			}
		}
	}
	private static String expandPrimitive(String methodName, String expandString, String expandedString) 
	{
		String expandMethodName  = "";
		do
		{	if (expandMethodName!="") 
				methodName = expandMethodName;
			expandMethodName = methodName.replace(expandString, expandedString);
		} while (!(methodName.equals(expandMethodName)));
		methodName=expandMethodName;
		return methodName;
	}
	public static void copyFolder(File src, File dest) throws IOException {

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
}
