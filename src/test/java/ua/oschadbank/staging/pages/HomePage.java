package ua.oschadbank.staging.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends OschadPage {
    public HomePage(WebDriver driver) { super(driver);}

    @Step("is page load")
    public void IsMainPageLoad(){ isPageload(10,"page not loaded before 10 sec");}

    @Step("go to ipoteka credit")
    public void GoToIpotekaCredit(){
        IsCreditVisible();
        moveTo(By.xpath(Locators.LOCATOR_CREDIT),timeForWaiting,"not show credit");
        IsIpotekaVisible();
        getElement(By.xpath(Locators.LOCATOR_CREDIT_IPOTEKA),timeForWaiting,"not clicked ipoteka").click();
    }

    @Step("is credit menu visible")
    private void IsCreditVisible(){ isDisplayed(By.xpath(Locators.LOCATOR_CREDIT),timeForWaiting,"credit menu not visible");}

    @Step("is ipoteka visible")
    private void IsIpotekaVisible(){ isDisplayed(By.xpath(Locators.LOCATOR_CREDIT_IPOTEKA),timeForWaiting,"ipoteka not visible");}
}
