package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import utils.ConfigReader;

public class CreateUserAPI {

    public static Response createUser() {

        String body =
                "{ \"name\": \"Chandra\", \"job\": \"QA\" }";

        return RestAssured
                .given()
                .baseUri("https://reqres.in")
                .header("x-api-key",
                        ConfigReader.getProperty("apiKey"))
                .header("Content-Type",
                        "application/json")
                .body(body)
                .when()
                .post("/api/users");
    }
}