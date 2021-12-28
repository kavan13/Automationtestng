package com.automation.testsuite;

import com.automation.customlisteners.CustomListeners;
import com.automation.pages.HomePage;
import com.automation.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class DeleteTest extends TestBase {
    HomePage homePage;
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
    }

    @Test
    public void verifyDeleteCart(){
        homePage.clickOnWomen();
      homePage.clickOnFadedShort();
      homePage.clickOnAddToCartButton();
      homePage.clickOnCheckout();
      homePage.clickOnDelete();
      homePage.getTextShoppingcartEmpty();

    }
    }
