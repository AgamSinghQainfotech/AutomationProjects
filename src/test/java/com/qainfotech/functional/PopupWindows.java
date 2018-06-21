package com.qainfotech.functional;

import java.util.Set;

import org.openqa.selenium.By;

import com.qainfotech.core.BaseTest;
import com.qainfotech.core.GenericMethods;

public class PopupWindows extends BaseTest {


	GenericMethods gm = GenericMethods.getInstance();

	By proceed = By.xpath("//a[contains(text() ,'Proceed')]");
	By launchPopuwindow =  By.xpath("//a[contains(text(), 'Launch Popup Window')]");
	By name = By.cssSelector("#name");
	By submit = By.cssSelector("#submit");
	public void handlePopupwindow() throws InterruptedException

	{

		driver.findElement(launchPopuwindow).click();
		
		for (String handle : driver.getWindowHandles()) {
		    driver.switchTo().window(handle);
		}
		
		gm.holdOn(2);
		
		driver.findElement(name).sendKeys("Agam");
		driver.findElement(submit).click();
		
		gm.holdOn(2);
		
		for (String handle : driver.getWindowHandles()) {
		    driver.switchTo().window(handle);
		}
		
		//driver.switchTo().defaultContent();
		driver.findElement(proceed).click();
		
		gm.holdOn(2);
		
		/*gm.holdOn(10);
		Set<String> availableWindows = driver.getWindowHandles();
		if (!availableWindows.isEmpty()) {
			for (String windowId : availableWindows) {
				if (driver.switchTo().window(windowId).getTitle().equals("Popup - Basic Course - T.A.T.O.C")) {
					driver.findElement(name).sendKeys("Agam");
					driver.findElement(submit).click();
					gm.holdOn(2);
				} else {

				}}

			driver.switchTo().defaultContent();
			driver.findElement(proceed).click();
			gm.holdOn(2);
		}*/


		/*	gm.holdOn(2);
		driver.findElement(submit).click();*/

	}
}