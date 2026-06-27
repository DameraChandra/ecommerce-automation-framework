package api_tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class ApiTest {

    @Test
    public void validateProductsAPI() {

        RestAssured
                .given()
                .when()
                .get("https://fakestoreapi.com/products")
                .then()
                .statusCode(200);

        System.out.println("API Validation Successful");
    }
}