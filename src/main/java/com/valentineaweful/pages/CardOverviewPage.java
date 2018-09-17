package com.valentineaweful.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CardOverviewPage extends WrapperPage {
    private WebDriver driver;

    public CardOverviewPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void cerifyCardDescription(String card) {
    }
}
