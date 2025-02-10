package org.javaTraining.ui.pom;

import lombok.Getter;
import lombok.ToString;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@Getter
@ToString
public class LoginPage extends PageObject {

    private final By userInput = By.xpath("//*[@id=\"user-name\"]"),
            passInput = By.xpath("//*[@id=\"password\"]"),
            loginButton = By.xpath("//*[@id=\"login-button\"]"),
            tittleInventory = By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div");
}
