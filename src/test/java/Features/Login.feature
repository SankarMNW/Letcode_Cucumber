@sanity
Feature: User Authentication

  Background: 
    #Given User should navigate to the application login
    And User clicks on the login link

  @reg
  Scenario: Login should be Success
    And User enter the username as "ortoni"
    And User enter the password as "pass1234"
    When User click the login button
    Then Login should be success

  @smoke @reg
  Scenario: Login should be Failed
    And User enter the username as "sankar"
    And User enter the password as "pwd123"
    When User click the login button
    Then Login should fail
