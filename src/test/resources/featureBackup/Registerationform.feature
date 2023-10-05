
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Filling Registration form
    Given User needs cicks on registration form
    When User needs to enter username,password,confirm password from given <"sheetname"> and <rowno>
    Then User needs to click on register button with expected message

    Examples:
    |sheetname	|	rowno			|
    |Sheet1			|0					|
    |Sheet1			|1					|
    |Sheet1			|2					|
    |Sheet1			|3					|
    |Sheet1			|4					|
    |Sheet1			|5					|
    |Sheet1			|6					|
    |Sheet1			|7					|
    |Sheet1			|8					|
    |Sheet1			|9					|
    
    
  