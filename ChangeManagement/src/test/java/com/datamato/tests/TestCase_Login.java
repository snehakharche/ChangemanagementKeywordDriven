package com.datamato.tests;

import org.testng.annotations.Test;

import com.datamato.pages.LoginPage;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.annotations.AfterClass;

public class TestCase_Login {
	LoginPage l;
  @Test
  public void f() throws IOException {
	  
	  l = new LoginPage();
	  l.Login();
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
