package com.valentineaweful.managers;

import com.valentineaweful.pages.HomePage;
import com.valentineaweful.pages.WrapperPage;
import org.openqa.selenium.WebDriver;

public class PageManager {
    private WebDriver driver;
    private HomePage homePage;
    private WrapperPage wrapperPage;

    public PageManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomPage() {
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public WrapperPage getWrapperPage() {
        return (wrapperPage == null) ? wrapperPage = new WrapperPage(driver) : wrapperPage;
    }
}
