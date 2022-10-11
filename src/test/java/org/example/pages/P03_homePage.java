package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {
    public WebElement user_select_euro_option() {

        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> euroSymbolIsDisplayedOnAllProducts() {
//
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }

    public WebElement click_on_search_field() {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement search_on_productname() {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public void type_product_name(String productname) {
        search_on_productname().sendKeys(productname);
        search_on_productname().submit();

    }
//    public WebElement click_on_search_button(){
//        return Hooks.driver.findElement(By.xpath
//                ("//button[@class=\"button-1 search-box-button\"]"));
//    }

    public List<WebElement> resultforAllProducts() {
//
        return Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]"));
    }

    public WebElement open_detail_page() {
        return Hooks.driver.findElement(By.xpath("//h2[@class=\"product-title\"]//a"));
    }

    public void detail_page() {
        open_detail_page().click();
    }

    public WebElement get_SKU() {
        return Hooks.driver.findElement(By.xpath("//span[@class=\"value\"]"));
    }

    public String get_current_url() {
        return Hooks.driver.getCurrentUrl();
    }

    public List<WebElement> user_could_hover_on_randomCategory() {
        return Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href]"));
    }

    public List<WebElement> user_could_select_random_subCategory(int category) {
        category = category + 1;
        return Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[" + category + "]/ul[@class=\"sublist first-level\"]/li"));
    }

    public WebElement get_page_title()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"] h1"));
    }
    public  WebElement click_on_slider(String add_number)
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"nivo-imageLink\"]:nth-child("+add_number+")"));
    }
}
