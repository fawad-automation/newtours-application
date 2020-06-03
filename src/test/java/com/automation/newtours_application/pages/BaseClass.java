package com.automation.newtours_application.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.automation.newtours_application.utilities.Browserfactory;

public class BaseClass {
	
	public WebDriver driver; 
	
	@BeforeClass
	public void setup () {
		driver = Browserfactory.startApplication(driver, "Chrome", "http://newtours.demoaut.com/");
	}
	
	@AfterClass
	public void teardown () throws InterruptedException {
		
		Browserfactory.quitBrowser(driver);
		
	}
	

}
