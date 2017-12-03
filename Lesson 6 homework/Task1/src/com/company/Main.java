package com.company;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
	WebDriver driver = new SafariDriver();
	driver.get("https://catalog.onliner.by");
	//driver.manage().window().maximize();
	WebElement button = driver.findElement(By.xpath("//a[text()='Мобильные телефоны']"));
	button.click();


	//List<WebElement> link_to_phone = driver.findElements(By.xpath("//a[.'schema-product__title']"));
//driver.close();

    }
}


