package com.fkart.pages;

import com.fkart.driver.DriverManager;
import com.fkart.file.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    private final ChromeDriver driver;
    private final WebDriverWait wait;

    public BasePage() {
        this.driver = DriverManager.getDriver();
        this.wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
    }

//    public void goToUrl(String url) {
//        driver.get(url);
//    }

    public void clickElement(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)).click();
    }

    public void fillValue(By by , String value) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)).sendKeys(value);
    }

}
