package com.valentineaweful.stepdefinitions;

import com.valentineaweful.managers.DriverProvider;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class StepDefinitionGeneric extends DriverProvider {

    @Before
    public void beforeScenario(Scenario scenario) {
        System.out.println("Scenario Name = " + scenario.getName());
    }

    @After
    public void afterScenario(Scenario scenario) {
        System.out.println("After scenario !");
        //if(getDriver() != null){
        //    getDriver().close();
       // }
    }
}
