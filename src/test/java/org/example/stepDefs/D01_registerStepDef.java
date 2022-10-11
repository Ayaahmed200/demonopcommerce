package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    public static WebDriver driver = null;
    P01_register register = new P01_register();



    @Given("user go to register page")
    public void goRegisterPage() {

        register.registerlink().click();
    }

    //
    @When("user select gender type")
    public void user_select_gender_type() {
        register.user_select_gender_type().click();

    }

    @And("^user enter first name \"(.*)\" and last name \"(.*)\"$")
    public void user_enter_FL_and_LN(String firstname, String last_name) {
        register.user_enter_FL_and_LN(firstname, last_name);

    }

//    @And("^user enter date of birth \"(.*)\"\"(.*)\"\"(.*)\"$")
//    public void user_enter_date_of_birth(String day, String month, String year) {
//        register.user_enter_date_of_birth(day, month, year);
//    }
    @And("user enter date of birth")
    public void enter_date_of_birth() {
        Select select=new Select(register.select_day());
        select.selectByIndex(10);

        select=new Select(register.select_month());
        select.selectByValue("10");

        select=new Select(register.select_year());
        select.selectByVisibleText("1993");
    }
    @And("^user enter email \"(.*)\" field")
    public void user_enter_email(String email) {
        register.enter_email(email);
    }

    @And("^user fills Password fields \"(.*)\" \"(.*)\"")
    public void Password(String password,String confirm_password) {
        register.Password(password,confirm_password);

    }
    @Then("user clicks on register button")
    public void user_clicks_on_register(){
register.user_clicks_on_register().click();
    }
    @And ("success message is displayed")
    public void success_message()
    {
        SoftAssert soft= new SoftAssert();

        String expected_result = "Your registration completed";
        String actual_result = register.sucess_Alert().getText();
        System.out.println(actual_result);
        soft.assertTrue(actual_result.contains(expected_result),"wrong alert message");

        String expected_color = "rgba(76, 177, 124, 1)";
        String actual_color=register.sucess_Alert().getCssValue("color");
        soft.assertTrue(actual_color.contains(expected_color),"wrong color");
        System.out.println(actual_color);
        soft.assertAll();




    }
//
}
