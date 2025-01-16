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
     
  @Regresion
  Scenario: Verify back button functionality from signup and login page 
     When Click on the back button from signup page and verify 
     Then Click on the back button from login page and verify

  @Regresion
  Scenario: Verify Already a user ? Log in here functionality
      Given Click here if you have an account link 

  @Regresion
  Scenario: Verify No account yet Sign up here functionality 
     Given Click on No account yet Sign up here link  

  @Regresion
  Scenario: Verify skip functionality
     Given Click on skip functionality link  

  @Regresion    
  Scenario: Verify user is able to login to the system 
     When Enter Email id and Password
     Then Click on Login button

  @Regresion    
  Scenario: Verify recommendation supplement should show inside the recommendation tab
     Then verify supplement should show inside the tab   
     
  @Regresion    
  Scenario: Verify recommendation category inside the recommendation tab
     Then Click on plus icon from recommend section
     
   @Regresion    
  Scenario: Verify the Add to Cart button should be displayed on the product
     Then Verify add to cart button should show on product  
     
     
     
  