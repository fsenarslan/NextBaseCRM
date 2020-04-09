package com.nextbase.pages;

import com.nextbase.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void verifyPageTitle(String title){

        Assert.assertEquals(title, Driver.get().getTitle());

    }
}
