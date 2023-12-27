package org.javaTraining.api.rest.dto;

import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static net.serenitybdd.rest.SerenityRest.*;

public class HttpClientSerenity {


    public static Response getMethodSerenity(String endPoint,Object payload) {
        RequestSpecification requestSpecification = given()
                .baseUri("https://www.httpbin.org")
                .basePath(endPoint)
                .body(payload, ObjectMapperType.GSON)
                .accept(ContentType.JSON);

        return when().get(requestSpecification.toString());
    }
}
