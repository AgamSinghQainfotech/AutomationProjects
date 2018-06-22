package com.qainfotech.test;


import org.testng.annotations.Test;

import com.qainfotech.core.BaseTest;

import com.qainfotech.core.GenericMethods;
import com.qainfotech.functional.BingTranslator;



public class BingTranslatorTest extends BaseTest{

	GenericMethods gm = new GenericMethods();
	BingTranslator bngObj = new BingTranslator();
	
	
	@Test(priority =1)
	public void TatocTestmethod() throws InterruptedException {

		bngObj.bingTranslate("English", "Hey how are you", "Hindi");
		

	}
}