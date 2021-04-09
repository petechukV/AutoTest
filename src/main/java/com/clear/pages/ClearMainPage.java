package com.clear.pages;
import ex.capybara.MainPages;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class ClearMainPage extends MainPages {
    public static final int timeForWaiting = 30;


    public ClearMainPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();
    }
    public void waitingSomeTime(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void GetScrinshot (String result) throws IOException {
        waitingSomeTime(2000);
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File("C:\\AutoTests\\"+result));}
}
