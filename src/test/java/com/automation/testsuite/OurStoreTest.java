package com.automation.testsuite;

import com.automation.customlisteners.CustomListeners;
import com.automation.pages.HomePage;
import com.automation.pages.OurStorePage;
import com.automation.testbase.TestBase;
import com.automation.utility.Utility;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class OurStoreTest extends TestBase {
    OurStorePage ourStorePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        ourStorePage = new OurStorePage();
    }

    @Test
    public void verifyStoreMap() {
        ourStorePage.clickOnOurStore();
        ourStorePage.clickokpopup();
        ourStorePage.drag();
        ourStorePage.zoom1();
        Utility.takeScreenShot();
    }
}
