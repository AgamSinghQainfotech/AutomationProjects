package com.qainfotech.functional;

import org.openqa.selenium.By;
import com.qainfotech.core.BaseTest;
import com.qainfotech.core.GenericMethods;

public class FrameDungeon extends BaseTest {

	GenericMethods gm = GenericMethods.getInstance();
	static String colourOfFirstBox;
	String colourOfSecondBox ;

	By repaint = By.xpath(".//*[contains(text(),'Repaint')]");
	By box = By.xpath("//div[@id='answer']");
	By proceed = By.xpath("//a[@href='#'][2]");
	
	public void paintToPRoceed() throws InterruptedException
	{


		driver.switchTo().frame("main");
		colourOfFirstBox = driver.findElement(box).getAttribute("class");
		colourOfSecondBox =	colourOfSecondBox();
		if(!colourOfFirstBox.equalsIgnoreCase(colourOfSecondBox))
		{


			do {


				driver.switchTo().parentFrame();
				driver.findElement(repaint).click();
				gm.holdOn(1);
			}
			while (!colourOfFirstBox.equalsIgnoreCase(colourOfSecondBox()));

		}
		else 	{	
			
			driver.switchTo().parentFrame();
			driver.findElement(proceed).click();
			gm.holdOn(2);
		}
		driver.switchTo().parentFrame();
		driver.findElement(proceed).click();
		gm.holdOn(2);
	}
	
	public String colourOfSecondBox()

	{	driver.switchTo().frame("child");
	colourOfSecondBox = driver.findElement(box).getAttribute("class");



	return colourOfSecondBox;
	}
}
