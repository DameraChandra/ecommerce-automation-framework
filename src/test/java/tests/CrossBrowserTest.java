package tests;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CrossBrowserTest {

    private WebDriver driver;

    public void launchBrowser(String browser) {

        switch (browser.toLowerCase()) {

            case "chrome":

                WebDriverManager.chromedriver().setup();

                ChromeOptions options = new ChromeOptions();

                options.addArguments("--remote-allow-origins=*");
                options.addArguments("--start-maximized");
                options.addArguments("--disable-notifications");

                driver = new ChromeDriver(options);

                break;

            default:
                throw new IllegalArgumentException("Only Chrome is enabled for Jenkins build.");
        }
    }

    public void runTest(String browser) {

        launchBrowser(browser);

        driver.get("https://www.saucedemo.com/");

        System.out.println("-------------------------------------");
        System.out.println("Browser : " + browser);
        System.out.println("Title    : " + driver.getTitle());
        System.out.println("URL      : " + driver.getCurrentUrl());
        System.out.println("-------------------------------------");
    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }

    @Test(priority = 1)
    public void testChrome() {

        runTest("chrome");
    }

    @Test(enabled = false)
    public void testFirefox() {

        runTest("firefox");
    }

    @Test(enabled = false)
    public void testEdge() {

        runTest("edge");
    }
}