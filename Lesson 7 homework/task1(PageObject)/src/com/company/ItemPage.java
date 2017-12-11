package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

class ItemPage extends Page {

    ItemPage(WebDriver driver){
        super(driver);
    }

   private By offers = By.className("button_orange");
   private String cart_xpath = "'//*[@id=\"b-top-navigation-cart\"]/li/a/span'";
    private By shop_button = By.xpath("//a[@data-shop-id='7965']");
   private By cart = By.xpath("//div[@class='cart-product-title']");


    public void offersClick() {
        WebElement offersAction = driver.findElement(this.offers);
        offersAction.click();
    }

    public void addToCartAction(){
        WebElement  addToCart = driver.findElement(this.shop_button);
        addToCart.click();
    };

    public void clickOnCart(){

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("document.evaluate("+cart_xpath+", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.style.backgroundColor = \"yellow\"; document.evaluate("+cart_xpath+", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click();");


    }

    public String itemName() {

     //       WebElement basketname = driver.findElement(this.basket);
        driver.switchTo().defaultContent();
            WebElement basketList = driver.findElement(this.cart);

            return basketList.getText();
    }
}
