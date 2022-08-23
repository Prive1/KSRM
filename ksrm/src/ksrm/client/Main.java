package ksrm.client;

import java.io.File;

public class Main {

	public static void main(String[] args){
		XML_Filehandler test = new XML_Filehandler();
		File[] t1 = test.filter_Filelist(test.loade_filelist("../ksrm/Models"), ".xsd");
		for (File string : t1) {
			test.read_xml(string);
		}
//		Control c1 = new Control();
	}

}
 