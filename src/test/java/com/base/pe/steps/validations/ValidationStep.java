package com.base.pe.steps.validations;

import com.base.pe.pages.validations.ValidationPage;
import net.serenitybdd.annotations.Step;

public class ValidationStep {

    private ValidationPage validationPage;

    @Step("Validar visualización del módulo de productos")
    public Boolean titleIsVisible() {
        return validationPage.isProductLabelVisible();
    }

    @Step("Validar Visualización del mensaje de error")
    public Boolean errorMessageIsVisible() {
        return validationPage.isErrorMessageVisible();
    }
}