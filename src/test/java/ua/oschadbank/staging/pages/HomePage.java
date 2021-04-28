package ua.oschadbank.staging.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class HomePage extends OschadPage {
    public HomePage(WebDriver driver) { super(driver);}

    @Step("is page load")
    public void IsMainPageLoad(){ isPageload(10,"page not loaded before 10 sec");}
}
