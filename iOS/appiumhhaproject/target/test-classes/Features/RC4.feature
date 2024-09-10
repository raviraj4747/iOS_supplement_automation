Feature: RC4 Test Scenarios   
    
  Feature: RC4 Test Scenarios   
  
  @Regresion
  Scenario: Verify app should open successfully without crashing
    When Add a Drink button should show
    
  @Regresion
  Scenario: Verify all tabs open without any crashing i.e Home, Drink Logger, Drink Stats, More
    When Add a Drink button should show
    Then Click on Home tab
    Then Click on Drink Logger tab
    Then Click on Drink Stats tab
    Then Click on More tab
    
  @Regresion
  Scenario: verify User is able to Add/delete drink type as Beer without specifying Drink Details option
    Given Click on Add a Drink button
    Given Select drink type new
    When Select any Drink Type
    Then Specify Drink Details link should show 
    Then Click on Add Drink button
    Then Click on Drink Logger tab
    Then Verify Drink Added for the first
    Then Delete the Drink
    Then Verify drink should not show  
       
    
 
  @Regresion
  Scenario: Verify Drinking stats arrow redirect user to drinking stats screen
    When Click on arrow to redirect drinking stats screen
    Then Verify all three sections
    
    
  @Regresion
  Scenario: verify the value of drinking days this week,Total drinks consumed this week and drink free days this week stats
    Given Click on Add a Drink button
    Given Select drink type new
    When Select any Drink Type
    Then Specify Drink Details link should show 
    Then Click on Add Drink button
    Then Verify value of drinking days this week
    Then Verify total drinks consumed this week
    Then Verify drink free days this week value
    
    
  @Regression
  Scenario: Verify user is able to add a drink with Specify Drink Details screen with past date
    Given Click on Add a Drink button
    Then Select drink type new 
    Then Select any Drink Type
    When Click on Specify Drink Details link
    Then Navigate to Add Drink Details page
    When Select mug as select serving size
    Then select past date from data picker 
    Given Click on Save Drink button from specify link
    Then Click on Drink Logger tab
    Then verify drink added for past date from specify link   
    
    
    
  @Regresion
  Scenario: verify User is able to Add drink type as Cocktail without specifying Drink Details option
    Given Click on Add a Drink button
    Given Select drink type new
    When Select Drink Type as Cocktail
    Then Specify Drink Details link should show 
    Then Click on Add Drink button
    Then Click on Drink Logger tab
    Then Verify Cocktail has added   
    
    
  @Regresion
  Scenario: verify User is able to Add drink type as Liquor without specifying Drink Details option
    Given Click on Add a Drink button
    Given Select drink type new
    When Select Drink Type as liquor1
    Then Specify Drink Details link should show 
    Then Click on Add Drink button
    Then Click on Drink Logger tab
    Then Verify Liquor has added   
    
    
  @Regresion
  Scenario: verify User is able to Add drink type as wine without specifying Drink Details option
    Given Click on Add a Drink button
    Given Select drink type new
    When Select Drink Type as wine
    Then Specify Drink Details link should show 
    Then Click on Add Drink button
    Then Click on Drink Logger tab
    Then Verify wine has added   
    
  @Regresion
  Scenario: Tap to Take a photo button and verify camera should open
    Given Click on Add a Drink button
    When Click on Take a photo
    Then Verify camera should open   
    
  @Regresion
  Scenario: Tap to Take a photo button and verify camera should open
    Given Click on Add a Drink button
    When Click on Take a photo
    Then Verify camera should open   
    
  @Regression
  Scenario: Verify user is able to add a drink with Specify Drink Details screen
    Given Click on Add a Drink button
    Then Select drink type new 
    Then Select any Drink Type
    When Click on Specify Drink Details link
    Then Navigate to Add Drink Details page
    When Select Can as select serving size
    Then Drink Size ml should show as three hundred fifty
    Then Click on plus icon and add one more drink
    Given Click on Save Drink button from specify link
    Then Click on Drink Logger tab
    Then verify drink added from specify link


  @Regression
  Scenario: Verify user is able to add a drink as type Cocktail 
    Given Click on Add a Drink button
    Then Select drink type new 
    Then Select Drink Type as Cocktail
    When Click on Specify Drink Details link
    Then Navigate to Add Drink Details page
    When Select cocktail type from dropdown
    Given Click on Save Drink button from specify link
    Then Click on Drink Logger tab
    Then verify cocktail custom drink added 


  @Regression
  Scenario: Verify user is able to add a drink as type wine
    Given Click on Add a Drink button
    Then Select drink type new 
    Then Select Drink Type as wine and scroll 
    When Click on Specify Drink Details link
    Then Navigate to Add Drink Details page
    When Select sparkling as type
    Given Click on Save Drink button from specify link
    Then Click on Drink Logger tab
    Then Verify wine has added  
    
      
    