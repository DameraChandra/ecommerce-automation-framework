package pages;

import org.openqa.selenium.By;

import factory.DriverFactory;

public class LoginPage {

    By username = By.id("user-name");

    By password = By.id("password");

    By loginBtn = By.id("login-button");

    public void enterUsername(String uname) {

        DriverFactory.getDriver()
                .findElement(username)
                .sendKeys(uname);
    }

    public void enterPassword(String pwd) {

        DriverFactory.getDriver()
                .findElement(password)
                .sendKeys(pwd);
    }

    public void clickLogin() {

        DriverFactory.getDriver()
                .findElement(loginBtn)
                .click();
    }
}