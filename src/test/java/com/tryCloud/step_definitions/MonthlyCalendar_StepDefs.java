package com.tryCloud.step_definitions;

import com.tryCloud.pages.BasePage;
import com.tryCloud.pages.CalendarPage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MonthlyCalendar_StepDefs extends BasePage {

    @Override
    public void clickMenuByText(String text) {
        super.clickMenuByText(text);
    }

    CalendarPage monthlyCalendarPage = new CalendarPage();
    @When("user clicks on the Month option")
    public void user_clicks_on_the_month_option() {
        monthlyCalendarPage.monthSelection.click();
    }
    @Then("user can see monthly calendar view")
    public void user_can_see_monthly_calendar_view() {
        LocalDate expectedLocalDate = LocalDate.now();
        DateTimeFormatter df;
        df = DateTimeFormatter.ofPattern("MMMM y");

        BrowserUtils.sleep(4);

        Assert.assertEquals(expectedLocalDate.format(df), monthlyCalendarPage.dateBox.getText());
    }
}
