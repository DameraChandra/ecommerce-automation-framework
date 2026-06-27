package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setup() {

        WebDriverManager.chromedriver().setup();

        // Chrome Options
        ChromeOptions options = new ChromeOptions();

        // Run in Headless Mode
        options.addArguments("--headless=new");

        // Required for Docker
        options.addArguments("--no-sandbox");

        options.addArguments("--disable-dev-shm-usage");

        options.addArguments("--disable-gpu");

        options.addArguments("--remote-allow-origins=*");

        // Launch Browser
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void teardown() {

        if(driver != null) {

            driver.quit();
        }
    }
}