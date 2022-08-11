package ksrm.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;

public class XML_Filehandler {

	public File[] loade_filelist(String pfad){
		File f = new File(pfad);
		File[] result = f.listFiles();
		

		
		return result;
	}
	
	public File[] filter_Filelist(File[] filelist, String end) {

		int length = 0;
		String test = null;
		for (File file : filelist) {
			test = file.getName();
			if (test.endsWith(end)) {}
			else {
				length++;
			}
		}		
		File[] result = new File[length];
		int i = 0;
		for (File file : filelist) {
			test = file.getName();
			if (test.endsWith(end)) {}
			else {
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
		final String NAME = "name";
	    final String BUTTONNAME = "buttonname";
	    final String BUTTONNR = "buttonnr";
		List<Item> items = new ArrayList<Item>();
		try {
			XMLInputFactory inputFactory = XMLInputFactory.newInstance();
			InputStream in = new FileInputStream(file);
			XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
		}catch (FileNotFoundException | XMLStreamException e) {
			((Throwable) e).printStackTrace();
		}
	}
}
