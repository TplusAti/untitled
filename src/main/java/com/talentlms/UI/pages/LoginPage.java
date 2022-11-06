package com.talentlms.UI.pages;

import com.talentlms.UI.pojo.helperMethods.Helper;
import com.talentlms.UI.driverFactory.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    Helper helper = new Helper();

    @FindBy(xpath = "//input[@name='login'] ")
    public WebElement userNameOrEmailInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement loginButton;

    public LoginPage inputUserNameorEmail(String userNameOrEmail){
        helper.sendKeys(userNameOrEmailInput,userNameOrEmail);
        return this;
    }
    public LoginPage inputPassword (String password){
        helper.sendKeys(passwordInput,password);
        return this;
    }
    public LoginPage clickLoginButton(){
        helper.click(loginButton);
        return this;
    }


}
