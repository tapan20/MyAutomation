 package Freewire.freewire;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

// launch the application
public class Base {
	static IOSDriver<MobileElement> driver;

	@BeforeSuite
	public void launchApp() throws InterruptedException {

		Thread.sleep(2500);

		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/App");
		File app = new File(appDir, "FreeWire.app");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "iPhone X");
		capabilities.setCapability("platformVersion", "12.0");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("automationName", "XCUITest");
		capabilities.setCapability("locationServicesAuthorized", true);
		capabilities.setCapability("autoAcceptAlerts", true);
		try {
			driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			// safari_driver = ChromeDriver(executable_path='CHROMEDRIVER_PATH')
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
