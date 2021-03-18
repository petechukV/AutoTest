package com.clear.tests;

import com.clear.pages.CatalogPage;
import com.clear.pages.CategoryPage;
import com.clear.pages.HomePage;
import org.testng.annotations.Test;

public class CheckoutTest extends ClearTests {
    public CheckoutTest() {
        super(Platform.desktop);
    }

        HomePage homePage;
        CategoryPage categoryPage;
        CatalogPage catalogPage;


        @Override
        public void Before () {
            super.Before();
            homePage = new HomePage(this.getDriver());
            categoryPage = new CategoryPage(this.getDriver());
            catalogPage = new CatalogPage(this.getDriver());

        }

        @Test(description = "Check that user can place order")
        public void CheckoutTest () {

        }
    }
