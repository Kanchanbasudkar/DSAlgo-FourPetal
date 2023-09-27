package stepdefinationfile;

import com.pages.LinkedListPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedListStepFile {

	private LinkedListPage linkedListpage = new LinkedListPage(DriverFactory.getDriver());
	
	
    @Given("The user is in the Home page")
    public void  the_user_is_in_the_Home_page()   {
    	System.out.println("I am on home page");
    }

	@When("the user clicks on get started button")
	public void the_user_clicks_on_get_started_button() {
		linkedListpage.clickLinkedListGetStartedButton();

	}

	@Then("The user should be directed to Linked List Page")
	public void the_user_should_be_directed_to_linked_list_page() {
		System.out.println("I am on Linked List page");
	}

	@Given("the user clicks on Introduction link")
	public void the_user_clicks_on_introduction_link() {
		linkedListpage.introOfLinkedlist();

	}

	@When("The user clicks Try here button in the Introduction page")
	public void the_user_clicks_Try_here_button_in_the_Introduction_page() {
		linkedListpage.tryHereLink();
	}

	@And("user clicks on Run button")
	public void user_clicks_on_Run_button() {
		linkedListpage.clickRunButton();
	}

	@Then("The user should be presented with the Run output")
	public void the_user_should_be_presented_with_the_Run_output() {
		linkedListpage.codeOutput();
	}

	@When("the user clicks Creating a Linked List link")
	public void the_user_clicks_creating_a_linked_list_link() {
		linkedListpage.createLnkList();

	}

	@When("The user clicks Try here button on the Creating Linked List page")
	public void the_user_clicks_try_here_button_on_the_creating_linked_list_page() {
		linkedListpage.tryHereLink();

	}

	@Then("The user should be redirected to tryEditor page with a Run button to test")
	public void the_user_should_be_redirected_to_tryEditor_page_with_a_Run_button_to_test() {
		System.out.println("I am on tryeditor page");
	}

	@And("The user enters valid python code in tryEditor {string}")
	public void The_user_enters_valid_python_code_in_tryEditor(String pythonCode) {
		linkedListpage.enterValidPythonCode(pythonCode);
	}

	@Given("The user is in Linked List page")
	public void the_user_is_in_Linked_List_page() {
		System.out.println("I am on Linked List page");
	}

	@When("The user clicks Types of Linked List link")
	public void the_user_clicks_types_of_linked_list_link() {
		linkedListpage.typesOfLinkedList();

	}

	@When("The user clicks Try here button on Types of Linked List page")
	public void the_user_clicks_try_here_button_on_types_of_linked_list_page() {
		linkedListpage.tryHereLink();

	}
	
	@When("The user enters valid python code in tryEditor\"print {string}\"")
	public void the_user_enters_valid_python_code_in_try_editor_print1(String string) {
		linkedListpage.enterValidPythonCode(string);
	}

	@Then("The user enters valid python code in tryEditor\"print {string}\"")
	public void the_user_enters_valid_python_code_in_try_editor_print(String string) {
		linkedListpage.enterValidPythonCode(string);
	}

	@When("The user clicks Implement Linked list link")
	public void the_user_clicks_Implement_Linked_list_link() {
		linkedListpage.implementLinkedlist();
	}

	@When("The user clicks Try here button on the Implement Linked list page")
	public void the_user_clicks_try_here_button_on_the_implement_linked_list_page() {
		linkedListpage.tryHereLink();

	}

	@When("The user clicks Traversal  link")
	public void the_user_clicks_traversal_link() {
		linkedListpage.traversalLink();

	}

	@When("The user clicks Try here button on Traversal Linked list page")
	public void the_user_clicks_try_here_button_on_traversal_linked_list_page() {
		linkedListpage.tryHereLink();

	}

	@When("The user clicks on Insertion link")
	public void the_user_clicks_on_insertion_link() {
		linkedListpage.insertionLink();

	}

	@When("The user clicks Try here button on Insertion Linked list page")
	public void the_user_clicks_try_here_button_on_insertion_linked_list_page() {
		linkedListpage.tryHereLink();

	}

	@When("The user clicks Deletion link of Linked list page")
	public void the_user_clicks_deletion_link_of_linked_list_page() {
		linkedListpage.deletionLink();

	}

	@When("The user clicks Try Here button on the Deletion in Linked list page")
	public void the_user_clicks_try_here_button_on_the_deletion_in_linked_list_page() {
		linkedListpage.tryHereLink();

	}

	@When("The user clicks on Practice Questions link")
	public void the_user_clicks_on_practice_questions_link() {
		linkedListpage.practiceQuestionsLink();

	}

	@Then("The user should be directed to Practice Questions of Linked List Page")
	public void the_user_should_be_directed_to_Practice_Questions_of_Linked_List_Page() {
		System.out.println("I am on Practice questions page");
	}

}