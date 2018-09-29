Feature: Create Account Test

Scenario: Verify for signin page
Given user launch browser
When user enter URL
Then user should see signin option


Scenario Outline: Validate Create account functionality
Given user launch browser
When user enter URL
Then user should see signin option
When user click on signin option
And user enter email address "<emailAddress>"
And user click on create an account button
And user enter first name "<firstName>"
And user enter last name "<lastName>"
And user enter password "<password>"

Examples:
|emailAddress             |firstName|lastName|password |
|manoj87686@mailinator.com|manoj    |manoj   |manoj@123|