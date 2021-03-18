package com.clear.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class HomePage extends ClearMainPage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("Is main page is open")
    public void IsMainPageLoad(){
        isPageload(10,"Page isnt load for 10 sec");
    }
}

