package com.fkart.pages;

import com.fkart.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class ProductDetailsPage extends BasePage{

    By buyNow = By.xpath("//button[text()='Buy Now']");
    private final ChromeDriver driver;

    public ProductDetailsPage() {
//        super();
        this.driver = DriverManager.getDriver();
    }

    public void buyProduct() throws InterruptedException {
        //BasePage base = new BasePage();
        String parent_window = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles);
        Iterator<String> iterator = allWindowHandles.iterator();
        while(iterator.hasNext()) {
            String child_window = iterator.next();

            if(!parent_window.equals(child_window)) {
                driver.switchTo().window(child_window);
                clickElement(buyNow);
                //WebElement prod_name = driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 15 (Blue, 128 GB)')]"));
//                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Buy Now']")));
//                driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
                Thread.sleep(5000);
            }
        }
    }
}
