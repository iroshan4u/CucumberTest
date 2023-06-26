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

@tag
Feature: Login Form

	Background: User must be on contact page
	Given User must be on homepage by clicking url " https://demo.applitools.com/"
	
	@regression
  Scenario: Checking functionality of login form
    
    When Enter valid <username> and <password>
    And Click on signing button
    
    Then User must be navigated to own account
    
    Examples:
    |username|password|
    |Allen|James|
    |a|z|
    
   @integration
   Scenario: Checking Sign in button functionality without enter credential

			When Sign in button visible
			And Click on signing button
			
			Then User must be navigated to own account

