package ui_tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();

        System.out.println("Login Successful");
    }
}