package ua.net.perspective.dev.bbook.page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ua.net.perspective.dev.bbook.pages.BbookPages;

public class CatalogPage extends BbookPages {
    Integer otp = getRandomInt(1,4);
    String LOCATOR_SORT_LIST = "//select[@class='ais-SortBy-select']/option["+otp+"]";

    public CatalogPage(WebDriver driver) {super(driver);}

    @Step("Is catalog page load")
    public void IsCatalogPageLoad(){ isPageload(timeForWaiting,"Page not loaded");}

    @Step("Use sort")
    public void UseSortOption(){
        IsSortVisible();
        clickOnElement(By.xpath(Locators.LOCATOR_BOOK_SORT),timeForWaiting,"Sort not clicked");
        waitingSomeTime(1000);
        IsSortOptionVisible();
        clickOnElement(By.xpath(LOCATOR_SORT_LIST),timeForWaiting,"Option not clicked");
    }

    @Step("is sort visible")
    private void IsSortVisible(){ isDisplayed(By.xpath(Locators.LOCATOR_BOOK_SORT),timeForWaiting,"Sort not visible");}

    @Step("Is optoin visible")
    private void IsSortOptionVisible(){ isDisplayed(By.xpath(LOCATOR_SORT_LIST),timeForWaiting,"Option not visible");}
}
