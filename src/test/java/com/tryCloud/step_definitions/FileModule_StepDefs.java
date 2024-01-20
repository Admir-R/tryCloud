package com.tryCloud.step_definitions;

import com.tryCloud.pages.FileModulePage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class FileModule_StepDefs {

    FileModulePage fileModulePage = new FileModulePage();
    LoginPage loginPage = new LoginPage();

    @Given("User is on the dashboard page")
    public void user_is_on_the_dashboard_page() {
       loginPage.login("Employee15", "Employee123");
    }
    @When("user clicks the {string} module")
    public void user_clicks_the_module(String string) {
       fileModulePage.clickMenuByText("File");
    }
    @When("user click the plus icon")
    public void user_click_the_plus_icon() {
       // fileModulePage.plusButton.click();
        fileModulePage.plusBtnOnFilePage();
    }


    @When("user selects any file and upload")
    public void user_selects_any_file() {

        //String path = System.getProperty("user.dir")+"/src/test/resources/file/PracticeTasks.pdf";
       // fileModulePage.uploadFileBtn.sendKeys(path);

        String path = "C:\\Users\\admir\\Downloads\\download.jpeg";
        fileModulePage.uploadFileBtn.sendKeys(path);


        BrowserUtils.waitFor(10);
    }

    @Then("user see uploaded file")
    public void user_see_uploaded_file() {
        WebElement uploadedFile = Driver.getDriver().findElement(By.xpath("//span[.='download.jpeg']"));
        Assert.assertTrue(uploadedFile.isDisplayed());
    }





    @When("user clicks New folder file")
    public void user_clicks_new_folder_file() {
       fileModulePage.newFolder.click();
    }
    @Then("type name of folder and click arrow icon")
    public void type_name_of_folder_and_click_arrow_icon() {
        fileModulePage.inputFolderName.sendKeys("MyFolder");
        fileModulePage.arrowSubmit.click();
        BrowserUtils.waitFor(5);
    }
    @Then("user see New folder file")
    public void user_see_new_folder_file() {
        String expectedFolder = "MyFolder";
        String actualFolder = Driver.getDriver().findElement(By.xpath("//span[.='MyFolder'][1]")).getText();

        Assert.assertEquals(expectedFolder,actualFolder);
    }





    @When("select {string} that wants to delete,click three dots menu")
    public void select_folder_or_file_that_wants_to_delete(String string) {
     fileModulePage.actionForSpecificFile("MyFolder");


    }

    @Then("the user delete selected folder or file")
    public void the_user_delete_selected_folder_or_file() {
        fileModulePage.deleteOption.click();
        BrowserUtils.waitFor(5);
    }
    @Then("user cannot sees deleted items")
   public void user_cannot_sees_deleted_items() {
        List<String> fileOrFolderText = BrowserUtils.getElementsText(fileModulePage.listOfUploadedFiles);
       // System.out.println(fileOrFolderText);
        boolean deleted=false;
        for (String f : fileOrFolderText) {
            if (!f.contains("MyFolder")) {
                deleted = true;
                break;
            }
        }
        Assert.assertTrue(deleted);
    }





    @When("user go to files list table")
    public void user_go_to_files_list_table() {

        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(fileModulePage.footTable);

    }
    @Then("user sees the number of the file and folder")
    public void user_sees_the_number_of_the_file_and_folder() {
        boolean hasFiles=false;
       if(!fileModulePage.footTable.getText().equalsIgnoreCase("No files in here")){
           hasFiles = true;
       }

       Assert.assertTrue(hasFiles);
    }

}
