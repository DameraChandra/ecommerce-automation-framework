package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() {

        driver.get("https://example.com/login");

        LoginPage lp = new LoginPage(driver);

        lp.doLogin("admin@test.com", "admin123");

        System.out.println("Login Successful");
    }
}