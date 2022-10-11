package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    public WebElement user_goto_login_page() {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }

    public void enter_email_and_password(String type ,String email, String password) {
        Hooks.driver.findElement(By.id("Email")).sendKeys(email);
        Hooks.driver.findElement(By.id("Password")).sendKeys(password);
    }

    public WebElement user_press_on_login_button() {
        return Hooks.driver.findElement(By.xpath
                ("//button[@class=\"button-1 login-button\"]"));
    }

    public WebElement login_successfully() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/customer/info\"]"));
    }

    public WebElement failed_alert() {
        return Hooks.driver.findElement(By.className("message-error"));
    }
}
