package com.valentineaweful.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features =  "src/main/resources/Feature"
,glue = "stepdefinitions"
,monochrome = true
,dryRun = false)
public class TestRunnerTest extends TestRunner {
}
