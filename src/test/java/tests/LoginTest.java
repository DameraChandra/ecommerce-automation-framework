package tests;

import factory.DriverFactory;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    @BeforeMethod
    public void setup() {

        DriverFactory.initDriver("chrome");
    }

    @Test
    public void testLogin() {

        DriverFactory.getDriver().get("https://www.google.com");

        System.out.println("Google opened successfully");

        String title = DriverFactory.getDriver().getTitle();

        System.out.println("Page Title: " + title);
    }

    @AfterMethod
    public void tearDown() {

        DriverFactory.quitDriver();
    }
}