package com.qainfotech.functional;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qainfotech.core.BaseTest;
import com.qainfotech.core.GenericMethods;



public class TatocHomepage extends BaseTest{

	GenericMethods gm = GenericMethods.getInstance();


	public void selectCourse(String courseLevel) throws InterruptedException  {
		List <WebElement> courseList = driver.findElements(By.xpath("//div[@class='page']//a"));
		for(WebElement w : courseList)
		{
			if(w.getText().equalsIgnoreCase(courseLevel))
			{
				w.click();
				gm.holdOn(2);
				break;
			}
		}}}

