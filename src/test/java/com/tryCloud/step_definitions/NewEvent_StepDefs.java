package com.tryCloud.step_definitions;

import com.tryCloud.pages.BasePage;
import com.tryCloud.pages.CalendarPage;
import com.tryCloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NewEvent_StepDefs extends BasePage {

    @Override
    public void clickMenuByText(String text) {
        super.clickMenuByText(text);
    }

    CalendarPage newEvent = new CalendarPage();

    @When("user clicks on the New Event button")
    public void user_clicks_on_the_new_event_button() {
        newEvent.newEventButton.click();
    }
    @When("user types in an {string}")
    public void user_types_in_an(String string) {
        newEvent.eventTitleBox.sendKeys(string);

    }
    @When("user selects the event starting date")
    public void user_selects_the_event_starting_date() {
        newEvent.allDayCheckbox.click();
        BrowserUtils.sleep(4);
        newEvent.startingDateBox.click();
        CalendarPage.clickStartingDate("24");

    }
    @When("user selects the ending date")
    public void user_selects_the_ending_date() {
        newEvent.endingDateBox.click();
        BrowserUtils.sleep(4);
        CalendarPage.clickEndingDate("26");

    }
    @When("user clicks Save")
    public void user_clicks_save() {
        BrowserUtils.sleep(2);
        newEvent.saveButton.click();

    }
    @Then("user can see the new event on monthly calendar view")
    public void user_can_see_the_new_event_on_monthly_calendar_view() {
        Assert.assertTrue(newEvent.savedEventBox.isDisplayed());
    }
}
