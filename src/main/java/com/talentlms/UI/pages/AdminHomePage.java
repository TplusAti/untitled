package com.talentlms.UI.pages;

import com.talentlms.UI.driverFactory.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage {


    public AdminHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='tl-title tl-ellipsis']")
    public WebElement adminhomeTitle;

    @FindBy(xpath = "(//div[@class='tl-bold-link'])[1]")
    public WebElement UserButton;

    @FindBy(xpath = "(//a[@href='https://theateam.talentlms.com/user/create'])[2]")
    public WebElement addUserButton;





}
