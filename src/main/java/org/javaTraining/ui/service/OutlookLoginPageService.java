package org.javaTraining.ui.service;

import lombok.SneakyThrows;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractions;
import org.javaTraining.ui.constants.EnvironmentsUIConstants;
import org.javaTraining.ui.pom.OutlookLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OutlookLoginPageService extends UIInteractions {

    private final WebDriver driver;
    private final WebDriverWait wait;
    @Steps
    private OutlookLoginPage page;

    public OutlookLoginPageService() {
        this.driver = Serenity.getDriver();
        Duration elementTimeOut = Duration.ofSeconds(10);
        this.wait = new WebDriverWait(this.driver, elementTimeOut);
    }

    public void openPage() {
        this.driver.get(EnvironmentsUIConstants.OUTLOOK_URL);
    }

    public void sendUser(String user) {
        this.wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(this.page.getUserInput())));
        this.driver.findElement(this.page.getUserInput()).sendKeys(user);
    }

    public void clickOnNextButton() {
        this.wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(this.page.getNextButton())));
        this.driver.findElement(this.page.getNextButton()).click();
    }

    @SneakyThrows
    public void sendPassword(String password) {
        Thread.sleep(1000);
        this.wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(this.page.getPassInput())));
        this.driver.findElement(this.page.getPassInput()).sendKeys(password);
    }

    public void clickOnYesButton() {
        this.wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(this.page.getYesButton())));
        this.driver.findElement(this.page.getYesButton()).click();

    }

    public String getTitle() {
        return this.driver.getTitle();
    }

}
