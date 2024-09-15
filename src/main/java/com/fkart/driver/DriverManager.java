package com.fkart.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    public static ThreadLocal<ChromeDriver> driver = new ThreadLocal<>();

    public static ChromeDriver getDriver() {
        return driver.get();
    }

    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
        DriverManager.driver.set(new ChromeDriver());

    }
}
