package ua.oschadbank.staging.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IpotekaPage extends OschadPage{
    public IpotekaPage(WebDriver driver) { super(driver);}

    String fullSuma = String.valueOf(getRandomInt(300000,1200000));
    String trayPeriod = String.valueOf(getRandomInt(30,90));
    String timeCredit = String.valueOf(getRandomInt(12,240));


    @Step("is page load")
    public void IsIpotekaPageLoad(){ isPageload(10,"page not loaded before 10 sec");}

    @Step("fill calculate form")
    public void FillIpotekaCalculate(){
        DoScrole(1700);
        IsCalculatorVisible();
        moveTo(By.xpath(Locators.LOCATOR_IPOTEKA_CALCULATE),timeForWaiting,"calculate side");

        clickOnElement(By.xpath(Locators.LOCATOR_IPOTEKA_FULLSUM),timeForWaiting,"full suma");
        getElement(By.xpath(Locators.LOCATOR_IPOTEKA_FULLSUM),timeForWaiting,"full suma").sendKeys(fullSuma);
        waitingSomeTime(100);
        clickOnElement(By.xpath(Locators.LOCATOR_IPOTEKS_FIRSTPAY),timeForWaiting,"period of cred");
        getElement(By.xpath(Locators.LOCATOR_IPOTEKS_FIRSTPAY),timeForWaiting,"period of cred").sendKeys(trayPeriod);
        waitingSomeTime(100);
        clickOnElement(By.xpath(Locators.LOCATOR_IPOTEKA_TIME),timeForWaiting,"time of credit");
        getElement(By.xpath(Locators.LOCATOR_IPOTEKA_TIME),timeForWaiting,"time of credit").sendKeys(timeCredit);

        clickOnElement(By.xpath(Locators.LOCATOR_IPOTEKA_ADITIONAL_NOTARY),timeForWaiting,"notary");
        waitingSomeTime(100);
        clickOnElement(By.xpath(Locators.LOCATOR_IPOTEKA_ADITIONAL_APPRAICER),timeForWaiting,"notary");
        waitingSomeTime(100);
        clickOnElement(By.xpath(Locators.LOCATOR_IPOTEKA_ADITIONAL_STRAH),timeForWaiting,"notary");
        waitingSomeTime(100);
        clickOnElement(By.xpath(Locators.LOCATOR_IPOTEKA_ADITIONAL_STRLIVE),timeForWaiting,"notary");
        waitingSomeTime(100);
        clickOnElement(By.xpath(Locators.LOCATOR_IPOTEKA_ADITIONAL_PENSION),timeForWaiting,"notary");
        waitingSomeTime(100);
        clickOnElement(By.xpath(Locators.LOCATOR_IPOTEKA_ADITIONAL_ADMIN),timeForWaiting,"notary");

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
