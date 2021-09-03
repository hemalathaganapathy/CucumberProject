Feature: OrangeHRM Login Action
Scenario: Successful Login OrangeHRM
Given User  Enter into The OrangeHRM Page
When User Giving the Credentials
And Click the login Button
Then print user successfully logged in

Scenario: Successful LogOut
	When User LogOut from the Application
	Then Message displayed LogOut Successfully