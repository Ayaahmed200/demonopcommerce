@smoke
Feature: F08_Wishlist | users could add product to wishlist

  Scenario: user add product to Wishlist
    Given user click on product to add to wishlist button
    Then user could find success alert

  Scenario: user navigate to whishlist page
    Given user click on product to add to wishlist button
    When navigate to whishlist page
    Then user could count product quantity
