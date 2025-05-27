Feature: RC4 Test Scenarios   


  @case_79
  @Regresion
  Scenario: Verify user is able to open the supplement app 
   Then Verify app open with onboarding flow   
    
  @case_80
  @Regresion
  Scenario: Verify onboarding flow after opening the application  
   Then Verify on boaring flow should open

  @case_81   
  @Regresion
  Scenario: Verify signup page should open after clicking on Signup button 
   When Verify on boaring flow should open
   Then Click on the signup button 
   Then Verify signup page should open    
     
  @case_82   
  @Regresion
  Scenario: Verify login page should open after clicking on login button 
   When Verify on boaring flow should open
   Then Click on the login button 
   Then Verify login page should open   
     
  @case_87
  @Regresion
  Scenario: Verify Skip tutorial functionality
   Then Navigate to the Sigup and login button page  
   
  @case_200
  @Regresion
  Scenario: Verify Cancel pop up functionality from external web page
   When Verify on boaring flow should open
   Then Click on the signup button  
   Then Verify Cancel button functionality from pop up
   
        
        