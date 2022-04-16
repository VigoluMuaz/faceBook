package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {


    @FindBy(xpath = "//a[@*='Ana Sayfa']")
    public WebElement dashBoard;
    @FindBy(className ="login_form_container" )
    public WebElement page;


}
