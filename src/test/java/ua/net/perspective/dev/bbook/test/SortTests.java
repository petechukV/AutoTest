package ua.net.perspective.dev.bbook.test;

import org.testng.annotations.Test;
import ua.net.perspective.dev.bbook.page.CatalogPage;
import ua.net.perspective.dev.bbook.page.HomePage;

import java.io.IOException;

public class SortTests extends BbookTests{
    public SortTests() {super(Platform.desktop);}

    HomePage homePage;
    CatalogPage catalogPage;

    @Override
    public void Before () {
        super.Before();
        homePage = new ua.net.perspective.dev.bbook.page.HomePage(this.getDriver());
        catalogPage = new ua.net.perspective.dev.bbook.page.CatalogPage(this.getDriver());
    }

    @Test(description = "Sort test")
    public void SortsTest() throws IOException {
        homePage.IsMainPageLoad();
        homePage.ClickOnBookCatalog();
        catalogPage.IsCatalogPageLoad();
        catalogPage.UseSortOption();
        catalogPage.DoScrole(250);
        catalogPage.GetScrinshot("SortBB.png");
    }
}
