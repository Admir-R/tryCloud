package com.tryCloud.step_definitions;

import com.tryCloud.pages.BasePage;
import com.tryCloud.pages.Dashboard_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Widget_StepDefs extends BasePage {

    @Override
    public void clickMenuByText(String text) {
        super.clickMenuByText(text);
    }
    Dashboard_Page widgets = new Dashboard_Page();

    @When("user clicks Customize button")
    public void user_clicks_customize_button() {
        widgets.customizeButton.click();
    }
    @Then("user can see the widgets")
    public void user_can_see_the_widgets() {
        Dashboard_Page.widgetsDisplayed();
    }
    @Then("user can click on any of them")
    public void user_can_click_on_any_of_them() {
        Dashboard_Page.widgetsSelect();

    }

}
