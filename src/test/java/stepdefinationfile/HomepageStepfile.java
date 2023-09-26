package stepdefinationfile;

import com.pages.HomePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageStepfile {

	HomePage homePage = new HomePage(DriverFactory.getDriver());



@Given("User needs to click on Register link")
public void user_needs_to_click_on_register_link() {
    // Write code here that turns the phrase above into concrete actions
	DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home");
   // throw new io.cucumber.java.PendingException();
}

@When("User click register link,it shoud navigate to registerformPage")
public void user_click_register_link_it_shoud_navigate_to_registerform_page() {
    // Write code here that turns the phrase above into concrete actions
	homePage.ClickRegisterButton();
    // throw new io.cucumber.java.PendingException();
}

@Then("User lands on registerformPage")
public void user_lands_on_registerform_page() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Welcome to Register form Page");
   // throw new io.cucumber.java.PendingException();
}
}

