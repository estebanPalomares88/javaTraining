package org.javaTraining.api.rest;

import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.javaTraining.api.constants.EnvironmentsConstants;

import static net.serenitybdd.rest.SerenityRest.*;

public class HttpClient {

    public static Response getMethod(String endPoint,Object payload) {
        final String baseUri = EnvironmentsConstants.API_ENDPOINT;
        RequestSpecification requestSpecification = given()
                .baseUri(baseUri)
                .basePath(endPoint)
                .body(payload, ObjectMapperType.GSON)
                .accept(ContentType.JSON);

        return requestSpecification.when().get();
    }
    public static Response getMethod(String endPoint) {
        final String baseUri = EnvironmentsConstants.API_ENDPOINT;
        RequestSpecification requestSpecification = given()
                .baseUri(baseUri)
                .basePath(endPoint)
                .accept(ContentType.JSON);

        return requestSpecification.when().get();
    }

    public static Response getMethodWithToken(String token) {
        final String baseUri = EnvironmentsConstants.API_ENDPOINT;
        RequestSpecification requestSpecification = given()
                .baseUri(baseUri)
                .basePath("bearer")
                .accept(ContentType.JSON)
                .header("Authorization", "Bearer " + token);

        return requestSpecification.when().get();
    }

    public static Response postMethod(String endPoint,Object payload) {
        final String baseUri = EnvironmentsConstants.API_ENDPOINT;
        RequestSpecification requestSpecification = given()
                .baseUri(baseUri)
                .basePath(endPoint)
                .body(payload, ObjectMapperType.GSON)
                .accept(ContentType.JSON);

        return requestSpecification.when().post();
    }

    public static Response postMethod(String endPoint) {
        final String baseUri = EnvironmentsConstants.API_ENDPOINT;
        RequestSpecification requestSpecification = given()
                .baseUri(baseUri)
                .basePath(endPoint)
                .accept(ContentType.JSON);

        return requestSpecification.when().post();
    }

    public static Response putMethod(String endPoint,Object payload) {
        final String baseUri = EnvironmentsConstants.API_ENDPOINT;
        RequestSpecification requestSpecification = given()
                .baseUri(baseUri)
                .basePath(endPoint)
                .body(payload, ObjectMapperType.GSON)
                .accept(ContentType.JSON);

        return requestSpecification.when().put();
    }

    public static Response putMethod(String endPoint) {
        final String baseUri = EnvironmentsConstants.API_ENDPOINT;
        RequestSpecification requestSpecification = given()
                .baseUri(baseUri)
                .basePath(endPoint)
                .accept(ContentType.JSON);

        return requestSpecification.when().put();
    }

    public static Response patchMethod(String endPoint,Object payload) {
        final String baseUri = EnvironmentsConstants.API_ENDPOINT;
        RequestSpecification requestSpecification = given()
                .baseUri(baseUri)
                .basePath(endPoint)
                .body(payload, ObjectMapperType.GSON)
                .accept(ContentType.JSON);

        return requestSpecification.when().patch();
    }
    public static Response patchMethod(String endPoint) {
        final String baseUri = EnvironmentsConstants.API_ENDPOINT;
        RequestSpecification requestSpecification = given()
                .baseUri(baseUri)
                .basePath(endPoint)
                .accept(ContentType.JSON);

        return requestSpecification.when().patch();
    }

    public static Response deleteMethod(String endPoint,Object payload) {
        final String baseUri = EnvironmentsConstants.API_ENDPOINT;
        RequestSpecification requestSpecification = given()
                .baseUri(baseUri)
                .basePath(endPoint)
                .body(payload, ObjectMapperType.GSON)
                .accept(ContentType.JSON);

        return requestSpecification.when().delete();
    }

    public static Response deleteMethod(String endPoint) {
        final String baseUri = EnvironmentsConstants.API_ENDPOINT;
        RequestSpecification requestSpecification = given()
                .baseUri(baseUri)
                .basePath(endPoint)
                .accept(ContentType.JSON);

        return requestSpecification.when().delete();
    }
}
