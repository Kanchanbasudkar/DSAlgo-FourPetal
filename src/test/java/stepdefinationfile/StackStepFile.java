package stepdefinationfile;

import com.pages.StackPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StackStepFile {
	
	
	
	private StackPage stackpage = new StackPage(DriverFactory.getDriver());
	
	@Given("The user is in the Home page")
	public void the_user_is_in_the_home_page() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home");
	   
	}

	@When("The user clicks on  get started button")
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

	@When("The user enters valid python code in TryEditor {string}")
	public void the_user_enters_valid_python_code_in_try_editor(String string) {
		stackpage.enterText();

	}

	@When("user clicks on run button")
	public void user_clicks_on_run_button() {
		stackpage.clickRunBtn();
	   
	}

	@Then("The user will be presented with the Run output")
	public void the_user_will_be_presented_with_the_run_output() {
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

	@Then("The user enters text in tryEditor {string}")
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
		stackpage.enterText();
	   
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
