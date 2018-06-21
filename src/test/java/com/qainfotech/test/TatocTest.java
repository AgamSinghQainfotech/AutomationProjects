package com.qainfotech.test;

import java.io.IOException;
import java.util.List;

import org.apache.maven.model.Dependency;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.qainfotech.core.BaseTest;

import com.qainfotech.core.GenericMethods;
import com.qainfotech.functional.CookieHandling;
import com.qainfotech.functional.DragAround;
import com.qainfotech.functional.FrameDungeon;
import com.qainfotech.functional.PopupWindows;
import com.qainfotech.functional.TatocGridGate;
import com.qainfotech.functional.TatocHomepage;


public class TatocTest extends BaseTest{

	GenericMethods gm = new GenericMethods();
	FrameDungeon framDun = new FrameDungeon();
	TatocHomepage homepage = new TatocHomepage();
	TatocGridGate gridgate = new TatocGridGate();
	DragAround drgAround = new DragAround();
	PopupWindows popup = new PopupWindows();
	CookieHandling cookieObj = new CookieHandling();
	@Test(priority =1)
	public void TatocTestmethod() throws InterruptedException {

		homepage.selectCourse("Basic Course");
		gridgate.selectCellFromGrid("greenbox");
		framDun.paintToPRoceed();
		drgAround.dragAndDrop();
		popup.handlePopupwindow();
		cookieObj.cookieManage();

	}
}