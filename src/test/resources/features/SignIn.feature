@tag
Feature: Sign in
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Enter user name and password to sign in
    Given User is on home page
    When User clicked on SignIn button
    And User enters sheetname "<sheetName>" and rownumber <rowNumber>
    Then Enter username "<userName>" and password "<password>" to sign in
    Then It navigates to login page
    And User clicked on login button
    Then User navigates to home page
    Examples:
      | sheetName | rowNumber |
      | signIn    | 0         |


 