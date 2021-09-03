Feature: OrangeHRM Login Action without example keywors
Scenario: Successful Login OrangeHRM without example keywors
Given User  Enter into The OrangeHRM Page without example keywors
When User Giving the Credentials "Admin" and "admin123"
And Click the login Button without example keywors
Then print user successfully logged in without example keywors

Scenario: Successful LogOut without example keywors
	When User LogOut from the Application without example keywors
	Then Message displayed LogOut Successfully without example keywors