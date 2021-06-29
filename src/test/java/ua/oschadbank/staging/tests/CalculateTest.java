package ua.oschadbank.staging.tests;

import org.testng.annotations.Test;
import ua.oschadbank.staging.pages.HomePage;
import ua.oschadbank.staging.pages.IpotekaPage;

import java.io.IOException;

public class CalculateTest extends OschadTests {
    HomePage homePage;
    IpotekaPage ipotekaPage;

    public CalculateTest() {
        super(Platform.desktop);
    }

    @Override
    public void Before () {
        super.Before();
        homePage = new ua.oschadbank.staging.pages.HomePage(this.getDriver());
        ipotekaPage = new ua.oschadbank.staging.pages.IpotekaPage(this.getDriver());
    }

    @Test(description = "Ipoteca 7 test")
    public void Ipoteca7Test() throws IOException {
        homePage.IsMainPageLoad();
        homePage.waitingSomeTime(300);
        homePage.GoToIpotekaCredit();
        ipotekaPage.IsIpotekaPageLoad();
        ipotekaPage.FillIpotekaCalculate();
        ipotekaPage.GetScrinshot("Oschad.png");
    }
}
