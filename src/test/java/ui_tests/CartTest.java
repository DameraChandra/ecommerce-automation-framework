package ui_tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.BaseTest;

public class CartTest extends BaseTest {

    @Test
    public void addToCart() {

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack"))
                .click();

        System.out.println("Product Added To Cart");
    }
}