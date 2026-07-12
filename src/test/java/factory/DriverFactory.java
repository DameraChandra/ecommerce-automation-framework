package factory;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initDriver(String browser) {

        WebDriver webDriver = null;

        try {

            if (browser.equalsIgnoreCase("chrome")) {

                ChromeOptions options = new ChromeOptions();

                webDriver = new RemoteWebDriver(
                        new URL("http://localhost:4444"),
                        options);

            } else if (browser.equalsIgnoreCase("firefox")) {

                FirefoxOptions options = new FirefoxOptions();

                webDriver = new RemoteWebDriver(
                        new URL("http://localhost:4444"),
                        options);

            } else if (browser.equalsIgnoreCase("edge")) {

                EdgeOptions options = new EdgeOptions();

                webDriver = new RemoteWebDriver(
                        new URL("http://localhost:4444"),
                        options);

            } else {

                throw new RuntimeException("Invalid Browser : " + browser);

            }

            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.set(webDriver);

            // ===============================
            // Verification Messages
            // ===============================
            System.out.println("==========================================");
            System.out.println(" Selenium Grid Connected Successfully ");
            System.out.println(" Browser : " + browser);
            System.out.println(" Driver  : " + webDriver.getClass().getName());
            System.out.println(" Grid URL: http://localhost:4444");
            System.out.println("==========================================");

        } catch (MalformedURLException e) {

            throw new RuntimeException("Invalid Grid URL", e);

        }
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {

        if (driver.get() != null) {

            driver.get().quit();
            driver.remove();

            System.out.println("==========================================");
            System.out.println(" Browser Closed Successfully ");
            System.out.println("==========================================");
        }
    }
}