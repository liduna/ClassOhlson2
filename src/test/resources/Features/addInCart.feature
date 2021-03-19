Feature: add Item in Cart

  @addingItem
  Scenario: Add item into cart
    Given I have navigated to webpage https://www.clasohlson.com/se/Superlim-Loctite-Precision,-5-g/p/25-1544
    And I have accepted cookies

    When I press add to cart
    And I click on the cart icon
    Then the item is added to the cart