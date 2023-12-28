package org.javaTraining.stepdef.api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.annotations.Steps;
import org.javaTraining.api.actions.MethodsActions;
import org.javaTraining.api.rest.dto.BodyExample;

import static org.assertj.core.api.Assertions.assertThat;

public class MethodsStepDef {

    @Steps
    private MethodsActions methodsActions;
    private BodyExample bodyExample = null;
    private Response response;

    @Given("user has a Body Request")
    public void userHasABodyRequest() {
        this.bodyExample = new BodyExample("John","Doe",35);
    }

    @When("user {string} the endpoint")
    public void userTheEndpoint(String method) {
        this.response = this.methodsActions.httpMethods(method,this.bodyExample);
    }

    @Then("user verify the {int} status code")
    public void userVerifyTheStatusCode(int statusCode) {
        assertThat(this.response).isNotNull();
        assertThat(this.response.statusCode()).isEqualTo(statusCode);
    }

    @When("user {string} the {string} endpoint")
    public void userTheEndpoint(String method, String endpoint) {
        this.response = this.methodsActions.executeMethodOnEndpoint(method,endpoint);
    }
}
