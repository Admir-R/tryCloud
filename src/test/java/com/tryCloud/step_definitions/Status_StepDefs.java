package com.tryCloud.step_definitions;

import com.tryCloud.pages.BasePage;
import com.tryCloud.pages.Dashboard_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Status_StepDefs extends BasePage {

    @Override
    public void clickMenuByText(String text) {
        super.clickMenuByText(text);
    }

    Dashboard_Page status = new Dashboard_Page();

    @When("user clicks on Set Status button")
    public void user_clicks_on_set_status_button() {
        status.statusButton.click();
    }
    @Then("user can see the Status options")
    public void user_can_see_the_status_options() {
        Dashboard_Page.statusOptionsDisplayed();
    }
    @Then("user can select any of the status options")
    public void user_can_select_any_of_the_status_options() {
        Dashboard_Page.statusSelect();
    }

}
