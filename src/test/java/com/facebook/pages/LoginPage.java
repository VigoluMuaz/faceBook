package com.facebook.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "email")
    public WebElement username;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement enterBtn;

    @FindBy(xpath = "//*[.=' Personal profile ']")
    public WebElement personalProfile;

    @FindBy(xpath = "//*[.=' Sign out ']")
    public WebElement signOut;

    public void login(String emailStr, String passwordStr) {
        username.sendKeys(emailStr);
        password.sendKeys(passwordStr);
        enterBtn.click();

    }
    public void clickOnPersonalProfile() {
        personalProfile.click();
    }

    public void clickOnSignOutBtn() {
        signOut.click();
    }

}
