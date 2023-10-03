package stepdefinationfile;

import com.pages.ArrayPage;
import com.pages.SignInPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;


public class ArrayStepfile {


	ArrayPage arraypage = new ArrayPage(DriverFactory.getDriver());

	SignInPage signIn = new SignInPage(DriverFactory.getDriver());


	@Given("User on home page of Dsalo and clickon Getstarted")
	public void user_on_home_page_of_dsalo_and_clickon_getstarted() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home/");
		signIn.clickSignIn();
	}

	@Given("User enters sheetname {string} and rownumber {int} for Arrays")
	public void user_enters_sheetname_and_rownumber_for_arrays(String sheetName, Integer rowNumber) throws IOException {
		signIn.readDataFromSheet(sheetName, rowNumber);
	}

	@Then("Enter username {string} and password {string} to sign in for Arrays")
	public void enter_username_and_password_to_sign_in_for_arrays(String string, String string2) throws IOException {
		System.out.println("inside enter username and password");
		signIn.sendUsername();
		signIn.sendPassword();
		signIn.clickLoginBtn();
	}

	@When("User click the GetStared button under Array subtitle")
	public void user_click_the_get_stared_button_under_array_subtitle() {
		arraypage.Getstarted();
	}

	@Then("User Navigates to Array overview")
	public void user_navigates_to_array_overview() {
		System.out.println("Array Page");

	}

	@When("User click on Array in Python")
	public void user_click_on_array_in_python() {
		arraypage.ClickonArrayinPython();
	}

	@Then("Navigates to Array in Python")
	public void navigates_to_array_in_python() {
		System.out.println("Now at Array in Python Page");
	}

	@When("User click the Try HereButton")
	public void user_click_the_try_here_button_on_array_python_page() {
		arraypage.tryhere();
	}

	@Then("User navigates to Try EditorPage")
	public void user_navigates_to_try_editor_page() {
		System.out.println("Now at Editor page");
	}

	@When("User Enter vaild statement in textbox")
	public void user_enter_vaild_statment_in_textbox() throws InterruptedException {
		Thread.sleep(4000);
		arraypage.Txtarea();

	}

	@When("User click on RunButton")
	public void user_click_on_run_button() {
		arraypage.runButtton();
	}

	@Then("Display vaild message")
	public void display_vaild_message() {
System.out.println("Valid Statement");
	}


	@Given("User click on Arrays Using List")
	public void userClickOnArraysUsingList() throws InterruptedException {
		arraypage.ClickonArrayusingList();

	}

	@Then("Naviagates to Arrays Using List")
	public void naviagatesToArraysUsingList() throws InterruptedException {
		arraypage.ClickonArrayusingList();
		System.out.println("Now at Arrays Using List Page");
	}
	@Given("User click on Basic Operations in Lists")
	public void userClickOnBasicOperationsInLists() {
		arraypage.ClickonBasicOperation();
	}

	@Then("Naviagates to Basic Operations in Lists")
	public void naviagatesToBasicOperationsInLists() {
		System.out.println("Now at Basic Operations in Lists Page");

	}

	@Given("User click on Applications of Array")
	public void userClickOnApplicationsOfArray() {
		arraypage.ClickonApplication();
	}

	@Then("Naviagates to Applications of Array")
	public void naviagatesToApplicationsOfArray() {
		System.out.println("Now at Applications of Array Page");
	}
}
