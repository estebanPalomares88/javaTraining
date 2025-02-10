package org.javaTraining.stepdef.ui;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.javaTraining.ui.actions.LoginPageActions;
import org.javaTraining.ui.constants.EnvironmentsUIConstants;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginStepDef {

    @Steps
    private LoginPageActions loginPageActions;

    @Given("User opens the website")
    public void userOpenTheWebsite() {
        this.loginPageActions.openLoginPage();
    }

    @When("User uses {string} credentials")
    public void userUsesCredentials(String scenario) {
        this.loginPageActions.login(scenario);
    }

    @Then("User in logged")
    public void userIsLogged() {
        assertThat(this.loginPageActions.getTitle()).isEqualTo(EnvironmentsUIConstants.UI_MAIN_TITLE);
    }
}
