@smoke
Feature: F06_homeSlider | user could click on the slider on the home page

  Scenario: user could click on nokia slider on home page
    Given user click on the "1" slider
    Then user could navigate to "nokia" page

  Scenario: user could click on iphone slider on home page
    Given user click on the "2" slider
    Then user could navigate to "iphone" page


