package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalendarPage {
    public CalendarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//button[@aria-label='Actions'])[1]")
    public WebElement viewButton;

    @FindBy (xpath = "//span[.='Day']")
    public WebElement daySelection;

    @FindBy (xpath = "//span[.='Week']")
    public WebElement weekSelection;

    @FindBy (xpath = "//span[.='Month']")
    public WebElement monthSelection;

    @FindBy (xpath = "//button[@class='datepicker-button-section__datepicker-label button datepicker-label']")
    public WebElement dateBox;

    @FindBy (xpath = "//button[@class='button primary new-event']")
    public WebElement newEventButton;

   @FindBy (xpath = "//input[@placeholder='Event title']")
    public WebElement eventTitleBox;

    @FindBy(xpath = "//label[@for='allDay']")
    public WebElement allDayCheckbox;
    @FindBy (xpath = "(//input[@name='date'])[2]")
    public WebElement startingDateBox;

    @FindBy(xpath = "(//input[@name='date'])[3]")
    public WebElement endingDateBox;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='fc-event-title-container']")
    public WebElement savedEventBox;

    public static void clickStartingDate(String dateText) {
        List<WebElement> calendarCellsWeb = Driver.getDriver().findElements(By.xpath("//div[@class='mx-calendar-content']//tbody/tr/td"));
        for (WebElement each : calendarCellsWeb) {
            if((each.getText()).equals(dateText)){
                each.click();
            }
        }

    }

    public static void clickEndingDate(String dateText) {
        List<WebElement> calendarCellsWeb = Driver.getDriver().findElements(By.xpath("//div[@class='mx-calendar mx-calendar-panel-date']//tbody/tr/td"));
        for (WebElement each : calendarCellsWeb) {
            if((each.getText()).equals(dateText)){
                each.click();
            }
        }

    }

}
