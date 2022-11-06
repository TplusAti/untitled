package com.talentlms.UI.pojo.helperMethods;

import org.openqa.selenium.WebDriver;

import java.util.LinkedList;
import java.util.Set;

public class BrowserHelper {

    private WebDriver driver;

    public BrowserHelper(WebDriver driver) {
        this.driver = driver;
    }


    //  Navigating to previous page
    public void goBack(){
        driver.navigate().back();
    }
    //  Navigating to forward page
    public void goForward(){
        driver.navigate().forward();
    }
    // refresh the page
    public void refresh(){
        driver.navigate().refresh();
    }
    public Set<String> getWindow(){
        return driver.getWindowHandles();
    }
    public void switchToWindow(int index){
        LinkedList<String> windowId = new LinkedList<>(getWindow());
        if (index < 0 || index > windowId.size()){
            throw new IllegalArgumentException("Invalid Index" + index);
        }
        driver.switchTo().window(windowId.get(index));
    }
    public void switchToParentWindow(){
        LinkedList<String> windowId = new LinkedList<>(getWindow());
        driver.switchTo().window(windowId.get(0));
    }
}
