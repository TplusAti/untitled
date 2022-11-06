package com.talentlms.UI.pages;

import com.talentlms.UI.driverFactory.Driver;
import com.talentlms.UI.pojo.helperMethods.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserCreatePage {


    public UserCreatePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    Helper helper = new Helper();

    @FindBy(xpath = "//input[@name='name']")
    public WebElement FirstNameField;

    @FindBy(xpath = "//input[@name='surname']")
    public WebElement LastName;

    @FindBy(xpath = "//input[@placeholder='e.g. jdoe@example.com']")
    public WebElement Emailaddress;

    @FindBy(xpath = "//input[@placeholder='e.g. jdoe']")
    public WebElement UserName;

    @FindBy(xpath = "//input[@placeholder='Blank for random password']")
    public WebElement Password;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement Bio;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement AddUserButton;

    @FindBy(xpath = ".//div [@class='tl-title tl-ellipsis']")
    public WebElement AddUserTitle;

    @FindBy(xpath = "(//span[@class='select2-chosen'])[2]")
    public WebElement timeZone;

    @FindBy(xpath = "//span [@title='A. Considine']")
    public WebElement userTitle;





}
