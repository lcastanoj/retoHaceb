package com.haceb.setps;

import com.haceb.pageObject.ProductsPage;
import com.haceb.utils.WaitUtils;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.haceb.models.NameProductModel.setNameProduct;
import static com.haceb.utils.RamdonSelect.selectRandom;

public class ProductSteps {
    @Page
    ProductsPage productsPage;

    @Step("The user selects the product randomly")
    public void theUserSelectsTheProductRandomly() {
        WaitUtils.waitForSeconds(5);
        List<WebElement> collections = productsPage.getDriver().findElements(productsPage.getBtnSeeProduct());
        WebElement element = selectRandom(collections);
        setNameProduct(element.getText());
        element.click();
    }

    @Step("The user add the product to cart")
    public void theUserAddTheProductToCart() {
        try {
            WaitUntil.the(productsPage.getBtnAddToCart(), WebElementStateMatchers.isVisible());
            productsPage.getDriver().findElement(productsPage.getBtnAddToCart()).click();
        } catch (Exception e) {
            System.out.println("The product is not available");
        }
    }

    @Step("The user clicks on the cart button")
    public void theUserClicsOnTheCartButton() {
        productsPage.getDriver().findElement(productsPage.getBtnCart()).click();
    }
}
