package com.talentlms.UI.pages;

import com.talentlms.UI.driverFactory.Driver;
import com.talentlms.UI.pojo.helperMethods.DropDownHelper;
import com.talentlms.UI.pojo.helperMethods.Helper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QAImovingMainPage {

    public QAImovingMainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    Helper helper = new Helper();

    @FindBy(xpath = "//select[@id='houseTypeSelectList']")
    public WebElement WhatAreYouMovingButton;

    @FindBy(id = "hp-nav-select-house")
    public WebElement moveList;

    @FindBy(xpath = "(//button[@class='btn btn-white quickQuoteLink'])[1]\n")
    public WebElement compareQutesButton;

    @FindBy(xpath = "(//span[@class='quantity-plus'])[1]")
    public WebElement plus1;

    @FindBy(xpath = "//span[@class='arrow arrow-next']")
    public WebElement continueButton;


    public QAImovingMainPage selectingFunction(int whatRUMovingIndex,int moveListIndex,int howManyClick){
        DropDownHelper.selectUsingIndex(WhatAreYouMovingButton,whatRUMovingIndex);
        DropDownHelper.selectUsingIndex(moveList,moveListIndex);
        compareQutesButton.click();
        helper.multipleClick(howManyClick,plus1);
        return this;
    }



}
