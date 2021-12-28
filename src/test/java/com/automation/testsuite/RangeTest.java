package com.automation.testsuite;

import com.automation.customlisteners.CustomListeners;
import com.automation.pages.HomePage;
import com.automation.pages.RangePage;
import com.automation.pages.SummerDressDisplay;
import com.automation.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class RangeTest extends TestBase {
    HomePage homePage;
    SummerDressDisplay summerDressDisplay;
    RangePage rangePage;
    @BeforeMethod(alwaysRun = true)
    public void inIt4() {
        homePage = new HomePage();
        summerDressDisplay= new SummerDressDisplay();
        rangePage=new RangePage();
    }
    @Test
    public void verifyRangePriceDisplay() throws InterruptedException {
        summerDressDisplay.setMouseHoverToWomen();
        summerDressDisplay.clickOnSummerDress();
        Thread.sleep(1000);
        rangePage.selectSliderPriceRange();
       Assert.assertEquals("$16.00 - $20.00", rangePage.verifyPriceRange());

    }
}
