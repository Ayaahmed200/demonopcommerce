@smoke
  Feature: F04_Search | user could search with product name
    Scenario Outline: user could search with product name
    Given user clicks on search field
    When user search with "<productName>"
    Then user could find "<productName>"
  Examples:
      |productName|
      |book|
      |laptop|
      |nike|

    Scenario Outline: user could search with suku
      Given user clicks on search field
      When user search with "<suku>"
      Then user could find "<suku>" product
      Examples:
        |suku|
        |SCI_FAITH|
        |APPLE_CAM|
        |SF_PRO_11|