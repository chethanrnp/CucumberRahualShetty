package stepDefinition;

import java.util.Iterator;
import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {

	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User is on NetBanking landing page 1");
	}

	@Given("User is on Practice landing page")
	public void user_is_on_practice_landing_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User is on Practice landing page On WebApplication");
	}

	// When you need to pass multiple date
	@When("User Signup into application")
	public void user_signup_into_application(List<String> data) {
		for (String lv : data) {
			System.out.println(lv);
		}
	}

	// when you need to pass string as parameter
//	@When("User Signup into application with {string} password {string}")
//	public void user_signup_into_application_with_password(String usn, String psw) {
//		// Write code here that turns the phrase above into concrete actions
//		System.out.println("Username =" + usn + " password = " + psw);
//	}

	// need to send any type of parameter is called "Regex"
	@When("^User Signup into application with (.+) password (.+)$")
	public void user_signup_into_application_with_password(String usn, String psw) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Username =" + usn + " password = " + psw);
	}

	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Home Page is displayed 3");
	}

	@And("Cards are displayed")
	public void cards_are_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Cards are displayed 4");
	}

	@Given("set up the entries in the data base")
	public void set_up_the_entries_in_the_data_base() {
		System.out.println("set up the entries in the data base %%");
	}

	@When("Launch the browser from Config Variable")
	public void launch_the_browser_from_config_variable() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Launch the browser from Config Variable %%");
	}

	@When("Hit thee home page Url of the Banking Page")
	public void hit_thee_home_page_url_of_the_banking_page() {
		System.out.println("Hit thee home page Url of the Banking Page %%");
	}
}
