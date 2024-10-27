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
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginStep login = new LoginStep(); // Inicialización de LoginStep

    @Steps(shared = true)
    ValidationStep validation;

    @Given("el usuario navega al sitio web")
    public void userNavigateTo(){
        url.navigateTo("https://www.saucedemo.com/v1/index.html");

    }

    @When("ingresa credenciales válidas")
    public void userLoginWithValidCredentials(){
        login.typeUsername("standard_user");
        login.typePassword("secret_sauce");
        login.click_Login();
    }

    @Then("la aplicación debería mostrar el módulo principal de productos")
    public void systemShowProductsModule(){
        Assert.assertTrue(validation.titleIsVisible());
    }

    @When("ingresa credenciales inválidas")
    public void userLoginWithInvalidCredentials(){
        login.typeUsername("standard_user");
        login.typePassword("secret_sauce12");
        login.click_Login();
    }

    @Then("la aplicación debería mostrar un mensaje de error")
    public void systemNotShowProductsModule(){
        Assert.assertTrue(validation.errorMessageIsVisible());
    }
}
