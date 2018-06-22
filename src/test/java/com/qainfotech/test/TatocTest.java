package com.qainfotech.test;


import org.testng.annotations.Test;
import com.qainfotech.core.BaseTest;
import com.qainfotech.core.GenericMethods;
import com.qainfotech.functional.TatocHoverMenu;


public class TatocTest extends BaseTest{

	GenericMethods gm = new GenericMethods();



	TatocHoverMenu hovermenuObj = new TatocHoverMenu();
	@Test(priority =1)
	public void TatocAdvance() throws InterruptedException {

		hovermenuObj.selectGoNext();
		gm.holdOn(10);

	}
}