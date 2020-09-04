Feature: login functionality

#@run
@sanity
Scenario: vlaid login
Given user should be on login page
When user enters userid and password adn click login button
Then user should be land on home page
And close the browser




#@run
@smoke
Scenario: E2E lead creation 

Given user should be on login page
When user enters userid and password adn click login button
Then user should be land on home page
When user clicks on create lead link
Then user navigates on lead page
When user enters lastname and company name
And click on save button
Then lead should be created successfully
And click on logout link
And close the browser



@run
Scenario Outline: invlaid login


Given user should be on login page
When user enters wrong  "<Userid>" and wrong "<Password>" and click on login button
#Then user should be land on home page
And close the browser
Examples:
|Userid|Password|
|admin1|admin1|
|admin2|admin2|
|admin3|admin3|