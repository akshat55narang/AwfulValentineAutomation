package com.valentineaweful.genericconfiguration;

import com.valentineaweful.managers.ConfigFileManager;
import com.valentineaweful.managers.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class FleuentialWaitProvider extends DriverProvider {
    protected FluentWait<WebDriver> wait;

    public FleuentialWaitProvider() {

        wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(ConfigFileManager.getInstance()
                .getConfiguration().getExplicitWait()));
    }
}
