package com.haceb.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductsPage extends PageObject {
    private final By btnSeeProduct = By.xpath("//span[starts-with(@class,'vtex-product-s')]");
    public By getBtnSeeProduct() {
        return btnSeeProduct;
    }

    private final By btnAddToCart = By.xpath("//span[contains(text(), 'Agregar al carrito')]");
    public By getBtnAddToCart() {
        return btnAddToCart;
    }

    private final By btnCart = By.xpath("(//button/div/span[starts-with(@class,'vtex-minicart-2-x-minicartIconContainer')])[1]");
    public By getBtnCart() {
        return btnCart;
    }
}
