package com.nextbase.pages;

import com.nextbase.utilities.ConfigurationReader;
import com.nextbase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    @FindBy(name = "USER_LOGIN")
    public WebElement userName;

    @FindBy(css="input[type=password]")
    public WebElement passWord;

    @FindBy(className = "login-btn")
    public WebElement loginButton;

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void login(){
        userName.sendKeys(ConfigurationReader.getProperty("usernameHr"));
        passWord.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }

    public void login(String role){

        if(role.equals("Human Resources")){
            userName.sendKeys(ConfigurationReader.getProperty("usernameHr"));
            passWord.sendKeys(ConfigurationReader.getProperty("password"));
        }else if(role.equals("Help Desk")){
            userName.sendKeys(ConfigurationReader.getProperty("usernameHd"));
            passWord.sendKeys(ConfigurationReader.getProperty("password"));
        }else if(role.equals("Marketing")){
            userName.sendKeys(ConfigurationReader.getProperty("usernameMr"));
            passWord.sendKeys(ConfigurationReader.getProperty("password"));
        }else{
            System.out.println("Invalid User");
        }
        loginButton.click();
    }

//    public void login1(String role) {
//        String username = "";
//        String password = ConfigurationReader.getProperty("password");
//        switch (role) {
//            case "Human Resources":
//                username = ConfigurationReader.getProperty("usernameHr");
//                break;
//            case "Help Desk":
//                username = ConfigurationReader.getProperty("usernameHd");
//                break;
//            case "Marketing":
//                username = ConfigurationReader.getProperty("usernameMr");
//                break;
//            default:
//                throw new RuntimeException("Invalid role!");
//        }
//        userName.sendKeys(username);
//        passWord.sendKeys(password);
//        loginButton.click();
//    }
}
