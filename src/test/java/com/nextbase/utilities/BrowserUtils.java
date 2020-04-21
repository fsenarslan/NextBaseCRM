package com.nextbase.utilities;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class BrowserUtils {

    public static void wait(int seconds){
        try {
            Thread.sleep(1000*seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitForPresenceOfElement(By by, long time) {
        new WebDriverWait(Driver.get(), time).until(ExpectedConditions.presenceOfElementLocated(by));
    }

        public static void clickWithJS(WebElement element) {

        JavascriptExecutor js = ((JavascriptExecutor) Driver.get());
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", element);
    }

    public static void clickWithWait(WebElement webElement) {
        Wait wait = new FluentWait(Driver.get())
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotVisibleException.class)
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(WebDriverException.class);
        WebElement element = (WebElement) wait.until((Function<WebDriver, WebElement>) driver -> webElement);
        try {
            element.click();
        } catch (WebDriverException e) {
            System.out.println(e.getMessage());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            element.click();
        }
    }
    // Waits for element to be not stale
    public static void waitForStaleElement(WebElement element) {
        int y = 0;
        while (y <= 15) {
            try {
                element.isDisplayed();
                break;
            } catch (StaleElementReferenceException st) {
                y++;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            break;
        }
    }

    public static List<String> getListOfString(List<WebElement> listOfWebElements) {

            List<String> listOfStrings = new ArrayList<>();
        for (WebElement element : listOfWebElements) {
            String value = element.getText().trim();
            //if there is no text
            //do not add this blank text into list
            if (value.length() > 0) {
                listOfStrings.add(value);
            }
        }

        return listOfStrings;


    }

    public static void getTextElements(String name){
        WebElement documentExternal = Driver.get().findElement(By.cssSelector("[title='" + name + "']"));
            waitForVisibility(documentExternal,10);
             Assert.assertTrue(documentExternal.isDisplayed());
        System.out.println(documentExternal.getText());
    }


}
