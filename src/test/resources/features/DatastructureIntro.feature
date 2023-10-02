@tag
Feature: Data Structures-Introduction Home page Funtionality

Background:
    Given I am on Ds-algo Home Page
    When I click the GetStared button under Data Structures-Introduction subtitle
    Then Navigates to Data Structures-Introduction Home page

  @tag1
  Scenario: Run the print statement in Data Structures-Introduction
    When I click on the Data Structures-Introduction link
    Then Navigates to Data Structures-Introduction page
    When I click the Time Complexity link
    Then I click on Typehere button on Time Complexity Page
		And Navigates to TryEditor Page
    When I Enter "print 'welcome'" in text area
    And click Run
    Then displays "welcome" in output


  @tag2
  Scenario: Run the print statement in Data Structures-Introduction
    When I click on the Data Structures-Introduction link
    Then Navigates to Data Structures-Introduction page
    When I click the Time Complexity link
    Then I click on Typehere button on Time Complexity Page
		And Navigates to TryEditor Page
    When I Enter invalid python Code in text area
    And click Run
    Then Display Alert message