package com.datamato.tests;

import org.testng.annotations.Test;

import com.datamato.core.Driverhelper;
import com.datamato.pages.Dashboard;
import com.datamato.pages.LoginPage;

import static org.testng.Assert.assertEquals;

import java.io.IOException;



public class DashbordTest extends Driverhelper {


	
	@Test
	public void Dashboard() throws IOException  {
		LoginPage l = new LoginPage();
		//Dashboard d = l.Login();

		//d.ClickOnAllProjectTab();
		//assertEquals(d.getHeading(),"All Projects");
	}


}
