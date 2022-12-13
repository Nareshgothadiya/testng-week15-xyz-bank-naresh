package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomersPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement mouseHoverCustomer;
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement selectYourName;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement yourName;

    public void mouseHoverOnYourName() {
        Reporter.log("mouseHoverOnYourName" + mouseHoverCustomer.toString());
        mouseHoverToElementAndClick(mouseHoverCustomer);
    }

    public void clickOnSelectYourName(String text) {
        Reporter.log("clickOnSelectYourName" + selectYourName.toString());
        selectByVisibleTextFromDropDown(selectYourName, text);
    }

    public void clickOnLoginButton() {
        Reporter.log("clickOnLoginButton" + loginButton.toString());
        clickOnElement(loginButton);
    }

    //****************************
    public String verifyYourNameText() {
        Reporter.log("verifyYourNameText" + yourName.toString());
        return getTextFromElement(yourName);
    }
}
