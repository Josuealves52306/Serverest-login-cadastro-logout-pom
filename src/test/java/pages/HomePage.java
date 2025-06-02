package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By botaoLogout = By.cssSelector("[data-testid='logout']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void realizarLogout() {
        driver.findElement(botaoLogout).click();
    }

}
