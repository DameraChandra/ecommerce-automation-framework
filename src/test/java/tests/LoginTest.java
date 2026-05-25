package tests;

import base.BaseTest;
import factory.DriverFactory;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {

        DriverFactory.getDriver().get("https://www.google.com");

        System.out.println("Title: " + DriverFactory.getDriver().getTitle());
    }
}