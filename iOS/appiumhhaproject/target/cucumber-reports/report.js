$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:Features/RC4.feature");
formatter.feature({
  "name": "RC4 Test Scenarios",
  "description": "  Feature: RC4 Test Scenarios   ",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify app should open successfully without crashing",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regresion"
    }
  ]
});
formatter.write("Platform name :iOS");
formatter.write("Device name : iPhone");
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
  "name": "Verify app should allow user to navigate Start registeration flow",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regresion"
    }
  ]
});
formatter.write("Platform name :iOS");
formatter.write("Device name : iPhone");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on next button from onboarding flow",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_next_button_from_onboarding_flow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Start registeration button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Start_registeration_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Login button should appear",
  "keyword": "Given "
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