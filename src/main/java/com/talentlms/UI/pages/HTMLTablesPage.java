package com.talentlms.UI.pages;

import com.talentlms.UI.driverFactory.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.ArrayList;
import java.util.List;

public class HTMLTablesPage {

    @FindBy(xpath = "//table[@class='ws-table-all']//tr")
    public WebElement htmlTable;

//    int row = Driver.getDriver().findElements(By.xpath("//table[@class='ws-table-all']//tr)")).size();
//    int col = Driver.getDriver().findElements(By.xpath("//table[@class='ws-table-all']//td)")).size();


    private int row;
    private int col;

    WebElement av = Driver.getDriver().findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr" +
            "["+col+"]/td["+row+"]"));


//    public String rowList (int index){
//        ArrayList rowList= new ArrayList<>();
//        for (int i = 2; i < row; i++) {
//            rowList.add("//table[@class='ws-table-all']//tr["+i+"]");
//        }return rowList.get(index).toString();
//    }
//    public String colList (int index){
//        ArrayList colList= new ArrayList<>();
//        for (int i = 1; i < col; i++) {
//            colList.add("//table[@class='ws-table-all']//td["+i+"]");
//        }return colList.get(index).toString();
//    }







}
