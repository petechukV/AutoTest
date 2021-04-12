package ua.net.perspective.dev.bbook.pages;

import ex.capybara.MainPages;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class BbookPages extends MainPages {

    public static final int timeForWaiting = 10;

    public BbookPages(WebDriver driver) {
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
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0,"+scroll+");");
    }
}
