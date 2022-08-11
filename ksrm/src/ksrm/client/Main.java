package ksrm.client;


public class Main {

	public static void main(String[] args){
		XML_Filehandler test = new XML_Filehandler();
		test.filter_Filelist(test.loade_filelist("../ksrm/Models"), ".xsd");
		
		Control c1 = new Control();
	}

}
 