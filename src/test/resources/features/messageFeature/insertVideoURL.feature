Feature:Send Message
  As a user, I should be able to insert videos by clicking on the video icon and entering the video URL

  @insert_video_URL
  Scenario: Verify that insert videos
    Given User is on the login page
    And User logs in as Human Resources
    When user clicks message button
    And user clicks video insert button
    And user enter the video URL in the video icon
    And user clicks the video save button
    And user clicks send button
    Then verify that video URL is entered

