package com.crm.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

import junit.framework.Assert;

public class HomePageTest extends TestBase {
	LoginPage loginIn;
	HomePage homepage;
	TestUtil testUtil;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		init();
		testUtil = new TestUtil();
		loginIn = new LoginPage();
		homepage = loginIn.login(prop.getProperty("userName"), prop.getProperty("passWord"));

	}

	@Test(priority = 1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homepage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "CRMPRO");

	}

	@Test(priority = 2)
	public void verifyUserNameTest() {
		testUtil.switchToFrame();
		Assert.assertTrue(homepage.verifyCorrectUserName());
	}

	@AfterMethod
	public void teadDown() {
		driver.quit();
	}

}
