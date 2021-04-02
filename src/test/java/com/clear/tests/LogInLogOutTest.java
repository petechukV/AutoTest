package com.clear.tests;

import com.clear.pages.HomePage;
import com.clear.pages.LoginLogoutPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class LogInLogOutTest extends ClearTests {
    public LogInLogOutTest() {
        super(Platform.desktop);
    }

    HomePage homePage;
    LoginLogoutPage loginPage;


    @Override
    public void Before() {
        super.Before();
        homePage = new HomePage(this.getDriver());
        loginPage = new LoginLogoutPage(this.getDriver());

    }

    @Test(description = "Check that user can log in and log out")
    public void LoginLogoutTest() throws IOException {
        homePage.IsMainPageLoad();
        homePage.CleanHomePage();
        homePage.IsAccountVisible();
        homePage.ClickOnAccount();
        loginPage.IsLoginPageLoad();
        loginPage.FillLogInForm("petechukvlad@gmail.com","Privatsose24");
        loginPage.GetScrinshot("Login.png");
        loginPage.ClickOnLogOut();
        loginPage.GetScrinshot("Logout.png");

    }
}
