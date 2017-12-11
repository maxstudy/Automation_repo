package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class Page {

    protected final WebDriver driver;

    public Page(WebDriver driver){
        this.driver = driver;
    };

    public WebDriver getDriver() {
        return driver;
    }

    public Boolean isElementPresent(By locator){
        return driver.findElements(locator).size() > 0;
    }
}
