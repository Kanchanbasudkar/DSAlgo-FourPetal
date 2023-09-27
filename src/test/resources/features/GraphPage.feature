@tag
Feature: Graph Home page Funtionality

Background:
    Given I am on Ds-algo Home Page
    When I click the GetStared button under Graph subtitle
    Then Navigates to Graph Home page


  @tag1
  Scenario: Run print statement in Graph
    When I click the Graph Link
    Then Navigates to Graph Page
    When I click the Try Here>>> button
    Then Navigates to TryEditor Page
    When I Enter "print 'welcome'" in text area
    And click Run
    Then displays "welcome" in output


  @tag2
  Scenario: Run print statement in Graph Representations
    When I click the Graph Representations Link
    Then Navigates to Graph Representations Try Page
    When I click Try Here button
    Then Navigates to New Try Editor Page
    When Enter "print 'Welcome'" in text area
    And I click Run
    Then displays "Welcome" in the output

