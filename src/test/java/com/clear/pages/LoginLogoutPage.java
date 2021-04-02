package com.clear.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginLogoutPage extends ClearMainPage{
    public LoginLogoutPage(WebDriver driver) {
        super(driver);
    }

    @Step("Is login page is open")
    public void IsLoginPageLoad(){
        isPageload(10,"Page isnt load for 10 sec");
    }

    @Step("Log in form")
    public void FillLogInForm(String log, String pas){
        IsFormVisible();
        getElement(By.xpath(Locator.LOCATOR_LOGIN_HOME_LOG),10,"Login does not fill").sendKeys(log);
        getElement(By.xpath(Locator.LOCATOR_LOGIN_HOME_PAS),10,"Password does not fill").sendKeys(pas);
        clickOnElement(By.xpath(Locator.LOCATOR_LOGIN_HOME_BUTTON),10,"Button does not click");
    }

    @Step("Is form visible")
    private void IsFormVisible(){
        waitingSomeTime(3000);
        isDisplayed(By.xpath(Locator.LOCATOR_LOGIN_HOME_LOG),10,"login not visible");
        isDisplayed(By.xpath(Locator.LOCATOR_LOGIN_HOME_PAS),10,"Pasword not visible");
        isDisplayed(By.xpath(Locator.LOCATOR_LOGIN_HOME_BUTTON),10,"button not visible");
    }

    @Step("logout")
    public void ClickOnLogOut(){ clickOnElement(By.xpath(Locator.LOCATOR_LOGOUT_SINGUP),10,"not cliked"); }
}
