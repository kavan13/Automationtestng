package com.automation.testsuite;

import com.automation.customlisteners.CustomListeners;
import com.automation.pages.CreateAccountPage;
import com.automation.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Random;
@Listeners(CustomListeners.class)
public class CreateAccountPageTest extends TestBase {
    CreateAccountPage createAccountPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt3(){
        createAccountPage =new CreateAccountPage();
    }
    @Test
    public void  verifyThatUserShouldCreateAccountSuccessfully(){
        createAccountPage.clickOnSignIn();
        Random randomNum = new Random();
        int randomGenerator = randomNum.nextInt(1000);
        createAccountPage.enterEmailfornewacountcreation("xyz"+randomGenerator+"@gnail.com");
        createAccountPage.clickOnCreateAnAccountButton();
        createAccountPage.enterYourFirstName("Kavan");
        createAccountPage.enterYourLastName("Patel");
        createAccountPage.enterYourPassword("abcd123#");
        createAccountPage.enterYourAddress("13");
        createAccountPage.enterYourCity("London");
        createAccountPage.selectYourState("3");
        createAccountPage.enterYourPostalCode("Ha8 7Lq");
        createAccountPage.selectYourCountry("21");
        createAccountPage.enterYourPhoneNumber("07453482366");
        createAccountPage.clickOnRegisterButton();

    }




}
