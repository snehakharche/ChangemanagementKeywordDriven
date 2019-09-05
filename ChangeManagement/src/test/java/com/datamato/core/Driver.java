package com.datamato.core;

import java.io.File;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Driver {
	public static WebDriver driver;
	
	private static WebDriverWait wait;
	
		
	private void init()
	{
		
		File file = new File("resources//geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		
		
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 10);
		
	}
	
	/*public WebDriver getDriver()
	{
		return this.driver;
	}*/
	
	@BeforeMethod
	public void beforeTest(Method method)
	{
		System.out.println("-----------Starting Test - "+method.getName()+"-----------");
	}
	
	@AfterMethod
	public void afterTest(Method method)
	{
		System.out.println("-----------Stopping Test - "+method.getName()+"-----------");
	}
	
	@BeforeSuite
	public void setUp()
	{
		init();
	}
	
	
	@AfterSuite
	public void postSuiteActions()
	{
		driver.quit();
	}
}
