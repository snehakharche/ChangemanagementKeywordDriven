package com.datamato.tests;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.datamato.core.Driverhelper;
import com.datamato.helperclasses.HelperClass;
import com.datamato.pages.LoginPage;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;


public class LoginPageTest extends Driverhelper{

	
	@Test(dataProvider="login",dataProviderClass=HelperClass.class)
	public void getLogin(String Username,String Password) throws IOException {

		LoginPage l = new LoginPage();
		l.Login(Username,Password);
		assertEquals(l.getUser(), "Sneha");
	}
	
	
/*	@DataProvider(name="login")
	public Object[][] dataProvider() throws IOException 
	{
		return getAllData("resources//Login credentials.xlsx","Sheet1");
	}
	
	
	private String[][] getAllData(String filepath,String sheetname) throws IOException 
	{
		
		File file = new File(filepath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook book = new XSSFWorkbook(fis);

		XSSFCell cell1;
		XSSFCell cell2;
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
		
	}*/


}
