package com.talentlms.UI.pojo.helperMethods;

import com.talentlms.UI.driverFactory.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class FlentWaits1 {

//    Wait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
//            .withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(2))
//            .ignoring(NoSuchElementException.class);
//
//    WebElement ele1 = wait.until(new Function<WebDriver, WebElement>() {
//
//        public WebElement apply(WebDriver driver) {
//
//            return driver.findElement(By.xpath("xxxxxxx"));
//
//        }? });
    public void fluentwaitUntilclickable(By locator){
        Wait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {

            public WebElement apply(WebDriver driver) {
               driver = Driver.getDriver();
                return driver.findElement(locator);

            }


        });

    }}
