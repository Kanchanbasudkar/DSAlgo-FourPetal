Feature: Tree Home page Funtionality

  Scenario Outline: Run print statement in overview link
    Given User is on home page for TreePage
    And User enters sheetname "<sheetName>" and rownumber <rowNumber> for TreePage
    Then Enter username "<userName>" and password "<password>" to sign in for TreePage
    Given I am on Home Page after signing in for TreePage
    When I click the GetStared button under Tree subtitle
    Then Navigates to Tree Home page
    When I click the overview Link
    Then Navigates to overview Page
    When I Clicked the try Here
    Then Navigates to New Try Editor page
    When enter "print 'Welcome'" in Text Area
    And I Click run
    Then Displays "Welcome" in the
    Examples:
      | sheetName | rowNumber |
      | signIn    | 0         |

  @TreePage
  Scenario: Run print statement in terminologies link
    Given I click the terminologies Link
    Then Navigates to terminologies Page
    When I Clicked the try Here
    Then Navigates to New Try Editor page
    When enter "print 'Welcome'" in Text Area
    And I Click run
    Then Displays "Welcome" in the Output

  @TreePage
  Scenario: Run print statement in type link
    When I click the type Link
    Then Navigates to type Page
    When I Clicked the try Here
    Then Navigates to New Try Editor page
    When enter "print 'Welcome'" in Text Area
    And I Click run
    Then Displays "Welcome" in the Output

  @TreePage
  Scenario: Run print statement in tree link
    When I click the tree Link
    Then Navigates to tree Page
    When I Clicked the try Here
    Then Navigates to New Try Editor page
    When enter "print 'Welcome'" in Text Area
    And I Click run
    Then Displays "Welcome" in the Output

  @TreePage
  Scenario: Run print statement in traversals link
    When I click the traversals Link
    Then Navigates to traversals Page
    When I Clicked the try Here
    Then Navigates to New Try Editor page
    When enter "print 'Welcome'" in Text Area
    And I Click run
    Then Displays "Welcome" in the Output

  @TreePage
  Scenario: Run print statement in binary link
    When I click the binary Link
    Then Navigates to binary Page
    When I Clicked the try Here
    Then Navigates to New Try Editor page
    When enter "print 'Welcome'" in Text Area
    And I Click run
    Then Displays "Welcome" in the Output

  @TreePage
  Scenario: Run print statement in types Of Binary link
    When I click the typesOfBinary Link
    Then Navigates to typesOfBinary Page
    When I Clicked the try Here
    Then Navigates to New Try Editor page
    When enter "print 'Welcome'" in Text Area
    And I Click run
    Then Displays "Welcome" in the Output

  @TreePage
  Scenario: Run print statement in implementation In Python link
    When I click the implementationInPython Link
    Then Navigates to implementationInPython Page
    When I Clicked the try Here
    Then Navigates to New Try Editor page
    When enter "print 'Welcome'" in Text Area
    And I Click run
    Then Displays "Welcome" in the Output

  @TreePage
  Scenario: Run print statement in binary Tree Traversals link
    When I click the binaryTreeTraversals Link
    Then Navigates to binaryTreeTraversals Page
    When I Clicked the try Here
    Then Navigates to New Try Editor page
    When enter "print 'Welcome'" in Text Area
    And I Click run
    Then Displays "Welcome" in the Output

  @TreePage
  Scenario: Run print statement in implementation Of Binary link
    When I click the implementationOfBinary Link
    Then Navigates to implementationOfBinary Page
    When I Clicked the try Here
    Then Navigates to New Try Editor page
    When enter "print 'Welcome'" in Text Area
    And I Click run
    Then Displays "Welcome" in the Output

  @TreePage
  Scenario: Run print statement in applications link
    When I click the applications Link
    Then Navigates to applications Page
    When I Clicked the try Here
    Then Navigates to New Try Editor page
    When enter "print 'Welcome'" in Text Area
    And I Click run
    Then Displays "Welcome" in the Output

  @TreePage
  Scenario: Run print statement in binary Search link
    When I click the binarySearch Link
    Then Navigates to binarySearch Page
    When I Clicked the try Here
    Then Navigates to New Try Editor page
    When enter "print 'Welcome'" in Text Area
    And I Click run
    Then Displays "Welcome" in the Output

  @TreePage
  Scenario: Run print statement in implementation Of BST link
    When I click the implementationOfBST Link
    Then Navigates to implementationOfBST Page
    When I Clicked the try Here
    Then Navigates to New Try Editor page
    When enter "print 'Welcome'" in Text Area
    And I Click run
    Then Displays "Welcome" in the Output
    
    