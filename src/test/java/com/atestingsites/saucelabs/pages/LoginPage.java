package com.atestingsites.saucelabs.pages;


import com.atestingsites.saucelabs.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

    //locators
    @FindBy(xpath = "//div[@class='login_logo']")
    WebElement loginLogo;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void checkLoginLogo() {
        if (loginLogo.isDisplayed()) {
            System.out.println("Login logo is displayed.");
        } else {
            System.out.println("Login logo is not displayed.");
        }
    }
}
