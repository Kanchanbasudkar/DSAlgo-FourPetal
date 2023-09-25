@tag
Feature: LinkedList

  @tag1
  Scenario: Navigate to LinkedList Page
    Given The user is in the Home page
    When the user clicks on get started button
    Then The user should be directed to Linked List Page

  @tag2
  Scenario: Navigate to Introduction of LinkedlistPage
    Given the user clicks on Introduction link
    When The user clicks Try here button in the Introduction page
    And The user enters valid python code in tryEditor"print 'Welcome'"
    And user clicks on Run button
    Then The user should be presented with the Run output

  @tag3
  Scenario: Navigate to Creating a Linked list page
    Given The user is in Linked List page
    When the user clicks Creating a Linked List link
    When The user clicks Try here button on the Creating Linked List page
    Then The user should be redirected to tryEditor page with a Run button to test
    And The user enters valid python code in tryEditor"print 'Welcome'"
    And user clicks on Run button
    Then The user should be presented with the Run output

  @tag4
  Scenario: Navigate to Types of Linked list page
    Given The user is in Linked List page
    When The user clicks Types of Linked List link
    When The user clicks Try here button on Types of Linked List page
    Then The user should be redirected to tryEditor page with a Run button to test
    And The user enters valid python code in tryEditor"print 'Welcome'"
    And user clicks on Run button
    Then The user should be presented with the Run output

  @tag5
  Scenario: Navigate to Implement Linked list page
    Given The user is in Linked List page
    When The user clicks Implement Linked list link
    When The user clicks Try here button on the Implement Linked list page
    Then The user should be redirected to tryEditor page with a Run button to test
    And The user enters valid python code in tryEditor"print 'Welcome'"
    And user clicks on Run button
    Then The user should be presented with the Run output

  @tag6
  Scenario: Navigate to Traversal of Linked list page
    Given The user is in Linked List page
    When The user clicks Traversal  link
    When The user clicks Try here button on Traversal Linked list page
    Then The user should be redirected to tryEditor page with a Run button to test
    And The user enters valid python code in tryEditor"print 'Welcome'"
    And user clicks on Run button
    Then The user should be presented with the Run output

  @tag7
  Scenario: Navigate to Insertion of Linked list page
    Given The user is in Linked List page
    When The user clicks on Insertion link
    When The user clicks Try here button on Insertion Linked list page
    Then The user should be redirected to tryEditor page with a Run button to test
    And The user enters valid python code in tryEditor"print 'Welcome'"
    And user clicks on Run button
    Then The user should be presented with the Run output

  @tag8
  Scenario: Navigate to Deletion of Linked list page
    Given The user is in Linked List page
    When The user clicks Deletion link of Linked list page
    When The user clicks Try Here button on the Deletion in Linked list page
    Then The user should be redirected to tryEditor page with a Run button to test
    And The user enters valid python code in tryEditor"print 'Welcome'"
    And user clicks on Run button
    Then The user should be presented with the Run output

  @tag9
  Scenario: Validate Practice Questions Page
    Given The user is in Linked List page
    When The user clicks on Practice Questions link
    Then The user should be directed to Practice Questions of Linked List Page

