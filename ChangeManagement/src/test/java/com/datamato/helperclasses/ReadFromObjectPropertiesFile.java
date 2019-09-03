package com.datamato.helperclasses;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadFromObjectPropertiesFile {
	 static Properties p= new Properties();
	
	public ReadFromObjectPropertiesFile() throws IOException
	{
		getObjectRepo();
	}
	public  Properties getObjectRepo() throws IOException
	{
		File file = new File("resources\\object.properties");
		FileReader r = new FileReader(file.getAbsolutePath());
		//InputStream stream = new FileInputStream(new File(System.getProperty(System.getProperty("src\\object\\object.properties"))));
		p.load(r);
		
		return p;
	}
	public static String getUsername()
	{
		return p.getProperty("username");
	}
	
	public static String getPassword()
	{
		return p.getProperty("password");
	}
	public static String getURL()
	{
		return p.getProperty("loginUrl");
	}
	
	
}
