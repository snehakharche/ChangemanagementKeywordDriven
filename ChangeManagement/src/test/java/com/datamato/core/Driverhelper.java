package com.datamato.core;

import org.openqa.selenium.WebDriver;


public class Driverhelper extends Driver{
	protected WebDriver driver;
	
	public Driverhelper() {
		
		this.driver = super.driver;
	}
	
}
