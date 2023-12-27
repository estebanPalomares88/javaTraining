package org.javaTraining.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.annotations.Steps;
import org.javaTraining.api.actions.MethodsSerenityActions;
import org.javaTraining.api.rest.dto.BodyExample;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MethodsSerenityStepDef {

    @Steps
    private MethodsSerenityActions methodsSerenityActions;
    private BodyExample bodyExample = null;
    private Response response;

    @Test
    @Given("I have a Body Request")
    public void iHaveABodyRequest() {
        this.bodyExample = new BodyExample("Jaime","Palomares",35);
    }

    @When("I {string} the endpoint with Serenity")
    public void iTheEndpoint(String method) {
        this.response = this.methodsSerenityActions.getMethodSerenity(this.bodyExample);
    }

    @Then("I verify the response")
    public void iVerifyTheResponse() {
        assertThat(response.statusCode()).isEqualTo(200);
    }
}
