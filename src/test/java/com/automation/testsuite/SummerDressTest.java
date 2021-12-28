package com.automation.testsuite;

import com.automation.customlisteners.CustomListeners;
import com.automation.pages.HomePage;
import com.automation.pages.SummerDressDisplay;
import com.automation.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class SummerDressTest extends TestBase {
    HomePage homePage;
    SummerDressDisplay summerDressDisplay;
    @BeforeMethod(alwaysRun = true)
    public void inIt1() {
        homePage = new HomePage();
        summerDressDisplay= new SummerDressDisplay();
    }
 @Test
    public void verifySummerDressDisplay(){
         summerDressDisplay.setMouseHoverToWomen();
         summerDressDisplay.clickOnSummerDress();
         summerDressDisplay.verifyUserOnSummerDressPage();
 }
}
