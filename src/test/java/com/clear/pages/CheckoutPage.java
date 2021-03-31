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

}
