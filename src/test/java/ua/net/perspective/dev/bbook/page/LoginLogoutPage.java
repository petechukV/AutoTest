package ua.net.perspective.dev.bbook.page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ua.net.perspective.dev.bbook.pages.BbookPages;

public class LoginLogoutPage extends BbookPages {
    public LoginLogoutPage(WebDriver driver) {super(driver);}

    @Step("Is page load")
    public void IsLoginPageLoad(){ isPageload(timeForWaiting,"Login page does not load");}

    @Step("Fill login form")
    public void FillLoginForm(String mail,String pass){
        IsAllFieldVisible();
        getElement(By.xpath(Locators.LOCATOR_LOGIN_MAIL),timeForWaiting,"not fill mail").sendKeys(mail);
        getElement(By.xpath(Locators.LOCATOR_LOGIN_PASS),timeForWaiting,"not fill pass").sendKeys(pass);
        getElement(By.xpath(Locators.LOCATOR_LOGIN_BUTTON),timeForWaiting,"not submited button").submit();
    }

    @Step("Is all field visible")
    private void IsAllFieldVisible(){
        isDisplayed(By.xpath(Locators.LOCATOR_LOGIN_MAIL), timeForWaiting, "Mail field not visible");
        isDisplayed(By.xpath(Locators.LOCATOR_LOGIN_PASS), timeForWaiting, "Password field not visible");
        isDisplayed(By.xpath(Locators.LOCATOR_LOGIN_BUTTON), timeForWaiting, "Log In button not visible");

    }
}
