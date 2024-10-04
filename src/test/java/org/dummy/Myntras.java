package org.dummy;

import org.base.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class Myntras extends BaseClass {

	@Given("To launch the browser ")
	public void to_launch_the_browser_and_to_maximize_the_window() {
		LaunchBrowser();
	}

	@When("To lunch the URL")
	public void to_lunch_the_url() {
		launchURl("https://www.myntra.com/");
	}
}
