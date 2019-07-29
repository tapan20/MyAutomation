package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory - OR
	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;

	@FindBy(xpath = "//button[contains(text(),'Sign Up']")
	WebElement signUpBtn;

	@FindBy(xpath = "//img[contains(@class, 'img-responsive')]")
	WebElement crmLogo;

	// Initializing PageObjects
	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	// Action
	public String validateLoginPageTitle() {
		return driver.getTitle();

	}

	public boolean validateCrmImage() {
		return crmLogo.isDisplayed();
	}

	public HomePage login(String un, String pass) throws InterruptedException {
		username.sendKeys(un);
		password.sendKeys(pass);
		Thread.sleep(2000);
		loginBtn.click();

		return new HomePage();

	}

}
