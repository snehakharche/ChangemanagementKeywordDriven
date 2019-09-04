package com.datamato.core;

import java.io.File;

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
	
		
	public static void init()
	{
		File file = new File("resources//geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		
		
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 10);
		
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
	@BeforeMethod
	public void beforeTest()
	{
		System.out.println("-----------Starting Test-----------");
	}
	
	@AfterMethod
	public void afterTest()
	{
		System.out.println("-----------Stopping Test-----------");
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
