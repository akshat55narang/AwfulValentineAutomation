package com.valentineaweful.managers;

import com.valentineaweful.pages.CardOverviewPage;
import com.valentineaweful.pages.CartPage;
import com.valentineaweful.pages.HomePage;
import com.valentineaweful.pages.WrapperPage;
import org.openqa.selenium.WebDriver;

public class PageManager {
    private WebDriver driver;
    private HomePage homePage;
    private CartPage cartPage;
    private CardOverviewPage cardOverviewPage;
    private WrapperPage wrapperPage;

    public PageManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomPage() {
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public CartPage getCartPage() {
        return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;
    }

    public WrapperPage getWrapperPage() {
        return (wrapperPage == null) ? wrapperPage = new WrapperPage(driver) : wrapperPage;
    }

    public CardOverviewPage getCardOverviewPage(){
        return (cardOverviewPage == null) ? cardOverviewPage = new CardOverviewPage(driver) : cardOverviewPage;
    }
}
