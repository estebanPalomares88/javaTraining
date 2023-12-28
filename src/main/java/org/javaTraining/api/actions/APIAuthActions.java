package org.javaTraining.api.actions;

import io.restassured.response.Response;
import net.serenitybdd.core.steps.UIInteractions;
import org.javaTraining.api.rest.HttpClient;

public class APIAuthActions extends UIInteractions {

    public Response getMethod(String token){
        return HttpClient.getMethodWithToken(token);
    }

}
