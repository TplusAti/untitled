package com.talentlms.UI.pojo.helperMethods;

import com.talentlms.UI.driverFactory.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Helper {


    private Helper waitElementToBeClickable(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    private Helper waitElementToBeDisplayed(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public Helper click(WebElement element){
        waitElementToBeDisplayed(element);
        waitElementToBeClickable(element);
        element.click();
        return this;
    }

    public Helper sendKeys(WebElement element,String str){
        waitElementToBeDisplayed(element);
        element.sendKeys(str);
        return this;
    }

    public String getText(WebElement element){
        return element.getText();
    }

    public Helper javaScriptScrollDownThePage(){
        JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        js.executeScript("window.scrollBy(0,800)");
       return this;
    }
    public Helper clear(WebElement element){
        waitElementToBeDisplayed(element);
        element.sendKeys(Keys.chord(Keys.CONTROL,"a"));
        element.sendKeys(Keys.BACK_SPACE);
        return this;
    }
    public Helper multipleClick (int countOfClick, WebElement element){
        waitElementToBeDisplayed(element);
        waitElementToBeClickable(element);
        for(int i=0;i<countOfClick;i++){
            element.click();

        }
        return this;
    }



}
