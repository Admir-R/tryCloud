@B31G8-183
Feature: Default

	Background:
		#@B31G8-171
		Given User is on the dashboard page
		

	@B31G8-179
	Scenario: US005-TC001 User can display daily calendar view
		When user clicks on the calendar icon on the dashboard
		And user clicks on the view icon
		And user clicks on the Day option
		Then user can see daily calendar view	


	@B31G8-180
	Scenario: US005-TC002 User can display weekly calendar view
		When user clicks on the calendar icon on the dashboard
		And user clicks on the view icon
		And user clicks on the Week option 
		Then user can see weekly calendar view	

	@B31G8-181
	Scenario: US005-TC003 User can display monthly calendar view
		When user clicks on the calendar icon on the dashboard
		And user clicks on the view icon
		And user clicks on the Month option
		Then user can see monthly calendar view	

	@B31G8-182
	Scenario: US005-TC004 User can create a new event under the Calendar module and see it on the related day through the Monthly Calendar view
		When user clicks on the calendar icon on the dashboard
		And user clicks on the New Event button
		And user types in an "event title"
		And user selects the event starting date
		And user selects the ending date
		And user clicks Save 
		Then user can see the new event on monthly calendar view