
Feature: Stack Page Functionality

  @StackPage
  Scenario Outline: Run print statement
    Given User is on home page for StackPage
    And User enters sheetname "<sheetName>" and rownumber <rowNumber> for StackPage
    Then Enter username "<userName>" and password "<password>" to sign in for StackPage
    Given The user is in the Home page
    When The user clicks on  get started button
    Then The user will be directed to Stack Page
    Examples:
      | sheetName | rowNumber |
      | signIn    | 0         |

  @StackPage
  Scenario: Run print statement on Operations in Stack link
    Given The user clicks on Operations in Stack link
    When The user clicks Try Here button in the Operations in stack page
    When The user enters valid python code in TryEditor "print'Welcome'"
    And user clicks on run button
    Then The user will be presented with the Run output

  @StackPage
  Scenario: Run print statement on the Implementation page
    Given The user is on Stack page
    When The user clicks the Implementation link
    When The user clicks Try Here button on the Implementation page
    Then The user is redirected to tryEditor page with a Run button to test
    And The user enters text in tryEditor "print'Welcome'"
    And user clicks Run button
    Then The user will be presented with the Run output

  @  @StackPage
  Scenario:  Run print statement on the Applications page
    Given The user is on Stack page
    When The user clicks the Applications link
    When The user clicks Try Here button on the  Applications page
    Then The user will be redirected to tryEditor page with a Run button to test
    And The user enters text in tryEditor "print'Welcome'"
    And user clicks Run button
    Then The user will be presented with the Run output

  @  @StackPage
  Scenario: Validate Practice Questions Page
    Given The user is on Stack page
    When The user clicks on to the Practice Questions link
    Then The user will be directed to practice questions of stack Page
