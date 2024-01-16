package com.tryCloud.step_definitions;

import com.tryCloud.pages.LoginPage;
import com.tryCloud.pages.US_006TalkPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class US_006Talk_StepDefs {
LoginPage loginPage=new LoginPage();
US_006TalkPage talkPage=new US_006TalkPage();



    @Given("the user is on the Talk module screen")
    public void the_user_is_on_the_talk_module_screen() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login("User83","Userpass123");
        talkPage.TalkButton.click();

    }

    @When("the user selects the option to create a new conversation")
    public void theUserSelectsTheOptionToCreateANewConversation() {
        talkPage.plusIcon.click();


    }

    @And("the user adds a selected participant to the conversation")
    public void the_User_Adds_A_Selected_Participant_To_Selected(){
      talkPage.conversationName.sendKeys("A");
      talkPage.AllowsGuestToJoin.click();


    }

    @Then("the conversation should be created with the selected participant")
    public void theConversationShouldBeCreatedWithTheSelectedParticipant() {

        talkPage.addParticipants.click();
        talkPage.createConversation.click();

        talkPage.closeButton.click();
    }

    @And("the user should be able to see the new conversation in the conversation list")
    public void theUserShouldBeAbleToSeeTheNewConversationInTheConversationList() {

       BrowserUtils.verifyElementDisplayed(talkPage.actual);

    }

    @And("there is an existing conversation in the conversation list and click threeDash")
    public void thereIsAnExistingConversationInTheConversationListAndClickThreeDash() {
        talkPage.threeDash.click();
    }

    @When("the user selects the option to delete a conversation")
    public void theUserSelectsTheOptionToDeleteAConversation() {

        talkPage.DeleteConversation.click();
    }

    @Then ("click yes confirms the deletion")
    public void clickYesConfirmsTheDeletion() {
        talkPage.yesButton.click();
    }

    
}


