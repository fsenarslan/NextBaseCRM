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

  @file_upload_desktop
  Scenario: Verify that file upload
    And user clicks upload files button
    And user upload the file
    Then Verify that file is uploaded

   ####################
  @file_upload_Bitrix24_MyDrive
    Scenario: Verify that file upload
    And User clicks Bitrix24 button
    When User clicks My Drive button
    And User clicks Upload Folder
    When User choose resume.txt file
    And User clicks select Document button
    And User is clicks send button
    Then Verify that upload document

  @file_upload_Bitrix24_Sales_Marketing
  Scenario: Verify that file upload
    And User clicks Bitrix24 button
    When User clicks Sales and marketing button
    And User clicks Marketing and advertising
    When User choose Logo.gif file
    And User clicks select Document button
    And User is clicks send button
    Then Verify that upload document

  @file_upload_Bitrix24_Sales_Marketing_Quotes
  Scenario: Verify that file upload
    And User clicks Bitrix24 button
    When User clicks Sales and marketing button
    And User clicks Quotes
    When User choose Quote.docx file
    And User clicks select Document button
    And User is clicks send button
    Then Verify that upload document

  @dowload_from_external_drive
  Scenario:
    When user clicks download from external drive
    Then Verify that documents are available
      |Box           |
      |Dropbox       |
      |Google Drive  |
      |Office 365    |
      |OneDrive      |
      |Yandex.Disk   |


  @creating_using_Google_Docs
     Scenario:
     When User clicks choose Google Docs
     Then Verify that popUp Window display

   @link_upload
   Scenario: Verify that link uploaded
     When user clicks link button
     And user insert link name
     And user upload the link
     And user clicks the save button
     Then Verify that upload link



