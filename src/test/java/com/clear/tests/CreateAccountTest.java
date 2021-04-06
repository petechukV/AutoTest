package com.clear.tests;

import com.clear.pages.CreateAccountPage;
import com.clear.pages.HomePage;
import com.clear.pages.LoginLogoutPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class CreateAccountTest extends ClearTests{
    public CreateAccountTest() {
        super(Platform.desktop);
    }
    CreateAccountPage createAccount;
    HomePage homePage;
    LoginLogoutPage loginPage;

    @Override
    public void Before() {
        super.Before();
        homePage = new HomePage(this.getDriver());
        loginPage = new LoginLogoutPage(this.getDriver());
        createAccount = new CreateAccountPage(this.getDriver());
    }

    @Test(description = "Check that user can create account")
    public void CreateAccountTest() throws IOException {
        homePage.IsMainPageLoad();
        homePage.CleanHomePage();
        homePage.IsAccountVisible();
        homePage.ClickOnAccount();
        createAccount.ClickOnSingUp();
        createAccount.IsCreatePageLoad();

        createAccount.GetScrinshot("Create.png");
    }
}
