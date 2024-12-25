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
	
	WebDriverWait wait = new WebDriverWait(driver, 20); 
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

	@Then("Verify app open with onboarding flow")
	public void Verify_app_open_with_onboarding_flow() throws InterruptedException {
		    WebElement nextButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeButton[@name=\"次へ\"]")));
		    nextButton.isDisplayed();
	}
	
	@Then("Verify signup page should open")
	public void Verify_signup_page_should_open() throws InterruptedException {
    	    WebElement nextButton1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeTextField[@name=\"メール\"]")));
	        nextButton1.isDisplayed();
	}

	@When("Verify user should be redirected to the Signup page")
	public void Verify_user_should_be_redirected_to_the_Signup_page() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"次へ\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"次へ\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"登録を始める\"]")).click();
		Thread.sleep(1000);
		assert driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"サインアップ\"]")).isDisplayed();
	}
	
	@When("Click on the signup button")
	public void Click_on_the_signup_button() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"次へ\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"次へ\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"登録を始める\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"サインアップ\"]")).click();
	}
	
	@When("Click on the login button from onboarding")
	public void Click_on_the_login_button_from_onboarding() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"次へ\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"次へ\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"登録を始める\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"ログイン\"]")).click();
		Thread.sleep(3000);
	}
	
	@Then("Verify login page should open")
	public void Verify_login_page_should_open() throws InterruptedException {
		Thread.sleep(1000);
		assert driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"ログイン\"]")).isDisplayed();	
	}
	
	@When("Click on the back button from signup page and verify")
	public void Click_on_the_back_button_from_signup_page_and_verify() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"次へ\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"次へ\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"登録を始める\"]")).click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"サインアップ\"]")).click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"戻る\"]")).click();
		Thread.sleep(2000);
	    assert driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"サインアップ\"]")).isDisplayed();	    
	}
	
	@Then("Click on the back button from login page and verify")
	public void Click_on_the_back_button_from_login_page_and_verify() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"ログイン\"]")).click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"戻る\"]")).click();
		Thread.sleep(2000);
		assert driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"ログイン\"]")).isDisplayed();
	}
	
	@Given("Click here if you have an account link")
	public void Click_here_if_you_have_an_account_link() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"次へ\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"次へ\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"登録を始める\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"サインアップ\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"アカウントをお持ち方は こちら >\"]")).click();
		Thread.sleep(3000);
        assert driver.findElement(By.xpath("//XCUIElementTypeTextField[@name=\"メール\"]")).isDisplayed();	
	}
	
	@Given("Click on No account yet Sign up here link")
	public void Click_on_No_account_yet_Sign_up_here_link() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"次へ\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"次へ\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"登録を始める\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"ログイン\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"アカウントをお持ちでない方は こちら >\"]")).click();
		Thread.sleep(3000);
        assert driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"サインアップ\"]")).isDisplayed();	
	}
	
	@Given("Click on skip functionality link")
	public void Click_on_skip_functionality_link() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"チュートリアルをスキップ >\"]")).click();
		Thread.sleep(1000);
		assert driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"ログイン\"]")).isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@When("Enter Email id and Password incorrect")
	public void Enter_Email_id_and_Password_incorrect() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"次へ\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"次へ\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"登録を始める\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"ログイン\"]")).click();
		Thread.sleep(3000);
		
	}
	
	@Then("Click on Login button")
	public void Click_on_Login_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"ログイン\"]")).click();	
		Thread.sleep(3000);
	}
	
	@Then("Verify validation message should show")
	public void Verify_validation_message_should_show() throws InterruptedException {
		Thread.sleep(3000);
		assert driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Invalid email or password\"]")).isDisplayed();
		Thread.sleep(3000);
	}
	
	@Then("Verify Recommandation tab should show with result")
	public void Verify_Recommandation_tab_should_show_with_result() throws InterruptedException {
		Thread.sleep(5000);
		assert driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"最近疲れ、妊娠が気になるあなたへ\"]")).isDisplayed();	
		Thread.sleep(2000);
		assert driver.findElement(By.xpath("//XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeImage[2]")).isDisplayed();	
	    Thread.sleep(5000);
	}
	
	@When("Naivgate to supplement list tab")
	public void Naivgate_to_supplement_list_tab() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[contains(@name, 'サプリ一覧') and contains(@name, 'タブ: 2/2')]")).click();
	}
	
	@Then("Verify supplement should show")
	public void Verify_supplement_should_show() throws InterruptedException {
		Thread.sleep(3000);
		assert driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"商品を選択\"])[1]")).isDisplayed();	
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
	
	@When("Click on setting icon icon and click on Log out button")
	public void Click_on_setting_icon_icon_and_click_on_Log_out_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[contains(@name, 'My Page') and contains(@name, 'タブ: 3/3')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Log Out\"]")).click();
	}
	
	@Then("Verify Log out successfully")
	public void Verify_Log_out_successfully() throws InterruptedException {
       Thread.sleep(3000);
		assert driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"サインアップ\"]")).isDisplayed();	
	}
	
	
	
	
	
}