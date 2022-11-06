package com.talentlms.UI.pages;

import com.talentlms.UI.driverFactory.Driver;
import com.talentlms.UI.pojo.helperMethods.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessLoginPage {


    public SuccessLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    Helper helper = new Helper();

    @FindBy(xpath = "//input[@name='login'] ")
    public WebElement userNameOrEmailInput;


}
