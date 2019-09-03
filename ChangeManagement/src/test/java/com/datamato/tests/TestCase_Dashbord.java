package com.datamato.tests;

import org.testng.annotations.Test;

import com.datamato.pages.Dashboard;
import com.datamato.pages.LoginPage;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.annotations.AfterClass;

public class TestCase_Dashbord {
	LoginPage l ;
	Dashboard d;
  @Test
  public void f() throws IOException {
	  l = new LoginPage();
	  d = l.Login();
	  
	  d.ClickOnAllProjectTab();
	  
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
