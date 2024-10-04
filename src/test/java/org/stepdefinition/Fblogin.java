
package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.fbpojo;

import cucumber.api.java.en.*;



public class Fblogin extends BaseClass {

	static fbpojo f;

	@Given("To launch the browser and to maximize the window")
	public void to_launch_the_browser_and_to_maximize_the_window() {
		LaunchBrowser();
	}

	@When("To lunch the URL")
	public void to_lunch_the_url() {
		launchURl("https://en-gb.facebook.com/");
	}

	@Then("To enter the valid email")
	public void to_enter_the_valid_email() {
		f = new fbpojo();
		passText(f.getEmail(), "7744558899");
	}

	@Then("To enter the invalid password")
	public void to_enter_the_invalid_password() {
		f = new fbpojo();
		passText(f.getPass(), "pass@123");
	}

	@Then("To Click the login button")
	public void to_click_the_login_button() {
		f = new fbpojo();
		ClickButton(f.getLogin());
	}

	@Then("To check whether navigated to home page")
	public void to_check_whether_navigated_to_home_page() {
		String url = d.getCurrentUrl();
		if (url.equals("https://www.facebook.com/"))
			System.out.println("logged in");
		else
			System.out.println("not logged in");
	}

	@Then("To Close the Browser.")
	public void to_close_the_browser() throws InterruptedException {
		CloseBrowser();
	}

	@Then("To validate home page")
	public void to_validate_home_page() {
		System.out.println("home page");
	}
	@Then("To pass the valid email in email feild{string}")
	public void toPassTheValidEmailInEmailFeild(String string) {
		f= new fbpojo();
		passText(f.getEmail(), string);
		System.out.println("Email is" +string);
	}

	@Then("To enter the invalid password in password feild{string}")
	public void toEnterTheInvalidPasswordInPasswordFeild(String string) {
		f= new fbpojo();
		passText(f.getPass(), string);
		System.out.println("password is" +string);
	}

}

	//to_close_the_browser()
	//toCloseTheBrowser();

	//4.2.0( junit - java)

