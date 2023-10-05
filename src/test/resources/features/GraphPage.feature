Feature: Graph Home page Funtionality

  Scenario Outline: Run print statement in Graph link
    Given User is on home page for GraphPage
    And User enters sheetname "<sheetName>" and rownumber <rowNumber> for GraphPage
    Then Enter username "<userName>" and password "<password>" to sign in for GraphPage
    Given I am on Home Page after signing in for GraphPage
    When I click the GetStared button under Graph subtitle
    Then Navigates to Graph Home page
    When I click the Try Here>>> button
    Then Navigates to TryEditor Page
    When I Enter "print 'welcome'" in text area
    And click Run
    Then displays "welcome" in output
    Examples:
      | sheetName | rowNumber |
      | signIn    | 0         |


#  @GraphPage
#  Scenario: Run print statement in Graph Representations
#    When I click the Graph Representations Link
#    Then Navigates to Graph Representations Try Page
#    When I click Try Here button
#    Then Navigates to New Try Editor Page
#    When Enter "print 'Welcome'" in text area
#    And I click Run
#    Then displays "Welcome" in the output

