package ua.oschadbank.staging.tests;

import org.testng.annotations.Test;
import ua.oschadbank.staging.pages.HomePage;

public class CalculateTest extends OschadTests {
    HomePage homePage;

    public CalculateTest() {
        super(Platform.desktop);
    }

    @Override
    public void Before () {
        super.Before();
        homePage = new ua.oschadbank.staging.pages.HomePage(this.getDriver());
    }

    @Test(description = "Ipoteca 7 test")
    public void Ipoteca7Test(){
        homePage.IsMainPageLoad();
    }
}
