@tag
Feature: Sign in
  I want to use this template for my feature file

  @tag1
  Scenario: Enter id and password to sign in
    Given I am at home page
    When I click sign in
    Then It navigates to login page
    And I enter Username "kanchanbasudkar"
    And I enter password "kanbas123$"
    And I click login
    Then It navigates to home page
    


 