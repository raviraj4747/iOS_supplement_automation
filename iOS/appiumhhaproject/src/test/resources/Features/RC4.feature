Feature: RC4 Test Scenarios   
    
  Feature: RC4 Test Scenarios   
  
  @Regresion
  Scenario: Verify app should open successfully without crashing
    Then Verify app open with onboarding flow
    
  @Regresion
  Scenario: Verify app should allow user to navigate Start registeration flow
     When Click on next button from onboarding flow
     Then Click on Start registeration button
     Given Verify Login button should appear
     
    