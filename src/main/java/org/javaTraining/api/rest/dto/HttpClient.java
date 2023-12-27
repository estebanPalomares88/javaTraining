package org.javaTraining.api.rest.dto;

import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static net.serenitybdd.rest.SerenityRest.*;

public class HttpClient {


    public static Response getMethod(String endPoint,Object payload) {
        RequestSpecification requestSpecification = given()
                .baseUri("https://www.httpbin.org")
                .basePath(endPoint)
                .body(payload, ObjectMapperType.GSON)
                .accept(ContentType.JSON);

        return requestSpecification.when().get();
    }
    public static Response getMethod(String endPoint) {
        RequestSpecification requestSpecification = given()
                .baseUri("https://www.httpbin.org")
                .basePath(endPoint)
                .accept(ContentType.JSON);

        return requestSpecification.when().get();
    }

    public static Response postMethod(String endPoint,Object payload) {
        RequestSpecification requestSpecification = given()
                .baseUri("https://www.httpbin.org")
                .basePath(endPoint)
                .body(payload, ObjectMapperType.GSON)
                .accept(ContentType.JSON);

        return requestSpecification.when().post();
    }

    public static Response postMethod(String endPoint) {
        RequestSpecification requestSpecification = given()
                .baseUri("https://www.httpbin.org")
                .basePath(endPoint)
                .accept(ContentType.JSON);

        return requestSpecification.when().post();
    }

    public static Response putMethod(String endPoint,Object payload) {
        RequestSpecification requestSpecification = given()
                .baseUri("https://www.httpbin.org")
                .basePath(endPoint)
                .body(payload, ObjectMapperType.GSON)
                .accept(ContentType.JSON);

        return requestSpecification.when().put();
    }

    public static Response putMethod(String endPoint) {
        RequestSpecification requestSpecification = given()
                .baseUri("https://www.httpbin.org")
                .basePath(endPoint)
                .accept(ContentType.JSON);

        return requestSpecification.when().put();
    }

    public static Response patchMethod(String endPoint,Object payload) {
        RequestSpecification requestSpecification = given()
                .baseUri("https://www.httpbin.org")
                .basePath(endPoint)
                .body(payload, ObjectMapperType.GSON)
                .accept(ContentType.JSON);

        return requestSpecification.when().patch();
    }
    public static Response patchMethod(String endPoint) {
        RequestSpecification requestSpecification = given()
                .baseUri("https://www.httpbin.org")
                .basePath(endPoint)
                .accept(ContentType.JSON);

        return requestSpecification.when().patch();
    }

    public static Response deleteMethod(String endPoint,Object payload) {
        RequestSpecification requestSpecification = given()
                .baseUri("https://www.httpbin.org")
                .basePath(endPoint)
                .body(payload, ObjectMapperType.GSON)
                .accept(ContentType.JSON);

        return requestSpecification.when().delete();
    }

    public static Response deleteMethod(String endPoint) {
        RequestSpecification requestSpecification = given()
                .baseUri("https://www.httpbin.org")
                .basePath(endPoint)
                .accept(ContentType.JSON);

        return requestSpecification.when().delete();
    }
}
