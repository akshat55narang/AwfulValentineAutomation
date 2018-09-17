package com.valentineaweful.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends WrapperPage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void getBookBySpecialOffers(String button, String bookName) {
        By var = By.xpath("//div[@class='special-item']//a[text()='" + bookName + "']"
                + "/parent::h4/following-sibling::div/a[text()='" + button + "']");
        waitForElement(var).click();
    }

    public void getCartAdditionConfirmationPopUP() {
        Assert.assertTrue(waitForElement(By.xpath("//div[@id='fancybox-content']//a[text()=" +
                "'Closeness and Togetherness']")).isDisplayed());
    }

    public void getAddToCartPopUpButton(String buttonText) {
        waitForElementToBeClickable(By.xpath("//div[@id='fancybox-content']//input[@value='Add to Cart']")).click();

    }
}
