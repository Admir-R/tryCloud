@B31G8-191
Feature: Contact Group Functionality under Contacts Module

	
	@B31G8-188
	Scenario: US008-TC001 User can create a new group under Contacts Module
		Given user is on the Contacts page
		     When user clicks on the New Group button
		     Then user should see Create a new group input box and enters a new group name
		     Then user should see the newly created group name on the left with existing group names
		     Then user should see the newly created group name in the Groups dropdown	

	
	@B31G8-189
	Scenario: US008-TC002 User can see all the available groups name through the group’s dropdown menu existing in the contact’s own info menu
		Given user is on the Contacts page
		 When  user clicks on Groups dropdown input box
		 Then  all the available groups names in the group’s dropdown menu and the contact’s own info menu should be the same	

	
	@B31G8-190
	Scenario: US008-TC003 User can add a new property as “Anniversary” to the contact’s info page from the “Add new property” dropdown menu.
		Given user is on the Contacts page
		 When user is on the All Contacts page and one of the contacts is selected
		 And  user should be able to see the Add New Property dropdown and selects Annivesary option
		 Then user should see the newly created Anniversary module with a calender dropdown in the contact’s info page