#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@smoke
Feature: LoginRemember me checkbox

	@tag1
  Scenario: checking functionality of Login fomr remember me feature
    Given User must be on homepage by clicking on url " https://demo.applitools.com/"
    
    When User clicks on remember me check box
    
    Then Remember me check box must get selected