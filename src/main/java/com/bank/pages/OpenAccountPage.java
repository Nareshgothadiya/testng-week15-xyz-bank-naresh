package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement mouseHoverCustomer;
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement selectCustomerName;
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement mouseHoverCurrency;
    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement selectCurrancyByName;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Process']")
    WebElement processButton;

    public void mouseHoverOnCustomerName() {
        Reporter.log("mouseHoverOnCustomerName" + mouseHoverCustomer.toString());
        mouseHoverToElementAndClick(mouseHoverCustomer);
    }

    public void selectCustomerName(String text) {
        Reporter.log("selectCustomerName" + selectCustomerName.toString());
        selectByVisibleTextFromDropDown(selectCustomerName, text);
    }

    public void mouseHoverOnCurrancy() {
        Reporter.log("mouseHoverOnCurrancy" + mouseHoverCurrency.toString());
        mouseHoverToElementAndClick(mouseHoverCurrency);
    }

    public void selectCurrancyPound(String text) {
        Reporter.log("selectCurrancyPound(" + selectCurrancyByName.toString());
        selectByVisibleTextFromDropDown(selectCurrancyByName, text);
    }

    public void clickOnProcessButton() {
        clickOnElement(processButton);
        driver.switchTo().alert();
        String text = driver.switchTo().alert().getText();
        System.out.println(text);
        driver.switchTo().alert().accept();
    }
}
