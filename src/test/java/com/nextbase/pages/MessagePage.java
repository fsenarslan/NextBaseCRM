package com.nextbase.pages;

import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MessagePage {

    @FindBy(css = ".feed-add-post-form-link.feed-add-post-form-link-active")
    public WebElement messageButton;

    @FindBy(css = "#bx-b-uploadfile-blogPostForm")
    public WebElement fileUploadButton;

    @FindBy(xpath = "//input[@name='bxu_files[]']") //send keys is available
    public WebElement uploadfiles;

    @FindBy(xpath = "(//span[@class='wd-fa-add-file-light-title-text diskuf-selector-link'])[1]")
    public WebElement selectDocument;

    @FindBy(xpath = "(//span[text()='Download from external drive'])[1]")
    public WebElement downloadDocument;

    @FindBy(xpath = "(//span[text()='Desktop applications'])[1]")
    public WebElement desktopApplication;

    @FindBy(xpath = "//span[@class='f-wrap']")
    public WebElement file;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-video']//i")
    public WebElement insertVideoButton;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    public WebElement videoIcon;

    @FindBy(xpath = " //input[@id='']")
    public WebElement saveButton;



    public MessagePage() {
        PageFactory.initElements(Driver.get(),this);
    }

    public void verifyElements(){
        //BrowserUtils.waitForVisibility(uploadfiles, 5);
        Assert.assertTrue(uploadfiles.isDisplayed());
        //BrowserUtils.waitForVisibility(selectDocument, 5);
        Assert.assertTrue(selectDocument.isDisplayed());
        //BrowserUtils.waitForVisibility(downloadDocument, 5);
        Assert.assertTrue(downloadDocument.isDisplayed());
        //BrowserUtils.waitForVisibility(desktopApplication, 5);
        Assert.assertTrue(desktopApplication.isDisplayed());
    }

    public void clickFileUploadButton(){
        BrowserUtils.waitForVisibility(fileUploadButton,5);
        BrowserUtils.waitForClickablility(fileUploadButton, 5);
        fileUploadButton.click();
    }

}
