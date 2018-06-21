package com.qainfotech.core;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class BaseTest {

 public static WebDriver driver;
	
 
 
 private GenericMethods baseObj = GenericMethods.getInstance();
 
 
	@BeforeTest
	public void beforeMethod() throws IOException {
	
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://10.0.1.86/tatoc");

	}

	@AfterTest
	public void afterMethod() throws Exception {

		driver.quit();

	}


}
