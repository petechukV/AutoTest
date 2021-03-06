package com.clear.tests;

import com.clear.pages.CatalogPage;
import com.clear.pages.CheckoutPage;
import com.clear.pages.HomePage;
import com.clear.pages.LoginLogoutPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class CheckoutTest extends ClearTests {

        CheckoutPage checkoutPage;
        HomePage homePage;
        CatalogPage catalogPage;

    public CheckoutTest() {
        super(Platform.desktop);
    }

    @Override
        public void Before () {
            super.Before();
            homePage = new HomePage(this.getDriver());
            checkoutPage = new CheckoutPage(this.getDriver());
            catalogPage = new CatalogPage(this.getDriver());

        }

        @Test(description = "Check that user can place order")
        public void CheckoutsTest () throws IOException {
            homePage.IsMainPageLoad();
            homePage.CleanHomePage();
            homePage.IsMenuButtonVisible();
            homePage.ClickOnBurgerMenu();
            homePage.IsCategoryVisible();
            homePage.ClickOnCategory();
            catalogPage.IsCategotyPageLoad();
            checkoutPage.ClickOnProduct();
            checkoutPage.IsPageLoad();
            checkoutPage.AddToCart();
            homePage.ShowCart();
            checkoutPage.ViewCart();
            checkoutPage.ClickOnSecureCheckout();
            checkoutPage.IsPageLoad();
            checkoutPage.FillLogInForm("petechukvlad@gmail.com","Privatsose24");
            checkoutPage.ClickOnEnterAddress();
            checkoutPage.ChouseVendorShiping();
            checkoutPage.GoToPaymenth();
            checkoutPage.FillPaymenthMethod("5555555555554444","07","2023","343");
            checkoutPage.waitingSomeTime(6000);
            checkoutPage.GetScrinshot("checkout.png");
        }
    }
