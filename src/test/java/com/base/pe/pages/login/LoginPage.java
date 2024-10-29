package com.base.pe.pages.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
    @FindBy(xpath="//input[@id='user-name']")
    private WebElementFacade txt_username;

    @FindBy(id="password")
    private WebElementFacade txt_password;

    @FindBy(id="login-button")
    private WebElementFacade btn_login;

    public void typeUsername(String username) {
        element(txt_username).waitUntilVisible().clear();
        txt_username.typeAndEnter(username);
    }

    public void typePassword(String password) {
        element(txt_password).waitUntilVisible().clear();
        txt_password.typeAndEnter(password);
    }

    public void clickLoginButton() {
        element(btn_login).waitUntilClickable().click();
    }
}