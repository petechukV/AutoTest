package ua.oschadbank.staging.pages;

import ex.capybara.MainPages;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class OschadPage extends MainPages {
    public static final int timeForWaiting = 10;

    public OschadPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().window().maximize();
    }

    public void waitingSomeTime(int time) {
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
        FileUtils.copyFile(scrFile, new File("C:\\AutoTests\\"+result));
    }

    public void DoScrole(Integer scroll){
        waitingSomeTime(1000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0,"+scroll+");");
    }

    public int getResponseCode() throws IOException {
        URL url = new URL(this.driver.getCurrentUrl());
        HttpURLConnection huc = (HttpURLConnection)url.openConnection();
        huc.setRequestMethod("GET");
        huc.connect();
        return huc.getResponseCode();
    }
}
