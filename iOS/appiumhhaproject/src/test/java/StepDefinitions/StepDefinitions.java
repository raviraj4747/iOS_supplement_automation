package StepDefinitions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.apache.commons.math3.stat.descriptive.moment.SemiVariance.Direction;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Apphooks.Applicationhooks;
import BaseClass.Baseclass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utilities.ConfigReader;
import Apphooks.Applicationhooks;
import org.testng.Assert;

public class StepDefinitions extends Baseclass {
	
	WebDriverWait wait = new WebDriverWait(driver, 10); 
	Actions actions = new Actions(driver);

	@Given("user is on the login page")
	public void user_is_on_the_login_page() throws MalformedURLException, InterruptedException {
		System.out.println("Application Launched");
		Thread.sleep(5000);
		driver.setSetting("appium:autoAcceptAlerts", false);
		driver.setSetting("appium:AUTO_DISMISS_ALERTS", true);
		try {
			Thread.sleep(4000);
			if (driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Allow\"]")).isDisplayed()) {
				System.out.println("True");
				driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Allow\"]")).click();
			}
			if (driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Allow While Using App\"]"))
					.isDisplayed()) {
				Thread.sleep(5000);
				driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Allow While Using App\"]")).click();
			} else {
				System.out.println("Popup is not present");
			}
		} catch (Exception e) {
			System.out.println("Allow button is not present");
		}
	}

	@When("user verifies the popup")
	public void user_verifies_the_popup() throws InterruptedException {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException ne) {
			System.out.println("Popup not displayed");
			ne.printStackTrace();
		}

	}

	@When("user verifies the apply button")
	public void user_verifies_the_apply_button() throws InterruptedException {
		try {
			if (driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"FooterButton\"]")).isDisplayed()) {
				System.out.println("True");
				driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"FooterButton\"]")).click();
			}
		} catch (Exception e) {
			System.out.println("Apply button is not present");
		}
	}

	@When("user verifies the Hha notification popup")
	public void user_verifies_the_Hha_notification_popup() throws InterruptedException {
		try {
			Thread.sleep(4000);
			if (driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Allow\"]")).isDisplayed()) {
				System.out.println("True");
				driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Allow\"]")).click();
			}
		} catch (Exception e) {
			System.out.println("Hha notification popup is not present");
		}
	}

	@When("user verifies the location services popup")
	public void user_verifies_the_location_services_popup() throws InterruptedException {
		try {
			Thread.sleep(4000);
			if (driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Allow While Using App\"]"))
					.isDisplayed()) {
				System.out.println("True");
				driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Allow While Using App\"]")).click();
			}
		} catch (Exception e) {
			System.out.println("Location Services popup is not present");
		}
	}
	
	//Supplement app flow
	
	@Then("Verify app open with onboarding flow")
	public void Verify_app_open_with_onboarding_flow() throws InterruptedException {
		    Thread.sleep(5000);
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"NEXT\"]")).isDisplayed();
	}
	
	@When("Click on next button from onboarding flow")
	public void Click_on_next_button_from_onboarding_flow() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"NEXT\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"NEXT\"]")).click();

	}
	
	@Then("Click on Start registeration button")
	public void Click_on_Start_registeration_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Start registration\"]")).click();
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Log In\"]")).isDisplayed();
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Log In\"]")).click();
		driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"Email\"]")).sendKeys("ravirajsinh7474@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"Password\"]")).click();
	    driver.findElement(By.xpath("//XCUIElementTypeSecureTextField[@name='Password']")).sendKeys("Raviraj#9822");;
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Log In\"]")).click();		
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"Buy Now\"])[1]")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"advices\"]")).click();		
		
	}
}