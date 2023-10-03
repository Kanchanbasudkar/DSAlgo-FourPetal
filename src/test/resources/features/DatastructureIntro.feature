@tag
Feature: Data Structures-Introduction Homepage

  Scenario Outline:Print statement in Data Structures-Introduction
    Given User on homepage of Dsalo and clickon Get started
    And User enters sheetname "<sheetName>" and rownumber <rowNumber> for Data
    Then Enter username "<userName>" and password "<password>" to signin for Data
    When User click the GetStared button under Data subtitle
    Then User Navigates to Data Structures-Introduction
    When User click on Time Complexity link
    Then Navigates to Time Complexity link
    When User click on Try HereButton
    Then User navigates to TryEditorPage
    When User Enter vaild message in textbox
    And User click on RunButton
    Then Display output
    Examples:
      | sheetName |rowNumber|
      | signin    |0        |

