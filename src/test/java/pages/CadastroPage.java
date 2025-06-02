package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CadastroPage {
    private WebDriver driver;

    private By linkCadastro = By.linkText("Cadastre-se");
    private By nomeInput = By.id("nome");
    private By emailInput = By.id("email");
    private By senhaInput = By.id("password");
    private By checkbox = By.cssSelector(".form-check");
    private By botaoCadastrar = By.cssSelector(".btn-primary");
    private By alertaSucesso = By.cssSelector("a.alert-link");

    public CadastroPage(WebDriver driver) {
        this.driver = driver;

    }
    public void acessarPaginaCadastro() {
        driver.findElement(linkCadastro).click();

    }
    public void preencherFormulario(String nome,String email, String senha){
        driver.findElement(nomeInput).sendKeys(nome);
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(senhaInput).sendKeys(senha);
        driver.findElement(checkbox).click();

    }

    public void clicarEmCadastrar() {
        driver.findElement(botaoCadastrar).click();
    }

    public String obterMensagemCadastro() {
        return driver.findElement(alertaSucesso).getText();
    }
}
