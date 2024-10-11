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
  "name": "Verify app should open and redirecting user to Signup and Login page",
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
  "name": "Click on next button from onboarding flow and verify user redirected to Signup screen",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_next_button_from_onboarding_flow_and_verify_user_redirected_to_Signup_screen()"
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
  "name": "Verify the Login functionality",
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
  "name": "Enter Email id and Password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Start_registeration_button()"
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
  "status": "passed"
});
formatter.step({
  "name": "Verify Recommandation tab should show with result",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Verify_Recommandation_tab_should_show_with_result()"
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
  "name": "Verify supplement should show in the supplement list page",
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
  "name": "Naivgate to supplement list tab",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Naivgate_to_supplement_list_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify supplement should show",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Verify_supplement_should_show()"
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
  "name": "Verify bottle listed on bottle tab",
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
  "name": "Naivgate to bottle list page",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Naivgate_to_bottle_list_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify bottle  should show",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Verify_bottle_should_show()"
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
  "name": "Verify recommmendation section should show",
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
  "name": "Naivgate to recommendation section and click on plus icon",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Naivgate_to_recommendation_section_and_click_on_plus_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify supplements should show",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Verify_supplements_should_show()"
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
});