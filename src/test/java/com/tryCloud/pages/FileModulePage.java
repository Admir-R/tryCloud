package com.tryCloud.pages;

import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FileModulePage extends BasePage{

   public FileModulePage(){
       PageFactory.initElements(Driver.getDriver(), this);
   }

   @FindBy(xpath = "//a[@class='button new']")
    public WebElement plusButton;

   @FindBy(css = "#file_upload_start")
    public WebElement uploadFileBtn;

  @FindBy(xpath = "//span[.='✖']")
   public  WebElement alertNotEnoughSpace ;

   @FindBy(id = "filestable")
   public WebElement table;

    @FindBy(xpath = "//input[@id='file_upload_start']")
    public WebElement fileUploadField;

    @FindBy(xpath = "//span[.='New folder']")
    public WebElement newFolder;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement arrowSubmit;

    @FindBy(id = "view13-input-folder")
    public WebElement inputFolderName;


    @FindBy(xpath = "//span[@class='fileactions']/..")
    public List<WebElement> listOfFiles;

    @FindBy(xpath = "//table[@id='filestable']//tbody[@id='fileList']/tr/td[2]/a/span/span[1]")
    public List<WebElement> listOfUploadedFiles;

    @FindBy(xpath = "//input[contains(@id,'select-files')]")
    public List<WebElement> selectCheckBoxFileOrFolder;

    @FindBy(xpath = "//span[@class='fileactions']/a[2]")
    public List<WebElement> threeDots;

    @FindBy(xpath = "//*[.='Delete folder']/../..")
    public WebElement deleteOption;

    @FindBy(xpath = "//tfoot/tr/td[@class='filesummary']/span")
     public WebElement footTable;

 public void chooseOptionsFrom3Dots(String detailOption) {
  String locator = "//div[@class='app-sidebar-tabs']//ul/li//a[contains(.,'" + detailOption + "')]";
  Driver.getDriver().findElement(By.xpath(locator)).click();
 }

 public void actionForSpecificFile(String fileName) {
  String locator = "//span[@class='fileactions']/../span[1]/span[contains(.,'" + fileName + "')]/../../span[@class='fileactions']/a[2]";
  WebElement element = Driver.getDriver().findElement(By.xpath(locator));
  BrowserUtils.hover(element);
  element.click();
 }

 public boolean hasFileOrFolderName(String fileName){

   for (WebElement eachFile : listOfUploadedFiles) {
    // eachFile.getText();
     if(fileName.equals(eachFile.getText())){
      return true;
     }
   }
   return false;
 }

 public void plusBtnOnFilePage(){
  FileModulePage fileModulePage = new FileModulePage();
  fileModulePage.plusButton.click();
 }

 @FindBy(xpath = "//div[@id='app-navigation']/ul/li[2]")
 public WebElement buttonRecent;



}
