package com.automation.pages;

import com.automation.utility.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RangePage extends Utility {

    public RangePage() {
        PageFactory.initElements(driver, this);}

    @FindBy(xpath= "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[9]/ul[1]/div[1]/div[1]/a[2]")////div[@id='layered_price_slider']//a[2]
    WebElement sliderRange;

    @FindBy(xpath = "//span[@id='layered_price_range']")
    WebElement priceText;

    public void selectSliderPriceRange(){
        System.out.println(sliderRange.getLocation());
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(sliderRange, -182, 0).perform();
        System.out.println(sliderRange.getLocation());
    }

    public String verifyPriceRange(){
        return getTextFromElement(priceText);
    }

}
