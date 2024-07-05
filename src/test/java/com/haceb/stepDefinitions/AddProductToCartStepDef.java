package com.haceb.stepDefinitions;

import com.haceb.setps.HomeSteps;
import com.haceb.setps.ProductSteps;
import com.haceb.setps.Validate;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProductToCartStepDef {
    @Managed
    WebDriver driver;

    @Steps
    HomeSteps homeSteps;

    @Steps
    ProductSteps productSteps;

    @Steps
    Validate validate;

    @BeforeAll
    public static void setUpClass() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
    }

    @BeforeEach
    public void setUpTest() {
        driver = new ChromeDriver();
    }

    @Given("the user opens the browser at the Haceb url")
    public void theUserOpensTheBrowserAtTheHacebUrl() {
        homeSteps.openBrowser();
    }

    @When("the user searches for the product and selects it")
    public void theUserSearchesForTheProductAndSelectsIt() {
        homeSteps.closeAlert();
        homeSteps.userSelectMenu();
        homeSteps.userSelectsACategoryRandomly();
        homeSteps.userSelectsASubategoryRandomly();
        productSteps.theUserSelectsTheProductRandomly();
        productSteps.theUserAddTheProductToCart();
        productSteps.theUserClicsOnTheCartButton();
    }

    @Then("the user will be able to view the product in the cart")
    public void theUserWillBeAbleToViewTheProductInTheCart() {
        validate.assertion();
    }
}
