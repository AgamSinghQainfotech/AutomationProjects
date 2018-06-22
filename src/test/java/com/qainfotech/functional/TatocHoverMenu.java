package com.qainfotech.functional;


import org.openqa.selenium.By;

import org.openqa.selenium.interactions.Actions;

import com.qainfotech.core.BaseTest;
import com.qainfotech.core.GenericMethods;



public class TatocHoverMenu extends BaseTest{

	GenericMethods gm = GenericMethods.getInstance();
	By next2element = By.xpath("");
	By advanceoption = By.xpath("//a[text() = 'Advanced Course']");
	By goNext = By.xpath("//span[text() ='Go Next']");

	
	public void selectGoNext() throws InterruptedException  {

		driver.findElement(advanceoption).click();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Menu 2']"))).build().perform();
		gm.holdOn(2);
		driver.findElement(goNext).click();




	}

}