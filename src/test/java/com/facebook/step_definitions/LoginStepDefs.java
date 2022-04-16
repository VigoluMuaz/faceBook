package com.facebook.step_definitions;

import com.facebook.pages.DashBoard;
import com.facebook.pages.LoginPage;
import com.facebook.utilities.BrowserUtils;
import com.facebook.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.List;

public class LoginStepDefs extends LoginPage{
    LoginPage loginPage = new LoginPage();

    @Given("the user can navigates to facebook page")
    public void theUserCanNavigatesToFacebookPage() {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver=new ChromeDriver(options);
        driver.get(ConfigurationReader.get("url"));
        driver.manage().window().maximize();

        List<WebElement> acceptAll = driver.findElements(By.xpath("//button[@data-cookiebanner='accept_button']"));
        BrowserUtils.waitFor(3);
        if(acceptAll.size()>0){
            acceptAll.get(0).click();
        }
       // Assert.assertTrue(driver.findElement(By.xpath("//a[@*='Ana Sayfa']")).isDisplayed());
        BrowserUtils.waitFor(2);
    }

    @Then("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Assert.assertTrue(new DashBoard().page.isDisplayed());

    }
        @When("the user enters the user information")
        public void the_user_enters_the_user_information () {

            String email = ConfigurationReader.get("email");
            String password = ConfigurationReader.get("password");

            loginPage.login(email,password);
        }
        @Then("the user should be able to login")
        public void the_user_should_be_able_to_login () {

            Assert.assertTrue(new DashBoard().dashBoard.isDisplayed());


        }

    @Then("the user clicks on Personal Profile Option")
    public void theUserClicksOnPersonalProfileOption() {
        loginPage.clickOnPersonalProfile();

    }

    @And("the user clicks on SignOut Button")
    public void theUserClicksOnSignOutButton() {
        loginPage.clickOnSignOutBtn();

    }
}


