package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() {

        driver.get("https://www.saucedemo.com");

        LoginPage lp = new LoginPage(driver);

        lp.login("standard_user", "secret_sauce");

        System.out.println("Login Successful");
    }
}