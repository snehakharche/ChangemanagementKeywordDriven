package com.datamato.helperclasses;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class HelperClass {
	 static Properties p= new Properties();
	
	public static Properties getObjectRepository() throws IOException
	{
		File file = new File("resources\\object.properties");
		FileReader r = new FileReader(file.getAbsolutePath());
		//InputStream stream = new FileInputStream(new File(System.getProperty(System.getProperty("src\\object\\object.properties"))));
		p.load(r);
		
		return p;
	}
		
}
