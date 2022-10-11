package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P08_Wishlist;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_WishlistStepDef {
    P08_Wishlist whishlist = new P08_Wishlist();


    @Given("user click on product to add to wishlist button")
    public void userClickOnAddToWishlistButton() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        whishlist.userclick_on_product().get(2).click();
        wait.until(ExpectedConditions.elementToBeClickable(whishlist.wishlist_bar()));

    }

    @Then("user could find success alert")
    public void userCouldFindSuccessAlert() {
        SoftAssert soft = new SoftAssert();
        WebElement wishlist_bar_text = whishlist.bar_isdisplayed();
        soft.assertTrue(wishlist_bar_text.isDisplayed(), "Wrong Alert");
        String y = wishlist_bar_text.getText();
//        System.out.println(y);
        String expected_color = "#4bb07a";
        String rgba_actual_color=whishlist.bar_color().getCssValue("background-color");
        String hex_actualcolor = Color.fromString(rgba_actual_color).asHex();
//        System.out.println(hex_actualcolor);
        soft.assertTrue(hex_actualcolor.contains(expected_color),"Wrong background color");
//        System.out.println(hex_actualcolor);
    }

    @When("navigate to whishlist page")
    public void navigateToWhishlistPage() {
        whishlist.navigate_to_wishlistpage().click();
    }

    @Then("user could count product quantity")
    public void userCouldCountProductQuantity() {
        String product_quantity = whishlist.getQuantity().getAttribute("value");
        int count_product_quantity = Integer.parseInt(product_quantity);

        Assert.assertTrue(count_product_quantity > 0);
//        System.out.println(count_product_quantity);
    }


}
