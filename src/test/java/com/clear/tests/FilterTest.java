package com.clear.tests;

import com.clear.pages.CatalogPage;
import com.clear.pages.HomePage;
import org.testng.annotations.Test;

import java.io.IOException;


public class FilterTest extends ClearTests {
    public FilterTest() {
        super(Platform.desktop);
    }

    HomePage homePage;
    CatalogPage catalogPage;


    @Override
    public void Before () {
        super.Before();
        homePage = new HomePage(this.getDriver());
        catalogPage = new CatalogPage(this.getDriver());

    }

    @Test(description = "Check that filters work")
    public void FiltersTests() throws IOException {
        homePage.IsMainPageLoad();
        homePage.CleanHomePage();
        homePage.IsMenuButtonVisible();
        homePage.ClickOnBurgerMenu();
        homePage.IsCategoryVisible();
        homePage.ClickOnCategory();
        catalogPage.IsCategotyPageLoad();
        catalogPage.IsSortVisible();
        catalogPage.ClickOnSort();
        catalogPage.UseSortOption();
        catalogPage.IsProductVisible();
        catalogPage.GetScrinshot("Filter.png");
    }

}
