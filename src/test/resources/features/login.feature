Feature: Login
As a user I should be able to login


  @login
  Scenario: Login as a Human Resources
    Given User is on the login page
    When User logs in as Human Resources
    Then Verify that page title is "Portal"


  @login_with_different_credentials
  Scenario Outline: Login as "<role>"
    Given User is on the login page
    When User logs in as "<role>"
    Then Verify that page title is "<Portal>"
    Examples:
      |role           |Portal     |
      |Human Resources|Portal     |
      |Help Desk      |Portal     |
      |Marketing      |Assignments |