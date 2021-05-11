package ua.oschadbank.staging.pages;

import org.openqa.selenium.WebDriver;

public class Locators extends OschadPage{
    public Locators(WebDriver driver) {super(driver);}

    static String LOCATOR_CREDIT = "//a[contains(text(),'Кредити')]";
    static String LOCATOR_CREDIT_IPOTEKA = "//a[contains(text(),'Кредит під іпотеку')]";

    static String LOCATOR_IPOTEKA_CALCULATE = "//div[@class='calculations_side']";
    static String LOCATOR_IPOTEKA_FULLSUM = "//input[@id='fullSum']";
    static String LOCATOR_IPOTEKS_FIRSTPAY = "//input[@id='firstPayProc']";
    static String LOCATOR_IPOTEKA_TIME = "//input[@id='timeCount']";
    static String LOCATOR_IPOTEKA_ADITIONAL_NOTARY = "//input[@id='services_notary']";
    static String LOCATOR_IPOTEKA_ADITIONAL_APPRAICER = "//input[@id='services_appraiser']";
    static String LOCATOR_IPOTEKA_ADITIONAL_STRAH = "//input[@id='services_strah_subject']";
    static String LOCATOR_IPOTEKA_ADITIONAL_STRLIVE = "//input[@id='services_strah_lives']";
    static String LOCATOR_IPOTEKA_ADITIONAL_PENSION = "//input[@id='services_pension_insurance']";
    static String LOCATOR_IPOTEKA_ADITIONAL_ADMIN = "//input[@id='services_admin_commision']";

}
