package stepdefinationfile;

import com.pages.SignInPage;
import com.pages.TreePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class TreePageStepfile {

    TreePage treePage = new TreePage(DriverFactory.getDriver());

    SignInPage signIn = new SignInPage(DriverFactory.getDriver());

    @Given("User is on home page for TreePage")
    public void user_is_on_home_page_for_tree_page() {
        DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home/");
        signIn.clickSignIn();
    }

    @Given("User enters sheetname {string} and rownumber {int} for TreePage")
    public void user_enters_sheetname_and_rownumber_for_tree_page(String sheetName, Integer rowNumber) throws IOException {
        signIn.readDataFromSheet(sheetName, rowNumber);
    }

    @Then("Enter username {string} and password {string} to sign in for TreePage")
    public void enter_username_and_password_to_sign_in_for_tree_page(String string, String string2) throws IOException {
        System.out.println("inside enter username and password");
        signIn.sendUsername();
        signIn.sendPassword();
        signIn.clickLoginBtn();
    }

    @Given("I am on Home Page after signing in for TreePage")
    public void i_am_on_home_page_after_signing_in_for_tree_page() {
    }

    @Then("Displays {string} in the")
    public void displays_in_the(String string) {
    }


    @Given("I am on Home Page after signing in")
    public void i_am_on_home_page_after_signing_in() throws IOException {
        DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home/");
        signIn.clickSignIn();
        signIn.sendUsername();
        signIn.sendPassword();
        signIn.clickLoginBtn();
    }

    @When("I click the GetStared button under Tree subtitle")
    public void i_click_the_get_stared_button_under_tree_subtitle() {
        treePage.ClickTreeGetStared();
    }

    @Then("Navigates to Tree Home page")
    public void navigates_to_tree_home_page() {
        System.out.println("Welcome to Tree homepage");

    }

    @When("I click the overview Link")
    public void i_click_the_overview_link() {
        treePage.ClickOverviewLink();
    }

    @Then("Navigates to overview Page")
    public void navigates_to_overview_page() {
        System.out.println("Welcome to Overview Page");

    }

    @When("I click the terminologies Link")
    public void i_click_the_terminologies_link() {
        treePage.ClickTerminologiesLink();
    }

    @Then("Navigates to terminologies Page")
    public void navigates_to_terminologies_page() {
    }

    @When("I click the type Link")
    public void i_click_the_type_link() {
        treePage.ClickTypeLink();
    }

    @Then("Navigates to type Page")
    public void navigates_to_type_page() {
    }

    @When("I click the tree Link")
    public void i_click_the_tree_link() {
        treePage.ClickTreeLink();
    }

    @Then("Navigates to tree Page")
    public void navigates_to_tree_page() {
    }

    @When("I click the traversals Link")
    public void i_click_the_traversals_link() {
        treePage.ClickTraversalsLink();
    }

    @Then("Navigates to traversals Page")
    public void navigates_to_traversals_page() {
    }

    @When("I click the binary Link")
    public void i_click_the_binary_link() {
        treePage.ClickBinaryLink();
    }

    @Then("Navigates to binary Page")
    public void navigates_to_binary_page() {
    }

    @When("I click the typesOfBinary Link")
    public void i_click_the_types_of_binary_link() {
        treePage.ClickTypesOfBinaryLink();
    }

    @Then("Navigates to typesOfBinary Page")
    public void navigates_to_types_of_binary_page() {
    }

    @When("I click the implementationInPython Link")
    public void i_click_the_implementation_in_python_link() {
        treePage.ClickImplementationInPythonLink();
    }

    @Then("Navigates to implementationInPython Page")
    public void navigates_to_implementation_in_python_page() {
    }

    @When("I click the binaryTreeTraversals Link")
    public void i_click_the_binary_tree_traversals_link() {
        treePage.ClickBinaryTreeTraversalsLink();
    }

    @Then("Navigates to binaryTreeTraversals Page")
    public void navigates_to_binary_tree_traversals_page() {
    }

    @When("I click the implementationOfBinary Link")
    public void i_click_the_implementation_of_binary_link() {
        treePage.ClickImplementationOfBinaryLink();
    }

    @Then("Navigates to implementationOfBinary Page")
    public void navigates_to_implementation_of_binary_page() {
    }

    @When("I click the applications Link")
    public void i_click_the_applications_link() {
        treePage.ClickApplicationsLink();
    }

    @Then("Navigates to applications Page")
    public void navigates_to_applications_page() {
    }

    @When("I click the binarySearch Link")
    public void i_click_the_binary_search_link() {
        treePage.ClickBinarySearchLink();
    }

    @Then("Navigates to binarySearch Page")
    public void navigates_to_binary_search_page() {
    }

    @When("I click the implementationOfBST Link")
    public void i_click_the_implementation_of_bst_link() {
        treePage.ClickImplementationOfBstLink();
    }

    @Then("Navigates to implementationOfBST Page")
    public void navigates_to_implementation_of_bst_page() {
    }

    @When("I Clicked the try Here")
    public void i_clicked_the_try_here() {
        treePage.ClickTryHereButton();
    }

    @Then("Navigates to New Try Editor page")
    public void navigates_to_new_try_editor_page() {
    }

    @When("enter {string} in Text Area")
    public void enter_in_text_area(String string) {
        treePage.Write();
    }

    @When("I Click run")
    public void i_click_run() {
        treePage.Run();
    }

    @Then("Displays {string} in the Output")
    public void displays_in_the_output(String string) {
    }

    @Given("User should navigate to Tree Home page")
    public void user_should_navigate_to_tree_home_page() {
        DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/tree/overview-of-trees/");
    }


}
