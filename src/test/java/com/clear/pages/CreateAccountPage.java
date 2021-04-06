package com.clear.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends ClearMainPage{
    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

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

}
