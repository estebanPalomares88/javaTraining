package org.javaTraining.stepdef.api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.annotations.Steps;
import org.javaTraining.api.actions.APIAuthActions;
import org.javaTraining.api.constants.EnvironmentsAPIConstants;
import org.javaTraining.api.rest.dto.APIAuthDto;

import static org.assertj.core.api.Assertions.assertThat;

public class APIAuthStepDef {

    private String token;
    private Response response;
    @Steps
    private APIAuthActions apiAuthActions;

    @Given("I have a AUTH Request")
    public void iHaveAAUTHRequest() {
        this.token = EnvironmentsAPIConstants.API_TOKEN;
    }

    @When("I GET the Bearer endpoint status {int}")
    public void iGETTheBearerEndpointStatus(Integer statusCode) {
        this.response = apiAuthActions.getMethod(this.token);
        assertThat(this.response).isNotNull();
        assertThat(this.response.statusCode()).isEqualTo(statusCode);
    }

    @Then("I verify the Bearer response")
    public void iVerifyTheBearerResponse() {
        APIAuthDto dto = this.response.as(APIAuthDto.class);
        assertThat(dto.getToken()).isEqualTo(this.token);
        assertThat(dto.getAuthenticated()).isEqualTo("true");
    }

    @Given("I have a unauthorized Request")
    public void iHaveAUnauthorizedRequest() {
        this.token = "";
    }

    @Then("I verify the Bearer response is empty")
    public void iVerifyTheBearerResponseIsEmpty() {
        assertThat(this.response.asString()).isNullOrEmpty();
    }
}
