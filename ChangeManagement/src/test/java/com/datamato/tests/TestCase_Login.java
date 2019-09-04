package com.datamato.tests;

import org.testng.annotations.Test;

import com.datamato.core.Driverhelper;
import com.datamato.pages.LoginPage;

import java.io.IOException;


public class TestCase_Login extends Driverhelper{
	
  @Test
  public void f() throws IOException {
	  
	  LoginPage l = new LoginPage();
	  l.Login();
  }
  
}
