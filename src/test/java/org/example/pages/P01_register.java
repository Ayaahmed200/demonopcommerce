package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {
    public WebElement registerlink() {
//        WebElement element =
//        element.click();
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }

    public WebElement user_select_gender_type() {

        return Hooks.driver.findElement(By.id("gender-female"));
    }

    public WebElement user_enter_FL() {
        return Hooks.driver.findElement(By.id("FirstName"));

    }

    public WebElement user_enter_LN() {
        return Hooks.driver.findElement(By.id("LastName"));

    }

    public void user_enter_FL_and_LN(String firstname, String last_name) {
        user_enter_FL().sendKeys(firstname);
        user_enter_LN().sendKeys(last_name);
    }

    public WebElement select_day() {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement select_month() {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement select_year() {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }

//    public void user_enter_date_of_birth(String day, String month, String year) {
//        select_day().sendKeys(day);
//        select_month().sendKeys(month);
//        select_year().sendKeys(year);
//    }

    public void enter_email(String email) {
        Hooks.driver.findElement(By.id("Email")).sendKeys(email);

    }

    public void Password(String password, String confirm_password) {
        Hooks.driver.findElement(By.id("Password")).sendKeys(password);
        Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys(confirm_password);
    }

    public WebElement user_clicks_on_register(){

        return Hooks.driver.findElement(By.name("register-button"));
    }

    public WebElement sucess_Alert(){
        return Hooks.driver.findElement(By.className("result"));
    }
}
