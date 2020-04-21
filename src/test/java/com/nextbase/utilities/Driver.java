package com.nextbase.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Driver {


    private static ThreadLocal<WebDriver> driverPool= new ThreadLocal<>();

    private Driver() {
    }

    public static WebDriver get(){

        if(driverPool.get() == null) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            driverPool.set(new ChromeDriver());
            chromeOptions.addArguments("startmaximized");
        }
        return driverPool.get();
    }

    public static void close(){
        driverPool.get().quit();
        driverPool.remove();
    }
}

    // Basic setup
//    private static WebDriver driver;
//
//    private Driver() {
//    }
//
//    public static WebDriver get(){
//
//        if(driver == null) {
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
//        }
//        return driver;
//    }
//
//    public static void close(){
//        if(driver!=null) {
//            driver.quit();
//            driver = null;
//        }
//    }
//}

// Vasily Setup
//    public static WebDriver get(){
//
//        if(driver == null) {
//            String browser = ConfigurationReader.getProperty("browser");
//              switch(browser){
//                case "chrome":
//                    WebDriverManager.chromedriver().setup();
//                    driver = new ChromeDriver();
//                    break;
//                case "firefox":
//                    WebDriverManager.firefoxdriver().setup();
//                    driver = new FirefoxDriver();
//                    break;
//                default:
//                   System.out.println("invalid browser");
//            }
//        }
//        return driver;
//    }