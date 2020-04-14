Feature:Send Message
  As a user, I should be able to send messages by clicking on Message tab under Active Stream.

  Background:
    Given User is on the login page
    And User logs in as Human Resources
    When user clicks message button


  @add_contacts
  Scenario: Verify that adding contacts
    And user clicks Add more
    Then Verify that options available
      |Recent                   |
      |Employees and departments|
      |E-mail users             |