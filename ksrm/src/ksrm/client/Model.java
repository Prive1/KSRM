package ksrm.client;

import java.io.File;

public class Model {

	XML_Filehandler xml_filehandler;
	
	public Model() {
		xml_filehandler = new XML_Filehandler();
		File[] filelist = xml_filehandler.filter_Filelist(xml_filehandler.loade_filelist("../ksrm/Models"), ".xsd");
		for (File file : filelist) {
			xml_filehandler.read_xml(file.getAbsoluteFile());
		}
	}
}
