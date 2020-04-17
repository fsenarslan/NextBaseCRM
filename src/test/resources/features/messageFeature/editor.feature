
Feature: user should sending message using editor toolbar
  Background:
    Given User is on the login page
    And User logs in as Human Resources
    When user clicks message button
      And user clicks editor Button
      Then Verify editor toolbar display
@choosingFont
Scenario:
When user clicks fontButton
  Then Verify that fontButtons are available
  |don't specify      |
  |Times New Roman    |
  |Courier New        |
  |Arial / Helvetica  |
  |Arial Black        |
  |Tahoma / Geneva    |
  |Verdana            |
  |Georgia            |
  |monospace          |