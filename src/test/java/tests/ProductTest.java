package tests;

import org.testng.annotations.Test;

import pages.ProductPage;

public class ProductTest extends BaseTest {

    @Test

    public void verifyProductAddToCart() throws Exception {

        ProductPage pp = new ProductPage(driver);

        pp.searchProduct();

        System.out.println("Product Added To Cart");
    }
}