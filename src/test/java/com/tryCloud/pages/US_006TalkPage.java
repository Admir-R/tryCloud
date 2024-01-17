package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_006TalkPage {

    public US_006TalkPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[5]/a")
    public WebElement TalkButton;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/div[1]/div/button")
    public WebElement plusIcon;

    @FindBy(xpath = "//input[@placeholder='Conversation name']")
    public WebElement conversationName;

    @FindBy(xpath = "//button[@class=\"navigation__button navigation__button-right primary\"]")
    public WebElement addParticipants;


    @FindBy(css="label[class='conversation-type__label']")
    public WebElement AllowsGuestToJoin;

    @FindBy(css = "button[class=\"navigation__button navigation__button-right primary\"]")
    public WebElement createConversation;
    @FindBy(xpath = "(//button[@class=\"icon action-item__menutoggle action-item__menutoggle--default-icon\"])[1]")
    public WebElement threeDash;


    @FindBy(xpath = "(//span[@class=\"action-button__text\"])[7]")
    public WebElement DeleteConversation;


    @FindBy(css = "button[class=\"primary\"]")
    public WebElement yesButton;


    @FindBy(css="button[class=\"navigation__button navigation__button-right primary\"]")
    public WebElement closeButton;




    @FindBy(xpath = "(//span[@class='acli__content__line-one__title'])[1]")
    public WebElement actual;
}