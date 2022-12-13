package com.bank.testsuite;

import com.bank.customlisteners.CustomListeners;
import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class BankTest extends BaseTest {
    HomePage homePage;
    AddCustomerPage addCustomerPage;
    BankManagerLoginPage bankManagerLoginPage;
    AccountPage accountPage;
    CustomerLoginPage customerLoginPage;
    CustomersPage customersPage;
    OpenAccountPage openAccountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        addCustomerPage = new AddCustomerPage();
        bankManagerLoginPage = new BankManagerLoginPage();
        accountPage = new AccountPage();
        customerLoginPage = new CustomerLoginPage();
        customersPage = new CustomersPage();
        openAccountPage = new OpenAccountPage();

    }

    @Test(groups = {"sanity", "regression"})
    public void bankManagerShouldAddCustomerSuccessfully() {
        homePage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOnAddCustomerTab();
        addCustomerPage.sendTextToFirstName("Java");
        addCustomerPage.sendTextToLastName("Testing");
        addCustomerPage.sendTextToPostCode("365430");
        addCustomerPage.clickOnAddCustomer();

    }

    @Test(groups = {"sanity", "smoke"})
    public void bankManagerShouldOpenAccountSuccessfully() {
        homePage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOnOpenAccountTab();
        openAccountPage.mouseHoverOnCustomerName();
        openAccountPage.selectCustomerName("Harry Potter");
        openAccountPage.mouseHoverOnCurrancy();
        openAccountPage.selectCurrancyPound("Pound");
        openAccountPage.clickOnProcessButton();
    }

    @Test(groups = {"smoke", "regression"})
    public void customerShouldLoginAndLogoutSuceessfully() {
        homePage.clickOnCustomerLoginTab();
        customersPage.mouseHoverOnYourName();
        customersPage.clickOnSelectYourName("Harry Potter");
        customersPage.clickOnLoginButton();
        Assert.assertEquals(accountPage.verifyLogoutTexte(), "", "Logout Text verified");
        accountPage.clickOnLogout();
        Assert.assertEquals(customersPage.verifyYourNameText(), "Your Name :", "Logout Text verified");
    }

    @Test(groups = {"sanity", "regression"})
    public void customerShouldDepositMoneySuccessfully() {
        homePage.clickOnCustomerLoginTab();
        customersPage.mouseHoverOnYourName();
        customersPage.clickOnSelectYourName("Harry Potter");
        customersPage.clickOnLoginButton();
        accountPage.clickOnDeposit();
        accountPage.sendDepositAmountValue("5000");
        accountPage.clickOnDepositTab();
        Assert.assertEquals(accountPage.verifyDepositSuccessful(), "Deposit", "Deposit verified");
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void customerShouldWithdrawMoneySuccessfully() {
        homePage.clickOnCustomerLoginTab();
        customersPage.mouseHoverOnYourName();
        customersPage.clickOnSelectYourName("Harry Potter");
        customersPage.clickOnLoginButton();
        accountPage.clickOnWithdrawl();
        accountPage.sendWithdrawlAmountValue("1000");
        accountPage.clickOnWitdrawlTab();
        //Assert.assertEquals(accountPage.verifyWithdrawlSuccessful(), "Transaction Successful", "Withdrawl verified");


    }
}

