@Regression
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Login Page Title
    Given user is on login page
    When user gets the title of the page
    Then page title should be "Login - My Store"

  @tag2
  Scenario: Forgot Password Link
    Given user is on login page
    Then forgot your password link should be displayed

  @tag3
  Scenario: Login Page Title
    Given user is on login page
    When user gets the title of the page
    And user enters username as "demologin@gmail.com"
    And user enters password as "12345@"
    And user click on login button
    When user gets the title of the page
    Then page title should be "My account - My Store"
