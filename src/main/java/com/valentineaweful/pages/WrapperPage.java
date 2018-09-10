package com.valentineaweful.pages;

import com.valentineaweful.genericconfiguration.FleuentialWaitProvider;
import com.valentineaweful.managers.ConfigFileManager;
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
}
