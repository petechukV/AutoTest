package ua.net.perspective.dev.bbook.page;

import org.openqa.selenium.WebDriver;
import ua.net.perspective.dev.bbook.pages.BbookPages;

public class Locators extends BbookPages {
    public Locators(WebDriver driver) {super(driver);}

    static String LOCATOR_HOME_SEARCH = "//input[@id='search']";
    static String LOCATOR_HOME_LOGIN = "//a[@class='out-in-alert no-logged']";
    static String LOCATOR_HOME_BOOK = "//a[contains(text(),'Books')]";

    static String LOCATOR_SEARCH_RESULT = "//body/div[2]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]";

    static String LOCATOR_LOGIN_MAIL = "//input[@id='email']";
    static String LOCATOR_LOGIN_PASS = "//input[@id='pass']";
    static String LOCATOR_LOGIN_BUTTON = "//button[@id='send2']";
    static String LOCATOR_LOGIN_LOGOUT = "//a[@class='opener']";
    static String LOCATOR_LOGIN_LOGOUT_LINCK = "//a[@class ='out-in-alert logged']";

    static String LOCATOR_BOOK_SORT = "//select[@class='ais-SortBy-select']";
    static String LOCATOR_SORT_LIST = "//select[@class='ais-SortBy-select']/option[2]";
}
