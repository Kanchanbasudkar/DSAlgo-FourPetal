package stepdefinationfile;

import com.pages.DatastructuresIntroPage;
import com.pages.SignInPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class DataStructureIntroStepfile {

	DatastructuresIntroPage dataIntro = new DatastructuresIntroPage(DriverFactory.getDriver());
	SignInPage signIn = new SignInPage(DriverFactory.getDriver());

	@Given("User on homepage of Dsalo and clickon Get started")
	public void userOnHomepageOfDsaloAndClickonGetStarted() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home/");
		signIn.clickSignIn();
	}
	@Given("User enters sheetname {string} and rownumber {int} for Data")
	public void user_enters_sheetname_and_rownumber_for_data(String sheetName, Integer rowNumber) throws IOException {
		signIn.readDataFromSheet(sheetName, rowNumber);
	}
	@Then("Enter username {string} and password {string} to signin for Data")
	public void enter_username_and_password_to_signin_for_data(String string, String string2) throws IOException {
		System.out.println("inside enter username and password");
		signIn.sendUsername();
		signIn.sendPassword();
		signIn.clickLoginBtn();
	}
	@When("User click the GetStared button under Data subtitle")
	public void user_click_the_get_stared_button_under_data_subtitle() {
		dataIntro.clickDataStructureGetStarted();
	}
	@Then("User Navigates to Data Structures-Introduction")
	public void user_navigates_to_data_structures_introduction() {
		System.out.println("Data Structures-Introduction");

	}
	@When("User click on Time Complexity link")
	public void user_click_on_time_complexity_link() {
		dataIntro.Clicktime_complex();
	}
	@Then("Navigates to Time Complexity link")
	public void navigates_to_time_complexity_link() {
		System.out.println("Time Complexity link");
	}
	@When("User click on Try HereButton")
	public void user_click_on_try_here_button() {
		dataIntro.Clicktry();
	}
	@Then("User navigates to TryEditorPage")
	public void user_navigates_to_try_editor_page() {
		System.out.println("Try EditorPage");
	}
	@When("User Enter vaild message in textbox")
	public void user_enter_vaild_statement_in_textbox() {
		dataIntro.Clickwrite();
	}

	@And("User press on RunButton")
	public void userPressOnRunButton() {
		dataIntro.Clickrunbutton();
	}

	@Then("Display output")
	public void displayOutput() {
		dataIntro.Displayoutput();
	}
}