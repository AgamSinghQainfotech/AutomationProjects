package com.qainfotech.functional;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.qainfotech.core.BaseTest;
import com.qainfotech.core.GenericMethods;



public class BingTranslator extends BaseTest 
{
	GenericMethods gm = GenericMethods.getInstance();
	By inputLang = By.xpath("//select[@id='t_sl']");
	By inputarea = By.xpath("//textarea[@id='t_sv']");
	By outlang = By.xpath("//select[@id='t_tl']");
	By output = By.xpath("//div[@id='t_ttv']");
	public void bingTranslate(String inputLanguage, String input, String outputLang) throws InterruptedException  {


		Select inputlang = new Select(driver.findElement(inputLang));
		inputlang.selectByVisibleText(inputLanguage);
		driver.findElement(inputarea).sendKeys(input);
		System.out.println("Input was :" + input);

		Select outLang = new Select(driver.findElement(outlang));
		outLang.selectByVisibleText(outputLang);
		gm.holdOn(2);
		String outputText =  driver.findElement(output).getText();
		System.out.println("Output is " +outputText );
		assertEquals(outputText, "hello ap kaise hain");


	}






}