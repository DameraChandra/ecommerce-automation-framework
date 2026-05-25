package tests;

import base.BaseTest;
import factory.DriverFactory;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {

    @Test
    public void testGoogle() {

        DriverFactory.getDriver().get("https://www.google.com");

        System.out.println("Title is: " + DriverFactory.getDriver().getTitle());
    }
}