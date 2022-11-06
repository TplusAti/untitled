package com.talentlms.UI.pojo.helperMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHelper {

    public static void selectUsingVisibleText(WebElement element,String visibleText){
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }
    public static String selectByValue(WebElement element) {
        String value = new Select(element).getFirstSelectedOption().getText();
        return value;
    }
    public static void selectUsingIndex(WebElement element,int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }

}
