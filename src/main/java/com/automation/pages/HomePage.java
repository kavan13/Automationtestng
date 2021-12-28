package com.automation.pages;

import com.automation.customlisteners.CustomListeners;
import com.automation.utility.Utility;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    public HomePage() {                                      //created a constructor for PageFactorySetUp
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@title='Women']")
    WebElement womenbutton;

    @FindBy(xpath = "//a[normalize-space()='Faded Short Sleeve T-shirts']")
    WebElement fadedShort;
    @FindBy(css = "button[name='Submit'] span")
    WebElement addToCartButton;
    @FindBy(xpath = "//span[normalize-space()='Proceed to checkout']")
    WebElement checkout;
    @FindBy(xpath = "//i[@class='icon-trash']")
    WebElement delete;
    @FindBy(xpath = "//p[@class='alert alert-warning']")
    WebElement verifyText;


    public void clickOnWomen() {
        clickOnElement(womenbutton);
        CustomListeners.test.log(Status.PASS,"Click on women tab ");
    }

    public void clickOnFadedShort() {
        clickOnElement(fadedShort);
        CustomListeners.test.log(Status.PASS,"Click on fadedShort ");
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
        CustomListeners.test.log(Status.PASS,"Click on add to cart ");
    }

    public void clickOnCheckout() {
        clickOnElement(checkout);
        CustomListeners.test.log(Status.PASS,"Click on checkout ");
    }

    public void clickOnDelete() {
        clickOnElement(delete);
        CustomListeners.test.log(Status.PASS,"Click on Delete ");
    }

    public String getTextShoppingcartEmpty() {
        return getTextFromElement(verifyText);

    }


}
