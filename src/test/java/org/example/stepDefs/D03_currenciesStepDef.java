package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D03_currenciesStepDef {
    P03_homePage home = new P03_homePage();


    @When("user select Euro option")
    public void user_select_euro() {
        Select select = new Select(home.user_select_euro_option());
        select.selectByVisibleText("Euro");
    }

    @Then("euro symbol is displayed on all products")
    public void euroSymbolIsDisplayedOnAllProducts() {
        List<WebElement> currenies = home.euroSymbolIsDisplayedOnAllProducts();
        String expected_curruncies = "€";

        for (int x = 0; x < currenies.size(); x++) {
            String actual_currency = currenies.get(x).getText();
            System.out.println(actual_currency);
            Assert.assertTrue(actual_currency.contains(expected_curruncies), "wrong Currency");
        }
    }
}
