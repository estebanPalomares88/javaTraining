package org.javaTraining.ui.pom;

import lombok.Getter;
import lombok.ToString;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@Getter
@ToString
public class OutlookLoginPage extends PageObject {

    private final By userInput = By.xpath("//input[@id='i0116']"),
            nextButton = By.xpath("//input[@id='idSIButton9']"),
            passInput = By.xpath("//div[@class='placeholderContainer']/input[@id='i0118']"),
            yesButton = By.xpath("//input[@id='idSIButton9']");
}
