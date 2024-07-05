Feature: Add product to cart
  As a user I want to add products to the shopping cart to be able to pay

  Scenario: Product successfully added
    Given the user opens the browser at the Haceb url
    When the user searches for the product and selects it
    Then the user will be able to view the product in the cart