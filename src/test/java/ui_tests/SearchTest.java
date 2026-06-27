package ui_tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.BaseTest;

public class SearchTest extends BaseTest {

    @Test
    public void searchProduct() {

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();

        String product =
                driver.findElement(By.className("inventory_item_name"))
                        .getText();

        System.out.println("Product Found: " + product);
    }
}