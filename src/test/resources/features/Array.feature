
Feature: Array Homepage

Scenario Outline:Print statement in  Arrays in Python
Given User on home page of Dsalo and clickon Getstarted
And User enters sheetname "<sheetName>" and rownumber <rowNumber> for Arrays
Then Enter username "<userName>" and password "<password>" to sign in for Arrays
When User click the GetStared button under Array subtitle
Then User Navigates to Array overview
When User click on Array in Python
Then Navigates to Array in Python
When User click the Try HereButton
Then User navigates to Try EditorPage
When User Enter vaild statement in textbox
And User press on RunButton
Then Display vaild message
    Examples:
      | sheetName |rowNumber|
      | signin    |0        |

@Arrays
   Scenario:Print statement in Arrays Using List
     Given User click on Arrays Using List
     Then Naviagates to Arrays Using List
     When User click the Try HereButton                       
     Then User navigates to Try EditorPage                    
     When User Enter vaild statement in textbox               
     And User click on RunButton                              
     Then Display vaild message

@Arrays
  Scenario:Print statement in Basic Operations in Lists
    Given User click on Basic Operations in Lists
    Then Naviagates to Basic Operations in Lists
    When User click the Try HereButton
    Then User navigates to Try EditorPage
    When User Enter vaild statement in textbox
    And User click on RunButton
    Then Display vaild message

@Arrays
Scenario:Print statement in Applications of Array
  Given User click on Applications of Array
  Then Naviagates to Applications of Array
  When User click the Try HereButton
  Then User navigates to Try EditorPage
  When User Enter vaild statement in textbox
  And User click on RunButton
  Then Display vaild message 