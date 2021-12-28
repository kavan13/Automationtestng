package com.automation.pages;

import com.automation.customlisteners.CustomListeners;
import com.automation.utility.Utility;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.ScreenCapture;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OurStorePage extends Utility {
    public OurStorePage() {                                      //created a constructor for PageFactorySetUp
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Our stores')]")
    WebElement ourstore;
    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement okButton;
    @FindBy(xpath = "//div[@id='map']")
    WebElement map;
    @FindBy(xpath = "//button[@title='Zoom out']")
    WebElement zoomOut;

    public void clickOnOurStore() {
        clickOnElement(ourstore);
        CustomListeners.test.log(Status.PASS,"Click on OurStore ");
    }

    public void clickokpopup() {
        clickOnElement(okButton);
        CustomListeners.test.log(Status.PASS,"Click popup ");
    }



    public void drag() {

        new Actions(driver).moveToElement(map, 0, 0).clickAndHold().moveByOffset(300, 0).release().build().perform();
        clickOnElement(zoomOut);

    }

    public void zoom1() {
        clickOnElement(zoomOut);
        CustomListeners.test.log(Status.PASS,"Click on zoomOut ");
    }



}