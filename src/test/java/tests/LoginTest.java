package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import factory.DriverFactory;

public class LoginTest {

    @BeforeMethod
    public void setup() {

        DriverFactory.initDriver();
    }

    @Test
    public void loginTest() {

        DriverFactory.getDriver()
                .get("https://www.saucedemo.com/");

        System.out.println("Login Test Executed");
    }

    @AfterMethod
    public void tearDown() {

        DriverFactory.quitDriver();
    }
}