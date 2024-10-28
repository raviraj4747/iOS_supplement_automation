Feature: RC4 Test Scenarios   
    
  Feature: RC4 Test Scenarios  
  
   
  @Regresion
  Scenario: Verify app should open successfully without crashing
    Then Verify app open with onboarding flow
    
    
  @Regresion
  Scenario: Verify app should open and redirecting user to Signup and Login page
     When Click on next button from onboarding flow and verify user redirected to Signup screen
     
  @Regresion
  Scenario: Verify sign-up page should open
     When Click on the signup button  
     Then Verify signup page should open  
     
  @Regresion
  Scenario: Verify the Login functionality with In-correct id and password
     When Enter Email id and Password incorrect   
     Then Click on Login button
     Then Verify validation message should show    
     
  @Regresion
  Scenario: Verify the Login functionality with correct id and password
     When Enter Email id and Password    
     Then Click on Login button
     Then Verify Recommandation tab should show with result   
     
     
  @Regresion
  Scenario: Verify supplement should show in the supplement list page
     When Naivgate to supplement list tab   
     Then Verify supplement should show
     
  @Regresion
  Scenario: Verify bottle listed on bottle tab
     When Naivgate to bottle list page 
     Then Verify bottle  should show   
  
  @Regresion
  Scenario: Verify recommmendation section should show
     When Naivgate to recommendation section and click on plus icon
     Then Verify supplements should show   
     
  @Regresion
  Scenario: Verify the Signout functionality
     When Click on Menu icon icon and click on Log out button   
     Then Verify Log out successfully        
          
     
     
    