package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import factory.DriverFactory;

public class ProductTest extends BaseTest {

    @Test
    public void testGoogle() {

        DriverFactory.getDriver().get("https://www.google.com");

        System.out.println("Title is: "
                + DriverFactory.getDriver().getTitle());

    }
}