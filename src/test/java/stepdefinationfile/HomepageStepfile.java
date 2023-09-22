package stepdefinationfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageStepfile {

//	@Given("User needs to click on Register link")
//	public void user_needs_to_click_on_register_link() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User click register link,it shoud navigate to registerformPage")
//	public void user_click_register_link_it_shoud_navigate_to_registerform_page() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User lands on registerformPage")
//	public void user_lands_on_registerform_page() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}

// Steps for signInLink

	@Given("User needs to click on Sign in link")
	public void user_needs_to_click_on_sign_in_link() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user_needs_to_click_on_sign_in_link");
	}

	@When("User click register link,it shoud navigate to loginPage")
	public void user_click_register_link_it_shoud_navigate_to_login_page() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}

	@Then("User lands on loginPage")
	public void user_lands_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
}
