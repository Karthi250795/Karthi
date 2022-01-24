Feature: Verifying adactin hotel

Scenario: Verifying adactin hotel login with valid credentials
Given user is on adactin hotel page
When user should enter username and password
And user should click login button
Then user should verify succesfully login
