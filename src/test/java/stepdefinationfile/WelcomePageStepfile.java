package stepdefinationfile;

import com.pages.WelcomePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WelcomePageStepfile {
	
	WelcomePage welcomePage = new WelcomePage(DriverFactory.getDriver());

	@Given("Go to Ds-algo portal link")
	public void go_to_ds_algo_portal_link() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/");
	}

	@When("I click the GetStared button")
	public void clickGetstartedButton() {
		welcomePage.clickGetstartedButton();
	}

	@Then("I see Numpy Ninja Brand in home page")
	public void navigates_to_home_page() {
		welcomePage.checkForNumpyNinjaBrand();
	}

}
