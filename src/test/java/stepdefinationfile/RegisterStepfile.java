package stepdefinationfile;

import com.pages.RegistrationFormPage;
import com.qa.factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepfile {

    WebDriver driver;
    String url = "https://dsportalapp.herokuapp.com/";
    By getstared = By.className("btn");
    By register = By.linkText("Register");
    RegistrationFormPage registrationFormPage = new RegistrationFormPage(DriverFactory.getDriver());

    @Given("I want to click on Register - For testing")
    public void i_want_to_click_on_register_for_testing() {
        // Write code here that turns the phrase above into concrete actions
        DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home/");
    }

    @When("I click on registerlink")
    public void i_click_on_registerlink() {
        registrationFormPage.ClickRegister();
    }

    @Then("I should navigate to Registeration Page")
    public void i_should_navigate_to_registeration_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

}
