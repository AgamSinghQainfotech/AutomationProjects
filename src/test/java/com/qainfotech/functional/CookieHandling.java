package com.qainfotech.functional;

import org.apache.commons.exec.util.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

import com.qainfotech.core.BaseTest;
import com.qainfotech.core.GenericMethods;

public class CookieHandling extends BaseTest {
	By generateToken = By.xpath("//a[contains(text(), 'Generate Token')]");
	By tokenText = By.xpath("//span[@id='token']");
	By proceed = By.xpath("//a[contains(text(), 'Proceed')]");
	GenericMethods gm = GenericMethods.getInstance();
	public void cookieManage() throws InterruptedException
	{


		driver.findElement(generateToken).click();
		String tokenValue = driver.findElement(tokenText).getText();
		String splitToken[]= StringUtils.split(tokenValue, " ");

		Cookie name = new Cookie("Token", splitToken[1]);
		driver.manage().addCookie(name);
		gm.holdOn(2);
		driver.findElement(proceed).click();
		gm.holdOn(2);

	}



}
