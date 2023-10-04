@tag
Feature: Sign in
  I want to use this template for my feature file

  @SignInWithValidUserDetails
  Scenario Outline: Enter user name and password to sign in
    Given User is on home page and click SignIn button
    When User enters sheetname "<sheetName>" and rownumber <rowNumber>
    And Enter username "<userName>" and password "<password>" and click on login button
    Then User navigates to home page and see success message
    Examples:
      | sheetName | rowNumber |
      | signIn    | 0         |


  @SignInWithInValidUserDetails
  Scenario Outline: Enter invalid user name and password to sign in
    Given User is on home page and click SignIn button
    When User enters sheetname "<sheetName>" and rownumber <rowNumber>
    And Enter username "<userName>" and password "<password>" and click on login button
    Then User will see invalid user details message
    Examples:
      | sheetName | rowNumber |
      | signIn    |    1    |
      | signIn    |    2   |
      | signIn    |    3   |



#    @SignInWithOutValidUserDetails
#    Scenario Outline: SignIn with blank user name and password
#      Given User is on home page and click SignIn button
#      When User enters sheetname "<sheetName>" and rownumber <rowNumber>
#      And Enter username "<userName>" and password "<password>" and click on login button
#      Then User will see invalid user details message
#      Examples:
#        | sheetName | rowNumber |
#        | signIn    |         |

 