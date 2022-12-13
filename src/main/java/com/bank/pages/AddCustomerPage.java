package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCode;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement addCustomer;

    public void sendTextToFirstName(String first) {
        Reporter.log("sendTextToFirstName" + firstName.toString());
        sendTextToElement(firstName, first);
    }

    public void sendTextToLastName(String last) {
        Reporter.log("sendTextToLastName" + lastName.toString());
        sendTextToElement(lastName, last);
    }

    public void sendTextToPostCode(String code) {
        Reporter.log("sendTextToPostCode" + postCode.toString());
        sendTextToElement(postCode, code);
    }

    public void clickOnAddCustomer() {
        clickOnElement(addCustomer);
        driver.switchTo().alert();   //creating alert Oblect referance and switch to alert
        String text = driver.switchTo().alert().getText();
        System.out.println(text);
        driver.switchTo().alert().accept();

    }

}
