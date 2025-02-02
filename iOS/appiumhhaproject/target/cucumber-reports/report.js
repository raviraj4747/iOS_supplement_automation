$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:Features/RC4.feature");
formatter.feature({
  "name": "RC4 Test Scenarios",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify user is able to open the supplement app",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regresion"
    },
    {
      "name": "@case_79"
    }
  ]
});
formatter.write("Platform name: iOS");
formatter.write("Device name: iPhone");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Verify app open with onboarding flow",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Verify_app_open_with_onboarding_flow()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify onboarding flow after opening the application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@case_80"
    },
    {
      "name": "@Regresion"
    }
  ]
});
formatter.write("Platform name: iOS");
formatter.write("Device name: iPhone");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Verify user should be redirected to the Signup page",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Verify_user_should_be_redirected_to_the_Signup_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify signup page should open after clicking on Signup button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@case_81"
    },
    {
      "name": "@Regresion"
    }
  ]
});
formatter.write("Platform name: iOS");
formatter.write("Device name: iPhone");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on the signup button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_the_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify signup page should open",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Verify_signup_page_should_open()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify login page should open after clicking on login button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@case_82"
    },
    {
      "name": "@Regresion"
    }
  ]
});
formatter.write("Platform name: iOS");
formatter.write("Device name: iPhone");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on the login button from onboarding",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_the_login_button_from_onboarding()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify login page should open",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Verify_login_page_should_open()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify back button functionality from signup and login page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@case_84"
    },
    {
      "name": "@Regresion"
    }
  ]
});
formatter.write("Platform name: iOS");
formatter.write("Device name: iPhone");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on the back button from signup page and verify",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_the_back_button_from_signup_page_and_verify()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the back button from login page and verify",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_the_back_button_from_login_page_and_verify()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Already a user ? Log in here functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@case_85"
    },
    {
      "name": "@Regresion"
    }
  ]
});
formatter.write("Platform name: iOS");
formatter.write("Device name: iPhone");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click here if you have an account link",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_here_if_you_have_an_account_link()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify No account yet Sign up here functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@case_86"
    },
    {
      "name": "@Regresion"
    }
  ]
});
formatter.write("Platform name: iOS");
formatter.write("Device name: iPhone");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on No account yet Sign up here link",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_No_account_yet_Sign_up_here_link()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify skip functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@case_87"
    },
    {
      "name": "@Regresion"
    }
  ]
});
formatter.write("Platform name: iOS");
formatter.write("Device name: iPhone");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on skip functionality link",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_skip_functionality_link()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user is able to login to the system",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@case_88"
    },
    {
      "name": "@Regresion"
    }
  ]
});
formatter.write("Platform name: iOS");
formatter.write("Device name: iPhone");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Enter Email id and Password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Enter_Email_id_and_Password_incorrect()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Login_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: An element could not be located on the page using the given search parameters.\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027192.168.1.11\u0027, ip: \u00272402:a00:401:a870:e15d:4c3f:ed67:39c0%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002715.2\u0027, java.version: \u002717.0.2\u0027\nDriver info: io.appium.java_client.ios.IOSDriver\nCapabilities {app: com.dearnatura.supplementapp, autoAcceptAlerts: true, automationName: XCUITest, browserName: , databaseEnabled: false, deviceName: iPhone 11, javascriptEnabled: true, language: ja, locale: ja_JP, locationContextEnabled: false, networkConnectionEnabled: false, platform: MAC, platformName: iOS, platformVersion: 18.1, takesScreenshot: true, udid: 00008030-001255311498C02E, webStorageEnabled: false, xcodeOrgId: S4T6PVN6LR, xcodeSigningId: iPhone Developer}\nSession ID: da9b138b-8181-4bfb-bc5d-24dbe8a54a86\n*** Element info: {Using\u003dxpath, value\u003d//XCUIElementTypeStaticText[@name\u003d\"最近デスクワーク後もアクティブでいたい、友人との時間を楽しみたいが気になるあなたへ\"]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:250)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:41)\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\n\tat io.appium.java_client.ios.IOSDriver.execute(IOSDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:61)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat io.appium.java_client.ios.IOSDriver.findElement(IOSDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementByXPath(DefaultGenericMobileDriver.java:151)\n\tat io.appium.java_client.AppiumDriver.findElementByXPath(AppiumDriver.java:1)\n\tat io.appium.java_client.ios.IOSDriver.findElementByXPath(IOSDriver.java:1)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:57)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat io.appium.java_client.ios.IOSDriver.findElement(IOSDriver.java:1)\n\tat StepDefinitions.StepDefinitions.Click_on_Login_button(StepDefinitions.java:242)\n\tat ✽.Click on Login button(classpath:Features/RC4.feature:50)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "Verify_user_is_able_to_login_to_the_system");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify recommendation supplement should show inside the recommendation tab",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@case_90"
    },
    {
      "name": "@Regresion"
    }
  ]
});
formatter.write("Platform name: iOS");
formatter.write("Device name: iPhone");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "verify supplement should show inside the tab",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.verify_supplement_should_show_inside_the_tab()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: An element could not be located on the page using the given search parameters.\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027192.168.1.11\u0027, ip: \u00272402:a00:401:a870:e15d:4c3f:ed67:39c0%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002715.2\u0027, java.version: \u002717.0.2\u0027\nDriver info: io.appium.java_client.ios.IOSDriver\nCapabilities {app: com.dearnatura.supplementapp, autoAcceptAlerts: true, automationName: XCUITest, browserName: , databaseEnabled: false, deviceName: iPhone 11, javascriptEnabled: true, language: ja, locale: ja_JP, locationContextEnabled: false, networkConnectionEnabled: false, platform: MAC, platformName: iOS, platformVersion: 18.1, takesScreenshot: true, udid: 00008030-001255311498C02E, webStorageEnabled: false, xcodeOrgId: S4T6PVN6LR, xcodeSigningId: iPhone Developer}\nSession ID: 8e758bd8-c3d9-4ebb-a2eb-dc483e5bbdb2\n*** Element info: {Using\u003dxpath, value\u003d//XCUIElementTypeButton[@name\u003d\"カートに追加\"]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:250)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:41)\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\n\tat io.appium.java_client.ios.IOSDriver.execute(IOSDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:61)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat io.appium.java_client.ios.IOSDriver.findElement(IOSDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementByXPath(DefaultGenericMobileDriver.java:151)\n\tat io.appium.java_client.AppiumDriver.findElementByXPath(AppiumDriver.java:1)\n\tat io.appium.java_client.ios.IOSDriver.findElementByXPath(IOSDriver.java:1)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:57)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat io.appium.java_client.ios.IOSDriver.findElement(IOSDriver.java:1)\n\tat StepDefinitions.StepDefinitions.verify_supplement_should_show_inside_the_tab(StepDefinitions.java:248)\n\tat ✽.verify supplement should show inside the tab(classpath:Features/RC4.feature:55)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded1.png", "Verify_recommendation_supplement_should_show_inside_the_recommendation_tab");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify recommendation category inside the recommendation tab",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@case_91"
    },
    {
      "name": "@Regresion"
    }
  ]
});
formatter.write("Platform name: iOS");
formatter.write("Device name: iPhone");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on plus icon from recommend section",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_plus_icon_from_recommend_section()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: An element could not be located on the page using the given search parameters.\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027192.168.1.11\u0027, ip: \u00272402:a00:401:a870:e15d:4c3f:ed67:39c0%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002715.2\u0027, java.version: \u002717.0.2\u0027\nDriver info: io.appium.java_client.ios.IOSDriver\nCapabilities {app: com.dearnatura.supplementapp, autoAcceptAlerts: true, automationName: XCUITest, browserName: , databaseEnabled: false, deviceName: iPhone 11, javascriptEnabled: true, language: ja, locale: ja_JP, locationContextEnabled: false, networkConnectionEnabled: false, platform: MAC, platformName: iOS, platformVersion: 18.1, takesScreenshot: true, udid: 00008030-001255311498C02E, webStorageEnabled: false, xcodeOrgId: S4T6PVN6LR, xcodeSigningId: iPhone Developer}\nSession ID: d50cd02f-4870-403d-af64-c216d817cecb\n*** Element info: {Using\u003dxpath, value\u003d//XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeScrollView}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:250)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:41)\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\n\tat io.appium.java_client.ios.IOSDriver.execute(IOSDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:61)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat io.appium.java_client.ios.IOSDriver.findElement(IOSDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementByXPath(DefaultGenericMobileDriver.java:151)\n\tat io.appium.java_client.AppiumDriver.findElementByXPath(AppiumDriver.java:1)\n\tat io.appium.java_client.ios.IOSDriver.findElementByXPath(IOSDriver.java:1)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:57)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat io.appium.java_client.ios.IOSDriver.findElement(IOSDriver.java:1)\n\tat StepDefinitions.StepDefinitions.Click_on_plus_icon_from_recommend_section(StepDefinitions.java:255)\n\tat ✽.Click on plus icon from recommend section(classpath:Features/RC4.feature:60)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded2.png", "Verify_recommendation_category_inside_the_recommendation_tab");
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the Add to Cart button should be displayed on the product",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@case_93"
    },
    {
      "name": "@Regresion"
    }
  ]
});
formatter.write("Platform name: iOS");
formatter.write("Device name: iPhone");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Verify add to cart button should show on product",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});