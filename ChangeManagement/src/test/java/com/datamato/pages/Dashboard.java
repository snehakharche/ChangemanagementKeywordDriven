package com.datamato.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	static WebDriver driver;
	
	
	public Dashboard(WebDriver d){
		driver = d;
		
		PageFactory.initElements(driver,this);
		
	}
	
	public void ClickOnAllProjectTab()
	{
		driver.findElement(By.xpath("//div[@class='title'][contains(text(),'All Other Projects')]")).click();
	}
}
