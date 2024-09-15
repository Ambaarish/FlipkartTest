package com.fkart.tests;

import com.fkart.driver.DriverManager;
import com.fkart.file.PropertyReader;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    ChromeDriver driver;
    String url;
    PropertyReader properties;

    @BeforeSuite
    public void setPreRequisites() {
        properties = new PropertyReader();
        properties.


    }

    @BeforeTest
    public void setUp() {
        DriverManager.setDriver();
        driver = DriverManager.getDriver();
        driver.manage().window().maximize();
        driver.get(url);

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
