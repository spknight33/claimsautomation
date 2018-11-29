package com.big.automation.selenium_webdriver.common.rules;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;

public class ScreenshotTestRule  {

    private RemoteWebDriver driver;

    public ScreenshotTestRule(RemoteWebDriver driver) {
        this.driver = driver;
    }
    
    public ScreenshotTestRule(){
    	 try {
             String timeStamp = new SimpleDateFormat("HHmmssddMMyyyy").format(new java.util.Date());
             new File("target/screenshot/").mkdirs(); // Insure directory is there
             FileOutputStream out = new FileOutputStream("target/screenshot/screenshot-" + timeStamp + ".png");
             out.write((driver).getScreenshotAs(OutputType.BYTES));
             out.close();
         } catch (Exception e) {
             // No need to crash the tests if the screenshot fails
         }
    }
}
