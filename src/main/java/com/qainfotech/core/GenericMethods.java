package com.qainfotech.core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethods {


	public static GenericMethods baseObj;
	private WebElement element;
	public static WebDriver driver;
	
	public static void setDriver(WebDriver driver) {
		System.out.println("SetDriver Executed. ");
		GenericMethods.driver = driver;
	}
	public static WebDriver getDriver() {
		System.out.println("GetDriver Executed. ");
		return driver;
	}
	
	public static GenericMethods getInstance() {
		if (baseObj == null) {
			baseObj = new GenericMethods();
		}
		return baseObj;
	}


	
	public void click(By locatorName) {
		this.element = driver.findElement(locatorName);

		element.click();

	}

	public void setTextBoxValue(By locatorName, String text) {

		this.element = driver.findElement(locatorName);
		String textToInput = text;
		element.sendKeys(textToInput);

	}

	public void holdOn(int sec) throws InterruptedException {

		Thread.sleep(sec*1000);



	}

	public void quitDriver() {
		driver.quit();
		driver.close();

	}

}



