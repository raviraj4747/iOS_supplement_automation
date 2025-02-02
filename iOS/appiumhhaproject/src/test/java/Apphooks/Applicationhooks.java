package Apphooks;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import BaseClass.Baseclass;
import Testrail.TestRailIntegration;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import Utilities.takeScreenshot;

public class Applicationhooks extends Baseclass {

    private static takeScreenshot takescreenshot = new takeScreenshot();
    private TestRailIntegration testRailIntegration = new TestRailIntegration();

    @Before
    public void setUp(Scenario scenario) {
        String platform = getPlatform(); // Dynamically fetch platform
        String deviceName = getDeviceName(); // Dynamically fetch device name
        scenario.write("Platform name: " + platform);
        scenario.write("Device name: " + deviceName);
        System.out.println("Started");
        getDriver(); // Initialize Appium driver
    }

    private String getPlatform() {
        // Implement logic to fetch the platform from driver capabilities (iOS or Android)
        return "iOS"; // Example placeholder
    }

    private String getDeviceName() {
        // Implement logic to fetch the device name dynamically (e.g., "iPhone" or "Pixel")
        return "iPhone"; // Example placeholder
    }

    @After(order = 0)
    public void teardown() {
        System.out.println("TestDone");
        driver.quit(); // Make sure driver quit works properly
    }

    @After(order = 1)
    public void failedScreenshot(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            takeAndAttachScreenshot(scenario);
        } else {
            System.out.println("Test Passed");
        }
        postResultToTestRail(scenario);
    }

    private void takeAndAttachScreenshot(Scenario scenario) throws IOException {
        String screenshotName = scenario.getName().replaceAll(" ", "_");
        final byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(sourcePath, "image/png", screenshotName);

        // Optionally save the screenshot locally
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File("path/to/save/screenshots/" + screenshotName + ".png");
        FileUtils.copyFile(screenshotFile, destFile); // Ensure you import FileUtils
    }

    private void postResultToTestRail(Scenario scenario) {
        String testStatus = scenario.isFailed() ? "failed" : "passed";
        System.out.println(testStatus);
        String comment = "Test executed at " + System.currentTimeMillis() + " for scenario: " + scenario.getName();

        String caseId = getTestRailCaseId(scenario);
        if (caseId != null) {
        	 System.out.println(caseId);
            testRailIntegration.postTestResult(caseId, testStatus, comment);
            System.out.println(testStatus);
        }
    }

    private String getTestRailCaseId(Scenario scenario) {
        for (String tag : scenario.getSourceTagNames()) {
            if (tag.startsWith("@case_")) {
                return tag.replace("@case_", "");
            }
        }
        return null;
    }
}
