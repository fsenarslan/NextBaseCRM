Feature: user
  As a user, I should be able to send messages by clicking on Message tab under Active Stream.

  Background:
    Given User is on the login page
    And User logs in as Human Resources
    When user clicks message button

  @video_record
  Scenario: Verify that video record
    And User clicks video record button
    And User clicks video record allow button
    Then Verify that video uploaded