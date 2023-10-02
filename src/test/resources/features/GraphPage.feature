Feature: Graph Home page Funtionality

#  Background:
#    Given Graph Page User is on home page
#    When Graph Page User clicked on SignIn button
#    And Graph Page User enters sheetname "<sheetName>" and rownumber "<rowNumber>"
#    Then Graph Page Enter username "<userName>" and password "<password>" to sign in
#    Then Graph Page It navigates to login page
#    And Graph Page User clicked on login button
#    Then Graph Page User navigates to home page

  Scenario Outline: Run print statement in Graph
    Given User is on home page for GraphPage
    And User enters sheetname "<sheetName>" and rownumber <rowNumber> for GraphPage
    Then Enter username "<userName>" and password "<password>" to sign in for GraphPage
    Given I am on Home Page after signing in for GraphPage
    When Navigates to Graph Page
    Then I click the Graph Link
    When I click the Try Here>>> button
    Then Navigates to TryEditor Page
    When I Enter "print 'welcome'" in text area
    And click Run
    Then displays "welcome" in output
    Examples:
      | sheetName | rowNumber |
      | signIn    | 0         |


  @GraphPage
  Scenario: Run print statement in Graph Representations
    When I click the Graph Representations Link
    Then Navigates to Graph Representations Try Page
    When I click Try Here button on GraphPage
    Then Navigates to New Try Editor Page of GraphPage
    When Enter "print 'Welcome'" in text area for GraphPage
    And I click Run in GraphPage
    Then displays "Welcome" in the output for GraphPage
##    Examples:
##      | sheetName | rowNumber |
##      | signIn    | 0         |

