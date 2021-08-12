Feature: Login feature

Background: user is successfully logged in
Given user opens "Chrome" browser and exe "C:\\\\Sandhya\\\\Training\\\\Automation_Support_Tools\\\\chromedriver.exe"
Given user enters url as "https://www.flipkart.com/"
Given user cancel the initial login window
Given user move on Login button


@SmokeTest
Scenario: Login functionality with valid username and valid password
When user click on my profile
When user enter "8106367400" as username
When user enter "Flipkart123" as password
When user click on Login button
Then valid login page

@RegressionTest
Scenario: Login functionality with valid username and invalid password
When user click on my profile
When user enter "8106367400" as username
When user enter "Flipkart1289" as password
When user click on Login button
Then valid login page

@RegressionTest
Scenario: Login functionality with invalid username and valid password
When user click on my profile
When user enter "8106367408" as username
When user enter "Flipkart128" as password
When user click on Login button
Then valid login page
