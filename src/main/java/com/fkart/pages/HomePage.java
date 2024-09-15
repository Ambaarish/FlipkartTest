package com.fkart.pages;

import com.fkart.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage{
    By searchBox = By.name("q");
    By submit = By.xpath("//button[@type='submit']");

//    public void navigateUrl() {
//        goToUrl();
//    }
    public void searchProduct() {
        //BasePage base = new BasePage();
        fillValue(searchBox , "Iphone15");
        clickElement(submit);

    }
}
