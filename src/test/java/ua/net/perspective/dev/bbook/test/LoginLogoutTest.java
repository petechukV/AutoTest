package ua.net.perspective.dev.bbook.test;

import org.testng.annotations.Test;
import ua.net.perspective.dev.bbook.page.HomePage;
import ua.net.perspective.dev.bbook.page.LoginLogoutPage;

import java.io.IOException;

public class LoginLogoutTest extends BbookTests{
    HomePage homePage;
    LoginLogoutPage loginLogoutPage;

    public LoginLogoutTest() {super(Platform.desktop);}

    @Override
    public void Before () {
        super.Before();
        homePage = new ua.net.perspective.dev.bbook.page.HomePage(this.getDriver());
        loginLogoutPage = new ua.net.perspective.dev.bbook.page.LoginLogoutPage(this.getDriver());
    }

    @Test(description = "Login test")
    public void LoginLogoutTests() throws IOException {
    homePage.IsMainPageLoad();
    homePage.ClickOnLoginHome();
    loginLogoutPage.IsLoginPageLoad();
    loginLogoutPage.FillLoginForm("qatestv79@gmail.com","Hesoyam15");
    loginLogoutPage.GetScrinshot("LoginBB.png");
    }
}
