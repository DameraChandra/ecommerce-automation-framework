package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    WebDriver driver;

    WebDriverWait wait;

    public ProductPage(WebDriver driver) {

        this.driver = driver;

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    By samsungMobile =
            By.linkText("Samsung galaxy s6");

    By addToCart =
            By.linkText("Add to cart");

    public void searchProduct() throws Exception {

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(samsungMobile));

        driver.findElement(samsungMobile).click();

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(addToCart));

        driver.findElement(addToCart).click();

        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();

        System.out.println(alert.getText());

        alert.accept();

        System.out.println("Product Added To Cart");
    }
}