package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatalogPage extends Page {

    //THIS CLASS IS REFACTORED FOR PAGE FACTORY DEMONSTRATION

    private final String URL =   "https://catalog.onliner.by";
    private WebDriver driver;

    @FindBy(xpath = "//a[text()='Мобильные телефоны']")
    private WebElement mobile_catalog_link;

    @FindBy(xpath = "//*[text()='Xiaomi Redmi 4X 16GB Black']")
    private WebElement phone_link;



    public CatalogPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void open(){
        getDriver().get(URL);
    }




    public CatalogPage selectCatalog(){
        mobile_catalog_link.click();
        return new CatalogPage(driver);
    }


    public CatalogPage selectPhone(){
        phone_link.click();
        return new CatalogPage(driver);
    }



}
