Feature: user
  As a user, I should be able to send messages by clicking on Message tab under Active Stream.

  Background:
    Given User is on the login page
    And User logs in as Human Resources
    When user clicks message button


   @mention
   Scenario: User add mention successfully
     And user clicks mention button
     When user clicks contact button
#     And user clicks cyberVet button
     And user choose mail address
     And user enter a fake email
     Then verify that mention is displayed

