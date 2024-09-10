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
  "name": "Add a Drink button should show",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Add_a_Drink_button_should_show()"
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
  "name": "Verify all tabs open without any crashing i.e Home, Drink Logger, Drink Stats, More",
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
  "name": "Add a Drink button should show",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Add_a_Drink_button_should_show()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Home tab",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Home_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Drink Logger tab",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Drink_Logger_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Drink Stats tab",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Drink_Stats_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on More tab",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_More_tab()"
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
  "name": "verify User is able to Add/delete drink type as Beer without specifying Drink Details option",
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
  "name": "Click on Add a Drink button",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Add_a_Drink_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select drink type new",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Select_drink_type_new()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select any Drink Type",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Select_any_Drink_Type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Specify Drink Details link should show",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Specify_Drink_Details_link_should_show()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add Drink button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Add_Drink_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Drink Logger tab",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Drink_Logger_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Drink Added for the first",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Verify_Drink_Added_for_the_first()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Delete the Drink",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Delete_the_Drink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify drink should not show",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Verify_drink_should_not_show()"
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
  "name": "Verify Drinking stats arrow redirect user to drinking stats screen",
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
  "name": "Click on arrow to redirect drinking stats screen",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_arrow_to_redirect_drinking_stats_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify all three sections",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Verify_all_three_sections()"
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
  "name": "verify the value of drinking days this week,Total drinks consumed this week and drink free days this week stats",
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
  "name": "Click on Add a Drink button",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Add_a_Drink_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select drink type new",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Select_drink_type_new()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select any Drink Type",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Select_any_Drink_Type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Specify Drink Details link should show",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Specify_Drink_Details_link_should_show()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add Drink button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Add_Drink_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify value of drinking days this week",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Verify_value_of_drinking_days_this_week()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify total drinks consumed this week",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Verify_total_drinks_consumed_this_week()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify drink free days this week value",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Verify_drink_free_days_this_week_value()"
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
  "name": "Verify user is able to add a drink with Specify Drink Details screen with past date",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.write("Platform name :iOS");
formatter.write("Device name : iPhone");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add a Drink button",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Add_a_Drink_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select drink type new",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Select_drink_type_new()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select any Drink Type",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Select_any_Drink_Type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Specify Drink Details link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Specify_Drink_Details_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to Add Drink Details page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Navigate_to_Add_Drink_Details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select mug as select serving size",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Select_mug_as_select_serving_size()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select past date from data picker",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.select_past_date_from_date_picker()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Save Drink button from specify link",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Save_Drink_button_from_specify_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Drink Logger tab",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Drink_Logger_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify drink added for past date from specify link",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.verify_drink_added_for_past_date_from_specify_link()"
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
  "name": "verify User is able to Add drink type as Cocktail without specifying Drink Details option",
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
  "name": "Click on Add a Drink button",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Add_a_Drink_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select drink type new",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Select_drink_type_new()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Drink Type as Cocktail",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Select_Drink_Type_as_Cocktail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Specify Drink Details link should show",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Specify_Drink_Details_link_should_show()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add Drink button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Add_Drink_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Drink Logger tab",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Drink_Logger_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Cocktail has added",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Verify_Cocktail_has_added()"
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
  "name": "verify User is able to Add drink type as Liquor without specifying Drink Details option",
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
  "name": "Click on Add a Drink button",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Add_a_Drink_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select drink type new",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Select_drink_type_new()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Drink Type as liquor1",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Select_Drink_Type_as_liquor1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Specify Drink Details link should show",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Specify_Drink_Details_link_should_show()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add Drink button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Add_Drink_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Drink Logger tab",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Drink_Logger_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Liquor has added",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Verify_Liquor_has_added()"
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
  "name": "verify User is able to Add drink type as wine without specifying Drink Details option",
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
  "name": "Click on Add a Drink button",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Add_a_Drink_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select drink type new",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Select_drink_type_new()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Drink Type as wine",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Select_Drink_Type_as_wine()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Specify Drink Details link should show",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Specify_Drink_Details_link_should_show()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add Drink button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Add_Drink_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Drink Logger tab",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Drink_Logger_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify wine has added",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Verify_wine_has_added()"
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
  "name": "Tap to Take a photo button and verify camera should open",
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
  "name": "Click on Add a Drink button",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Add_a_Drink_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Take a photo",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Take_a_photo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify camera should open",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Verify_camera_should_open()"
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
  "name": "Tap to Take a photo button and verify camera should open",
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
  "name": "Click on Add a Drink button",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Add_a_Drink_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Take a photo",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Take_a_photo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify camera should open",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Verify_camera_should_open()"
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
  "name": "Verify user is able to add a drink with Specify Drink Details screen",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.write("Platform name :iOS");
formatter.write("Device name : iPhone");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add a Drink button",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Add_a_Drink_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select drink type new",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Select_drink_type_new()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select any Drink Type",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Select_any_Drink_Type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Specify Drink Details link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Specify_Drink_Details_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to Add Drink Details page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Navigate_to_Add_Drink_Details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Can as select serving size",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Select_Can_as_select_serving_size()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Drink Size ml should show as three hundred fifty",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Drink_Size_ml_should_show_as_three_hundred_fifty()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on plus icon and add one more drink",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_plus_icon_and_add_one_more_drink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Save Drink button from specify link",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Save_Drink_button_from_specify_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Drink Logger tab",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Drink_Logger_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify drink added from specify link",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.verify_drink_added_from_specify_link()"
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
  "name": "Verify user is able to add a drink as type Cocktail",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.write("Platform name :iOS");
formatter.write("Device name : iPhone");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add a Drink button",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Add_a_Drink_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select drink type new",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Select_drink_type_new()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Drink Type as Cocktail",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Select_Drink_Type_as_Cocktail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Specify Drink Details link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Specify_Drink_Details_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to Add Drink Details page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Navigate_to_Add_Drink_Details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select cocktail type from dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Select_cocktail_type_from_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Save Drink button from specify link",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Save_Drink_button_from_specify_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Drink Logger tab",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Drink_Logger_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify cocktail custom drink added",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.verify_cocktail_custom_drink_added()"
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
  "name": "Verify user is able to add a drink as type wine",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.write("Platform name :iOS");
formatter.write("Device name : iPhone");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add a Drink button",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Add_a_Drink_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select drink type new",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Select_drink_type_new()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Drink Type as wine and scroll",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Select_Drink_Type_as_wine_and_scroll()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Specify Drink Details link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Specify_Drink_Details_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to Add Drink Details page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Navigate_to_Add_Drink_Details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select sparkling as type",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Select_sparkling_as_type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Save Drink button from specify link",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Save_Drink_button_from_specify_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Drink Logger tab",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Click_on_Drink_Logger_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify wine has added",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.StepDefinitions.Verify_wine_has_added()"
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