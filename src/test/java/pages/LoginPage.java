package pages;

import org.openqa.selenium.By;
import base.BasePage;

public class LoginPage extends BasePage {

    By email = By.id("email");
    By password = By.id("password");
    By loginBtn = By.id("loginBtn");

    public void doLogin(String user, String pass) {

        driver.findElement(email).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }
}