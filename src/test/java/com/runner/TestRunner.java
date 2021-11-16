package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( 
		features = {"src/test/resources/com/features"},
		glue= {"com.stepdefinition"}
		)

public class TestRunner {

}
