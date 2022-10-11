package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D04_searchStepDef {

    P03_homePage home = new P03_homePage();
    SoftAssert soft = new SoftAssert();
    public String actualurl;

    @Given("user clicks on search field")
    public void user_click_on_search_field() {
        home.click_on_search_field().click();
    }

    @When("^user search with \"(.*)\"$")
    public void userSearchWith(String productname) {
        home.type_product_name(productname);
//        home.click_on_search_button().click();

    }

    @Then("^user could find \"(.*)\"$")
    public void userCouldFind(String productname) {
        System.out.println(productname);
        actualurl = home.get_current_url();
        soft.assertTrue(actualurl.contains("https://demo.nopcommerce.com/search?q="), "worng url");
        List<WebElement> search_result = home.resultforAllProducts();
        System.out.println(search_result.size());
        for (int x = 0; x < search_result.size(); x++) {
            String actual_serchresult = search_result.get(x).getText();
            System.out.println(actual_serchresult);
            soft.assertTrue(actual_serchresult.toLowerCase().contains(productname), "wrong book keyword assertion");


        }
        soft.assertAll();
    }

    @Then("user could find {string} product")
    public void userCouldFindProduct(String arg0) {
        System.out.println(arg0);

        home.detail_page();
        WebElement SKU_displayed = home.get_SKU();
        System.out.println(SKU_displayed.getText());
        Assert.assertTrue(SKU_displayed.isDisplayed(), "Not displayed");
    }
}
