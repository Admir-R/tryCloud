package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class ContactPage {

    public ContactPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[@aria-label='Contacts']")
    public WebElement contactButton;

    @FindBy(xpath = "//button[@class='icon action-item__menutoggle icon-add']")
    public WebElement newGroupButton;


   @FindBy(xpath = "//input[@class='action-input__input focusable']")
   public WebElement addNewGroupButton;


   @FindBy(id = "everyone")
   public WebElement allContacts;

   @FindBy(xpath = "//div[@class='property property--without-actions property-masonry property--groups property--last']//input")
   public WebElement groupDropdown;

    @FindBy(xpath = "//span[@title='cinema']")
    public WebElement cinemaGroupName;

    @FindBy(xpath = "//span[@title='hhh']")
    public WebElement hhhGroupName;

    @FindBy(xpath = "//span[@title='newGroupLast']")
    public WebElement newGroupLastGroupName;

    @FindBy(xpath = "//span[@title='privet']")
    public WebElement privetGroupName;


    @FindBy(xpath = "//span[.='cinema']")
    public WebElement cinemaOptionDropdown;

    @FindBy(xpath ="//div[@title='newGrouplast']/..")
    public WebElement newGrouplastOptionDropdown;

    @FindBy(xpath = "//span[.='privet']")
    public WebElement privetOptionDropdown;

    @FindBy(xpath = "//span[.='hhh']")
    public WebElement hhhOptionDropdown;

    @FindBy(xpath = "//input[@placeholder='Choose property type']")
    public WebElement addNewPropertyButton;

    @FindBy(xpath = "//div[@title='Anniversary']")
    public WebElement anniversaryOption;


    @FindBy(xpath ="//div[normalize-space(text())='Anniversary']" )

    public WebElement anniversaryDropdown;


    @FindBy(xpath = "//div[normalize-space(text())='New contact']")
    public WebElement newContact;















}
