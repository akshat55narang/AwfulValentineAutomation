package com.valentineaweful.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Feature"
        , glue = "com/valentineaweful/stepdefinitions"
        , monochrome = true
        , plugin = {"pretty", "html:Folder_Name"}
        , tags = "@test"
        , dryRun = false)
public class TestRunnerTest extends TestRunner {
}
