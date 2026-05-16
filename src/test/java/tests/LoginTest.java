package tests;

import org.testng.annotations.Test;

import factory.DriverFactory;
import pages.LoginPage;

public class LoginTest {

    @Test
    public void verifyLogin() {

        DriverFactory.initDriver();

        DriverFactory.getDriver().get("https://example.com");

        LoginPage lp = new LoginPage();

        lp.doLogin("test@gmail.com", "test123");

        DriverFactory.quitDriver();
    }
}