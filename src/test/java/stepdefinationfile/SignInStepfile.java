package stepdefinationfile;

import com.pages.SignIn;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInStepfile {

	SignIn signIn = new SignIn(DriverFactory.getDriver());

	@Given("I am at home page")
	public void i_am_at_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home/");
	}

	@When("I click sign in")
	public void i_click_sign_in() {
	    // Write code here that turns the phrase above into concrete actions
		signIn.ClickSignIn();
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("It navigates to login page")
	public void it_navigates_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Welcome to Login page");
      //throw new io.cucumber.java.PendingException();
	}

	//@Then("I enter Username")
	//public void i_enter_username() {
	    // Write code here that turns the phrase above into concrete actions
		//signIn.Username();
	    //throw new io.cucumber.java.PendingException();
	//}
	@Then("I enter Username {string}")
	public void i_enter_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
		signIn.Username();
	   // throw new io.cucumber.java.PendingException();
	}


	//@Then("I enter password")
	//public void i_enter_password() {
	    // Write code here that turns the phrase above into concrete actions
		//signIn.Password();
	    //throw new io.cucumber.java.PendingException();
	//}
	@Then("I enter password {string}")
	public void i_enter_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		signIn.Password();
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("I click login")
	public void i_click_login() {
	    // Write code here that turns the phrase above into concrete actions
		signIn.ClickLoginBtn();
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("It navigates to home page")
	public void it_navigates_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Welcome to homepage");
	   // throw new io.cucumber.java.PendingException();
	}

}
