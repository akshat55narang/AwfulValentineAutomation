package com.valentineaweful.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends WrapperPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyShoppingCartPage(String cart){
        WebElement element = waitForElement(By.xpath("//table[@id='viewCartTable']"));

    }

    public void verifyItemInCart(String book){
        WebElement element = waitForElement(By.xpath("//table[@id='viewCartTable']"
              + "//td[text()=' Closeness and Togetherness ']"));
        WebElement quantity = waitForElement(By.xpath("//input[@class='itemQuantity']"));
        Assert.assertTrue((element.getText().contains(book) && quantity.getAttribute("value").equals("1")));
    }
}
