package tests;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProductPage;

public class ProductTest extends BaseTest {

    @Test
    public void verifyProductAddToCart() {

        driver.get("https://www.saucedemo.com");

        LoginPage lp = new LoginPage(driver);
        lp.login("standard_user", "secret_sauce");

        ProductPage pp = new ProductPage(driver);
        pp.addProduct();
    }
}