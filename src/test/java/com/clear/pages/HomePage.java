package com.clear.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends ClearMainPage {
    int category = getRandomInt(1,3);
    int typeOfProduct = getRandomInt(1,4);
    String LOCATOR_MENU_CATEGORY = "/html[1]/body[1]/div[3]/header[1]/div[1]/div[1]/ul[1]/li["+ category +"]/a[1]";
    String LOCATOR_MENU_TYPE = "//header/div[1]/div[1]/ul[1]/li["+ category +"]/ul[1]/li["+ typeOfProduct +"]/a[1]";

    public HomePage(WebDriver driver) {
        super(driver);
    }


    @Step("Is main page is open")
    public void IsMainPageLoad(){
        isPageload(10,"Page isnt load for 10 sec");
    }
    @Step("Cleaning page")
    public void CleanHomePage(){
        IsMailpopupVisible();
        ClickOnMailPop();
        IsPoliceVisible();
        ClickOnPolice();
    }

    @Step("Is mail pop-up visible")
    private void IsMailpopupVisible() {isDisplayed(By.xpath(Locator.LOCATOR_HOME_MAIL), 20, "Mail pop-up Not visible");}

    @Step("Click on X")
    private void ClickOnMailPop(){ clickOnElement(By.xpath(Locator.LOCATOR_HOME_MAIL),5,"not clicked" );}

    @Step("Is Police visible")
    private void IsPoliceVisible(){ isDisplayed(By.xpath(Locator.LOCATOR_HOME_POLICE),10, "not visible");}

    @Step("Click on police")
    private void ClickOnPolice(){ getElement(By.xpath(Locator.LOCATOR_HOME_POLICE),5,"Not find").click();}

    @Step("Show cart")
    public void ShowCart() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getElement(By.xpath(Locator.LOCATOR_HOME_CART),10,"Not opened cart").click();}

    @Step("Is search is visible")
    public void IsSearchVisible(){isDisplayed(By.xpath(Locator.LOCATOR_SEARCH_HOME),15, "Search field doesn`t visible" ); }

    @Step("Click on search field")
    public void ClickOnSearch(){ clickOnElement(By.xpath(Locator.LOCATOR_SEARCH_HOME),5,"not clicked" );}

    @Step("Is login button visible")
    public void IsMenuButtonVisible() { isDisplayed(By.xpath(Locator.LOCATOR_HOME_MENU),10,"Burger menu button is not visible");}

    @Step("Open Burger menu")
    public void ClickOnBurgerMenu () { clickOnElement(By.xpath(Locator.LOCATOR_HOME_MENU),10,"Burger menu button not clicked");}

    @Step("is category visible")
    public void IsCategoryVisible(){ isDisplayed(By.xpath(LOCATOR_MENU_CATEGORY),10, "Not visible");}

    @Step("Open category")
    public void ClickOnCategory () {
        moveTo(By.xpath(LOCATOR_MENU_CATEGORY),10,"Not moved to category");
        clickOnElement(By.xpath(LOCATOR_MENU_TYPE),10,"Type of product not clicked");
    }

}
