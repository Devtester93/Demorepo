Feature: Free CRM Login Feature


#Without Example
#Scenario: Free CRM Login Test Scenario
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "naveenk" and user enters "test@123"
#Then user clicks on login button
#Then user is on home page
#And Close the browser

#With Example
Scenario Outline: Free CRM Login Test Scenario
Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and user enters "<password>"
Then user clicks on login button
Then user is on home page
And Close the browser

Examples:

   | username | password     |
   | naveenk  | test@123     |
   | devtester| Welcome@123  |