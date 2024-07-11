package com.haceb.setps;

import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import com.haceb.pageObject.HomePage;

import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.haceb.utils.SeleniumUtils.selectRandom;

public class HomeSteps {
    @Page
    HomePage homePage;

    @Step("User opens Haceb url ")
    public void openBrowser() {
        homePage.openUrl("https://www.haceb.com");
    }

    @Step("Close alert")
    public void closeAlert() {
        try {
            WaitUntil.the(homePage.getBtnCloseAlert(), WebElementStateMatchers.isVisible());
            homePage.getDriver().findElement(homePage.getBtnCloseAlert()).click();
        } catch (Exception e) {
            System.out.println("error element " + e);
        }
    }

    @Step("User select menu option")
    public void userSelectMenu() {
        homePage.getDriver().findElement(homePage.getBtnMenu()).click();
    }

    @Step("User selects a category randomly")
    public void userSelectsACategoryRandomly() {
        List<WebElement> collections = homePage.getDriver().findElements(homePage.getBtnSelectCategory());
        WebElement element = selectRandom(collections);
        element.click();
    }

    @Step("User selects a subcategory randomly")
    public void userSelectsASubategoryRandomly() {
        List<WebElement> collections = homePage.getDriver().findElements(homePage.getBtnSubCategory());

        if (!collections.isEmpty()) {
            WebElement element = selectRandom(collections);
            element.click();
        } else {
            System.out.println("No subcategories found.");
        }
    }
}
