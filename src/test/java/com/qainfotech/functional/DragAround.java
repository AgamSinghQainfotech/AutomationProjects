package com.qainfotech.functional;





import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.qainfotech.core.BaseTest;
import com.qainfotech.core.GenericMethods;

public class DragAround extends BaseTest {
	GenericMethods gm = GenericMethods.getInstance();

	By fromElement = By.xpath("//div[@class='page']//div[@id='dragbox']");
	By toElement = By.xpath("//div[@class='page']//div[@id='dropbox']");
	By proceed = By.xpath("//a[contains(text() , \"Proceed\")]");

	public void dragAndDrop() throws InterruptedException
	{
		Actions builder = new Actions(driver);

		Action dragAndDrop = builder.clickAndHold(driver.findElement(fromElement)).moveToElement(driver.findElement(toElement)).release(driver.findElement(toElement)).build();

		dragAndDrop.perform();
		driver.findElement(proceed).click();


	}
}