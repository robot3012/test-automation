package com.base.pe.definitions;

import com.base.pe.steps.login.LoginStep;
import com.base.pe.steps.validations.ValidationStep;
import com.base.pe.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class LoginDef {
    @Steps
    private WebSite url;

    @Steps
    private LoginStep login;

    @Steps
    private ValidationStep validation;

    @Given("el usuario navega al sitio web")
    public void userNavigateTo() {
        url.navigateTo("https://www.saucedemo.com/v1/index.html");
    }

    @When("ingresa credenciales válidas")
    public void userLoginWithValidCredentials() {
        login.loginWithCredentials("standard_user", "secret_sauce");
    }

    @Then("la aplicación debería mostrar el módulo principal de productos")
    public void systemShowProductsModule() {
        Assert.assertTrue("El módulo de productos no es visible", validation.titleIsVisible());
    }

    @When("ingresa credenciales inválidas")
    public void userLoginWithInvalidCredentials() {
        login.loginWithCredentials("standard_user", "secret_sauce12");
    }

    @Then("la aplicación debería mostrar un mensaje de error")
    public void systemNotShowProductsModule() {
        Assert.assertTrue("El mensaje de error no es visible", validation.errorMessageIsVisible());
    }
}