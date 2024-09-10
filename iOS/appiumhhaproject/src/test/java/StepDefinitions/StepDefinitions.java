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
	@When("Add a Drink button should show")
	public void Add_a_Drink_button_should_show() throws InterruptedException {
		
			Thread.sleep(2000);
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Add a Drink\"]")).isDisplayed();
	}
	
	
	@Then("Click on Home tab")
	public void Click_on_Home_tab() throws InterruptedException {
		
			Thread.sleep(2000);
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Home\"]")).click();
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Add a Drink\"]")).isDisplayed();
			
	}
	
	@Then("Click on Drink Logger tab")
	public void Click_on_Drink_Logger_tab() throws InterruptedException {
		
			Thread.sleep(2000);
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Drink Logger\"]")).click();
			driver.findElement(By.xpath("//XCUIElementTypeImage[@name=\"beer_icon\"]")).isDisplayed();
	}
	
	@Then("Click on Drink Stats tab")
	public void Click_on_Drink_Stats_tab() throws InterruptedException {
		
			Thread.sleep(2000);
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Drink Stats\"]")).click();
			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"This Year's Progress\"]")).isDisplayed();
	}
	
	@Then("Click on More tab")
	public void Click_on_More_tab() throws InterruptedException {
		
			Thread.sleep(2000);
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"More\"]")).click();
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"About the App\"]")).isDisplayed();			
	}

	@When("user reset app")
	public void user_reset_app() throws InterruptedException {
		driver.resetApp();
	}

	
	@Given("Select drink type new")
	public void Select_drink_type_new() throws InterruptedException {
		
		driver.findElement(By.xpath("//XCUIElementTypeImage[@name=\"alcoholic_drinks\"]")).click();
		
	}

	@When("user clicks on Signup button")
	public void user_clicks_on_Sign_Up__button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Sign Up']")).click();
	}
	
	@Given("Click on Add a Drink button")
	public void Click_on_Add_a_Drink_button() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Add a Drink\"]")).click();
	}
	
	@When("Select any Drink Type")
	public void Select_any_Drink_Type() throws InterruptedException {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//XCUIElementTypeImage[@name=\"beer_icon\"]")).click();
	}	
	
	@Then("Specify Drink Details link should show")
	public void Specify_Drink_Details_link_should_show() throws InterruptedException {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Specify Drink Details\"]")).isDisplayed();
	}	
	
	@Then("Click on Add Drink button")
	public void Click_on_Add_Drink_button() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Add Drink\"]")).click();
	}
	
	@Then("Verify Drink Added")
	public void Verify_Drink_Added() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Beer, 330.0 mL\"]")).isDisplayed();
	}
	
	@Then("Verify Drink Added for the first")
	public void Verify_Drink_Added_for_the_first() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Beer, 330.0 mL\"]")).click();
	}
	
	@Then("Select Drink Type as Cocktail")
	public void Select_Drink_Type_as_Cocktail() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//XCUIElementTypeImage[@name=\"cocktail_icon\"]")).click();
	}
	
	

	@Then("Delete the Drink")
    public void Delete_the_Drink() {
        try {
            // Click the 'Delete' button
        	driver.findElement(By.xpath("//XCUIElementTypeButton[@name='Delete']")).click();
            // Wait for the 'Yes, delete it' button to be clickable and click it
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//XCUIElementTypeButton[@name='Yes, delete it']"))).click();
        	Thread.sleep(7000);
        }
         catch (NoSuchElementException e) {} 
         catch (Exception e) {}
    }
	
		
	@Then("Verify drink should not show")
	public void Verify_drink_should_not_show() throws InterruptedException {
			Thread.sleep(3000);
	    driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"History not available\"]")).isDisplayed();
	}
	
	@Then("Verify Cocktail has added")
	public void Verify_Cocktail_has_added() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Cocktail, 240.0 mL\"]")).isDisplayed();
	}
	
	@Then("Verify value of drinking days this week")
	public void Verify_value_of_drinking_days_this_week() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"1\"][1]")).isDisplayed();
	}
	
	@Then("Verify total drinks consumed this week")
	public void Verify_total_drinks_consumed_this_week() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"1\"][2]")).isDisplayed();
	}
	
	
	@Then("Select Drink Type as liquor1")
	public void Select_Drink_Type_as_liquor1() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//XCUIElementTypeImage[@name=\"liquor_icon\"]")).click();
	}
	
	@Then("Verify Liquor has added")
	public void Verify_Liquor_has_added () throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Liquor, 45.0 mL\"]")).isDisplayed();
	}
	
	@Then("Verify drink free days this week value")
	public void Verify_drink_free_days_this_week_value() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"6\"]")).isDisplayed();
	}
	
	@Then("Select Drink Type as wine")
	public void Select_Drink_Type_as_wine() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//XCUIElementTypeImage[@name=\"wine_icon\"]")).click();
	}
	
	@Then("Verify wine has added")
	public void Verify_wine_has_added () throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Wine, 150.0 mL\"]")).isDisplayed();
	}
	
	@When("Click on Take a photo")
	public void Click_on_Take_a_photo() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//XCUIElementTypeImage[@name=\"camera\"]")).click();			
	}
	
	@When("Click on arrow to redirect drinking stats screen")
	public void Click_on_arrow_to_redirect_drinking_stats_screen() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//XCUIElementTypeImage[@name=\"right_arrow\"]")).click();			
	}
	
	@Then("Verify all three sections")
	public void Verify_all_three_sections() throws InterruptedException {
			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"This Year's Progress\"]")).isDisplayed();	
			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Number of Drinks Consumed\"]")).isDisplayed();	
			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Drinking Days\"]")).isDisplayed();	
	}
	
	
	@Then("Verify camera should open")
	public void Verify_camera_should_open() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//XCUIElementTypeImage[@name=\"close\"]")).isDisplayed();		
			Thread.sleep(2000);
			driver.findElement(By.xpath("//XCUIElementTypeImage[@name=\"close\"]")).click();
	}
	
	@When("Click on Specify Drink Details link")
	public void Click_on_Specify_Drink_Details_link() throws InterruptedException {
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Specify Drink Details\"]")).click();	
			Thread.sleep(4000);
		
	}
	@Then("Navigate to Add Drink Details page")
	public void Navigate_to_Add_Drink_Details_page() throws InterruptedException {
			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Add Drink Details\"]")).isDisplayed();	
		
	}
	@When("Select Can as select serving size")
	public void Select_Can_as_select_serving_size() throws InterruptedException {
			driver.findElement(By.xpath("//XCUIElementTypeImage[@name=\"Can\"]")).click();
	}
	
	@Then("Click on plus icon and add one more drink")
	public void Click_on_plus_icon_and_add_one_more_drink() throws InterruptedException {
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"+\"]")).click();
	}
	
	@Then("Drink Size ml should show as three hundred fifty")
	public void Drink_Size_ml_should_show_as_three_hundred_fifty() throws InterruptedException {
			driver.findElement(By.xpath("//XCUIElementTypeTextField[@value=\"330 mL\"]")).click();
	}
	
	@Given("Click on Save Drink button from specify link")
	public void Click_on_Save_Drink_button_from_specify_link() throws InterruptedException {
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Save Drink\"]")).click();
	}
	
	@Then("verify drink added from specify link")
	public void verify_drink_added_from_specify_link() throws InterruptedException {
			driver.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"Beer, 330.0 mL\"])[1]")).click();
			driver.findElement(By.xpath("(//XCUIElementTypeImage[@name=\"beer_icon\"])[2]")).isDisplayed();

	}
	
	@When("app should open")
	public void app_should_open() throws InterruptedException {
		    Thread.sleep(5000);
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"NEXT\"]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"NEXT\"]")).click();

	}
	
	@When("Select mug as select serving size")
	public void Select_mug_as_select_serving_size() throws InterruptedException {
			driver.findElement(By.xpath("//XCUIElementTypeImage[@name=\"Mug\"]")).click();
	}
	
	@Then("select past date from data picker")
	public void select_past_date_from_date_picker() throws InterruptedException {
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Date Picker\"]")).click();
			Thread.sleep(2000);		
			LocalDate yesterday = LocalDate.now().minusDays(1);
			String day = yesterday.format(DateTimeFormatter.ofPattern("d"));
	        System.out.println(day);		 
	        driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"" + day + "\"]")).click();
	        Thread.sleep(3000);			
	        driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"PopoverDismissRegion\"]")).click();
	}
	
	@Then("verify drink added for past date from specify link")
	public void verify_drink_added_for_past_date_from_specify_link() throws InterruptedException {
		     LocalDate yesterday = LocalDate.now().minusDays(1);
		     String day = yesterday.format(DateTimeFormatter.ofPattern("d"));
	       	 driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Beer, 500.0 mL\"]")).click();
	       	 MobileElement element = (MobileElement) driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Date Picker\"]"));
             String fullText = element.getText();
             System.out.println(fullText);
             boolean isTextPresent = fullText.contains(day);
             assert isTextPresent = true ;
	}
	
	@When("Select cocktail type from dropdown")
	public void Select_cocktail_type_from_dropdown() throws InterruptedException {
			driver.findElement(By.xpath("//XCUIElementTypeTextField[@value=\"Start typing the cocktail name\"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Amaretto Sour\"]")).click();
			Thread.sleep(2000);
	}
	
	@Then("verify cocktail custom drink added")
	public void verify_cocktail_custom_drink_added() throws InterruptedException {
	         Thread.sleep(2000);
		     driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Amaretto Sour, 100.0 mL\"]")).isDisplayed();
	}
	
	@Then("Select Drink Type as wine and scroll")
	public void Select_Drink_Type_as_wine_and_scroll() throws InterruptedException {
		
		MobileElement swipeableElement = (MobileElement) driver.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther"));
		// Locate the element you want to swipe within

		// Prepare the parameters for the swipe action
		HashMap<String, Object> swipeObject = new HashMap<>();
		swipeObject.put("direction", "left"); // Specify the swipe direction
		swipeObject.put("element", swipeableElement.getId()); // Correctly set the element's ID

		// Optional: Add additional parameters like duration (in milliseconds) if needed
	   	swipeObject.put("duration", 1000); // Duration of the swipe in milliseconds (optional)

		// Perform the swipe within the element
		driver.executeScript("mobile: swipe", swipeObject);

		driver.findElement(By.xpath("//XCUIElementTypeImage[@name=\"wine_icon\"]")).click();
	}	
	
	@When("Select sparkling as type")
	public void Select_sparkling_as_type() throws InterruptedException {
			driver.findElement(By.xpath("//XCUIElementTypeImage[@name=\"Sparkling\"]")).click();
			Thread.sleep(2000);
	}
	
	
}