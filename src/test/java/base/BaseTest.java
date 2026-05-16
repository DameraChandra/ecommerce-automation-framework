package base;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;

public class BaseTest {

    public WebDriver driver;

    public void setup() {

        driver = DriverFactory.getDriver();
    }
}