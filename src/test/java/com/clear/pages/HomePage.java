package com.clear.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends ClearMainPage {
    int category = getRandomInt(1,3);
    int typeOfProduct = getRandomInt(1,4);
    String LOCATOR_MENU_CATEGORY = "/html[1]/body[1]/div[3]/header[1]/div[1]/div[1]/ul[1]/li["+ category +"]/a[1]";
    String LOCATOR_MENU_TYPE = "//header/div[1]/div[1]/ul[1]/li["+ category +"]/ul[1]/li["+ typeOfProduct +"]/a[1]";

    //header/div[1]/div[1]/ul[1]/li[1*]/ul[1]/li[1*]/a[1]

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

    @Step("Is login button visible")
    public void IsMenuButtonVisible() { isDisplayed(By.xpath(Locator.LOCATOR_HOME_MENU),10,"Burger menu button is not visible");}

    @Step("Open Burger menu")
    public void ClickOnBurgerMenu () { clickOnElement(By.xpath(Locator.LOCATOR_HOME_MENU),10,"Burger menu button not clicked");}

    @Step("Open category")
    public void ClickOnCategory () {
        moveTo(By.xpath(LOCATOR_MENU_CATEGORY),10,"Not moved to category");
        clickOnElement(By.xpath(LOCATOR_MENU_TYPE),10,"Type of product not clicked");
    }

}
