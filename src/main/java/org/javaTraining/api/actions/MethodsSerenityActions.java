package org.javaTraining.api.actions;

import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.core.steps.UIInteractions;
import org.javaTraining.api.rest.dto.HttpClientSerenity;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.when;

public class MethodsSerenityActions extends UIInteractions {

    private final String basePath = "/anything";

    public Response getMethodSerenity(Object payload) {
        return HttpClientSerenity.getMethodSerenity(this.basePath, payload);
    }
}
