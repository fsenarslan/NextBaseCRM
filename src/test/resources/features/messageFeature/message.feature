Feature:Send Message
  As a user, I should be able to send messages by clicking on Message tab under Active Stream.

  Background:
    Given User is on the login page
    And User logs in as Human Resources
    When user clicks message button
    And user clicks file upload button

  @message
  Scenario:Verify that upload table display
    Then user verifies that elements are displayed

  @file_upload
  Scenario: Verify that file upload
    And user clicks upload files button
    And user upload the file
    Then Verify that file is uploaded

   @link_upload
   Scenario: Verify that link uploaded
     When user clicks link button
     And user insert link name
     And user upload the link
     And user clicks the save button
     Then Verify that upload link



