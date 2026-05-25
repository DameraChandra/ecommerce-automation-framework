package tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class APITest {

    @Test
    public void validateCreateUser() {

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given()

                .header("Content-Type", "application/json")

                .body("{\n" +
                        "  \"title\": \"QA Testing\",\n" +
                        "  \"body\": \"Automation Framework\",\n" +
                        "  \"userId\": 1\n" +
                        "}")

        .when()

                .post("/posts")

        .then()

                .statusCode(201);

        System.out.println("POST API PASSED");
    }

    @Test
    public void validateGetUsersAPI() {

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given()

        .when()

                .get("/posts/1")

        .then()

                .statusCode(200);

        System.out.println("GET API PASSED");
    }
}