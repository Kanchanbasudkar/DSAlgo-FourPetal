package stepdefinationfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepfile {

    WebDriver driver;
    String url = "https://dsportalapp.herokuapp.com/";
    By getstared = By.className("btn");
    By register = By.linkText("Register");

    @Given("I want to click on Register")

    public void i_want_to_click_on_register() {
        driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(getstared).click();
    }

    @When("I click on registerlink")
    public void i_click_on_registerlink() {
        driver.findElement(register).click();
    }

    @Then("I should navigate to Registeration Page")
    public void i_should_navigate_to_registeration_page() {
        System.out.println("Register");
    }

}
