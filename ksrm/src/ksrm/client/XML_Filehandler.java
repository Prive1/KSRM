package ksrm.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XML_Filehandler {

	public File[] loade_filelist(String pfad) {
		File f = new File(pfad);
		File[] result = f.listFiles();

		return result;
	}

	public File[] filter_Filelist(File[] filelist, String end) {

		int length = 0;
		String test = null;
		for (File file : filelist) {
			test = file.getName();
			if (test.endsWith(end)) {
			} else {
				length++;
			}
		}
		File[] result = new File[length];
		int i = 0;
		for (File file : filelist) {
			test = file.getName();
			if (test.endsWith(end)) {
			} else {
				result[i] = file;
				i++;
			}
		}
		for (File j : result) {
			System.out.println(j.getName());
		}
		return result;
	}

	public void read_xml(File file) {
//		final String NAME = "name";
//	    final String BUTTONNAME = "buttonname";
//	    final String BUTTONNR = "buttonnr";
//		List<Item> items = new ArrayList<Item>();
//		try {
//			XMLInputFactory inputFactory = XMLInputFactory.newInstance();
//			InputStream in = new FileInputStream(file);
//			XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
//		}catch (FileNotFoundException | XMLStreamException e) {
//			((Throwable) e).printStackTrace();
//		}

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

		try {
			dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();

			System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
			System.out.println("------");
			NodeList list = doc.getElementsByTagName("staff");
			for (int temp = 0; temp < list.getLength(); temp++) {

				Node node = list.item(temp);

				if (node.getNodeType() == Node.ELEMENT_NODE) {

					Element element = (Element) node;

					// get staff's attribute
					String id = element.getAttribute("id");

					// get text
	                  String firstname = element.getElementsByTagName("firstname").item(0).getTextContent();
	                  String lastname = element.getElementsByTagName("lastname").item(0).getTextContent();
	                  String nickname = element.getElementsByTagName("nickname").item(0).getTextContent();

					NodeList salaryNodeList = element.getElementsByTagName("salary");
					String salary = salaryNodeList.item(0).getTextContent();

					// get salary's attribute
					String currency = salaryNodeList.item(0).getAttributes().getNamedItem("currency").getTextContent();

					System.out.println("Current Element :" + node.getNodeName());
					System.out.println("Staff Id : " + id);
					System.out.println("First Name : " + firstname);
					System.out.println("Last Name : " + lastname);
					System.out.println("Nick Name : " + nickname);
					System.out.printf("Salary [Currency] : %,.2f [%s]%n%n", Float.parseFloat(salary), currency);

				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
