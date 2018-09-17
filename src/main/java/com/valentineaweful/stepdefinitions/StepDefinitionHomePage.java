package com.valentineaweful.stepdefinitions;

import com.valentineaweful.managers.DriverProvider;
import com.valentineaweful.managers.PageManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class StepDefinitionHomePage extends DriverProvider {
    private WebDriver driver;
    private PageManager pageManager;

    public StepDefinitionHomePage() {
        driver = getDriver();
        pageManager = new PageManager(driver);
    }

    @Given("^I am on the Home Page$")
    public void i_am_on_the_Home_Page() {
        pageManager.getWrapperPage().get();
    }

    @Then("^I should be able to view the text \"([^\"]*)\" as the page title$")
    public void i_should_be_able_to_view_the_text(String title) {
        Assert.assertEquals(title, pageManager.getWrapperPage().getTitle());
    }

    @When("^I click on the button \"([^\"]*)\" for the book \"([^\"]*)\" in Special Offers$")
    public void i_click_on_the_button_for_the_book(String option, String bookName) {
        pageManager.getHomPage().getBookBySpecialOffers(option, bookName);
    }

    @Then("^I should be able to see a pop up with the price overview$")
    public void i_should_be_able_to_see_a_pop_up_with_the_price_overview() {
        pageManager.getHomPage().getCartAdditionConfirmationPopUP();
    }

    @When("^I click on the button \"([^\"]*)\"$")
    public void i_click_on_the_button(String buttonText) {
        pageManager.getHomPage().getAddToCartPopUpButton(buttonText);
    }

    @Then("^I should be redirected to my \"([^\"]*)\"$")
    public void i_should_be_redirected_to_my(String cart) {
        pageManager.getCartPage().verifyShoppingCartPage(cart);
    }

    @Then("^I should be able to see the book \"([^\"]*)\" added in Cart$")
    public void i_should_be_able_to_see_the_item_added_in_Cart(String book) {
        pageManager.getCartPage().verifyItemInCart(book);
    }

    @Then("^I should be redirected to the page containing info about the book \"([^\"]*)\"$")
    public void verifyCardInfo(String card) {
        pageManager.getWrapperPage().verifyUrlResource(card);

    }
}
