Feature: user
  As a user, I should be able to send messages by clicking on Message tab under Active Stream.

Background:
Given User is on the login page
And User logs in as Human Resources
When user clicks message button
@Quate
  Scenario:user send message in quate succesfully
    And user clicks comma button
   Then quate should displayed
    When user write text on quate
    And user clicks send button
Then verify that message is displayed