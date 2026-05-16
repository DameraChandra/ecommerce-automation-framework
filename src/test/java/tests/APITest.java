package tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class APITest {

    String apiKey = "free_user_3C4fgVCL2G432FLXilo5uv2QK3T";

    @Test

    public void validateCreateUser() {

        String body = "{\n" +
                "\"name\":\"Chandra\",\n" +
                "\"job\":\"QA\"\n" +
                "}";

        String response = given()

                .header("x-api-key", apiKey)

                .header("Content-Type", "application/json")

                .body(body)

                .when()

                .post("https://reqres.in/api/users")

                .then()

                .statusCode(201)

                .extract()

                .asPrettyString();

        System.out.println("POST RESPONSE");

        System.out.println(response);
    }

    @Test

    public void validateGetUsersAPI() {

        String response = given()

                .header("x-api-key", apiKey)

                .when()

                .get("https://reqres.in/api/users?page=2")

                .then()

                .statusCode(200)

                .extract()

                .asPrettyString();

        System.out.println("GET RESPONSE");

        System.out.println(response);

        String email = given()

                .header("x-api-key", apiKey)

                .when()

                .get("https://reqres.in/api/users?page=2")

                .jsonPath()

                .getString("data[0].email");

        System.out.println("EMAIL : " + email);

        String contentType = given()

                .header("x-api-key", apiKey)

                .when()

                .get("https://reqres.in/api/users?page=2")

                .getContentType();

        System.out.println("CONTENT TYPE : " + contentType);
    }
}