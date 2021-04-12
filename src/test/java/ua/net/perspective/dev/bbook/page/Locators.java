package ua.net.perspective.dev.bbook.page;

import org.openqa.selenium.WebDriver;
import ua.net.perspective.dev.bbook.pages.BbookPages;

public class Locators extends BbookPages {
    public Locators(WebDriver driver) {super(driver);}

    static String LOCATOR_HOME_SEARCH = "//input[@id='search']";
    static String LOCATOR_SEARCH_RESULT = "//body/div[2]/main[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]";
}
