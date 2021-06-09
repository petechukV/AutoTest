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
    static String LOCATOR_IPOTEKA_ADITIONAL_NOTARY = "//label[contains(text(),'Послуги нотаріуса')]";
    static String LOCATOR_IPOTEKA_ADITIONAL_APPRAICER = "//label[contains(text(),'Послуги оцінювача')]";
    static String LOCATOR_IPOTEKA_ADITIONAL_STRAH = "//label[contains(text(),'Страхування нерухомого майна (предмету іпотеки)')]";
    static String LOCATOR_IPOTEKA_ADITIONAL_STRLIVE = "//label[contains(text(),'Страхування життя')]";
    static String LOCATOR_IPOTEKA_ADITIONAL_PENSION = "//label[contains(text(),\"Збори на обов'язкове державне пенсійне страхування\")]";
    static String LOCATOR_IPOTEKA_ADITIONAL_ADMIN = "//label[contains(text(),'Адміністративні збори')]";

}
