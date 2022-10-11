package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P07_followUs;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_followUsStepDef {
    P07_followUs follow = new P07_followUs();

    @When("user opens facebook link")
    public void click_on_social_media() throws InterruptedException {
        follow.userOpensFacebookLink().click();
        Thread.sleep(2000);
        ArrayList<String> opened_tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(opened_tabs.get(1));


        Thread.sleep(2000);

    }


    @When("user opens twitter link")
    public void userOpensTwitterLink() throws InterruptedException {

        follow.userOpensTwitterLink().click();
        Thread.sleep(2000);
        ArrayList<String> opened_tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(opened_tabs.get(1));
        Thread.sleep(2000);

    }

    @When("user opens rss link")
    public void userOpensRssLink() throws InterruptedException {
        follow.userOpensRssLink().click();
        Thread.sleep(2000);
        ArrayList<String> opened_tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(opened_tabs.get(0));
        Thread.sleep(2000);

    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() throws InterruptedException {
        follow.userOpensYoutubeLink().click();
        Thread.sleep(2000);
        ArrayList<String> opened_tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(opened_tabs.get(1));
        Thread.sleep(2000);

    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String expected_url) {
//        System.out.println(expected_url);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), expected_url);
//        System.out.println(expected_url);

    }

    @And("user could open and navigate to {string} tab")
    public void userCouldOpenAndNavigateToHttpsTwitterComNopCommerceTab(String arg0) throws Throwable {
        ArrayList<String> opened_tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(opened_tabs.get(0));
        follow.userOpensTwitterLink().click();
        Thread.sleep(2000);
        Hooks.driver.switchTo().window(opened_tabs.get(1));
        System.out.println("-----------------");
        System.out.println(Hooks.driver.getCurrentUrl());
        Hooks.driver.close();

    }
}
