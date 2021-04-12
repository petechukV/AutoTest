package com.clear.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CatalogPage extends ClearMainPage {
    int sortOption = getRandomInt(1,6);
    String LOCATOR_CATEGORY_SORT_OPTION = "//ul[@class=\"list\"]/li["+ sortOption +"]";

    public CatalogPage(WebDriver driver) {
        super(driver);
    }

    @Step("Is page is open")
    public void IsCategotyPageLoad(){
        isPageload(10,"Page isnt load for 10 sec");
    }

    @Step("Is sort visible")
    public void IsSortVisible(){ isDisplayed(By.xpath(Locator.LOCATOR_CATEGORY_SORT),10,"Sort not vivible");}

    @Step("Click on sort")
    public void ClickOnSort() { getElement(By.xpath(Locator.LOCATOR_CATEGORY_SORT),10,"Sort doesnt click").click();}

    @Step("use sort")
    public void UseSortOption(){ getElement(By.xpath(LOCATOR_CATEGORY_SORT_OPTION),10,"Sort not used").click();}

    @Step("is product visible")
    public void IsProductVisible(){ isDisplayed(By.xpath(Locator.LOCATOR_CATEGORY_PRODUCT),10,"not displayed"); }

}
