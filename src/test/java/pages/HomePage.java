package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    // Locator
    By loginLink =
            By.linkText("Login");

    // Method
    public void navigateToLogin() {

        driver.findElement(loginLink).click();
    }
}