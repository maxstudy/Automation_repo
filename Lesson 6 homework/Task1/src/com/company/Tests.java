package com.company;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Tests {

    @org.testng.annotations.Test
    public void testCartFlow() throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
  //      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://catalog.onliner.by");
        WebElement link_to_phones = driver.findElement(By.xpath("//a[text()='Мобильные телефоны']"));
        link_to_phones.click();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Мобильный телефон купить в Минске");



        WebDriverWait wait = new WebDriverWait(driver,15);
        WebElement mobile_links = driver.findElement(By.xpath("//*[text()='Xiaomi Redmi 4X 16GB Black']"));

        mobile_links.click();

        WebElement cart_button  = driver.findElement(By.className("product-aside__item-button"));
        cart_button.click();
        WebDriverWait wait2 = new WebDriverWait(driver,15);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
       jse.executeScript("document.evaluate('//*[@id=\"b-top-navigation-cart\"]/li/a/span', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click();");

       WebElement name = driver.findElement());
 String actual =  name.getText();
Assert.assertEquals(actual, "Xiaomi Redmi 4X 16GB Black");
    //      WebElement cart_link = driver.findElement(By.xpath("//*[@id=\"b-top-navigation-cart\"]/li/a/span"));
    //    cart_link.click();

    //   mobile_links.get(0).sendKeys("Iphone");


   //    driver.close();

    }

}
