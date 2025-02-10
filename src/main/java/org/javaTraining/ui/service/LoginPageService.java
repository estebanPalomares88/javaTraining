package org.javaTraining.ui.service;

import lombok.SneakyThrows;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractions;
import org.javaTraining.ui.constants.EnvironmentsUIConstants;
import org.javaTraining.ui.pom.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPageService extends UIInteractions {

    private final WebDriver driver;
    private final WebDriverWait wait;
    @Steps
    private LoginPage page;

    public LoginPageService() {
        this.driver = Serenity.getDriver();
        Duration elementTimeOut = Duration.ofSeconds(10);
        this.wait = new WebDriverWait(this.driver, elementTimeOut);
    }

    public void openPage() {
        this.driver.get(EnvironmentsUIConstants.UI_URL);
    }

    public void sendUser(String user) {
        this.wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(this.page.getUserInput())));
        this.driver.findElement(this.page.getUserInput()).sendKeys(user);
    }

    @SneakyThrows
    public void sendPassword(String password) {
        Thread.sleep(1000);
        this.wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(this.page.getPassInput())));
        this.driver.findElement(this.page.getPassInput()).sendKeys(password);
    }

    public void clickOnLoginButton() {
        this.wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(this.page.getLoginButton())));
        this.driver.findElement(this.page.getLoginButton()).click();

    }

    public String getTitle() {
        this.wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(this.page.getTittleInventory())));
        return this.driver.findElement(this.page.getTittleInventory()).getText();
    }

}
