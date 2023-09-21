package stepdefinationfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WelcomepageStepdefinitionfile {
 WebDriver driver;

//declare element
String url = "https://dsportalapp.herokuapp.com/";
By getstared = By.className("btn");
By register = By.linkText(" Register ");

@Given("Go to Ds-algo portal link")
public void go_to_ds_algo_portal_link()
	{
		driver = new ChromeDriver();
	    driver.get(url);
	    
	}

	@When("I click the GetStared button")
	public void clickGetstartedButton() {
		
		driver.findElement(getstared).click();
		
			}
	@Then("Navigates to HomePage")
	public void navigates_to_home_page() {
	   System.out.println("Welcome to homepage");
	}
	


	}

