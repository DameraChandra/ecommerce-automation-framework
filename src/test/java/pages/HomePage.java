package pages;

import org.openqa.selenium.By;
import base.BasePage;

public class HomePage extends BasePage {

    By loginBtn = By.xpath("//a[contains(text(),'Login')]");

    public void clickLogin() {

        driver.findElement(loginBtn).click();
    }
}