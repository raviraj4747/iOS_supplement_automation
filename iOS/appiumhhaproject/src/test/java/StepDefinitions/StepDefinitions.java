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
import java.util.Map;
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
	
	@Then("Verify app open with onboarding flow")
	public void Verify_app_open_with_onboarding_flow() throws InterruptedException {
		    Thread.sleep(5000);
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"次へ\"]")).isDisplayed();
	}
	
	@When("Click on next button from onboarding flow and verify user redirected to Signup screen")
	public void Click_on_next_button_from_onboarding_flow_and_verify_user_redirected_to_Signup_screen() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"次へ\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"次へ\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"登録を始める\"]")).click();
		Thread.sleep(1000);
		assert driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"サインアップ\"]")).isDisplayed();
	}
	
	@When("Enter Email id and Password")
	public void Click_on_Start_registeration_button() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"次へ\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"次へ\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"登録を始める\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"ログイン\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"メール\"]")).sendKeys("ravirajsinh+28@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"パスワード\"]")).click();
	    driver.findElement(By.xpath("//XCUIElementTypeSecureTextField[@name=\"パスワード\"]")).sendKeys("Raj#9822");;
	}
	
	@Then("Click on Login button")
	public void Click_on_Login_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"ログイン\"]")).click();	
		Thread.sleep(3000);
	}
	@Then("Verify Recommandation tab should show with result")
	public void Verify_Recommandation_tab_should_show_with_result() throws InterruptedException {
		Thread.sleep(5000);
		assert driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"最近疲れ、筋肉が気になるあなたへ\"]")).isDisplayed();	
		Thread.sleep(2000);
		assert driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"今すぐキープ\"]")).isDisplayed();	
	    Thread.sleep(5000);
	}
	
	@When("Naivgate to supplement list tab")
	public void Naivgate_to_supplement_list_tab() throws InterruptedException {
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//XCUIElementTypeStaticText[contains(@name, 'サプリ一覧') and contains(@name, 'タブ: 1/3')]")).click();
	}
	
	@Then("Verify supplement should show")
	public void Verify_supplement_should_show() throws InterruptedException {
		Thread.sleep(3000);
		assert driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"今すぐキープ\"])[1]")).isDisplayed();	
	}
	
	@When("Naivgate to bottle list page")
	public void Naivgate_to_bottle_list_page() throws InterruptedException {
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//XCUIElementTypeStaticText[contains(@name, 'ボトルキープ') and contains(@name, 'タブ: 3/3')]")).click();
	}
	
	@Then("Verify bottle  should show")
	public void Verify_bottle_should_show() throws InterruptedException {
		Thread.sleep(3000);
		assert driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"今すぐキープ\"])[1]")).isDisplayed();	
	}
	
	@When("Naivgate to recommendation section and click on plus icon")
	public void Naivgate_to_recommendation_section_and_click_on_plus_icon() throws InterruptedException {
		assert driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"recommend\"]")).isDisplayed();	
		Thread.sleep(1000);
	}
	
	@Then("Verify supplements should show")
	public void Verify_supplements_should_show() throws InterruptedException {
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"recommend\"]")).click();
		Thread.sleep(3000);
	}
	
}