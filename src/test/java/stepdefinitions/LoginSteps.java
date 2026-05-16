package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Given("user clicks on login")
    public void user_clicks_on_login() {

        homePage.clickLogin();
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {

        loginPage.doLogin(username, password);
    }
}