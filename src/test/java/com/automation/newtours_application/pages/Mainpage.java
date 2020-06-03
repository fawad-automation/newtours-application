package com.automation.newtours_application.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mainpage {
	
	WebDriver driver;
	
	public Mainpage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy (xpath = "//a[contains(text(),'SIGN-ON')]") 
	WebElement signon;
	
	public void signon () {
	signon.click();
		
	}

}
