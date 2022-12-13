package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[text()='Bank Manager Login']")
    WebElement bankManagerLogin;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLogin;

    public void clickOnBankManagerLoginTab() {
        Reporter.log("clickOnBankManagerLoginTab" + bankManagerLogin.toString());
        clickOnElement(bankManagerLogin);
    }

    public void clickOnCustomerLoginTab() {
        Reporter.log("clickOnCustomerLoginTab" + customerLogin.toString());
        clickOnElement(customerLogin);
    }
}
