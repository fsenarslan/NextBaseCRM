package com.nextbase.pages;

import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class MessagePage {

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

    //file upload element

    @FindBy(css = "[title=\"Link\"]")
    public WebElement linkButton;

    @FindBy(css = "#linkidPostFormLHE_blogPostForm-text")
    public WebElement linkText;

    @FindBy(css = "#linkidPostFormLHE_blogPostForm-href")
    public WebElement linkUrl;

    @FindBy(css = "[class=\"adm-btn-save\"]")
    public WebElement linkSaveButton;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(partialLinkText = "link35")
    public WebElement verifyLink;


    //add more elements

    @FindBy(linkText = "Add more")
    public WebElement addMore;

    @FindBy(xpath = "//div[@class='bx-finder-box-tabs']//a")
    public List<WebElement> options;

    @FindBy(css = "[data-type='groups']")
    public WebElement allEmployees;

    @FindBy(css="[id*='destLast']")
    public WebElement recent;

    @FindBy(id="destDepartmentTab_destination5102068")
    public WebElement employeesAndDepartments;

    @FindBy(id="destEmailTab_destination5102068")
    public WebElement eMailUsers;

    @FindBy(className = "[id='feed-add-post-destination-input']")
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

    @FindBy(xpath = "//label[.='Video title:']")
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

    @FindBy(xpath = "//div[contains(text(),'Cyber Vet')]")
    public WebElement cyberVetButton;

    @FindBy(xpath = "//div[@class='bx-finder-company-department-employee-name'][contains(text(),'marketing2@cybertekschool.com')]")
    public WebElement usersMailAddress;

    @FindBy(xpath = "//a[contains(text(),'hr55@cybertekschool.com')]")
    public WebElement checkMessage;


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

}