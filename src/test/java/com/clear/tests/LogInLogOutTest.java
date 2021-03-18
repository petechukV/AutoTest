package com.clear.tests;

import com.clear.pages.HomePage;
import org.testng.annotations.Test;

public class LogInLogOutTest extends ClearTests {
    public LogInLogOutTest() {
        super(Platform.desktop);
    }

    HomePage homePage;


    @Override
    public void Before() {
        super.Before();
        homePage = new HomePage(this.getDriver());

    }

    @Test(description = "Check that user can log in and log out")
    public void LoginLogoutTest() {
    homePage.IsMainPageLoad();
    }
}
