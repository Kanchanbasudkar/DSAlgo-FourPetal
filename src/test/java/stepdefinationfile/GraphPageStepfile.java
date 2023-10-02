package stepdefinationfile;

import com.pages.GraphPage;
import com.pages.SignInPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class GraphPageStepfile {

    GraphPage graphPage = new GraphPage(DriverFactory.getDriver());
    SignInPage signIn = new SignInPage(DriverFactory.getDriver());

    @Given("Graph Page User is on home page")
    public void graph_page_user_is_on_home_page() {
        DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home/");
        signIn.clickSignIn();
    }

    @When("Graph Page User clicked on SignIn button")
    public void graph_page_user_clicked_on_sign_in_button() {
        signIn.clickSignIn();
    }

    @When("Graph Page User enters sheetname {string} and rownumber {string}")
    public void graph_page_user_enters_sheetname_and_rownumber_row_number(String sheetName, String rowNumber) throws IOException {
        signIn.readDataFromSheet(sheetName, Integer.parseInt(rowNumber));
    }

    @Then("Graph Page Enter username {string} and password {string} to sign in")
    public void graph_page_enter_username_and_password_to_sign_in(String string, String string2) throws IOException {
        signIn.sendUsername();
        signIn.sendPassword();
        signIn.clickLoginBtn();
    }

    @Then("Graph Page It navigates to login page")
    public void graph_page_it_navigates_to_login_page() {
    }

    @Then("Graph Page User clicked on login button")
    public void graph_page_user_clicked_on_login_button() {
        signIn.clickLoginBtn();
    }

    @Then("Graph Page User navigates to home page")
    public void graph_page_user_navigates_to_home_page() {
        System.out.println("Graph homepage");
    }

    @Then("I click the Graph Link")
    public void i_click_the_graph_link() {
        graphPage.ClickGraphLink();
    }

    @When("Navigates to Graph Page")
    public void navigates_to_graph_page() {
        graphPage.clickGraphGetstarted();
    }

    @When("I click the Try Here>>> button")
    public void i_click_the_try_here_button() {
        graphPage.ClickGraphTry();
    }

    @Then("Navigates to TryEditor Page")
    public void navigates_to_try_editor_page() {
    }

    @When("I Enter {string} in text area")
    public void i_enter_in_text_area(String string) {
        graphPage.PrintGraph();
    }

    @When("click Run")
    public void click_run() {
        graphPage.ClickRunGraph();
    }

    @Then("displays {string} in output")
    public void displays_in_output(String string) {
    }

    @When("I click the Graph Representations Link")
    public void i_click_the_graph_representations_link() {
        graphPage.ClickGraphRepLink();
    }

    @Then("Navigates to Graph Representations Try Page")
    public void navigates_to_graph_representations_try_page() {
    }

    @When("I click Try Here button")
    public void i_click_try_here_button() {
        graphPage.ClickGraphReptry();
    }

    @Then("Navigates to New Try Editor Page")
    public void navigates_to_new_try_editor_page() {
    }

    @When("Enter {string} in text area")
    public void enter_in_text_area(String string) {
        graphPage.PrintGraphRep();
    }

    @When("I click Run")
    public void i_click_run() {
        graphPage.ClickRunGraphRep();
    }

    @Then("displays {string} in the output")
    public void displays_in_the_output(String string) {
    }

    @Given("User is on home page for GraphPage")
    public void user_is_on_home_page_for_graph_page() {
        DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home/");
        signIn.clickSignIn();
    }

    @Given("User enters sheetname {string} and rownumber {int} for GraphPage")
    public void user_enters_sheetname_and_rownumber_for_graph_page(String sheetName, Integer rowNumber) throws IOException {
        signIn.readDataFromSheet(sheetName, rowNumber);
    }

    @Then("Enter username {string} and password {string} to sign in for GraphPage")
    public void enter_username_and_password_to_sign_in_for_graph_page(String string, String string2) throws IOException {
        signIn.sendUsername();
        signIn.sendPassword();
        signIn.clickLoginBtn();
    }

    @Given("I am on Home Page after signing in for GraphPage")
    public void i_am_on_home_page_after_signing_in_for_graph_page() {
        System.out.println("Graph homepage");
    }

    @When("I click Try Here button on GraphPage")
    public void i_click_try_here_button_on_graph_page() {
        graphPage.ClickGraphTry();

    }

    @Then("Navigates to New Try Editor Page of GraphPage")
    public void navigates_to_new_try_editor_page_of_graph_page() {

    }

    @When("Enter {string} in text area for GraphPage")
    public void enter_in_text_area_for_graph_page(String string) {
        graphPage.PrintGraph();
    }

    @When("I click Run in GraphPage")
    public void i_click_run_in_graph_page() {
        graphPage.ClickRunGraphRep();
    }

    @Then("displays {string} in the output for GraphPage")
    public void displays_in_the_output_for_graph_page(String string) {

    }
}
