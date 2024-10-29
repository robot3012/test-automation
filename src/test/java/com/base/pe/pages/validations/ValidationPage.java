package com.base.pe.pages.validations;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ValidationPage extends PageObject {

    @FindBy(xpath = "//div[@class='product_label']")
    private WebElementFacade lbl_product;

    @FindBy(xpath = "//h3[@data-test='error' and text()='Username and password do not match any user in this service']")
    private WebElementFacade lbl_errorMessage;

    public boolean isProductLabelVisible() {
        return element(lbl_product).waitUntilVisible().isDisplayed();
    }

    public boolean isErrorMessageVisible() {
        return element(lbl_errorMessage).waitUntilVisible().isDisplayed();
    }
}