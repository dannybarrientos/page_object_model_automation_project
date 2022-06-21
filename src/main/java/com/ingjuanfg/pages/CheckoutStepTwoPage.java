package com.ingjuanfg.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class CheckoutStepTwoPage extends PageObject {

    @FindBy(id="finish")
    WebElementFacade buttonFinish;

    public void finishBuy(){
        buttonFinish.click();
    }
}
