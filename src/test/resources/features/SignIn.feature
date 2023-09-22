Feature: Sign in Action

Scenario: Successful Sign in with Valid Credentials
	Given i am on Home Page
	When click sign in
	And enter valid UserName and Password 
	And click login button
	Then Navigates to home page and diplays message - You are logged in
