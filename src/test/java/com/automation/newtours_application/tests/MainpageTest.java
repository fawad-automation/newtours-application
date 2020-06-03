package com.automation.newtours_application.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automation.newtours_application.pages.BaseClass;
import com.automation.newtours_application.pages.Mainpage;

public class MainpageTest extends BaseClass {
	
	@Test
	public void logintest() {
		
		Mainpage mainpage = PageFactory.initElements(driver, Mainpage.class);
		mainpage.signon();
	}
	
	

}
