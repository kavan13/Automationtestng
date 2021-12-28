package com.automation.pages;

import com.automation.customlisteners.CustomListeners;
import com.automation.utility.Utility;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class CreateAccountPage extends Utility {
    public CreateAccountPage() {PageFactory.initElements(driver, this);}

    @FindBy(css = "a[title='Log in to your customer account']")
    WebElement signIn;
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailfornewaccount;

    @CacheLookup
    @FindBy(xpath = "//p[contains(text(),'Please enter your email address to create an accou')]")
    WebElement createAccountPage;
    @FindBy(css = "button[id='SubmitCreate'] span")
    WebElement createAccounTAB;

    @FindBy(css = "#customer_firstname")
    WebElement firstName;

    @FindBy(css = "#customer_lastname")
    WebElement lastName;

    @FindBy(css = "#passwd")
    WebElement password;

    @FindBy(css = "#address1")
    WebElement address;

    @FindBy(css = "#city")
    WebElement city;

    @FindBy(css = "#id_state")
    WebElement state;

    @FindBy(css = "#postcode")
    WebElement postcode;

    @FindBy(css = "#id_country")
    WebElement country;

    @FindBy(css = "#phone_mobile")
    WebElement phoneNumber;

    @FindBy(css = "button[id='submitAccount'] span")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='My account']")
    WebElement headingOfMyAccount;

    @CacheLookup
    @FindBy(xpath = "//div[@class='header_user_info']//a//span")
    WebElement myAccountName;


    public void clickOnSignIn(){
        clickOnElement(signIn);
        CustomListeners.test.log(Status.PASS,"Click on signIn ");
    }
    public void clickOnCreateAnAccountButton() {
        clickOnElement(createAccounTAB);
        CustomListeners.test.log(Status.PASS,"Click on Create New account ");
    }

    public void enterEmailfornewacountcreation(String email) {
        sendTextToElement(emailfornewaccount,email);
    }
    public void enterYourFirstName(String name) {
        sendTextToElement(firstName, name);
        CustomListeners.test.log(Status.PASS,"Click on first name ");
    }

    public void enterYourLastName(String surname) {
        sendTextToElement(lastName, surname);
        CustomListeners.test.log(Status.PASS,"Click on lastname ");
    }

    public void enterYourPassword(String pass) {
        sendTextToElement(password, pass);
        CustomListeners.test.log(Status.PASS,"Click on password ");
    }

    public void enterYourAddress(String add) {
        sendTextToElement(address, add);
        CustomListeners.test.log(Status.PASS,"Click on Address ");
    }

    public void enterYourCity(String cityy) {
        sendTextToElement(city, cityy);
        CustomListeners.test.log(Status.PASS,"Click on city ");
    }

    public void selectYourState(String st) {
        selectByValueFromDropDown(state, st);
        CustomListeners.test.log(Status.PASS,"select state ");
    }

    public void enterYourPhoneNumber(String phone) {
        sendTextToElement(phoneNumber, phone);
        CustomListeners.test.log(Status.PASS,"Click on phone number ");
    }

    public void enterYourPostalCode(String postal) {
        sendTextToElement(postcode, postal);
        CustomListeners.test.log(Status.PASS,"Enter Post code ");
    }

    public void selectYourCountry(String countryy) {
        selectByValueFromDropDown(country, countryy);
        CustomListeners.test.log(Status.PASS,"Select country ");
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
        CustomListeners.test.log(Status.PASS,"Click on Register Button ");
    }




    public void verifyAccountPage(){
        String expectedmsg = "Please enter your email address to create an account.";
        String actualmsg = getTextFromElement(createAccountPage);
        Assert.assertEquals("Page not found",expectedmsg,actualmsg);
    }





    public void myAccountName(){
        String expAccountName = "Reena Pat";
        String actualAccountName = getTextFromElement(myAccountName);
        Assert.assertEquals(expAccountName,actualAccountName);

    }
}
