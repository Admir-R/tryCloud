@B31G8-175
Feature: US-002 Upload/Edit/Delete File Module Functionality

	Background:
		#@B31G8-171
		Given User is on the dashboard page
		When user clicks the "files" module
		



	@B31G8-170
	Scenario: US002-TC01 User is able to upload a file
	   #When user clicks the "files" module
		And user click the plus icon
		And user selects any file and upload
		#Then user see uploaded file



	@B31G8-172
	Scenario: US002-TC02 User is able to create a new folder
		#When user clicks the "files" module
		And user click the plus icon
		And user clicks New folder file
		Then type name of folder and click arrow icon
		Then user see New folder file	



	@B31G8-173
	Scenario: US002-TC03 User is able to delete any selected item from its three dots menu
		#When user clicks the "files" module
		And select "folder or file" that wants to delete,click three dots menu
		#Then click three dots menu
		Then the user delete selected folder or file
		Then user cannot sees deleted items



	@B31G8-174
	Scenario: US002-TC04 User is able to see the total number of files and folders under the files list table
		#When user clicks the "files" module
		And user go to files list table
		Then user sees the number of the file and folder