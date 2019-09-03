package com.datamato.pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.datamato.core.Driver;
import com.datamato.core.Driverhelper;
import com.datamato.helperclasses.ReadFromObjectPropertiesFile;

public class LoginPage extends Driverhelper{
	static WebDriver driver;
	
	@CacheLookup
	@FindBy(name = "j_username")
	WebElement username;
	
	@CacheLookup
	@FindBy(name = "j_password")
	WebElement password;
	
	@CacheLookup
	@FindBy(css=".form>button")
	WebElement loginButton;
	
	ReadFromObjectPropertiesFile r;
	
	public LoginPage() throws IOException {
		//Driver d = new Driver();
		driver = getDriver();
		
		PageFactory.initElements(driver,this);
		r = new ReadFromObjectPropertiesFile();
		
		driver.get(ReadFromObjectPropertiesFile.getURL());
	}
	
	public Dashboard Login() 
	{
		username.sendKeys(ReadFromObjectPropertiesFile.getUsername());
		password.sendKeys(ReadFromObjectPropertiesFile.getPassword());
		loginButton.click();
		return new Dashboard(driver);
	}
	
	 
}
