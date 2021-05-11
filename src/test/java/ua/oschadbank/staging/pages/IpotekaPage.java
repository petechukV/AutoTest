package ua.oschadbank.staging.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IpotekaPage extends OschadPage{
    public IpotekaPage(WebDriver driver) { super(driver);}

    Integer fullSuma = getRandomInt(3000000,12000000);

    @Step("is page load")
    public void IsIpotekaPageLoad(){ isPageload(10,"page not loaded before 10 sec");}

    @Step("fill calculate form")
    public void FillIpotekaCalculate(){
        DoScrole(2000);
        IsCalculatorVisible();
        moveTo(By.xpath(Locators.LOCATOR_IPOTEKA_CALCULATE),timeForWaiting,"calculate side");
        getElement(By.xpath(Locators.LOCATOR_IPOTEKA_FULLSUM),timeForWaiting,"full suma").sendKeys(fullSuma.toString());
    }



    @Step("is calculator visible")
    private void IsCalculatorVisible(){
        isDisplayed(By.xpath(Locators.LOCATOR_IPOTEKA_FULLSUM),timeForWaiting,"full suma");
        isDisplayed(By.xpath(Locators.LOCATOR_IPOTEKS_FIRSTPAY),timeForWaiting,"first pay");
        isDisplayed(By.xpath(Locators.LOCATOR_IPOTEKA_TIME),timeForWaiting,"time credit");
        isDisplayed(By.xpath(Locators.LOCATOR_IPOTEKA_ADITIONAL_NOTARY),timeForWaiting,"aditional notary");
        isDisplayed(By.xpath(Locators.LOCATOR_IPOTEKA_ADITIONAL_APPRAICER),timeForWaiting,"aditional appraicer");
        isDisplayed(By.xpath(Locators.LOCATOR_IPOTEKA_ADITIONAL_STRAH),timeForWaiting,"adititonal strah");
        isDisplayed(By.xpath(Locators.LOCATOR_IPOTEKA_ADITIONAL_STRLIVE),timeForWaiting,"aditional strlive");
        isDisplayed(By.xpath(Locators.LOCATOR_IPOTEKA_ADITIONAL_PENSION),timeForWaiting,"aditional pension");
        isDisplayed(By.xpath(Locators.LOCATOR_IPOTEKA_ADITIONAL_ADMIN),timeForWaiting,"aditional admin");
    }
}
