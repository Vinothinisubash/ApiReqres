package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature",glue= {"org.stepdefenition"},plugin="html:target/HtmlReports.html")

public class Runner {

}
