package factory;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {

    public static WebDriver driver;

    // Initialize Driver
    public static WebDriver initDriver(String browser) {

        try {

            // Chrome Browser
            if (browser.equalsIgnoreCase("chrome")) {

                ChromeOptions options = new ChromeOptions();

                driver = new RemoteWebDriver(
                        new URL("http://localhost:4444"),
                        options);

            }

            // Firefox Browser
            else if (browser.equalsIgnoreCase("firefox")) {

                FirefoxOptions options = new FirefoxOptions();

                driver = new RemoteWebDriver(
                        new URL("http://localhost:4444"),
                        options);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return driver;
    }

    // Get Driver
    public static WebDriver getDriver() {

        return driver;
    }

    // Quit Driver Safely
    public static void quitDriver() {

        try {

            if (driver != null) {

                driver.quit();

            }

        } catch (Exception e) {

            System.out.println("Driver already closed.");

        }
    }
}