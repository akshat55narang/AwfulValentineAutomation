package com.valentineaweful.stepdefinitions;

import com.valentineaweful.managers.DriverProvider;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class StepDefinitionGeneric extends DriverProvider {
    private WebDriver driver;

    @Before
    public void beforeScenario(Scenario scenario) {
        System.out.println("Scenario Name = " + scenario.getName());
    }

    @After
    public void afterScenario() {
        driver = getDriver();
        //if (driver != null) {
           //driver.close();
        //}
    }
}
