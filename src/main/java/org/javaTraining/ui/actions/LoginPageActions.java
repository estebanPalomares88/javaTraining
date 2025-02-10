package org.javaTraining.ui.actions;

import net.serenitybdd.annotations.Steps;
import org.javaTraining.ui.constants.EnvironmentsUIConstants;
import org.javaTraining.ui.service.LoginPageService;

public class LoginPageActions {

    @Steps
    private LoginPageService service;

    public void openLoginPage(){
        this.service.openPage();
    }

    public void login(String scenario) {
        this.service.sendUser(EnvironmentsUIConstants.UI_USER);
        this.service.sendPassword(EnvironmentsUIConstants.UI_PASS);
        this.service.clickOnLoginButton();
    }

    public String getTitle() {
        return this.service.getTitle();
    }

}
