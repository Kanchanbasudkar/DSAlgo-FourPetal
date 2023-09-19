
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @tag2
  Scenario Outline: Registeration Form
    Given User need to Enter Username <sdet130@gmail.com>
    When User need to Enter Password <Numpy@12345> 
    And User confirms Password <Numpy@12345> 
    Then User need to click on Register Button
    
     

    Examples: 
      | name  | value |
      | Username | sdet130@gmail.com |
      | Password | Numpy@12345 |     
			|Password confirmation|Numpy@12345|