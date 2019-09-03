package com.datamato.core;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {
	public static WebDriver driver;
	
	public static WebDriverWait wait;
	
	public Driver()
	{
		init();
	
	}
	
	public static void init()
	{
		File file = new File("resources//geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		
		
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 10);
		
	}
	
	
}
