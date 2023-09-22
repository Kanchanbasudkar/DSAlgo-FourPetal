package stepdefinationfile;

import com.pages.GraphPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphPageStepfile {

	GraphPage graphPage = new GraphPage(DriverFactory.getDriver());

	@Given("I am on Ds-algo Home Page")
	public void i_am_on_ds_algo_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I click the GetStared button under Graph subtitle")
	public void i_click_the_get_stared_button_under_graph_subtitle() {
	    // Write code here that turns the phrase above into concrete actions
		graphPage.clickGraphGetstarted();
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Navigates to Graph Home page")
	public void navigates_to_graph_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Graph homepage");
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I am on Graph Home Page")
	public void i_am_on_graph_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I click the Graph Link")
	public void i_click_the_graph_link() {
	    // Write code here that turns the phrase above into concrete actions
		graphPage.ClickGraphLink();
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Navigates to Graph Page")
	public void navigates_to_graph_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I click the Try Here>>> button")
	public void i_click_the_try_here_button() {
	    // Write code here that turns the phrase above into concrete actions
		graphPage.ClickGraphTry();;
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Navigates to TryEditor Page")
	public void navigates_to_try_editor_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I Enter {string} in text area")
	public void i_enter_in_text_area(String string) {
	    // Write code here that turns the phrase above into concrete actions
		graphPage.PrintGraph();
	    throw new io.cucumber.java.PendingException();
	}

	@When("click Run")
	public void click_run() {
	    // Write code here that turns the phrase above into concrete actions
		graphPage.ClickRunGraph();
	    throw new io.cucumber.java.PendingException();
	}

	@Then("displays {string} in output")
	public void displays_in_output(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I click the Graph Representations Link")
	public void i_click_the_graph_representations_link() {
	    // Write code here that turns the phrase above into concrete actions
		graphPage.ClickGraphRepLink();
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Navigates to Graph Representations Try Page")
	public void navigates_to_graph_representations_try_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("I click Try Here button")
	public void i_click_try_here_button() {
	    // Write code here that turns the phrase above into concrete actions
		graphPage.ClickGraphReptry();
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Navigates to New Try Editor Page")
	public void navigates_to_new_try_editor_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enter {string} in text area")
	public void enter_in_text_area(String string) {
	    // Write code here that turns the phrase above into concrete actions
		graphPage.PrintGraphRep();
	    throw new io.cucumber.java.PendingException();
	}

	@When("I click Run")
	public void i_click_run() {
	    // Write code here that turns the phrase above into concrete actions
		graphPage.ClickRunGraphRep();;
	    throw new io.cucumber.java.PendingException();
	}

	@Then("displays {string} in the output")
	public void displays_in_the_output(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
