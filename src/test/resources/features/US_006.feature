@B31G8-169
Feature: User can create a new conversation by adding any selected participant

	@B31G8-167
	Scenario: create a new conversation by adding any selected participant

		Given the user is on the Talk module screen
		When the user selects the option to create a new conversation
		And the user adds a selected participant to the conversation
		Then the conversation should be created with the selected participant
		And the user should be able to see the new conversation in the conversation list	

	
	@B31G8-168
	Scenario:  User can delete a conversation

		
		Given the user is on the Talk module screen
		And there is an existing conversation in the conversation list and click threeDash
		When the user selects the option to delete a conversation
		And  click yes confirms the deletion
