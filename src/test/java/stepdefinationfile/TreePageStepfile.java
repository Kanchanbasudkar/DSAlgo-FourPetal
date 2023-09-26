package stepdefinationfile;

import com.pages.SignIn;
import com.pages.TreePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreePageStepfile {

	TreePage treePage = new TreePage(DriverFactory.getDriver());

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

	@When("I click the GetStared button under Tree subtitle")
	public void i_click_the_get_stared_button_under_tree_subtitle() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		treePage.ClickTreeGetStared();
	}

	@Then("Navigates to Tree Home page")
	public void navigates_to_tree_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Welcome to Tree homepage");

	}

	@When("I click the overview Link")
	public void i_click_the_overview_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		treePage.ClickOverviewLink();
	}

	@Then("Navigates to overview Page")
	public void navigates_to_overview_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("Welcome to Overview Page");

	}

	@When("I click the terminologies Link")
	public void i_click_the_terminologies_link() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		treePage.ClickTerminologiesLink();
	}

	@Then("Navigates to terminologies Page")
	public void navigates_to_terminologies_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("I click the type Link")
	public void i_click_the_type_link() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		treePage.ClickTypeLink();
	}

	@Then("Navigates to type Page")
	public void navigates_to_type_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("I click the tree Link")
	public void i_click_the_tree_link() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		treePage.ClickTreeLink();
	}

	@Then("Navigates to tree Page")
	public void navigates_to_tree_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("I click the traversals Link")
	public void i_click_the_traversals_link() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		treePage.ClickTraversalsLink();
	}

	@Then("Navigates to traversals Page")
	public void navigates_to_traversals_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("I click the binary Link")
	public void i_click_the_binary_link() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		treePage.ClickBinaryLink();
	}

	@Then("Navigates to binary Page")
	public void navigates_to_binary_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("I click the typesOfBinary Link")
	public void i_click_the_types_of_binary_link() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		treePage.ClickTypesOfBinaryLink();
	}

	@Then("Navigates to typesOfBinary Page")
	public void navigates_to_types_of_binary_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("I click the implementationInPython Link")
	public void i_click_the_implementation_in_python_link() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		treePage.ClickImplementationInPythonLink();
	}

	@Then("Navigates to implementationInPython Page")
	public void navigates_to_implementation_in_python_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("I click the binaryTreeTraversals Link")
	public void i_click_the_binary_tree_traversals_link() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		treePage.ClickBinaryTreeTraversalsLink();
	}

	@Then("Navigates to binaryTreeTraversals Page")
	public void navigates_to_binary_tree_traversals_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("I click the implementationOfBinary Link")
	public void i_click_the_implementation_of_binary_link() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		treePage.ClickImplementationOfBinaryLink();
	}

	@Then("Navigates to implementationOfBinary Page")
	public void navigates_to_implementation_of_binary_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("I click the applications Link")
	public void i_click_the_applications_link() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		treePage.ClickApplicationsLink();
	}

	@Then("Navigates to applications Page")
	public void navigates_to_applications_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("I click the binarySearch Link")
	public void i_click_the_binary_search_link() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		treePage.ClickBinarySearchLink();
	}

	@Then("Navigates to binarySearch Page")
	public void navigates_to_binary_search_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("I click the implementationOfBST Link")
	public void i_click_the_implementation_of_bst_link() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		treePage.ClickImplementationOfBstLink();
	}

	@Then("Navigates to implementationOfBST Page")
	public void navigates_to_implementation_of_bst_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("I Clicked the try Here")
	public void i_clicked_the_try_here() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		treePage.ClickTryHereButton();
	}

	@Then("Navigates to New Try Editor page")
	public void navigates_to_new_try_editor_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("enter {string} in Text Area")
	public void enter_in_text_area(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		treePage.Write();
	}

	@When("I Click run")
	public void i_click_run() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		treePage.Run();
	}

	@Then("Displays {string} in the Output")
	public void displays_in_the_output(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}



}
