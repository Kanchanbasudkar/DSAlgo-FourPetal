package stepdefinationfile;

import com.pages.ArrayPage;
import com.pages.SignIn;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArrayStepfile {


	ArrayPage arraypage = new ArrayPage(DriverFactory.getDriver());

	SignIn signIn = new SignIn(DriverFactory.getDriver());


	@Given("I am on Home Page after signing in")
	public void i_am_on_home_page_after_signing_in() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home/");
		signIn.ClickSignIn();
		signIn.Username();
		signIn.Password();
		signIn.ClickLoginBtn();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("I click the GetStared button under Array subtitle")
	public void i_click_the_get_stared_button_under_array_subtitle() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		arraypage.Getstarted();
	}
	

	@Then("Navigates to Array Home page")
	public void navigates_to_array_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Array Home page");

	}

	@When("I click on Array in Python")
	public void i_click_on_array_in_python() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		arraypage.ClickonArrayinPython();
	}

	@Then("Navigates to Array in Python")
	public void navigates_to_array_in_python() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("Array in Python");
	}

	@When("I click the Try Here")
	public void i_click_the_try_here() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		arraypage.tryhere();
	}

	@Then("Navigates to Try Editor Page")
	public void navigates_to_try_editor_page() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		System.out.println("editor page");
	}
	@When("I Enter in text area")
	public void i_enter_in_text_area() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		arraypage.Txtarea();
	}

	@And("Click Run")
	public void click_run() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		arraypage.runButtton();
	}

	@Then("Displays {string} in output")
	public void displays_in_output1(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("wel");

	}

@When("I click on Arrays Using List")
public void i_click_on_arrays_using_list() {
    arraypage.ClickonArrayusingList();
}

@Then("Navigates to Arrays Using List")
public void navigates_to_arrays_using_list() {
	System.out.println("now on Array Using List Page");
    }

@When("I click on Basic Operations in Lists")
public void i_click_on_basic_operations_in_lists() {
	arraypage.ClickonBasicOperation();
  }

@Then("Navigates to Basic Operations in Lists")
public void navigates_to_basic_operations_in_lists() {
	System.out.println("Basic Operations in Lists");
    }

@When("I click on Applications of Array")
public void i_click_on_applications_of_array() {
  arraypage.ClickonApplication();
}

@Then("Navigates to Applications of Array")
public void navigates_to_applications_of_array() {
	System.out.println("Applications of Array");
   
}




}
