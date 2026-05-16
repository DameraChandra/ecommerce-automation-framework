package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage =
            new LoginPage(DriverFactory.getDriver());

    @Given("user is on login page")
    public void user_is_on_login_page() {

        DriverFactory.getDriver()
                .get("https://example.com/login");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {

        loginPage.doLogin(
                "admin@test.com",
                "admin123");
    }
}