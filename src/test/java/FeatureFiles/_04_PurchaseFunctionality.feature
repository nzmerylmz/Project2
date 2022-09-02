Feature: Purchase Functionality

  Background:
    Given Navigate to website
    And User click on sign in button
      | homepageSignIn |
    When User enter valid login credentials
      | emailInput    | grup1@techno.study |
      | passwordInput | grup1TechnoStudy1  |
    And User click on sign in button
      | signInButton |
    Then User should login successfully

  Scenario: Purchase Functionality
    Given User chooses an item
      | itemImage |
    And User chooses size and color and click on add button
      | sizeOption |
      | colorOption |
      | addToCartButton |
    And User goes to shopping cart and proceed to checkout
      | shoppingCart |
      | proceedToCheckoutButton |
    And User prefers the shipping option and clicks on next
      | shippingOption |
      | nextButton |
    When User places the order
      | placeOrderButton |
    Then User should see successfull purchase message


