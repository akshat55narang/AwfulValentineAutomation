package com.valentineaweful.stepdefinitions;

import com.valentineaweful.managers.ConfigFileManager;
import com.valentineaweful.managers.DriverProvider;
import com.valentineaweful.managers.PageManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class StepDefinitionHomePage extends DriverProvider {
    private WebDriver driver;
    private PageManager pageManager;

    public StepDefinitionHomePage(){
        driver = getDriver(ConfigFileManager.getInstance().getConfiguration().getBrowser());
        pageManager = new PageManager(driver);
    }

    @Given("^I am on the Home Page$")
    public void i_am_on_the_Home_Page() {
        pageManager.getWrapperPage().get();
    }

    @Then("^I should be able to view the text \"([^\"]*)\"$")
    public void i_should_be_able_to_view_the_text(String arg1) {
    }

    @When("^I click on the button \"([^\"]*)\" for the book \"([^\"]*)\"$")
    public void i_click_on_the_button_for_the_book(String arg1, String arg2) {

    }

    @Then("^I should be able to see a pop up with the price overview$")
    public void i_should_be_able_to_see_a_pop_up_with_the_price_overview() {

    }

    @When("^I click on the button \"([^\"]*)\"$")
    public void i_click_on_the_button(String arg1) {

    }

    @Then("^I should be redirected to my \"([^\"]*)\"$")
    public void i_should_be_redirected_to_my(String arg1) {

    }

    @Then("^I should be able to see the item added in Cart$")
    public void i_should_be_able_to_see_the_item_added_in_Cart() {

    }

    @Then("^I should be redirected to the page containing info about the book \"([^\"]*)\"$")
    public void i_should_be_redirected_to_the_page_containing_info_about_the_book(String arg1) {

    }
}
