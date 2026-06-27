package stepdefinitions;

import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage;

    @Given("User is on login page")
    public void user_is_on_login_page() {

        DriverFactory.getDriver().get("https://www.saucedemo.com/");

        loginPage = new LoginPage(DriverFactory.getDriver());
    }

    @When("User enters username and password")
    public void user_enters_username_and_password() {

        loginPage.login("standard_user", "secret_sauce");
    }

    @When("Clicks on login button")
    public void clicks_on_login_button() {

        // Login button is already clicked inside login()
    }

    @Then("User should navigate to home page")
    public void user_should_navigate_to_home_page() {

        String currentUrl = DriverFactory.getDriver().getCurrentUrl();

        Assert.assertTrue(currentUrl.contains("inventory"));

        System.out.println("Login Successful");
    }
}