@smoke
Feature: F05_hoverCategories | user could hover and select sub_category

  Scenario: user could hover and select sub_category
    Given user hover on random category
    And select random sub_category
    Then open datail page and get the title
