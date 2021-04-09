package com.clear.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends ClearMainPage{
    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }
    String text = Long.toHexString(Double.doubleToLongBits(Math.random()));

    @Step("Is login page is open")
    public void IsCreatePageLoad(){
        isPageload(10,"Page isnt load for 10 sec");
    }

    @Step("Click on button")
    public void ClickOnSingUp(){
        IsCreateButtonVisible();
        clickOnElement(By.xpath(Locator.LOCATOR_CREATE_BUTTON),10,"not clicked");
    }

    @Step("Is Sing up button visible")
    private void IsCreateButtonVisible(){ isDisplayed(By.xpath(Locator.LOCATOR_CREATE_BUTTON),10,"Not visible sing up");}

    @Step("Fill create form")
    public void FillCreateForm(){
        IsAllComponentVisible();
        getElement(By.xpath(Locator.LOCATOR_CREATE_FIRSTNAME),10,"not selected name").sendKeys(text);
        getElement(By.xpath(Locator.LOCATOR_CREATE_LASTNAME),10,"not selected last name").sendKeys(text);
        getElement(By.xpath(Locator.LOCATOR_CREATE_MAIL),10,"not selected").sendKeys(text+"@gmail.com");
        getElement(By.xpath(Locator.LOCATOR_CREATE_PASS),10,"not selected").sendKeys("A"+text);
        getElement(By.xpath(Locator.LOCATOR_CREATE_CONFPASS),10,"not selected").sendKeys("A"+text);
        getElement(By.xpath(Locator.LOCATOR_CREATE_POLICE),10,"Not used police").submit();
        clickOnElement(By.xpath(Locator.LOCATOR_CREATE_CBUTTON),10,"Not cliked");
    }


    @Step("Is all component form visible")
    private void IsAllComponentVisible(){
        isDisplayed(By.xpath(Locator.LOCATOR_CREATE_FIRSTNAME),10,"Not visible first name");
        isDisplayed(By.xpath(Locator.LOCATOR_CREATE_LASTNAME),10,"Not visible lastname");
        isDisplayed(By.xpath(Locator.LOCATOR_CREATE_MAIL),10,"Not visible mail");
        isDisplayed(By.xpath(Locator.LOCATOR_CREATE_PASS),10,"Not visible password");
        isDisplayed(By.xpath(Locator.LOCATOR_CREATE_CONFPASS),10,"Not visible confirm password");
        isDisplayed(By.xpath(Locator.LOCATOR_CREATE_CBUTTON),10,"Not visible create button");
    }

}
