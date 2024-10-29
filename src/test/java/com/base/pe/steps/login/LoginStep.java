package com.base.pe.steps.login;

import com.base.pe.pages.login.LoginPage;
import net.serenitybdd.annotations.Step;

public class LoginStep {

    private LoginPage loginPage;

    @Step("Ingresar usuario")
    public void typeUsername(String username) {
        loginPage.typeUsername(username);
    }

    @Step("Ingresar contraseña")
    public void typePassword(String password) {
        loginPage.typePassword(password);
    }

    @Step("Clic en el botón login")
    public void click_Login() {
        loginPage.clickLoginButton();
    }

    @Step("Login con credenciales")
    public void loginWithCredentials(String username, String password) {
        typeUsername(username);
        typePassword(password);
        click_Login();
    }
}