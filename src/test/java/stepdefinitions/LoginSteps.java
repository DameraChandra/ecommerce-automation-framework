package stepdefinitions;

import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import pages.LoginPage;

public class LoginSteps {

    WebDriver driver = DriverFactory.getDriver();

    LoginPage loginPage = new LoginPage(driver);

    @Given("User is on login page")
    public void user_is_on_login_page() {

        driver.get("https://example.com/login");
    }

    @When("User enters username and password")
    public void user_enters_username_and_password() {

        loginPage.login("test@gmail.com", "12345");
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {

        System.out.println("Login Successful");
    }
}