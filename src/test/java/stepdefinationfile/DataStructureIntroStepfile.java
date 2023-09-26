package stepdefinationfile;

import com.pages.DatastructuresIntroPage;
import com.pages.SignIn;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructureIntroStepfile {

DatastructuresIntroPage dataIntro = new DatastructuresIntroPage(DriverFactory.getDriver());
SignIn signIn = new SignIn(DriverFactory.getDriver());


@Given("I am on Ds-algo Home Page")
public void i_am_on_ds_algo_home_page() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home/");
	signIn.ClickSignIn();
	signIn.Username();
	signIn.Password();
	signIn.ClickLoginBtn();

}

@When("I click the GetStared button under Data Structures-Introduction subtitle")
public void i_click_the_get_stared_button_under_graph_subtitle() {
    //throw new io.cucumber.java.PendingException();
	dataIntro.ClickData_structureGetstarted();
}

@Then("Navigates to Data Structures-Introduction Home page")
public void navigates_to_data_structures_introduction_home_page() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	System.out.println("Data Structures-Introduction Home page");
}

@When("I click on the Data Structures-Introduction link")
public void i_click_on_the_data_structures_introduction_link() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	dataIntro.Clicktime_complex();
}

@Then("Navigates to Data Structures-Introduction page")
public void navigates_to_data_structures_introduction_page() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	System.out.println("Data Structures-Introduction page");
}

@When("I click the Try Here>>> button")
public void i_click_the_try_here_button() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	dataIntro.Clicktry();
}

@Then("Navigates to TryEditor Page")
public void navigates_to_try_editor_page() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	System.out.println("need to enter welcome");
}

@When("I Enter {string} in text area")
public void i_enter_in_text_area(String string) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	Thread.sleep(5000);
	dataIntro.Clickwrite();
}

@And("click Run")
public void click_run() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	dataIntro.Clickrunbutton();
}


@Then("displays {string} in output")
public void displays_in_output(String string) {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	System.out.println("welcome printed");
}

@When("I click the Time Complexity link")
public void i_click_the_time_complexity_link() {
	dataIntro.Clicktry();
}

@Then("I click on Typehere button on Time Complexity Page")
public void i_click_on_typehere_button_on_time_complexity_page() {
	System.out.println("now at time Time Complexity");
}

@When("I Enter invalid python Code in text area")
public void i_enter_invalid_python_code_in_text_area() {
		dataIntro.invalidtext();
		dataIntro.Clickrunbutton();

}

@Then("Display Alert message")
public void display_alert_message() {
	System.out.println("alert");
   }




}
