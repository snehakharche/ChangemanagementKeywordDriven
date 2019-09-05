package com.datamato.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	static WebDriver driver;
	
	@CacheLookup
	@FindBy(xpath="//div[@class='title'][contains(text(),'All Other Projects')]")
	WebElement allProjectTab;
	
	@CacheLookup
	@FindBy(xpath="//h1")
	WebElement heading;
	
	public Dashboard(WebDriver d){
		driver = d;
		
		PageFactory.initElements(driver,this);
		
	}
	
	public void ClickOnAllProjectTab()
	{
		allProjectTab.click();
	}
	public String getHeading()
	{
		String title = heading.getText();
		System.out.println("Title: "+title);
		return title;
	}
}
