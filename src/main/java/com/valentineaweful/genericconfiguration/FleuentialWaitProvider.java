package com.valentineaweful.genericconfiguration;

import com.valentineaweful.managers.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FleuentialWaitProvider extends DriverProvider {
    protected FluentWait<WebDriver> wait;

    public FleuentialWaitProvider() {
        wait = new FluentWait<WebDriver>(getDriver());
    }
}
