package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Test {
    private static WebDriver driver = null;

    @org.testng.annotations.BeforeTest
    public void Environment() throws Exception {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setBrowserName("chrome");
//            capabilities.setVersion("62.0.3202.94");
            driver = new RemoteWebDriver(new URL("http://localhost:4445/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @org.testng.annotations.Test
    public void testCartFlow() throws Exception {
        CatalogPage catalog = new CatalogPage(driver);
        ItemPage phone = new ItemPage(driver);
        catalog.open();
        catalog.selectCatalog();
        catalog.selectPhone();
        phone.offersClick();
        phone.addToCartAction();
        phone.clickOnCart();
        String name = phone.itemName();
        Assert.assertEquals(name, "Xiaomi Redmi 4X 16GB Black");

    }
}
