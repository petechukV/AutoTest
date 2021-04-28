package ua.net.perspective.dev.bbook.page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ua.net.perspective.dev.bbook.pages.BbookPages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HomePage extends BbookPages {

    public HomePage(WebDriver driver) {super(driver);}

    @Step("is page load")
    public void IsMainPageLoad(){ isPageload(10,"page not loaded before 10 sec");System.out.println(Locators.LOCATOR_PRICE_TEST);}

    @Step("use search")
    public void UseSearch(String text){
        IsSearchVisible();
        waitingSomeTime(3000);
        getElement(By.xpath(Locators.LOCATOR_HOME_SEARCH),timeForWaiting,"not get search").sendKeys(text);
        SubmitSearchForm();
    }

    @Step("is search field displayed")
    private void IsSearchVisible(){ isDisplayed(By.xpath(Locators.LOCATOR_HOME_SEARCH),timeForWaiting,"search field not visible");}

    @Step("submit search form")
    private void SubmitSearchForm(){getElement(By.xpath(Locators.LOCATOR_HOME_SEARCH),timeForWaiting,"not get search").submit();}

    @Step("is result contain")
    public void IsResultContain(String result){ isTextContains(By.xpath(Locators.LOCATOR_SEARCH_RESULT),result,timeForWaiting,"Result not contain text");}

    @Step("click on home login button")
    public void ClickOnLoginHome(){
        IsLoginHomeVisible();
        waitingSomeTime(5000);
        getElement(By.xpath(Locators.LOCATOR_HOME_LOGIN),timeForWaiting,"not clicked home login").click();
    }

    @Step("Is login button visible")
    private void IsLoginHomeVisible(){isDisplayed(By.xpath(Locators.LOCATOR_HOME_LOGIN),timeForWaiting,"home login not visible");}

    @Step("click on book catalog")
    public void ClickOnBookCatalog(){
        IsCatalogBookVisible();
        waitingSomeTime(1000);
        clickOnElement(By.xpath(Locators.LOCATOR_HOME_BOOK),timeForWaiting,"not clicked  on catalog");
    }

    @Step("is catalog visible")
    private void IsCatalogBookVisible(){isDisplayed(By.xpath(Locators.LOCATOR_HOME_BOOK),timeForWaiting,"not visible catalog");}

    @Step("Http code request")
    public int getResponseCode() throws IOException {
        URL url = new URL(this.driver.getCurrentUrl());
        HttpURLConnection huc = (HttpURLConnection)url.openConnection();
        huc.setRequestMethod("GET");
        huc.connect();
        return huc.getResponseCode();
    }
}
