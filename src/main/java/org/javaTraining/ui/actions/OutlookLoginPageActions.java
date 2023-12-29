package org.javaTraining.ui.actions;

import net.serenitybdd.annotations.Steps;
import org.javaTraining.ui.constants.EnvironmentsUIConstants;
import org.javaTraining.ui.service.OutlookLoginPageService;

public class OutlookLoginPageActions {

    @Steps
    private OutlookLoginPageService service;

    public void openGmailPage(){
        this.service.openPage();
    }

    public void login(String scenario) {
        this.service.sendUser(EnvironmentsUIConstants.OUTLOOK_USER);
        this.service.clickOnNextButton();
        this.service.sendPassword(EnvironmentsUIConstants.OUTLOOK_PASS);
        this.service.clickOnNextButton();
        this.service.clickOnYesButton();
    }

    public String getTitle() {
        return this.service.getTitle();
    }

}
