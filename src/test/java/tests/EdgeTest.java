package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EdgeTest {

    @Test
    public void testEdgeBrowser() {

        // ✅ Set path to EdgeDriver
        System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");

        // Launch Edge
        WebDriver driver = new EdgeDriver();

        // Open application
        driver.get("https://www.saucedemo.com");

        // Print title
        System.out.println("Title : " + driver.getTitle());

        // Close browser
        driver.quit();
    }
}