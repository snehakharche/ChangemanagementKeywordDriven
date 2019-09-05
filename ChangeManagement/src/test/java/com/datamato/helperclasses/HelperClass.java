package com.datamato.helperclasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

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
	
	@DataProvider(name="login")
	public Object[][] dataProvider() throws IOException 
	{
		return getAllData("resources//Login credentials.xlsx","Sheet1");
	}
	
	private String[][] getAllData(String filepath,String sheetname) throws IOException 
	{
		
		File file = new File(filepath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook book = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = book.getSheet(sheetname);
		
		int rowcount = sheet.getLastRowNum();
		int cellcount = sheet.getRow(0).getLastCellNum();
		System.out.println("Cellcount"+cellcount);
		String array[][]=new String[rowcount][cellcount];
		for(int i=1;i<=rowcount;i++)
		{
			Row r = sheet.getRow(i);
			for(int j=0;j<=1;j++)
			{
				System.out.println("infor");
				Cell c = r.getCell(j);
				
				if (c.getCellType() == c.getCellType().STRING) {
					
				      array[i - 1][j] = c.getStringCellValue();
				} 
				else
				 {
					//set numeric value to string
					c.setCellType(CellType.STRING);
				    array[i - 1][j] =c.getStringCellValue();
				}
				
				
			}
			
		}
		
		
		return array;
		
	}
}
