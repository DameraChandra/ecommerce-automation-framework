package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public static WebDriver driver;

    public static void initDriver() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {

        return driver;
    }

    public static void quitDriver() {

        driver.quit();
    }
}