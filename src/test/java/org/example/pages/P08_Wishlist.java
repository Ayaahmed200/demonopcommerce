package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P08_Wishlist {
    public List<WebElement> userclick_on_product() {
//        return Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 add-to-wishlist-button\"])[3]"));
    return Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));

    }
    public WebElement wishlist_bar()
    {
        return Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));
    }

    public WebElement navigate_to_wishlistpage(){
        return Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));

    }

    public WebElement getQuantity()
    {return Hooks.driver.findElement(By.className("qty-input"));
    }

    public WebElement bar_isdisplayed()
    {return  Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));}

    public  WebElement bar_color()
    {return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));}
}
