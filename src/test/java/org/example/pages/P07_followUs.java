package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P07_followUs {
   public WebElement userOpensFacebookLink()
   {

      return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
   }
   public WebElement userOpensTwitterLink() {
      return Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
   }

   public WebElement userOpensRssLink() {
      return Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
   }


   public WebElement userOpensYoutubeLink() {
      return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
   }
}
