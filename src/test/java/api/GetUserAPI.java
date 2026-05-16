package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import utils.ConfigReader;

public class GetUserAPI {

    public static Response getUsers() {

        return RestAssured
                .given()
                .baseUri("https://reqres.in")
                .header("x-api-key",
                        ConfigReader.getProperty("apiKey"))
                .header("Content-Type",
                        "application/json")
                .when()
                .get("/api/users?page=2");
    }
}