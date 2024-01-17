package com.tryCloud.step_definitions;

import com.tryCloud.pages.BasePage;
import com.tryCloud.pages.CalendarPage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DailyCalendar_StepDef extends BasePage {

    @Override
    public void clickMenuByText(String text) {
        super.clickMenuByText(text);
    }
    LoginPage loginPage = new LoginPage();

    CalendarPage dailyCalendarPage = new CalendarPage();

    @Given("User is on the dashboard page")
    public void user_is_on_the_dashboard_page() {

        loginPage.login(ConfigurationReader.getProperty("user_username"), ConfigurationReader.getProperty("user_password"));
    }

    @When("user clicks on the calendar icon on the dashboard")
    public void user_clicks_on_the_calendar_icon_on_the_dashboard() {
        clickMenuByText("Calendar");

    }
    @When("user clicks on the view icon")
    public void user_clicks_on_the_view_icon() {
        dailyCalendarPage.viewButton.click();

    }
    @When("user clicks on the Day option")
    public void user_clicks_on_the_day_option() {
        dailyCalendarPage.daySelection.click();

    }
    @Then("user can see daily calendar view")
    public void user_can_see_daily_calendar_view() {
        LocalDate expectedLocalDate = LocalDate.now();
        DateTimeFormatter df;
        df = DateTimeFormatter.ofPattern("MMM d, y");

        BrowserUtils.sleep(4);

        Assert.assertEquals(expectedLocalDate.format(df), dailyCalendarPage.dateBox.getText());
    }
}
