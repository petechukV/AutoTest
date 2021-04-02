package com.clear.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends ClearMainPage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @Step("Click on product")
    public void ClickOnProduct() {
        waitingSomeTime(6000);
        clickOnElement(By.xpath(Locator.LOCATOR_PRODUCT),10,"product doesnot selected");
    }

    @Step("Is product page load")
    public void IsPageLoad(){ isPageload(10,"Page doesnt load");}

    @Step("Add to cart")
    public void AddToCart(){ getElement(By.xpath(Locator.LOCATOR_PRODUCT_CART),10,"Not added").click();}

    @Step("View cart")
    public void ViewCart() { clickOnElement(By.xpath(Locator.LOCATOR_HOME_CARD_VIEW),10,"Does not viewed cart");}

    @Step("Go to checkout secure")
    public void ClickOnSecureCheckout(){
        waitingSomeTime(5000);
        clickOnElement(By.xpath(Locator.LOCATOR_CHECKOUT_SECURE),10,"Not open secure checkout");
    }
    @Step("Log in form")
    public void FillLogInForm(String log, String pas){
        IsFormVisible();
        getElement(By.xpath(Locator.LOCATOR_LOGIN_LOG),10,"Login does not fill").sendKeys(log);
        getElement(By.xpath(Locator.LOCATOR_LOGIN_PAS),10,"Password does not fill").sendKeys(pas);
        clickOnElement(By.xpath(Locator.LOCATOR_LOGIN_BUTTON),10,"Button does not click");
    }

    @Step("Is form visible")
    private void IsFormVisible(){
        waitingSomeTime(3000);
        isDisplayed(By.xpath(Locator.LOCATOR_LOGIN_LOG),10,"login not visible");
        isDisplayed(By.xpath(Locator.LOCATOR_LOGIN_PAS),10,"Pasword not visible");
        isDisplayed(By.xpath(Locator.LOCATOR_LOGIN_BUTTON),10,"button not visible");
    }

    @Step("enter adress manualy")
    public void ClickOnEnterAddress(){
        waitingSomeTime(10000);
        clickOnElement(By.xpath(Locator.LOCATOR_CHECKOUT_ADDRESS),10,"Adress not enter");
    }

    @Step("chouse vendor shiping")
    public void ChouseVendorShiping(){ clickOnElement(By.xpath(Locator.LOCATOR_CHECKOUT_SHIPPING_VENDOR),10,"Vendor shiping not used");}

    @Step("go ot paymenth")
    public void GoToPaymenth(){ clickOnElement(By.xpath(Locator.LOCATOR_CHECKOUT_CONTINUE),10,"does not go to paymenth");}

    @Step("Paymenth method")
    public void FillPaymenthMethod(String card, String month, String year, String cv2 ){
        IsPaymentVisible();
        getElement(By.xpath(Locator.LOCATOR_CHECKOUT_PAYMENT_CARD),10,"card not fill").sendKeys(card);
        getElement(By.xpath(Locator.LOCATOR_CHECKOUT_PAYMENT_DATE),10,"month not fill").sendKeys(month);
        getElement(By.xpath(Locator.LOCATOR_CHECKOUT_PAYMENT_YER),10,"year not fill").sendKeys(year);
        getElement(By.xpath(Locator.LOCATOR_CHECKOUT_PAYMENT_CV2),10,"cv2 not fill").sendKeys(cv2);
        clickOnElement(By.xpath(Locator.LOCATOR_CHECKOUT_PAYMENT_MAKE),10, "make button not clicked");
    }

    @Step("Is payment form visible")
    private void IsPaymentVisible(){
        isDisplayed(By.xpath(Locator.LOCATOR_CHECKOUT_PAYMENT_CARD),10,"card not visible");
        isDisplayed(By.xpath(Locator.LOCATOR_CHECKOUT_PAYMENT_DATE),10,"date not visible");
        isDisplayed(By.xpath(Locator.LOCATOR_CHECKOUT_PAYMENT_YER),10,"year not visible");
        isDisplayed(By.xpath(Locator.LOCATOR_CHECKOUT_PAYMENT_CV2),10,"CV2 not visible");
        isDisplayed(By.xpath(Locator.LOCATOR_CHECKOUT_PAYMENT_MAKE),10,"make button not visible");
    }

}
