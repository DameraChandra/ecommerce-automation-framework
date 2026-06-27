package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest {

    @Test
    public void checkout() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack"))
              .click();

        driver.findElement(By.className("shopping_cart_link"))
              .click();

        driver.findElement(By.id("checkout")).click();

        driver.findElement(By.id("first-name"))
              .sendKeys("Test");

        driver.findElement(By.id("last-name"))
              .sendKeys("User");

        driver.findElement(By.id("postal-code"))
              .sendKeys("500001");

        driver.findElement(By.id("continue")).click();

        driver.findElement(By.id("finish")).click();

        String msg =
            driver.findElement(By.className("complete-header"))
                  .getText();

        Assert.assertEquals(msg, "Thank you for your order!");

        driver.quit();
    }
}