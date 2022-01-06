package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// Runner class should have Test word in name then only it can be run from maven pom.xml using maven surefire plugin

@RunWith(Cucumber.class)
@CucumberOptions(features = {".\\features"}, 
                 glue = {"com.stepdefinitions"}, 
                 dryRun = false, 
                 monochrome = false,
                 plugin = {"html:target/reports/cucumber-html-report.html","json:target/reports/cucumber.json","pretty"} /*,
                 tags = "@Test3 or Test1"*/)
public class TestRunner {

}
