package WebdriverPro.web.framework;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class WebdriverManager {
		
	public static AppiumDriver<MobileElement> getDriver() throws MalformedURLException {
		AppiumDriver<MobileElement> driver = null;
		String mobileDeviceName = PropertyManager.getProperty("mobileDeviceName");
		String deviceName = PropertyManager.getProperty("deviceName");
		String platformVersion = PropertyManager.getProperty("platformVersion");
		String platformName = PropertyManager.getProperty("platformName");
		String appAPKFilePath = PropertyManager.getProperty("appPackage");
		String appActivity = PropertyManager.getProperty("appActivity");

		if (mobileDeviceName.equals("android")) {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			// Specify the device name (any name)
			capabilities.setCapability("deviceName", deviceName);
			// Platform version
			capabilities.setCapability("platformVersion", platformVersion);
			// platform name
			capabilities.setCapability("platformName", platformName);
			// specify the application package
			capabilities.setCapability("appPackage", appAPKFilePath);
			// specify the application activity
			capabilities.setCapability("appActivity", appActivity);
			// Start android driver I used 4727 port by default it will be 4723
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
;
		} else {
			// Provide capabilities for IOS driver as above
		}
		return driver;

	}

}
