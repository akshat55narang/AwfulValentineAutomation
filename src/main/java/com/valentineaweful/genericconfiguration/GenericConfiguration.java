package com.valentineaweful.genericconfiguration;

import com.valentineaweful.managers.DriverProvider;
import cucumber.api.Scenario;
import org.openqa.selenium.WebDriver;

public class GenericConfiguration extends DriverProvider {
    private WebDriver driver;

    public GenericConfiguration(WebDriver driver) {
        this.driver = driver;
    }

    public void beforeScenario(Scenario scenario) {
        System.out.println("Scenario Name = " + scenario.getName());
    }

    public void afterScenario() {
        if (driver != null) {
            driver.close();
        }
    }
}
