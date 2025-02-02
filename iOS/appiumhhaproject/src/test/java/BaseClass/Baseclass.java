package BaseClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Baseclass {

	public static IOSDriver<?> driver;
	
	public static void getDriver() {
		try {

			DesiredCapabilities capabilities = new DesiredCapabilities();

			 capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		     capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "18.1.1");
		     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11");
		     capabilities.setCapability("automationName", "XCUITest");
		     capabilities.setCapability(MobileCapabilityType.UDID,"00008030-001255311498C02E");
	    	 
    	     capabilities.setCapability("xcodeOrgId", "S4T6PVN6LR");
	 		 capabilities.setCapability("xcodeSigningId", "iPhone Developer");
			// running on AWS
			 capabilities.setCapability("autoAcceptAlerts", "true");
			 
		        // Set device language and locale to Japanese
		     capabilities.setCapability("locale", "ja_JP"); // Set locale
		     capabilities.setCapability("language", "ja");  // Set language
		        
			 capabilities.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS, true);
			 capabilities.setCapability(MobileCapabilityType.APP, "com.dearnatura.supplementapp");		
    	   	URL url = new URL("http://127.0.0.1:4723");

			driver = new IOSDriver<>(url, capabilities);
			driver.setSetting("appium:autoAcceptAlerts", true);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean takeScreenshot(final String name) {
		String screenshotDirectory = System.getProperty("appium.screenshots.dir",
				System.getProperty("java.io.tmpdir", ""));
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		return screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", name)));
	}

	// public boolean takeScreenshot(final String name)
	// {
	// String screenshotDirectory = System.getenv("WORKING_DIRECTORY");
	// File screenshot = ((TakesScreenshot)
	// driver).getScreenshotAs(OutputType.FILE);
	// return screenshot.renameTo(new File(screenshotDirectory,
	// String.format("%s.png", name)));
	// }

}
