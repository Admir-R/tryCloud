package com.tryCloud.pages;

import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Dashboard_Page {

    public Dashboard_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    public WebElement userIcon;

    @FindBy(xpath = "//span[@class='user-status-menu-item__header']")
    public WebElement userBox;

    @FindBy(xpath = "//a[@class='edit-panels icon-rename']")
    public WebElement customizeButton;

    @FindBy(xpath = "//button[@href='#']")
    public WebElement statusButton;

    public static void dashboardModules() {
        List<WebElement> listOfElements = Driver.getDriver().findElements(By.xpath("//ul[@id='appmenu']/li"));
        listOfElements.remove(listOfElements.size() - 1);

        for (WebElement each : listOfElements) {
            Assert.assertTrue(each.isDisplayed());
        }
    }

    public static void widgetsDisplayed() {

        List<WebElement> widgetsElements = Driver.getDriver().findElements(By.xpath("//label[contains(@for, 'checkbox')]"));
        for (WebElement each : widgetsElements) {
            BrowserUtils.sleep(2);
            Assert.assertTrue(each.isDisplayed());
        }
    }

    public static void widgetsSelect() {
        List<WebElement> widgetsElements = Driver.getDriver().findElements(By.xpath("//label[contains(@for, 'checkbox')]"));
        for (WebElement each : widgetsElements) {
            BrowserUtils.sleep(2);

            if (!each.isSelected()) {
                each.click();
            } else {
                if (each.isSelected()) {
                    each.click();
                }
            }

            if( (each.getText().equals("Status")) && !each.isSelected() ){
                each.click();
            }
        }
    }


    public static void statusOptionsDisplayed() {
        List<WebElement> statusElements = Driver.getDriver().findElements(By.xpath("//label[contains(@for, 'user-status')]"));
        for (WebElement each : statusElements) {
            BrowserUtils.sleep(2);
            if (each.isDisplayed()) {
                Assert.assertTrue(each.isDisplayed());
            }
        }
    }

    public static void statusSelect(){
        List<WebElement> statusElements = Driver.getDriver().findElements(By.xpath("//label[contains(@for, 'user-status')]"));
        for (WebElement each : statusElements) {
            BrowserUtils.sleep(2);
            if (!each.isSelected()) {
                each.click();
            } else {
                if (each.isSelected()) {
                    each.click();
                }
            }
        }
    }
}
