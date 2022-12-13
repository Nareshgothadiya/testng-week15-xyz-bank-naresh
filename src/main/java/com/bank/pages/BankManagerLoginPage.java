package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[@ng-class='btnClass1']")
    WebElement addCustomerTab;
    @CacheLookup
    @FindBy(xpath = "//button[@ng-class='btnClass2']")
    WebElement openAccountTab;

    public void clickOnAddCustomerTab() {
        Reporter.log("clickOnAddCustomerTab" + addCustomerTab.toString());
        clickOnElement(addCustomerTab);
    }

    public void clickOnOpenAccountTab() {
        Reporter.log("clickOnOpenAccountTab" + openAccountTab.toString());
        clickOnElement(openAccountTab);
    }
}
