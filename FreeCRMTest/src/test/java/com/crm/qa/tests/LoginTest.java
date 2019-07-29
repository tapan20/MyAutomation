package com.crm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginTest extends TestBase {
	LoginPage loginIn;
	HomePage homePage;

	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		init();
		loginIn = new LoginPage();
	}

	@Test
	public void loginPageTitleTest() {
		String title = loginIn.validateLoginPageTitle();
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");

	}

	@Test
	public void crmImageTest() {
		boolean flag = loginIn.validateCrmImage();
		Assert.assertTrue(flag);
	}

	@Test
	public void loginTest() throws InterruptedException {
		homePage = loginIn.login(prop.getProperty("userName"), prop.getProperty("passWord"));
	}

	// jowo de mane
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
