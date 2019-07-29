package Freewire.freewire;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;

public class Login extends Base implements Locator {

	@Test(priority = 1)
	public void TC8() throws InterruptedException {
		// String pass = "Test Cases Completed";
		// click on sign up button

		// zoya.20@yopmail.com
		// Zoya.20
		// 5949494946
		Thread.sleep(2500);
		MobileElement signUp = driver.findElement(By.xpath(Locator.signUp));
		signUp.click();
		Thread.sleep(2500);
		// Enter First and Last name
		MobileElement firstLast = driver.findElement(By.xpath(Locator.firstLast));
		firstLast.clear();
		firstLast.sendKeys("Zoya & Patel");
		Thread.sleep(2500);

		// Click on next
		MobileElement next = driver.findElement(By.xpath(Locator.next));
		next.click();
		// Enter email address
		MobileElement emailAddr = driver.findElement(By.xpath(Locator.emailAddr));
		emailAddr.clear();
		emailAddr.sendKeys("zoya.20@yopmail.com");
		Thread.sleep(2500);

		next.click();
		// Enter password
		MobileElement passwordSignup = driver.findElement(By.xpath(Locator.passwordSignup));
		passwordSignup.clear();
		passwordSignup.sendKeys("Simform.123");
		Thread.sleep(2500);

		next.click();
		// Enter Lincense Plate No
		MobileElement lincensePlateNo = driver.findElement(By.xpath(Locator.lincensePlateNo));
		lincensePlateNo.clear();
		lincensePlateNo.sendKeys("Test Lincense 123");
		Thread.sleep(2500);

		next.click();
		// Enter Vehicle Model
		MobileElement vehicleModel = driver.findElement(By.xpath(Locator.vehicleModel));
		vehicleModel.clear();
		vehicleModel.sendKeys("Test Model GTA 5");
		Thread.sleep(2500);

		next.click();
		Thread.sleep(2500);

		// select default color and click on next

		MobileElement color = driver.findElement(By.xpath(Locator.colorSelect));
		color.click();
		next.click();

		// // Set profile picture
		// MobileElement selectImage =
		// driver.findElement(By.xpath(Locator.selectImage));
		// selectImage.click();
		//
		// Thread.sleep(2500);
		//
		// // Select library / camera
		// MobileElement library =
		// driver.findElement(By.xpath(Locator.library));
		// library.click();
		// Thread.sleep(4500);
		//
		// // Select from moments
		// MobileElement moments =
		// driver.findElement(By.xpath(Locator.moments));
		// moments.click();
		// Thread.sleep(2500);
		// // Select image
		// MobileElement image = driver.findElement(By.xpath(Locator.image));
		// image.click();
		//
		// // CLick on choose
		// MobileElement choose = driver.findElement(By.xpath(Locator.choose));
		// choose.click();

		next.click();
		Thread.sleep(2500);

		// Enter a usrname
		MobileElement user = driver.findElement(By.xpath(Locator.userNames));
		user.clear();
		user.sendKeys("Zoya.20");
		Thread.sleep(2500);
 
		next.click();

		// Select Network
		// MobileElement network =
		// driver.findElement(By.xpath(Locator.network));
		// network.sendKeys("FreeWire Test 1");
		// Thread.sleep(2500);
		// next.click();

		MobileElement networkPicker = driver.findElement(By.xpath(Locator.networkPicker));
		List<MobileElement> Columns = networkPicker.findElements(By.xpath(Locator.networkPicker));
		Columns.get(1).sendKeys("FreeWire Test 1");
		next.click();

		// Enter Mobile Number
		MobileElement mobile = driver.findElement(By.xpath(Locator.mobileNos));
		mobile.clear();
		mobile.sendKeys("9898980000");
		next.click();
		Thread.sleep(2500);

		String userName = "//XCUIElementTypeStaticText[@name='Enter a Username']";
		if (Locator.userNames.contains(userName)) {
			System.out.println("Duplicate Username");
		}

		// return pass;

	}

	// Driver Login
	// @Test(priority = 5)
	// public void login() throws Exception {
	//
	// Thread.sleep(2500);
	// driver.findElement(By.xpath(Locator.login)).click();
	//
	// Thread.sleep(2500);
	//
	// // enter username
	// MobileElement userName =
	// driver.findElement(By.xpath(Locator.username));
	// userName.click();
	// userName.clear();
	// userName.sendKeys("zoya.19");
	//
	// Thread.sleep(2500);
	// // click on next
	// driver.findElement(By.xpath(Locator.nxtUsername)).click();
	//
	// Thread.sleep(2500);
	// // enter password
	// MobileElement password =
	// driver.findElement(By.xpath(Locator.password));
	// password.click();
	// password.clear();
	// password.sendKeys("Simform.123");
	//
	// Thread.sleep(2500);
	// // click on next
	// driver.findElement(By.xpath(Locator.nxtPassword)).click();
	//
	// Thread.sleep(4000);
	// // allow permission
	// try {
	// driver.findElementByAccessibilityId("ALLOW").click();
	// } catch (NoSuchElementException e) {
	// System.out.println(e);
	// }
	// Thread.sleep(2000);
	// // menu7();
	// }

	// Attendent login (Special Case)
	// @Test(priority = 1)
	// public void attendentLogin() throws InterruptedException {
	//
	// Thread.sleep(2500);
	// driver.findElement(By.xpath(Locator.login)).click();
	//
	// Thread.sleep(2500);
	//
	// // enter username
	// MobileElement userName =
	// driver.findElement(By.xpath(Locator.username));
	// userName.click();
	// userName.clear();
	// userName.sendKeys("jekilp");
	//
	// Thread.sleep(2500);
	// // click on next
	// driver.findElement(By.xpath(Locator.nxtUsername)).click();
	//
	// Thread.sleep(2500);
	// // enter password
	// MobileElement password =
	// driver.findElement(By.xpath(Locator.password));
	// password.click();
	// password.clear();
	// password.sendKeys("Simform.123");
	//
	// Thread.sleep(2500);
	// // click on next
	// driver.findElement(By.xpath(Locator.nxtPassword)).click();
	//
	// Thread.sleep(4000);
	// // allow permission
	// try {
	// driver.findElementByAccessibilityId("ALLOW").click();
	// } catch (NoSuchElementException e) {
	// System.out.println(e);
	// }
	// Thread.sleep(2000);
	// PC15();
	//
	// }

	// Test Case : 1
	// 1. Login into the app.
	// 2.Click on Menu button.

	// @Test(priority = 2)
	// public String TC1() throws InterruptedException {
	//
	// String pass = "Test Case 1 Completed";
	//
	// Thread.sleep(2500);
	//
	// try {
	// MobileElement menu = driver.findElement(By.xpath(Locator.menu));
	// menu.click();
	// // driver.findElement(By.id(Locator.network1)).click();
	//
	// driver.findElement(By.id(Locator.Go)).click();
	// driver.findElement(By.id(Locator.earthView));
	// TC2();
	//
	// }
	//
	// catch (NoSuchElementException ignored) {
	// System.out.println("Only one network available");
	// TC2();
	// }
	//
	// return pass;
	//
	// }

	// //XCUIElementTypeImage[@id='chargeIcon']
	// Test Case : 2
	// 1. Login into the app.
	// 2.Click on Menu button.
	// 3.Click on Charge History
	// @Test(priority = 3)
	// public String TC2() throws InterruptedException {
	//
	// String pass = "Test Case 2 Completed";
	// Thread.sleep(2500);
	// MobileElement icoMenu =
	// driver.findElement(By.xpath(Locator.icoMenu));
	// icoMenu.click();
	//
	// Thread.sleep(2500);
	//
	// MobileElement chargeHistory =
	// driver.findElement(By.xpath(Locator.chargeHistory));
	// chargeHistory.click();
	//
	// return pass;
	//
	// }

	// PCH 11
	// 1.Login with EV driver. [akshay/Akshay@123]
	// 2.Click on Charge Request button.
	// 3.Login with Attendent. [jekil/Jekil@123]
	// @Test(priority = 4)
	// public String PCH11() throws InterruptedException {
	//
	// // String toastMsg = "You must be parked in the geofenced area to
	// // receive a charge.";
	//
	// // select campus
	// Thread.sleep(2500);
	// MobileElement selectCampus =
	// driver.findElement(By.xpath(Locator.selectCampus));
	//
	// Thread.sleep(4500);
	// selectCampus.click();
	// Thread.sleep(9500);
	//
	// // Click on select campus
	// MobileElement campus = driver.findElement(By.xpath(Locator.campus));
	// Thread.sleep(5500);
	// campus.click();
	// Thread.sleep(5500);
	//
	// // Check in
	// MobileElement checkIn =
	// driver.findElement(By.xpath(Locator.checkIn));
	// Thread.sleep(3500);
	// checkIn.click();
	//
	// Thread.sleep(5500);
	// checkIn.click();
	// Thread.sleep(3500);
	//
	// // Click on Update Location
	// MobileElement updateLoc =
	// driver.findElement(By.xpath(Locator.updateLocation));
	// Thread.sleep(3500);
	// updateLoc.click();
	//
	// // Click on Confirm Location
	// MobileElement confirmLoc =
	// driver.findElement(By.xpath(Locator.confirmLoc));
	// Thread.sleep(3500);
	// confirmLoc.click();
	//
	// // Click on save
	// MobileElement save = driver.findElement(By.xpath(Locator.save));
	// Thread.sleep(3500);
	// save.click();
	//
	// // Yes to alert pop up
	// Thread.sleep(3500);
	// confirmLoc.click();
	//
	// // Click on ico menu for logout.
	// MobileElement icoMenu =
	// driver.findElement(By.xpath(Locator.icoMenu));
	// Thread.sleep(3500);
	// icoMenu.click();
	//
	// // Click on logout
	// MobileElement logout = driver.findElement(By.xpath(Locator.logout));
	// Thread.sleep(3500);
	// logout.click();
	//
	// // Yes to alert pop up
	// Thread.sleep(3500);
	// confirmLoc.click();
	//
	// return null;
	// }

	// 1.Login with Attendent.
	// 2.Navigate to Waiting state.
	// 3.Select the charging request.
	// 4.Select Mobi and Port.
	// 5.Click on Start Charging.
	// 6.Click on Pause
	// @Test(priority = 2)
	// public void PC12() throws InterruptedException {
	//
	// // Verify if waiting list displays or not
	// MobileElement waiting =
	// driver.findElement(By.xpath(Locator.waiting));
	//
	// if (waiting.isDisplayed()) {
	// System.out.println("Waiting List is found");
	// waiting.click();
	// Thread.sleep(3500);
	//
	// new TouchAction(driver).press(134,
	// 1188).waitAction(500).release().perform();
	//
	// // MobileElement mi = (MobileElement)
	// // driver.findElementByIosUIAutomation(Locator.selectMobi);
	// // // Select Mobi
	// // // MobileElement selectMobi =
	// // // driver.findElement(By.xpath(Locator.selectMobi));
	// // mi.click();
	// // Thread.sleep(3500);
	//
	// // Start Charging
	// MobileElement startCharging =
	// driver.findElement(By.xpath(Locator.startCharging));
	// Thread.sleep(3500);
	// startCharging.click();
	// Thread.sleep(3500);
	//
	// } else {
	// System.out.println("No waiting list");
	// }
	//
	// }

	// 1.Login with EV driver.
	// 2.Click on Charge Request button.
	// 3.Click on Chat button.
	// 4.Send text to chat window.
	// @Test(priority = 6)
	// public void PC14() throws InterruptedException {
	//
	// // Click on message icon
	// MobileElement message =
	// driver.findElement(By.xpath(Locator.messageMenu));
	// Thread.sleep(3500);
	// message.click();
	//
	// // Driver chat
	// // Click on the chat request.
	// MobileElement chat = driver.findElement(By.xpath(Locator.chat));
	// Thread.sleep(2500);
	// chat.click();
	//
	// // Click on Text Field
	// MobileElement textField =
	// driver.findElement(By.xpath(Locator.chatTextField));
	// Thread.sleep(2000);
	// textField.click();
	//
	// textField.clear();
	// textField.sendKeys("Test Message");
	//
	// MobileElement send = driver.findElement(By.xpath(Locator.send));
	// Thread.sleep(1500);
	// send.click();
	//
	// driver.hideKeyboard();
	//
	// }

	// @Test
	// public void PC15() throws InterruptedException {
	// // Click on message icon
	// MobileElement message =
	// driver.findElement(By.xpath(Locator.messageMenu));
	// Thread.sleep(3500);
	// message.click();
	//
	// // Attendent chat
	// MobileElement attendentChat =
	// driver.findElement(By.xpath(Locator.attendent));
	// attendentChat.click();
	//
	// // MobileElement chat = driver.findElement(By.xpath(Locator.chat));
	// // Thread.sleep(3000);
	// // chat.click();
	//
	// // Click on Text Field
	// MobileElement textField =
	// driver.findElement(By.xpath(Locator.chatTextField));
	// Thread.sleep(3000);
	// textField.click();
	//
	// textField.clear();
	// textField.sendKeys("Test Message");
	//
	// MobileElement send = driver.findElement(By.xpath(Locator.send));
	// Thread.sleep(1500);
	// send.click();
	//
	// driver.hideKeyboard();
	//
	// }

	// @Test
	// public void PC16() throws Exception {
	//
	// Thread.sleep(3500);
	// MobileElement selectCampus =
	// driver.findElement(By.xpath(Locator.selectCampus));
	// Thread.sleep(2500);
	// selectCampus.click();
	// Thread.sleep(5500);
	//
	// // sliding to 1
	// MobileElement slider = driver.findElement(By.xpath(Locator.slider));
	// slider.sendKeys(Keys.ARROW_RIGHT);
	//
	// // click on check in button
	// Thread.sleep(2500);
	// MobileElement checkIn =
	// driver.findElement(By.xpath(Locator.checkIn));
	// checkIn.click();
	//
	// // click on current campus
	// Thread.sleep(2500);
	// MobileElement centreCampus =
	// driver.findElement(By.xpath(Locator.campus));
	// centreCampus.click();
	//
	// // click on check in again
	// Thread.sleep(2500);
	// checkIn.click();
	//
	// // update location
	// MobileElement updateLocation =
	// driver.findElement(By.xpath(Locator.updateLocation));
	// updateLocation.click();
	//
	// // click on save
	// MobileElement save = driver.findElement(By.xpath(Locator.save));
	// save.click();
	//
	// }

	// @Test
	// public void PC17() throws InterruptedException {
	// Thread.sleep(4500);
	// MobileElement selectCampus =
	// driver.findElement(By.xpath(Locator.selectCampus));
	// Thread.sleep(2500);
	// selectCampus.click();
	//
	// Thread.sleep(5500);

	// Select date
	// Click on Expedite Request
	// MobileElement expediteRequest =
	// driver.findElement(By.xpath(Locator.expediteReq));
	// Thread.sleep(2500);
	// expediteRequest.click();

	// TouchActions action = new TouchActions(driver);
	// Thread.sleep(2500);
	// action.singleTap(expediteRequest);
	// Thread.sleep(2500);
	// action.perform();

	// click
	// MobileElement DatePickerWheel1 =
	// driver.findElement(By.xpath(Locator.datePicker));
	// List<MobileElement> Columns =
	// DatePickerWheel1.findElements(By.xpath(Locator.datePicker));
	//
	// Columns.get(1).sendKeys("9");
	// Columns.get(2).sendKeys("30");
	// Columns.get(3).sendKeys("PM");

	// Set Hours
	// MobileElement time_picker_hours =
	// driver.findElement(By.xpath(Locator.datePickerHours));
	// time_picker_hours.sendKeys("9");
	// Thread.sleep(1500);
	//
	// // Set Minutes
	// MobileElement time_picker_minutes =
	// driver.findElement(By.xpath(Locator.datePickerTime));
	// time_picker_minutes.sendKeys("30");
	// Thread.sleep(1500);
	//
	// // Set am/pm
	// MobileElement amPm = driver.findElement(By.xpath(Locator.amPm));
	// amPm.sendKeys("pm");

	// Click on Set Request time
	// MobileElement setReqTime =
	// driver.findElement(By.xpath(Locator.setRequestedTime));
	// Thread.sleep(2500);
	// setReqTime.click();
	//
	// // sliding to 1
	// MobileElement slider = driver.findElement(By.xpath(Locator.slider));
	// slider.sendKeys(Keys.ARROW_RIGHT);
	//
	// // Click on 'Set Requested Time'
	// MobileElement setTime =
	// driver.findElement(By.xpath(Locator.setTime));
	// Thread.sleep(2500);
	// setTime.click();

	// click on check in button
	// Thread.sleep(2500);
	// MobileElement checkIn =
	// driver.findElement(By.xpath(Locator.checkIn));
	// checkIn.click();
	//
	// Thread.sleep(4500);
	// // select campus
	// // XCUIElementTypeButton[@name="center campus"]
	// MobileElement centreCampus =
	// driver.findElement(By.xpath(Locator.campus));
	// centreCampus.click();
	//
	// Thread.sleep(3500);
	// // Click on check in again
	// checkIn.click();

	// Click on Cancel
	// Test case : PCH 19
	// MobileElement cancel = driver.findElement(By.xpath(Locator.cancel));
	// Thread.sleep(2500);
	// cancel.click();
	//
	// // click on yes.
	// MobileElement confirm =
	// driver.findElement(By.xpath(Locator.confirmYes));
	// Thread.sleep(2500);
	// confirm.click();
	//
	// // click on End session early
	// MobileElement endSessionEarly =
	// driver.findElement(By.xpath(Locator.endSessionEarly));
	// Thread.sleep(2500);
	// endSessionEarly.click();

	// click on ok
	// MobileElement ok = driver.findElement(By.xpath(Locator.ok));
	// Thread.sleep(2500);
	// ok.click();

	// update location
	// MobileElement updateLocation =
	// driver.findElement(By.xpath(Locator.updateLocation));
	// updateLocation.click();

	// }

	// @Test
	// public String menu3() throws InterruptedException {
	// String pass = "Test Case 3 Completed";
	// Thread.sleep(2500);
	// MobileElement icoMenu =
	// driver.findElement(By.xpath(Locator.icoMenu));
	// icoMenu.click();
	//
	// Thread.sleep(2500);
	//
	// MobileElement notification =
	// driver.findElement(By.xpath(Locator.notifications));
	// notification.click();
	//
	// return pass;
	//
	// }

	// Menu 7
	// @Test
	// public String menu7() throws InterruptedException {
	// String pass = "Test Case 3 Completed";
	// Thread.sleep(2500);
	// MobileElement icoMenu =
	// driver.findElement(By.xpath(Locator.icoMenu));
	// icoMenu.click();
	//
	// Thread.sleep(2500);
	//
	// MobileElement setting =
	// driver.findElement(By.xpath(Locator.settings));
	// setting.click();
	//
	// // Enter in Current password
	// MobileElement currPass =
	// driver.findElement(By.xpath(Locator.currPass));
	// currPass.sendKeys("Simform.123");
	// Thread.sleep(2500);
	//
	// // Enter in New Password
	// MobileElement newPass =
	// driver.findElement(By.xpath(Locator.newPass));
	// newPass.sendKeys("Simform.123");
	// Thread.sleep(2500);
	//
	// // Enter in confirm new password
	// MobileElement confPass =
	// driver.findElement(By.xpath(Locator.confPass));
	// confPass.sendKeys("Simform.123");
	// Thread.sleep(2500);
	//
	// // Test Case : Menu 8
	// // Enable / Disbale toggle
	// MobileElement toggleNotications =
	// driver.findElement(By.xpath(Locator.toggleNotifications));
	// toggleNotications.click();
	// Thread.sleep(2500);
	//
	// // Click on save changes
	// MobileElement saveChanges =
	// driver.findElement(By.xpath(Locator.saveChanges));
	// saveChanges.click();
	// Thread.sleep(2500);
	//
	// return pass;
	//
	// }

	// Menu 10 to 20
	// public String menu10_20() throws InterruptedException {
	// String pass = "Test Cases Completed";
	//
	// // update locator as per test case run.
	// try {
	// MobileElement firstName =
	// driver.findElement(By.xpath(Locator.firstName));
	// firstName.clear();
	// firstName.sendKeys("Zoya");
	// Thread.sleep(2500);
	// }
	//
	// catch (Exception e) {
	// // System.out.println(network.getText());
	// // System.out.println("Cannot edit network");
	// }
	//
	// // For MENU 17 test case
	//
	// return pass;
	//
	// }

	// Menu 22
	// public String menu22() throws InterruptedException {
	// String pass = "Test Cases Completed";
	//
	// // fins credit card field and enter details
	// MobileElement creditNumber =
	// driver.findElement(By.xpath(Locator.creditCard));
	// creditNumber.clear();
	// creditNumber.sendKeys("4111111111111111");
	// Thread.sleep(2500);
	//
	// // click back button
	// MobileElement back =
	// driver.findElement(By.xpath(Locator.paymentBack));
	// back.click();
	// Thread.sleep(2500);
	//
	// return pass;
	//
	// }

	// Menu 23
	// public String menu23() throws InterruptedException {
	// String pass = "Test Cases Completed";
	// MobileElement logOut = driver.findElement(By.xpath(Locator.logout));
	// logOut.click();
	//
	// return pass;
	//
	// }

	// TC 8
	// "1. Enter First name
	// 2. Enter Lastname
	// 3. Enter Usename
	// 4. Enter Password
	// 5. Enter Mobilenumber
	// 6. Enter Email address
	// 7. Clicks on Save button"

}
