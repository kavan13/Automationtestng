package com.automation.pages;

import com.automation.customlisteners.CustomListeners;
import com.automation.utility.Utility;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SummerDressDisplay extends Utility {
    public SummerDressDisplay() {PageFactory.initElements(driver, this);}

    @CacheLookup
    @FindBy(xpath = "//a[@title='Women']")
    WebElement mouseHoverToWomen;

    @CacheLookup
    @FindBy(linkText = "Summer Dresses")
    WebElement summerDress;

    @CacheLookup
    @FindBy(xpath = "//div[@class='rte']")
    WebElement summerDressPage;


    public void setMouseHoverToWomen(){
        mouseHoverToElement(mouseHoverToWomen);
     //   CustomListeners.test.log(Status.PASS,"Click on women tab ");

    }

    public void clickOnSummerDress(){
        clickOnElement(summerDress);
       // CustomListeners.test.log(Status.PASS,"Click on summerdress tab ");
    }

    public void verifyUserOnSummerDressPage(){
        String expectedmessage = getTextFromElement(summerDressPage);
        String actualmessage ="Short dress, long dress, silk dress, printed dress, you will find the perfect dress for summer.";
        Assert.assertEquals(expectedmessage,actualmessage,"Wrong Page");
    }


}
