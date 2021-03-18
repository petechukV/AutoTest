package com.clear.pages;
import ex.capybara.MainPages;
import org.openqa.selenium.WebDriver;

public class ClearMainPage extends MainPages {
    public static final int timeForWaiting = 30;



    public ClearMainPage(WebDriver driver) {
        this.driver = driver;
    }


}
