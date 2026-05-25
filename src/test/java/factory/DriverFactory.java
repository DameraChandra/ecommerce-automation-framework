package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public static WebDriver driver;

    // Initialize Driver
    public static void initDriver(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();

            driver.manage().window().maximize();
        }
    }

    // Get Driver
    public static WebDriver getDriver() {
        return driver;
    }

    // Quit Driver
    public static void quitDriver() {

        if (driver != null) {
            driver.quit();
        }
    }
}