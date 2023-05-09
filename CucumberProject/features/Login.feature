@Facebook
Feature: Login Feature 
  I want to test Login page of Facebook Application

  @LogIn
  Scenario: Login Scenario
    Given I am a user of facebook application.
    When I enter valid username.
    And I enter valid password.
    And I click on Login button.
    Then user should be able to log in successfully.
   
  @SignUP
  Scenario Outline: SignUp Scenario
    Given I am a user of facebook application. 
    When I enter valid  <username> 
    And I enter valid password.

    Examples: 
      | username | 
      | Nikhil   | 
    
