package com.qainfotech.functional;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qainfotech.core.BaseTest;
import com.qainfotech.core.GenericMethods;

public class TatocGridGate extends BaseTest {

	GenericMethods gm = GenericMethods.getInstance();

	public void selectCellFromGrid(String cellColour) throws InterruptedException
	{
		List <WebElement> cellList = driver.findElements(By.xpath("//tr//td//div"));
		for(WebElement cell : cellList)
		{
			if(cell.getAttribute("Class").equalsIgnoreCase(cellColour))
			{
				cell.click();
				gm.holdOn(2);
				break;



			}
		}
	}}