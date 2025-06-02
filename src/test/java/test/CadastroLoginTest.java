package org.example;

import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.*;
import org.example.CadastroPage;
import org.example.LoginPage;
import org.example.HomePage;
import org.example.BaseTest;

import static org.example.BaseTest.HomePage.driver;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CadastroLoginTest extends BaseTest {

    private static LoginPage loginPage;
    private static CadastroPage cadastroPage;
    private static HomePage homePage;

    @BeforeEach
    public void init() {
        loginPage = new LoginPage(driver);
        cadastroPage = new CadastroPage(driver);
        homePage = new HomePage(driver);
        loginPage.acessarPagina();
    }

    @Test
    @Order(1)
    public void testCadastroComSucesso() {
        cadastroPage.acessarPaginaCadastro();
        cadastroPage.preencherFormulario("josue", "josue@gmail.com", "123");
        cadastroPage.clicarEmCadastrar();
        assertEquals("Cadastro realizado com sucesso", cadastroPage.obterMensagemCadastro());
    }

    @Test
    @Order(2)
    public void testLoginComSucesso() {
        loginPage.preencherLogin("josue100@gmail.com", "123");
        assertEquals("Este é seu sistema para administrar seu ecommerce.", loginPage.obterMensagemBoasVindas());
    }

    @Test
    @Order(3)
    public void testLogout() {
        loginPage.preencherLogin("josue100@gmail.com", "123");
        homePage.realizarLogout();
        assertEquals("Login", driver.getTitle());
    }
}

