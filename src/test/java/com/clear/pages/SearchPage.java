package com.clear.pages;

import io.qameta.allure.Step;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

public class SearchPage extends ClearMainPage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @Step("Is search imput vivsible")
    public void IsSearchImputVisible () {isDisplayed(By.xpath(Locator.LOCATOR_SEARCH_PAGE),5, "Search imput doesn`t visible" );}

    @Step("Send some text")
    public void SendText(String text) { getElement(By.xpath(Locator.LOCATOR_SEARCH_PAGE), 10, "not get").sendKeys(text);}

    @Step("Search product")
    public void ClickSearch () { getElement(By.xpath(Locator.LOCATOR_SEARCH_BUTTON), 10, "not get").submit();}

    @Step("Check results")
    public void IsSearchResultAre(String result) {
        IsResultDisplayed();
        IsSearchResultContainText(result);
    }

    @Step("result displayed")
    private void IsResultDisplayed() { isDisplayed(By.xpath(Locator.LOCATOR_SEARCH_RESULT),10, "Results is not dispalyed");}

    @Step("Search result contain")
    private void IsSearchResultContainText (String result) { isTextContains(By.xpath(Locator.LOCATOR_SEARCH_RESULT),result,10,"result not contain text");}


}
