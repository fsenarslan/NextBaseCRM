package com.nextbase.step_definitions.MessageSteps;


import com.github.javafaker.Faker;
import com.nextbase.pages.MessagePage;
import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class MessageStepDefinitions {

    MessagePage messagePage = new MessagePage();
            Faker
    faker = new Faker();

    @When("user clicks message button")
    public void user_clicks_message_button() {
        //BrowserUtils.clickWithWait(messagePage.messageButton);
       BrowserUtils.clickWithJS(messagePage.messageButton);
    }

    @When("user clicks file upload button")
    public void user_clicks_file_upload_button() {
        messagePage.clickFileUploadButton();
    }

    @Then("user verifies that elements are displayed")
    public void user_verifies_that_elements_are_displayed() {
        BrowserUtils.wait(5);
        messagePage.verifyElements();
    }

    @When("user clicks upload files button")
    public void user_clicks_upload_files_button() {
//        BrowserUtils.clickWithJS(messagePage.uploadfiles);
//        BrowserUtils.wait(3);
    }

    @When("user upload the file")
    public void user_upload_the_file() {
//        try {
//            Runtime.getRuntime().exec(System.getProperty("user.dir")+"/FileUploud.exe");
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
        BrowserUtils.wait(3);
        messagePage.uploadfiles.sendKeys(System.getProperty("user.dir")+"/testfile.txt");
        BrowserUtils.wait(3);
    }

    @Then("Verify that file is uploaded")
    public void verify_that_file_is_uploaded() {
        BrowserUtils.waitForVisibility(messagePage.file,20);
        Assert.assertTrue(messagePage.file.isDisplayed());
            }

/////////////UPLOAD FILE FROM BTRIX //////////////

    @When("User clicks Bitrix{int} button")
    public void user_clicks_Bitrix_button(Integer int1) {
    BrowserUtils.waitForVisibility(messagePage.selectDocument,10);
    messagePage.selectDocument.click();
        BrowserUtils.wait(3);
    }

    @When("User clicks My Drive button")
    public void user_clicks_My_Drive_button() {
        BrowserUtils.waitForVisibility(messagePage.myDriveButton,10);
        messagePage.myDriveButton.click();
        BrowserUtils.wait(3);
    }

    @When("User clicks Upload Folder")
    public void user_clicks_Upload_Folder() {
        BrowserUtils.waitForVisibility(messagePage.uploadFolder,10);
    messagePage.uploadFolder.click();
        BrowserUtils.wait(3);
    }

    @When("User choose resume.txt file")
    public void user_choose_resume_txt_file() {
        BrowserUtils.waitForVisibility(messagePage.resumeButton,10);
    messagePage.resumeButton.click();
        BrowserUtils.wait(3);
    }

    @When("User clicks select Document button")
    public void user_clicks_select_Document_button() {
        BrowserUtils.waitForVisibility(messagePage.selectDocumentButtonBtrix,10);
    messagePage.selectDocumentButtonBtrix.click();
        BrowserUtils.wait(3);

    }

    @When("User is clicks send button")
    public void user_is_clicks_send_button() {
        BrowserUtils.waitForVisibility(messagePage.sendButton,10);
    messagePage.sendButton.click();
        BrowserUtils.wait(3);
    }

    @Then("Verify that upload document")
    public void verify_that_upload_document() {
        BrowserUtils.waitForVisibility(messagePage.messageselectDocumentBtrix,15);
    Assert.assertTrue(messagePage.messageselectDocumentBtrix.isDisplayed());
        BrowserUtils.wait(3);
    }



    @When("User clicks Sales and marketing button")
    public void user_clicks_Sales_and_marketing_button() {
    BrowserUtils.waitForVisibility(messagePage.salesAndMarketin,10);
        messagePage.salesAndMarketin.click();
    }

    @When("User clicks Marketing and advertising")
    public void user_clicks_Marketing_and_advertising() {
    BrowserUtils.waitForVisibility(messagePage.marketingAndAdvertising,10);
        messagePage.marketingAndAdvertising.click();
    }

    @When("User choose Logo.gif file")
    public void user_choose_Logo_gif_file() {
        BrowserUtils.waitForVisibility(messagePage.logoPdf,10);
        messagePage.logoPdf.click();
    }

    @When("User clicks Quotes")
    public void user_clicks_Quotes() {
        BrowserUtils.waitForVisibility(messagePage.quotesLink,10);
        messagePage.quotesLink.click();

    }

    @When("User choose Quote.docx file")
    public void user_choose_Quote_docx_file() {
        BrowserUtils.waitForVisibility(messagePage.quoteDocx,10);
        messagePage.quoteDocx.click();
    }

    @When("user clicks download from external drive")
    public void user_clicks_download_from_external_drive() {
        BrowserUtils.waitForVisibility(messagePage.downloadDocument,10);
      messagePage.downloadDocument.click();
      BrowserUtils.wait(3);

    }

    @Then("Verify that documents are available")
    public void verify_that_documents_are_available(List<String> documents) {

//        for (int i=0; i<documents.size(); i++) {
//            BrowserUtils.getTextElements(documents.get(i));
//                    }

        for (String each : documents) {
            BrowserUtils.getTextElements(each);
                   }

    }

        @When("User clicks choose Google Docs")
        public void user_clicks_choose_Google_Docs() {
        BrowserUtils.waitForVisibility(messagePage.createGoogleDocsDocument,10);
            BrowserUtils.clickWithJS(messagePage.createGoogleDocsDocument);
            BrowserUtils.wait(3);
        }

        @Then("Verify that popUp Window display")
        public void verify_that_popUp_Window_display() {
       BrowserUtils.wait(3);
        String popPage = Driver.get().getWindowHandle();
            System.out.println(popPage.getBytes().length);

//     String expectedText = "The social networking service Google Docs is not configured. Please contact your Bitrix24 administrator.";
//     Assert.assertEquals(expectedText,messagePage.getCreateGoogleDocsDocumentPopPageText.getText());
//   System.out.println(messagePage.getCreateGoogleDocsDocumentPopPageText.getText());
        }

        ////////////////LINK BUTTON /////////////////////////

    @When("user clicks link button")
    public void user_clicks_link_button() {
        messagePage.linkButton.click();
        BrowserUtils.wait(2);
    }

    @When("user insert link name")
    public void user_insert_link_name() {

        messagePage.linkText.sendKeys("Link to Amazon");
   //     BrowserUtils.wait(2);
    }

    @When("user upload the link")
    public void user_upload_the_link() {
        messagePage.linkUrl.sendKeys("https://www.amazon.com/");
    //    BrowserUtils.wait(2);
    }

    @When("user clicks the save button")
    public void user_clicks_the_save_button() {
        messagePage.linkSaveButton.click();
      //  BrowserUtils.wait(3);
    }

    @Then("Verify that upload link")
    public void verify_that_upload_link() {
        String email = faker.internet().emailAddress();
        //BrowserUtils.wait(2);
        BrowserUtils.waitForVisibility(messagePage.addEmployer,10);
        messagePage.addEmployer.click();
        BrowserUtils.waitForVisibility(messagePage.toInbox,10);
        //BrowserUtils.wait(3);
        messagePage.toInbox.clear();
        messagePage.toInbox.sendKeys(email);
        BrowserUtils.waitForVisibility(messagePage.emailPopUp,15);
        messagePage.toInbox.click();
        BrowserUtils.waitForVisibility(messagePage.emailPopUpClose,15);
        messagePage.emailPopUpClose.click();

        messagePage.sendButton.click();


        BrowserUtils.waitForStaleElement(messagePage.checkMessage);

    //  Assert.assertEquals(messagePage.checkMessage.getText(),"Link to Amazon");
        Assert.assertTrue(messagePage.checkMessage.isDisplayed());
        BrowserUtils.wait(3);
    }
}
