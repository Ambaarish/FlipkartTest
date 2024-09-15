package com.fkart.tests;

import com.fkart.pages.HomePage;
import com.fkart.pages.ProductDetailsPage;
import com.fkart.pages.ProductPage;
import org.testng.annotations.Test;


public class TransactionTest extends BaseTest{

    HomePage homePage;
    ProductPage productPage;
    ProductDetailsPage productDetailsPage;


    @Test
    public void transactionTest() throws InterruptedException {
        homePage = new HomePage();
        productPage = new ProductPage();
        productDetailsPage = new ProductDetailsPage();

        //homePage.navigateUrl();
        homePage.searchProduct();
        productPage.selectProduct();
        productDetailsPage.buyProduct();

    }

}


