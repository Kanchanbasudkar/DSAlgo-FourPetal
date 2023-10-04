package stepdefinationfile;

import com.pages.SignInPage;
import com.pages.StackPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class StackStepFile {


	
	
	
	private StackPage stackpage = new StackPage(DriverFactory.getDriver());

	SignInPage signIn = new SignInPage(DriverFactory.getDriver());

	@Given("User is on home page for StackPage")
	public void user_is_on_home_page_for_stack_page() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home/");
		signIn.clickSignIn();
	}

	@And("User enters sheetname {string} and rownumber {int} for StackPage")
	public void user_enters_sheetname_and_rownumber_for_stack_page(String sheetName, Integer rowNumber) throws IOException {
		signIn.readDataFromSheet(sheetName, rowNumber);
	}

	@Then("Enter username {string} and password {string} to sign in for StackPage")
	public void enter_username_and_password_to_sign_in_for_stack_page(String string, String string2) throws IOException {
		System.out.println("inside enter username and password");
		signIn.sendUsername();
		signIn.sendPassword();
		signIn.clickLoginBtn();
	}
	
	@Given("The user is in the Home page")
	public void the_user_is_in_the_home_page() {
		System.out.println("I am on home page");
	   
	}

	@When("The user clicks on get started button")
	public void the_user_clicks_on_get_started_button() {
		stackpage.selectStack();
	
	}

	@Then("The user will be directed to Stack Page")
	public void the_user_will_be_directed_to_stack_page() {
		System.out.println("The user is on Stack page");
	  
	}

	@Given("The user clicks on Operations in Stack link")
	public void the_user_clicks_on_operations_in_stack_link() {
		stackpage.clickOperationsLink();
	  
	}

	@When("The user clicks Try Here button in the Operations in stack page")
	public void the_user_clicks_try_here_button_in_the_operations_in_stack_page() {
		stackpage.clickTryBtn();
	    
	}
	@When("user clicks on run button")
	public void user_clicks_on_run_button() {
		stackpage.clickRunBtn();
	   
	}

	@Then("The user will be presented with the Run output")
	public void the_user_will_be_presented_with_the_run_output() throws InterruptedException {
		stackpage.checkOutput();
	}


	@Given("The user is on Stack page")
	public void the_user_is_on_stack_page() {
		System.out.println("The user is on Stack page");
		
	
	}

	@When("The user clicks the Implementation link")
	public void the_user_clicks_the_implementation_link() {
		stackpage.clickImplementationLink();
	 
	}

	@When("The user clicks Try Here button on the Implementation page")
	public void the_user_clicks_try_here_button_on_the_implementation_page() {
		stackpage. clickTryBtn();
	    
	}

	@Then("The user is redirected to tryEditor page with a Run button to test")
	public void the_user_is_redirected_to_try_editor_page_with_a_run_button_to_test() {
		System.out.println("I am on try editor page");
	
	}

	@And("The user enters text in tryEditor {string}")
	public void the_user_enters_text_in_try_editor(String string) {
		stackpage.enterText();
	}

	@And("user clicks Run button")
	public void user_clicks_run_button() {
		stackpage.clickRunBtn();
	
	}
	@When("The user clicks the Applications link")
	public void the_user_clicks_the_applications_link() {
		stackpage.clickApplicationsLink();
	  
	}

	@When("The user clicks Try Here button on the  Applications page")
	public void the_user_clicks_try_here_button_on_the_applications_page() {
		stackpage. clickTryBtn();
	    
	}

	@Then("The user will be redirected to tryEditor page with a Run button to test")
	public void the_user_will_be_redirected_to_try_editor_page_with_a_run_button_to_test() {
		System.out.println("I am on TryEditor page");
	   
	}

	@When("The user clicks on to the Practice Questions link")
	public void the_user_clicks_on_to_the_practice_questions_link() {
		stackpage.clickPracticeQuesLink();
	   
	}

	@Then("The user will be directed to practice questions of stack Page")
	public void the_user_will_be_directed_to_practice_questions_of_stack_page() {
		System.out.println("I am on Practice questions of Stack page");
	   
	}


}
