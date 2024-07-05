package com.haceb.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private final By btnCloseAlert = By.xpath("//div[@class='gigya-screen-dialog-close']");
    public By getBtnCloseAlert() {
        return btnCloseAlert;
    }

    private final By btnMenu = By.xpath("(//div[@class='pr3 items-stretch    flex'])[2]");
    public By getBtnMenu() {
        return btnMenu;
    }

    private final By btnSelectCategory = By.xpath("//div[@class='w-100 hacebco-menu-drawer-0-x-itemList']/div");
    public By getBtnSelectCategory() {
        return btnSelectCategory;
    }

    private final By btnSubCategory = By.xpath("//ul/div[contains(@class, 'category')]");
    public By getBtnSubCategory() {
        return btnSubCategory;
    }
}
