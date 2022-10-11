package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class D05_hoverCategoriesStepDef {
    P03_homePage home = new P03_homePage();
    Actions hover = new Actions(Hooks.driver);
    int randon_category = new Random().nextInt(3);
    public String  subcategory_name;


    @Given("user hover on random category")
    public void user_could_hover() {

        List<WebElement> categories = home.user_could_hover_on_randomCategory();
        hover.moveToElement(categories.get(randon_category)).perform();
//        System.out.println(randon_category);
    }

    @And("select random sub_category")
    public void selectRandomSub_category() {

        int randon_subcategory = new Random().nextInt(3);
        List<WebElement> subCategories = home.user_could_select_random_subCategory(randon_category);
         subcategory_name=subCategories.get(randon_subcategory).getText();
        subCategories.get(randon_subcategory).click();




    }

    @Then("open datail page and get the title")
    public void openDatailPageAndGetTheTitle() {
        String expected_title_result=subcategory_name.toLowerCase().trim();
        System.out.println(expected_title_result);

       String actual_title= home.get_page_title().getText().toLowerCase().trim();
        System.out.println(actual_title);
        Assert.assertTrue(actual_title.contains(expected_title_result),"wrong title");

    }
}
