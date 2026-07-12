package tests;

import base.BaseTest;
import factory.DriverFactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkout() {

        WebDriver driver = DriverFactory.getDriver();

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        driver.findElement(By.className("shopping_cart_link")).click();

        driver.findElement(By.id("checkout")).click();

        driver.findElement(By.id("first-name")).sendKeys("Test");
        driver.findElement(By.id("last-name")).sendKeys("User");
        driver.findElement(By.id("postal-code")).sendKeys("500001");

        driver.findElement(By.id("continue")).click();

        System.out.println("--------------------------------");
        System.out.println("Current URL : " + driver.getCurrentUrl());
        System.out.println("Page Title  : " + driver.getTitle());
        System.out.println("--------------------------------");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));

        driver.findElement(By.id("finish")).click();

        String msg = driver.findElement(By.className("complete-header")).getText();

        Assert.assertEquals(msg, "Thank you for your order!");

        System.out.println("Checkout Test Passed");
    }
}