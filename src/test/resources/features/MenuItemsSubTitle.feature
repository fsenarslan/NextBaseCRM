@Menu_Items
Feature: Page SubTitle

  Scenario Outline: Login as <role> and verify page SubTitle
    Given User is on the login page
    And User logs in as "<role>"
    When user navigates to "<module>"
    Then page subtitle should be "<PageTitle>"


    Examples:
      | role            | module           | PageTitle                  |
      | Human Resources | Activity Stream  | Activity Stream            |
      | Human Resources | Tasks            | My tasks                   |
      | Human Resources | Workgroups       | Workgroups and projects    |
      | Human Resources | Calendar         | Calendar                   |
      | Human Resources | Mail             | Mailbox Integration        |
      | Human Resources | Contact Center   | Contact Center             |
      | Human Resources | Time and Reports | Absence Chart              |
      | Human Resources | Employees        | Company Structure          |
      | Human Resources | Services         | Meeting Rooms              |
      | Human Resources | Company          | Company                    |



