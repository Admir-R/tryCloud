@B31G8-187
Feature: Default

	Background:
		#@B31G8-171
		Given User is on the dashboard page
		


	@B31G8-184
	Scenario: US001-TC001 User can see all modules and Username
		When user is on the dashboard
		And user can see the dashboard modules
		And user clicks on the profile icon
		Then user can see the username	


	@B31G8-185
	Scenario: US001-TC002 User can click on Customize button and select any of the Widgets
		When user clicks Customize button
		Then user can see the widgets
		And user can click on any of them	


	@B31G8-186
	Scenario: US001-TC003 User can click on Set Status button and select any of the Status options
		When user clicks on Set Status button
		Then user can see the Status options
		And user can select any of the status options