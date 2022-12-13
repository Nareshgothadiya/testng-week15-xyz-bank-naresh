package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[@ng-show='logout']")
    WebElement logoutText;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logout;
    @CacheLookup
    @FindBy(xpath = "//button[@ng-class='btnClass2']")
    WebElement deposit;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement depositAmount;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement depositTab;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement depositVerify;
    @CacheLookup
    @FindBy(xpath = "(//button[contains(@class,'btn btn-lg')])[3]")
    WebElement withdrawl;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement withdrawlAmount;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement withdrawlTab;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement withdrawlVerify;

    public String verifyLogoutTexte() {
        Reporter.log("verifyLogoutTexte" + logoutText.toString());
        return getTextFromElement(logoutText);
    }

    public void clickOnLogout() {
        Reporter.log("clickOnLogout" + logout.toString());
        clickOnElement(logout);
    }

    //*****************************
    public void clickOnDeposit() {
        Reporter.log("clickOnDeposit" + deposit.toString());
        clickOnElement(deposit);
    }

    public void sendDepositAmountValue(String amount) {
        sendTextToElement(depositAmount, amount);
    }

    public void clickOnDepositTab() {
        Reporter.log("clickOnDepositTab" + depositTab.toString());
        clickOnElement(depositTab);
    }

    public String verifyDepositSuccessful() {
        Reporter.log("verifyDepositSuccessful" + depositVerify.toString());
        return getTextFromElement(depositVerify);
    }

    //****************************************************
    public void clickOnWithdrawl() {
        Reporter.log("clickOnWithdrawl" + withdrawl.toString());
        clickOnElement(withdrawl);
    }

    public void sendWithdrawlAmountValue(String amount) {
        Reporter.log("sendWithdrawlAmountValue" + withdrawlAmount.toString());
        sendTextToElement(withdrawlAmount, amount);
    }

    public void clickOnWitdrawlTab() {
        Reporter.log("clickOnWitdrawlTab" + withdrawlTab.toString());
        clickOnElement(withdrawlTab);
    }

    public String verifyWithdrawlSuccessful() {
        Reporter.log("verifyWithdrawlSuccessful" + withdrawlVerify.toString());
        return getTextFromElement(withdrawlVerify);
    }
}
