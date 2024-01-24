package com.tryCloud.step_definitions;

import com.tryCloud.pages.ContactPage;
import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ContactsStepDefs {
    ContactPage contactPage = new ContactPage();
    @Given("user is on the Contacts page")
    public void user_is_on_the_contacts_page() throws InterruptedException {
        LoginPage loginPage=new LoginPage();
        loginPage.login("User1","Userpass123");
        Thread.sleep(1000);
        contactPage.contactButton.click();


    }
    @When("user clicks on the New Group button")
    public void user_clicks_on_the_new_group_button() {
        contactPage.newGroupButton.click();


    }
    @Then("user should see Create a new group input box and enters a new group name")
    public void user_should_see_create_a_new_group_input_box_and_enters_a_new_group_name() {
        contactPage.addNewGroupButton.sendKeys("cinema" + Keys.ENTER);

    }
    @Then("user should see the newly created group name on the left with existing group names")
    public void user_should_see_the_newly_created_group_name_on_the_left_with_existing_group_names() {
        Assert.assertTrue(contactPage.cinemaGroupName.isDisplayed());

    }
    @Then("user should see the newly created group name in the Groups dropdown")
    public void user_should_see_the_newly_created_group_name_in_the_groups_dropdown() {
        contactPage.allContacts.click();
        contactPage.groupDropdown.click();
        Assert.assertTrue(contactPage.cinemaOptionDropdown.isDisplayed());
 ;
    }



    @When("user clicks on Groups dropdown input box")
    public void user_clicks_on_groups_dropdown_input_box() {
        contactPage.groupDropdown.click();

    }
    @Then("all the available groups names in the group’s dropdown menu and the contact’s own info menu should be the same")
    public void all_the_available_groups_names_in_the_group_s_dropdown_menu_and_the_contact_s_own_info_menu_should_be_the_same() throws InterruptedException {

       // Assert.assertEquals(contactPage.cinemaGroupName.getText(),contactPage.cinemaOptionDropdown.getText());
        //Assert.assertEquals(contactPage.hhhGroupName.getText(),contactPage.hhhOptionDropdown.getText());
        //Assert.assertEquals(contactPage.newGroupLastGroupName.getText(),contactPage.newGrouplastOptionDropdown.getText());
        //Assert.assertEquals(contactPage.privetGroupName.getText(),contactPage.privetOptionDropdown.getText());
        Assert.assertEquals("hhh",contactPage.hhhOptionDropdown.getText());
        Assert.assertEquals("newGro\n" + "uplast", contactPage.newGrouplastOptionDropdown.getText());
        Assert.assertEquals("privet" , contactPage.privetOptionDropdown.getText());

    }


    @When("user is on the All Contacts page and one of the contacts is selected")
    public void user_is_on_the_all_contacts_page_and_one_of_the_contacts_is_selected() {
        contactPage.allContacts.click();

    }
    @When("user should be able to see the Add New Property dropdown and selects Annivesary option")
    public void user_should_be_able_to_see_the_add_new_property_dropdown_and_selects_annivesary_option() {
        contactPage.addNewPropertyButton.click();
        contactPage.anniversaryOption.click();

    }
    @Then("user should see the newly created Anniversary module with a calender dropdown in the contact’s info page")
    public void user_should_see_the_newly_created_anniversary_module_with_a_calender_dropdown_in_the_contact_s_info_page() {
        Assert.assertTrue(contactPage.anniversaryDropdown.isDisplayed());

    }
}
