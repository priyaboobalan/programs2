package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
					glue = "org.stepdefinition",
					monochrome = false,
					dryRun = false,
					snippets = SnippetType.CAMELCASE,
					plugin = {"html:Report\\htmlreport.html",
							"junit:Report\\junitReport.xml",
							"json:Report\\JsonReport.json"} )
public class TestRunner {

}