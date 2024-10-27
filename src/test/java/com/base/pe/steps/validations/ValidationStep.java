package com.base.pe.steps.validations;

import com.base.pe.pages.validations.ValidationPage;
import net.serenitybdd.annotations.Step;

public class ValidationStep extends ValidationPage {

    @Step("Validar visualización del módulo de productos")
    public Boolean titleIsVisible(){
        return lbl_product.isDisplayed();
    }

    @Step("Validar Visualización del mensaje de error")
    public Boolean errorMessageIsVisible(){
        return lbl_errorMessage.isDisplayed();
    }
}
