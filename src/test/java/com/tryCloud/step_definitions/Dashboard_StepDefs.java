package com.tryCloud.step_definitions;

import com.tryCloud.pages.BasePage;
import com.tryCloud.pages.Dashboard_Page;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Dashboard_StepDefs extends BasePage {

    @Override
    public void clickMenuByText(String text) {
        super.clickMenuByText(text);
    }

    Dashboard_Page dashboardPage = new Dashboard_Page();

    @When("user is on the dashboard")
    public void user_is_on_the_dashboard() {
        BrowserUtils.verifyTitleContains("Dashboard");
    }
    @When("user can see the dashboard modules")
    public void user_can_see_the_dashboard_modules() {

        Dashboard_Page.dashboardModules();
    }
    @When("user clicks on the profile icon")
    public void user_clicks_on_the_profile_icon() {
        dashboardPage.userIcon.click();

    }
    @Then("user can see the username")
    public void user_can_see_the_username() {
        String expectedUsername = ConfigurationReader.getProperty("user_username");
        String actualUsername = dashboardPage.userBox.getText();
        Assert.assertTrue(actualUsername.equals(expectedUsername));

    }
}
