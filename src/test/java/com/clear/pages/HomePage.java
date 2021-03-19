package com.clear.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends ClearMainPage {
    public HomePage(WebDriver driver) {
        super(driver);
    }


    @Step("Is main page is open")
    public void IsMainPageLoad(){
        isPageload(10,"Page isnt load for 10 sec");
    }

    @Step("Is mail pop-up visible")
    public void IsMailpopupVisible() {isDisplayed(By.xpath(Locator.LOCATOR_HOME_MAIL), 20, "Mail pop-up Not visible");}

    @Step("Click on X")
    public void ClickOnMailPop(){ clickOnElement(By.xpath(Locator.LOCATOR_HOME_MAIL),5,"not clicked" );}

    @Step("Is search is visible")
    public void IsSearchVisible(){isDisplayed(By.xpath(Locator.LOCATOR_SEARCH_HOME),15, "Search field doesn`t visible" ); }

    @Step("Click on search field")
    public void ClickOnSearch(){ clickOnElement(By.xpath(Locator.LOCATOR_SEARCH_HOME),5,"not clicked" );}

}
