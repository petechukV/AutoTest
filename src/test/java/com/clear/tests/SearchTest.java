package com.clear.tests;

import com.clear.pages.HomePage;
import com.clear.pages.SearchPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class SearchTest extends ClearTests{
    public SearchTest() {
        super(Platform.desktop);
    }

    HomePage homePage;
    SearchPage searchPage;


    @Override
    public void Before() {
        super.Before();
        homePage = new HomePage(this.getDriver());
        searchPage = new SearchPage(this.getDriver());

    }
    @Test(description = "Valid search")
    public void SearchTestValid() throws IOException {
        homePage.IsMainPageLoad();
        homePage.IsMailpopupVisible();
        homePage.ClickOnMailPop();
        homePage.IsSearchVisible();
        homePage.ClickOnSearch();
        searchPage.IsSearchImputVisible();
        searchPage.SendText("Blouse");
        searchPage.ClickSearch();
        searchPage.GetScrinshot();
    }

    @Test(description = "Unvalid data")
    public void SearchTestUnValid() throws IOException {
        homePage.IsMainPageLoad();
        homePage.IsMailpopupVisible();
        homePage.ClickOnMailPop();
        homePage.IsSearchVisible();
        homePage.ClickOnSearch();
        searchPage.IsSearchImputVisible();
        searchPage.SendText("afdhhf");
        searchPage.ClickSearch();
        searchPage.GetScrinshot();
    }

}
