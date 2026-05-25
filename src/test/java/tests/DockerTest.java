package tests;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DockerTest {

    @Test
    public void testGoogle() throws Exception {

        WebDriver driver = new RemoteWebDriver(
                new URL("http://localhost:4444/wd/hub"),
                new ChromeOptions());

        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());

        driver.quit();
    }
}