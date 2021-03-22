package com.clear.pages;
import ex.capybara.MainPages;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ClearMainPage extends MainPages {
    public static final int timeForWaiting = 30;


    public ClearMainPage(WebDriver driver) {
        this.driver = driver;
        Dimension dm = new Dimension(1920,1080);
        driver.manage().window().setSize(dm);
    }

    public void GetScrinshot () throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File("D:\\AutoTests\\screen.png"));}
}
