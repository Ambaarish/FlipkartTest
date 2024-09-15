package com.fkart.pages;

import com.fkart.driver.DriverManager;
import org.openqa.selenium.By;


public class ProductPage extends BasePage{
    By product = By.xpath("//a[@target='_blank']/descendant::div[contains(text(),'Apple iPhone 15 (Blue, 128 GB)')]");
//    private final ChromeDriver driver;
//    private final WebDriverWait wait;

//    public ProductPage() {
//        super();
//        this.driver = DriverManager.getDriver();
//        this.wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
//    }

    public void selectProduct() {
        //BasePage base = new BasePage();
        clickElement(product);

    }

}
