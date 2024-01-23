package com.tryCloud.step_definitions;

import com.tryCloud.pages.BasePage;
import com.tryCloud.pages.CalendarPage;
import com.tryCloud.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WeeklyCalendar_StepDef extends BasePage {
    @Override
    public void clickMenuByText(String text) {
        super.clickMenuByText(text);
    }

    CalendarPage weeklyCalendarPage = new CalendarPage();

    @When("user clicks on the Week option")
    public void user_clicks_on_the_week_option() {
        weeklyCalendarPage.weekSelection.click();

    }
    @Then("user can see weekly calendar view")
    public void user_can_see_weekly_calendar_view() {
        Assert.assertTrue((weeklyCalendarPage.dateBox.getText()).contains("Week"));

    }
}
