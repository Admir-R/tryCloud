package com.tryCloud.pages;




import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    Actions actions = new Actions(Driver.getDriver());
    public void clickMenuByText(String text){
        String locator = "(//a[contains(.,'"+text+"')])[1]";
        WebElement element = Driver.getDriver().findElement(By.xpath(locator));
        actions.moveToElement(element).click().perform();
    }
}
