package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.factory.DriverFactorys;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageStepfile {

//By getstared = By.className("btn");
//By register = By.linkText("Register");
//(DriverFactorys.getDriver());

@Given("User want to click on GetStarted button")
public void user_want_to_click_on_get_started_button() {
	
	DriverFactorys.getDriver().get("https://dsportalapp.herokuapp.com/");
	
}

@When("User will navigate to Homepage") public void
  user_will_navigate_to_homepage() {
  DriverFactorys.getDriver().findElement(getstared).click(); }
  
  @Then("User navigate to Registeration Page") public void
  user_navigate_to_registeration_page() {
  System.out.println("Registeration page"); }
 

}

