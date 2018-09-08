package com.valentineaweful.genericconfiguration;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class GenericConfiguration {
    private WebDriver driver;

    @Before
    public void beforeScenario(Scenario scenario){
        System.out.println(scenario.getName());
        WebDriverManager.chromedriver().setup();
    }

    @After
    public void afterScenario(){
        if(driver != null){
            driver.close();
        }
    }
}
