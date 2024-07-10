package com.haceb.setps;

import com.haceb.pageObject.PayDetailsCart;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static com.haceb.models.NameProductModel.getNameProduct;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Validate {
    @Page
    PayDetailsCart payDetailsCart;

    @Step
    public void assertion() {

        String product = getNameProduct();

        assertEquals(
                String.valueOf(product),
                String.valueOf(payDetailsCart.getDriver().
                        findElement(payDetailsCart.getLblProductName()).getText())
        );
        System.out.println(getNameProduct());
    }
}
