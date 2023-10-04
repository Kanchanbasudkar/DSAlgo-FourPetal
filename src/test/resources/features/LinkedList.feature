
Feature: LinkedList

  @LinkedListPage
  Scenario Outline: Run print statement
    Given User is on home page for LinkedListPage
    And User enters sheetname "<sheetName>" and rownumber <rowNumber> for LinkedList Page
    Then Enter username "<userName>" and password "<password>" to sign in for LinkedListPage
    Given The user is in Home page
    When the user clicks on get started button
    Then The user should be directed to Linked List Page
    Examples:
      | sheetName | rowNumber |
      | signIn    | 0         |

  @LinkedListPage
  Scenario:Run print statement on Introduction Link
    Given the user clicks on Introduction link
    When The user clicks Try here button in the Introduction page
    And The user enters valid python code in tryEditor"print 'Welcome'"
    And user clicks on Run button
    Then The user should be presented with the Run output

  @LinkedListPage
  Scenario: Run print statement on the Creating Linked List page
    Given The user is in Linked List page
    When the user clicks Creating a Linked List link
    When The user clicks Try here button on the Creating Linked List page
    Then The user should be redirected to tryEditor page with a Run button to test
    And The user enters valid python code in tryEditor"print 'Welcome'"
    And user clicks on Run button
    Then The user should be presented with the Run output

  @LinkedListPage
  Scenario: Run print statement on Types of Linked List page
    Given The user is in Linked List page
    When The user clicks Types of Linked List link
    When The user clicks Try here button on Types of Linked List page
    Then The user should be redirected to tryEditor page with a Run button to test
    And The user enters valid python code in tryEditor"print 'Welcome'"
    And user clicks on Run button
    Then The user should be presented with the Run output

  @LinkedListPage
  Scenario: Run print statement on the Implement Linked list page
    Given The user is in Linked List page
    When The user clicks Implement Linked list link
    When The user clicks Try here button on the Implement Linked list page
    Then The user should be redirected to tryEditor page with a Run button to test
    And The user enters valid python code in tryEditor"print 'Welcome'"
    And user clicks on Run button
    Then The user should be presented with the Run output

  @LinkedListPage
  Scenario: Run print statement on Traversal Linked list page
    Given The user is in Linked List page
    When The user clicks Traversal  link
    When The user clicks Try here button on Traversal Linked list page
    Then The user should be redirected to tryEditor page with a Run button to test
    And The user enters valid python code in tryEditor"print 'Welcome'"
    And user clicks on Run button
    Then The user should be presented with the Run output

  @LinkedListPage
  Scenario: Run print statement on Insertion Linked list page
    Given The user is in Linked List page
    When The user clicks on Insertion link
    When The user clicks Try here button on Insertion Linked list page
    Then The user should be redirected to tryEditor page with a Run button to test
    And The user enters valid python code in tryEditor"print 'Welcome'"
    And user clicks on Run button
    Then The user should be presented with the Run output

  @LinkedListPage
  Scenario: Run print statement on Deletion link of Linked list page
    Given The user is in Linked List page
    When The user clicks Deletion link of Linked list page
    When The user clicks Try Here button on the Deletion in Linked list page
    Then The user should be redirected to tryEditor page with a Run button to test
    And The user enters valid python code in tryEditor"print 'Welcome'"
    And user clicks on Run button
    Then The user should be presented with the Run output

  @LinkedListPage
  Scenario: Validate Practice Questions Page
    Given The user is in Linked List page
    When The user clicks on Practice Questions link
    Then The user should be directed to Practice Questions of Linked List Page

