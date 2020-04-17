package com.nextbase.pages;

import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {


    public BasePage() {

        PageFactory.initElements(Driver.get(), this);
    }

    public void verifyPageTitle(String title){

        Assert.assertEquals(title, Driver.get().getTitle());

    }


    public void menuNavigation(String menuItem) {
        WebElement menu = Driver.get().findElement(By.cssSelector("[title='" + menuItem + "']"));
        BrowserUtils.waitForVisibility(menu, 5);
        BrowserUtils.waitForClickablility(menu, 5);
        menu.click();
    }

    public String getPageSubTitle(){
        WebElement subtitle = Driver.get().findElement(By.id("pagetitle"));
        BrowserUtils.waitForStaleElement(subtitle);
        String subTitleText = subtitle.getText();
        return subTitleText;
        }



}
