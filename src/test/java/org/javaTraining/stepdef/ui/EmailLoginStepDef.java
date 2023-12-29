package org.javaTraining.stepdef.ui;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.javaTraining.ui.actions.OutlookLoginPageActions;
import org.javaTraining.ui.constants.EnvironmentsUIConstants;

import static org.assertj.core.api.Assertions.assertThat;

public class EmailLoginStepDef {

    @Steps
    private OutlookLoginPageActions outlookLoginPageActions;

    @Given("User is in outlook website")
    public void userIsInOutlookWebsite() {
        this.outlookLoginPageActions.openGmailPage();
    }

    @When("User uses {string} credentials")
    public void userUsesCredentials(String scenario) {
        this.outlookLoginPageActions.login(scenario);
    }

    @Then("User is logged")
    public void userIsLogged() {
        assertThat(this.outlookLoginPageActions.getTitle()).isEqualTo(EnvironmentsUIConstants.OUTLOOK_MAIN_TITLE);
    }
}
