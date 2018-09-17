package com.valentineaweful.pages;

import com.valentineaweful.genericconfiguration.FleuentialWaitProvider;
import com.valentineaweful.managers.ConfigFileManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class WrapperPage extends FleuentialWaitProvider {
    private WebDriver driver;

    public WrapperPage(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public void get() {
        driver.get(ConfigFileManager.getInstance().getConfiguration().getApplicationURL());
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public WebElement waitForElement(By by) {
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
    }

    public WebElement waitForElement(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitForElementToBeClickable(By by) {
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public WebElement waitForElementToBeClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilElementDisappears(WebElement element) {
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void waitUntilElementDisappears(By by) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    public void clickButtonAndDisapperElement(WebElement element, By validation) {
        waitForElementToBeClickable(element).click();
        waitUntilElementDisappears(validation);
    }

    public void verifyUrlResource(String resource){
        Assert.assertTrue(driver.getCurrentUrl().contains(resource));
    }
}
