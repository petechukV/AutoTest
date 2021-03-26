package com.clear.pages;

import org.openqa.selenium.WebDriver;

public class Locator extends ClearMainPage {

    public Locator(WebDriver driver) {
        super(driver);
    }
    static String LOCATOR_SEARCH_PAGE = "//input[@id='search']";
    static String LOCATOR_SEARCH_BUTTON = "//body/div[4]/aside[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[1]";
    static String LOCATOR_SEARCH_HOME = "//a[@id='open-search']";
    static String LOCATOR_SEARCH_RESULT = "//body/div[3]/main[1]/div[2]/div[1]/div[6]/div[1]/div[2]/ol[1]/li[1]";

    static String LOCATOR_HOME_MAIL = "//button[@id='buttonClose-right-first']";
    static String LOCATOR_HOME_MENU = "//header/div[1]/button[1]";
    static String LOCATOR_HOME_POLICE = "//button[@id='btn-cookie-allow']";

}
