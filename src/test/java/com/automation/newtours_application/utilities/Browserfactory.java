package com.automation.newtours_application.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserfactory {
	
	public static WebDriver startApplication (WebDriver driver, String browserName, String appUrl) {
		
		if (browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else {
			System.out.println("We do not support this browser for this testing framework");
		}
		
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		}

	public static void quitBrowser (WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
