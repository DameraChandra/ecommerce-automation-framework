package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowserTest {

    WebDriver driver;

    public void launchBrowser(String browser) {

        switch (browser.toLowerCase()) {

            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case "edge":

                // ✅ FINAL FIX FOR YOUR ERROR
                try {
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                } catch (Exception e) {
                    System.out.println("EdgeDriver failed via WebDriverManager. Retrying fallback...");
                    
                    System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");
                    driver = new EdgeDriver();
                }
                break;

            default:
                System.out.println("Invalid browser name");
        }
    }

    public void runTest(String browser) {

        launchBrowser(browser);

        driver.get("https://www.saucedemo.com");

        System.out.println("Browser : " + browser);
        System.out.println("Title : " + driver.getTitle());

        driver.quit();
    }

    @Test
    public void testChrome() {
        runTest("chrome");
    }

    @Test
    public void testFirefox() {
        runTest("firefox");
    }

    @Test
    public void testEdge() {
        runTest("edge");
    }
}