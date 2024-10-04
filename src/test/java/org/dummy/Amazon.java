package org.dummy;
import org.base.BaseClass;
import org.pojo.AzPojo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


	public class Amazon extends BaseClass {

		static AzPojo a;
		

		@Given("To launch the brawser and maximize")
		public void to_launch_the_brawser_and_maximize() {
			LaunchBrowser();
		}

		@When("To launch the amaxon url")
		public void to_launch_the_amaxon_url() {
			launchURl("https://www.amazon.in/ref=nav_logo");
		}

		@Then("To enter the Search the product")
		public void to_enter_the_search_the_product(DataTable dataTable) {
			a = new AzPojo();
			passText(a.getSearch(), dataTable.cell(0, 1));
		}

		@Then("To Click the search button")
		public void to_click_the_search_button() {
			a = new AzPojo();
			ClickButton(a.getSubmit());
		}

		@Then("To validate the product page")
		public void to_validate_the_product_page() {
			System.out.println("searched");
		}
	}

