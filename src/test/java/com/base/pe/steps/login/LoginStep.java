package com.base.pe.steps.login;

import com.base.pe.pages.login.LoginPage;
import net.serenitybdd.annotations.Step;

/*import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;*/

import java.time.Duration;

public class LoginStep extends LoginPage {

    // Constructor
    public LoginStep() {
        super();
    }

    @Step("Ingresar usuario")
    public void typeUsername(String username) {
        /*if(txt_username == null) {
            System.out.println("txt_username is null");
        } else {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(txt_username));
            txt_username.click();
            txt_username.sendKeys(username);
        }*/
        txt_username.sendKeys(username);
    }

    @Step("Ingresar contraseña")
    public void typePassword(String password) {
        txt_password.sendKeys(password);
    }

    @Step("Clic en el botón login")
    public void click_Login() {
        btn_login.click();
    }
}
