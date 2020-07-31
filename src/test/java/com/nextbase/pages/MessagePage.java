package com.nextbase.pages;

import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MessagePage extends BasePage {


    @FindBy(css = ".feed-add-post-form-link.feed-add-post-form-link-active")
    public WebElement messageButton;

    @FindBy(css = "#bx-b-uploadfile-blogPostForm")
    public WebElement fileUploadButton;

    @FindBy(xpath = "//input[@name='bxu_files[]']") //send keys is available
    public WebElement uploadfiles;

    @FindBy(xpath="//div[@class='feed-add-post-form-wrap']//tr[1]//td[1]")
    public WebElement uploadfiles2;

    @FindBy(xpath = "//div[@class='feed-add-post-form-wrap']//tr[1]//td[3]")
    public WebElement selectDocument;//(//span[@class='wd-fa-add-file-light-title-text diskuf-selector-link'])[1]

    @FindBy(xpath = "//div[@class='feed-add-post-form-wrap']//tr[3]//td[1]")
    public WebElement downloadDocument;

    @FindBy(xpath = "//div[@class='feed-add-post-form-wrap']//tr[3]//td[3]")
    public WebElement desktopApplication;

    @FindBy(xpath = "//span[@class='f-wrap']")
    public WebElement file;

    @FindBy(xpath = "//span[contains(text(),'My Drive')]")
    public WebElement myDriveButton;

    @FindBy(css = "[class=\"bx-file-dialog-content-link bx-file-dialog-icon bx-file-dialog-icon-folder\"]")
    public WebElement uploadFolder;

    @FindBy(xpath = "//a[@class='bx-file-dialog-content-link bx-file-dialog-icon bx-file-dialog-icon-file'][contains(text(),'resume.txt')]")
    public WebElement resumeButton;

    @FindBy(css = "[class=\"popup-window-button popup-window-button-accept\"]")
    public WebElement selectDocumentButtonBtrix;

    @FindBy(xpath = "//div[@class='feed-wrap']/child::div[@class='feed-item-wrap'][1]/child::div[@class='feed-post-block feed-post-block-files feed-post-block-separator feed-post-block-short']")
    public WebElement messageselectDocumentBtrix;

    @FindBy(xpath = "//span[contains(text(),'Sales and marketing')]")
    public WebElement salesAndMarketin;

    @FindBy(xpath = "//a[contains(text(),'Marketing and advertising')]")
    public WebElement marketingAndAdvertising;

    @FindBy(css = "[class=\"bx-file-dialog-content-link bx-file-dialog-icon bx-file-dialog-icon-file\"]")
    public WebElement logoPdf;//a[contains(text(),'Quotes')]

    @FindBy(xpath = "//a[contains(text(),'Quotes')]")
    public WebElement quotesLink;

    @FindBy(css = "[class=\"bx-file-dialog-content-link bx-file-dialog-icon bx-file-dialog-icon-file\"]")
    public WebElement quoteDocx;

    @FindBy(css = "//div[@class='ui-notification-balloon-actions']")
    public WebElement boloonMessage;

//    @FindBy(xpath = "//div[@class='bx-file-dialog-tab-group']")
//    public List<WebElement> selectExternalDrive;

    @FindBy(xpath = "//div[@class='bx-file-dialog-tab-group']")
    public WebElement selectExternalDrive;

    @FindBy(xpath = "//div[@class='feed-add-post-form-wrap']//td[3]//span[1]//span[1]//span[2]//a[1]")
    public WebElement createGoogleDocsDocument;

    @FindBy( xpath = "/html/body/div[2]/div/span/text()")
    public WebElement getCreateGoogleDocsDocumentPopPageText;



    //add link element//span[contains(text(),'My Drive')]

    @FindBy(css = "[title=\"Link\"]")
    public WebElement linkButton;

    @FindBy(css = "#linkidPostFormLHE_blogPostForm-text")
    public WebElement linkText;

    @FindBy(css = "#linkidPostFormLHE_blogPostForm-href")
    public WebElement linkUrl;

    @FindBy(css = "[class=\"adm-btn-save\"]")
    public WebElement linkSaveButton;

    @FindBy(css = "[id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(partialLinkText = "link35")
    public WebElement verifyLink;


    //add more elements

    @FindBy(linkText = "Add more")
    public WebElement addMore;

    @FindBy(xpath = "//div[@class='bx-finder-box-tabs']//a")
    public List<WebElement> options;

    @FindBy(className = "feed-add-post-del-but")
    public WebElement allEmployees;

    @FindBy(xpath = "//a[@id='bx-destination-tag']")
    public WebElement addEmployer;

    @FindBy(css="[id*='destLast']")
    public WebElement recent;

    @FindBy(id="destDepartmentTab_destination5102068")
    public WebElement employeesAndDepartments;

    @FindBy(id="destEmailTab_destination5102068")
    public WebElement eMailUsers;

    @FindBy(xpath = "//input[@id='feed-add-post-destination-input']")
    public WebElement toInbox;

    //video elements

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-video']//i")
    public WebElement insertVideoButton;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    public WebElement videoIcon;

    @FindBy(css= "[id='undefined']")
    public WebElement videoSaveButton;

    @FindBy(css = "(//div[@class='feed-add-post-text'])[1]")
    public WebElement verifyVideo;

    @FindBy(xpath = "//label[contains(text(),'Video size:')]")
    public WebElement videoTitle;

   //Quate elements

    @FindBy(css = "[title=\"Quote text\"]")
    public WebElement quoteButton;

    @FindBy(css="[class='bx-editor-iframe']")
    public  WebElement iframe;

    @FindBy(css = "[class='bxhtmled-quote']")
    public WebElement quoteFrame;

    ////div[@id="blg-post-507"]tum message bloc

    @FindBy(css= "[id=\"log_internal_container\"]")
    public WebElement blocquote;


    //add mention

    @FindBy(xpath = "//span[@id='bx-b-mention-blogPostForm']")
    public WebElement mentionButton;

    @FindBy(css = "[class=\"bx-finder-box-tab bx-lm-tab-department\"]")
    public WebElement selectContactButton;

    @FindBy(id = "popup-window-content-invite-email-email-user-popup")
    public WebElement emailPopUp;

    @FindBy(xpath = "//div[@class='bx-finder-company-department-employee-name'][contains(text(),'marketing2@cybertekschool.com')]")
    public WebElement usersMailAddress;

    @FindBy(xpath = "//div[@class='feed-wrap']/child::div[@class='feed-item-wrap'][1]/child::div[@class='feed-post-block feed-post-block-short feed-post-block-separator']")
    public WebElement checkMessage;

    @FindBy(css="[class='popup-window-close-icon']")
    public WebElement emailPopUpClose;


    ///////////video Record ////////////////

    @FindBy(xpath = "//div[@id='divoPostFormLHE_blogPostForm']//span[@class='feed-add-post-form-but-cnt feed-add-videomessage'][contains(text(),'Record Video')]")
    public WebElement videoRecordButton;

    @FindBy(css = "[class=\"popup-window-button popup-window-button-blue\"]")
    public WebElement allowVideoRecordButton;

    @FindBy(id = "popup-window-content-bx-popup-videomessage-popup")
    public WebElement videoRecordFailsText;


//div[contains(text(),'Cyber Vet')]


    public MessagePage() {
        PageFactory.initElements(Driver.get(),this);
    }

    public void verifyElements(){
        BrowserUtils.waitForVisibility(uploadfiles2, 10);
        Assert.assertTrue(uploadfiles2.isDisplayed());
        BrowserUtils.waitForVisibility(selectDocument, 5);
        Assert.assertTrue(selectDocument.isDisplayed());
        BrowserUtils.waitForVisibility(downloadDocument, 5);
        Assert.assertTrue(downloadDocument.isDisplayed());
        BrowserUtils.waitForVisibility(desktopApplication, 5);
        Assert.assertTrue(desktopApplication.isDisplayed());
    }

    public void clickFileUploadButton(){
        BrowserUtils.waitForVisibility(fileUploadButton,5);
        BrowserUtils.waitForClickablility(fileUploadButton, 5);
        fileUploadButton.click();
    }


//Text Editor
     @FindBy(css="[id=\"lhe_button_editor_blogPostForm\"]")
     public WebElement editorButton;

     @FindBy(css="#bx-html-editor-tlbr-idPostFormLHE_blogPostForm")
      public WebElement editorToolBar;

     @FindBy(xpath = "//span[contains(text(),'Font')]")
     public WebElement fontButton;

     @FindBy(className="popup-window popup-window-content-no-paddings popup-window-with-titlebar")
     public List<WebElement> fontOptions;

//Titles

      @FindBy(linkText = "Tasks")
      public WebElement tasksLink;

     @FindBy(css="#bx-component-scope-bitrix_tasks_interface_topmenu_1")
      public WebElement subModules;


}