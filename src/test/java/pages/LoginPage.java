package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By emailInput = By.id("email");
    private By passwordInput = By.id("password");
    private By entrarButton = By.cssSelector("[data-testid='entrar']");
    private By mensagemBoasVindas = By.cssSelector("p.lead");
    private By mensagemErro = By.cssSelector("div.alert.alert-secondary.alert-dismissible > span");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void acessarPagina(){
        driver.get("https://front.serverest.dev/login");
    }
    public void preencherLogin(String email, String senha) {
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(senha);
        driver.findElement(entrarButton).click();
}

    public String obterMensagemBoasVindas() {
        return driver.findElement(mensagemBoasVindas).getText();
    }

    public String obterMensagemErro() {
        return driver.findElement(mensagemErro).getText();
    }

}