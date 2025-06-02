# 🧪 Testes Automatizados com Selenium WebDriver + JUnit  
Java | JUnit | Selenium | WebDriverManager | Page Object Model

Este projeto demonstra a automação dos fluxos de **cadastro** e **login** da aplicação, utilizando:

✅ Selenium WebDriver  
✅ Java 17  
✅ JUnit 5  
✅ WebDriverManager  
✅ Padrão de Projeto Page Object Model (POM)

---

## ✨ Funcionalidades Testadas

✅ Cadastro de novo usuário com dados válidos  
✅ Login com credenciais válidas  

---

## 🔧 Tecnologias Utilizadas

| Tecnologia         | Versão     |
|--------------------|------------|
| Java               | 17         |
| Selenium WebDriver | 4.28.1     |
| WebDriverManager   | 6.0.0      |
| JUnit Jupiter      | 5.10.0     |
| Maven              | Build Tool |

---

## 📂 Estrutura do Projeto

src/
└── test/
└── java/
├── pages/
│ ├── LoginPage.java
│ ├── CadastroPage.java
│ └── HomePage.java
└── tests/
└── CadastroLoginTest.java # Classe contendo os testes

yaml
Copiar
Editar

> O projeto segue o padrão **Page Object Model (POM)** para separar a lógica das páginas e promover maior **manutenibilidade** e **reutilização de código** nos testes.

---

## ▶️ Como Executar Localmente

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/testes-cadastro-login.git
cd testes-cadastro-login
Execute os testes com Maven:

bash
Copiar
Editar
mvn clean test
📌 Observações
Os testes utilizam @TestMethodOrder com @Order para garantir a ordem de execução.

As ações automatizadas simulam interações reais com a interface do usuário.

O WebDriverManager faz a configuração automática do driver, sem necessidade de download manual.

Foi configurado Duration.ofSeconds(12) como espera implícita para aguardar elementos na página.
