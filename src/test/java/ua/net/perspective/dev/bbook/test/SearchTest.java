package ua.net.perspective.dev.bbook.test;

import org.testng.annotations.Test;
import ua.net.perspective.dev.bbook.page.HomePage;

import java.io.IOException;

public class SearchTest extends BbookTests{
    HomePage homePage;

    public SearchTest() {super(Platform.desktop);}

    @Override
    public void Before () {
        super.Before();
        homePage = new ua.net.perspective.dev.bbook.page.HomePage(this.getDriver());
    }

    @Test(description = "search test")
    public void SearchTest() throws IOException {
        homePage.IsMainPageLoad();
        homePage.UseSearch("Boy");
        homePage.IsResultContain("Boy");
        homePage.waitingSomeTime(1000);
        homePage.DoScrole(300);
        homePage.GetScrinshot("Bbook.png");
    }
}
