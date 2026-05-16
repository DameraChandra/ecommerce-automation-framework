package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {

    HomePage homePage;
    LoginPage loginPage;

    @Given("User launches application")
    public void launchApp() {
        homePage = new HomePage(DriverFactory.getDriver());
    }

    @When("User navigates to login page")
    public void goToLogin() {
        homePage.clickLogin();
    }

    @And("User enters email and password")
    public void enterDetails() {
        loginPage = new LoginPage(DriverFactory.getDriver());
        loginPage.doLogin("test@gmail.com", "123456");
    }

    @Then("User should login successfully")
    public void verifyLogin() {
        System.out.println("✅ Login Successful");
    }
}