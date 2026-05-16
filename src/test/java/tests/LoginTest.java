package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.LoginPage;
import utils.RetryAnalyzer;
import utils.TestListener;

@Listeners(TestListener.class)

public class LoginTest extends BaseTest {

    @Test(retryAnalyzer = RetryAnalyzer.class)

    public void loginTest() throws Exception {

        LoginPage lp = new LoginPage(driver);

        lp.login("pavanol", "test123");

        System.out.println("Login Test Passed");
    }
}