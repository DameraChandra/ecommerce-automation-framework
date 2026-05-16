package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() {

        driver.get("https://example.com/login");

        LoginPage lp = new LoginPage(driver);

        lp.login("test@gmail.com", "12345");

        System.out.println("Login Successful");
    }
}