package com.dsalgo.stepDefinition;

import com.dsalgo.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDefinition {
    @Given("I see the register link")
    public void i_see_the_register_link() {
        System.out.println("I see the register link");
        throw new io.cucumber.java.PendingException();
    }
    @When("I click the register link")
    public void i_click_the_register_link() {
        HomePage.clickRegisterLink();
        throw new io.cucumber.java.PendingException();
    }
    @Then("Navigates to Registration screen")
    public void navigates_to_registration_screen() {
        System.out.println("I will navigate to Registration screen");
        throw new io.cucumber.java.PendingException();
    }



}
