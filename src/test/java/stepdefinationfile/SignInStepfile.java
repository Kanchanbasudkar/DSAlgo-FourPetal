package stepdefinationfile;

import com.pages.SignInPage;
import com.pages.WelcomePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInStepfile {
	SignInPage signInPage = new SignInPage(DriverFactory.getDriver());
	@Given("User filled user id and password")
	public void user_filled_user_id_and_password() throws InterruptedException {
		signInPage.user_filled_user_id_and_password();
	}

	@When("user id filed is visible")
	public void user_id_filed_is_visible() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("user field is visible");
	}

	@Then("login to home page")
	public void login_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
}
