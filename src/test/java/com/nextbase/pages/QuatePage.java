package com.nextbase.pages;

import com.nextbase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class QuatePage extends BasePage {

    public QuatePage(){
        PageFactory.initElements(Driver.get(),this);
    }

@FindBy(css = "[title=\"Quote text\"]")
public WebElement quoteButton;

   @FindBy(css="[class='bx-editor-iframe']")
   public  WebElement iframe;

   @FindBy(css = "[class='bxhtmled-quote']")
    public WebElement quoteFrame;

@FindBy(css="#blog-submit-button-save")
   public WebElement sendButton;


 ////div[@id="blg-post-507"]tum message bloc

@FindBy(css= "[id=\"log_internal_container\"]")
public WebElement blocquote;


@FindBy(xpath= "//button[@id='blog-submit-button-save']")
    public WebElement addMoreButton;


    @FindBy(xpath = "//span[@class='popup-window-button']")
    public WebElement popUpWindowsAddButton;

    @FindBy(css = "#destDepartmentTab_destination0754330")
    public WebElement employeesAndDepartmentsButton;

    @FindAll({@FindBy(className= "bx-finder-company-department-employee-position"),
            @FindBy(className="bx-finder-company-department-employee-name")})
    public List<WebElement> employeesAndDepartments;

    //FindBys any(or)=====FindAll(and)
//@FindAll({
//        @FindBy(id = "one"),
//        @FindBy(id = "two")
//})
//public List<WebElement> allElementsInList;
//    Whereas,
//
//    @FindBys will return the elements depending upon how @FindBy specified inside it.
//
//    @FindBys({
//            @FindBy(id = "one"),
//            @FindBy(className = "two")
//    })
//    public List<WebElement> allElementsInList;
//    Where allElementsInList contains all the elements having className="two" inside id="one"




    public static List<String> getListOfString(List<WebElement> listOfWebElements) {
        List<String> listOfStrings = new ArrayList<>();
        for (WebElement element : listOfWebElements) {
            String value = element.getText().trim();
            if(value.length()>0){
                listOfStrings.add(value);}
        }
        return listOfStrings;
    }





}
