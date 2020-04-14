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

    @FindBy(xpath = "//div[@id='blog_post_body_487']//a[contains(text(),'Link to Amazon')]")
    public WebElement verifyLink;









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