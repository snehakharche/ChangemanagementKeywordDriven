package com.datamato.core;

import org.openqa.selenium.WebDriver;

public class Driverhelper extends Driver{
	static WebDriver driver;
	
	public Driverhelper() {
		super();
		driver = Driver.driver;
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
}
