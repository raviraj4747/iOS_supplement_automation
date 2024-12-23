Feature: RC4 Test Scenarios   
    
  Feature: RC4 Test Scenarios    
     
  @Regresion
  Scenario: Verify user is able to open the supplement app 
    Then Verify app open with onboarding flow
    
  @Regresion
  Scenario: Verify onboarding flow after opening the application 
     When Verify user should be redirected to the Signup page
     
  @Regresion
  Scenario: Verify signup page should open after clicking on Signup button 
     When Click on the signup button  
     Then Verify signup page should open  
     
  @Regresion
  Scenario: Verify login page should open after clicking on login button 
     When Click on the login button from onboarding 
     Then Verify login page should open
    
    