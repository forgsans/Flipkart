Feature: Manage feature

Background: user is successfully logged in
Given user opens "Chrome" browser and exe "C:\\\\Sandhya\\\\Training\\\\Automation_Support_Tools\\\\chromedriver.exe"
Given user enters url as "https://www.flipkart.com/"
Given user cancel the initial login window
Given user move on Login button
When user click on my profile
When user enter "8106367400" as username
When user enter "Flipkart123" as password
When user click on Login button




Scenario: Manage address functionality
When user click on manage address
When user click on ADD A NEW ADDRESS
When user enter "Lakshmi" as name
When user enter "8763457246" as mobile number
When user enter "500029" as pincode
When user enter "Ecil" as locality
When user enter "Near bus stop" as address
When user click on save button
Then validate address is added successfully

@RegressionTest
Scenario: Manage address functionality
When user click on manage address
When user click on ADD A NEW ADDRESS
When user enter "Lakshmi" as name
When user enter "8763457248" as mobile number
When user enter "500029" as pincode
When user enter "Ecil" as locality
When user enter "Near bus stop" as address
When user click on save button
Then validate address is added successfully