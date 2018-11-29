package com.big.automation.selenium_webdriver.common.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;

public class SeleniumUtils {
/*
    private SeleniumUtils() {}

    public static void waitForValueInElement(WebDriver webDriver, String elementId, String value) {
        WebDriverWait wait = new WebDriverWait(webDriver, 60);

        wait.until(x -> {
            String textValue = x.findElement(By.id(elementId)).getAttribute("value");
            return value.equals(textValue);
        });
    }

    public static void waitForTextInElement(WebDriver webDriver, String elementId, String value) {
        // TODO this shouldn't be needed but getting stale object exception
        sleep(5);
        WebDriverWait wait = new WebDriverWait(webDriver, 60);

        wait.until(x -> {
            try {
                String textValue = x.findElement(By.id(elementId)).getText();
                return value.equals(textValue);
            } catch (Exception e) {
                return false;
            }
        });
    }

    public static void waitForElementToBeVisible(WebDriver webDriver, WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(webDriver, 60);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void waitForElementToBeClickable(WebDriver webDriver, WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(webDriver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public static void scrollToElement(WebDriver webDriver, WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(webDriver, 60);
        sleep(1);
        wait.until(ExpectedConditions.visibilityOf(webElement));
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", webElement);
    }

    public static void switchToIframe(WebDriver webDriver, WebElement webElement) {
        webDriver.switchTo().frame(webElement);
    }

    public static void populateRadioButtonValue(List<WebElement> radioButtonElements, String expectedRadioButtonValue) {
        for (WebElement radioButtonElement : radioButtonElements) {

            if (radioButtonElement.getAttribute("value").equals(expectedRadioButtonValue)) {
                radioButtonElement.click();
            }
        }
    }

    public static String obtainSelectedRadioValueByAttributeValue(List<WebElement> radioButtonElements) {
        for (WebElement radioButtonElement : radioButtonElements) {
            if (radioButtonElement.isSelected()) {
                return radioButtonElement.getAttribute("value");
            }
        }

        return null;
    }

    public static String createTimeStamp(String pattern) {
        String timeStamp = new SimpleDateFormat(pattern).format(new java.util.Date());
        return timeStamp;
    }

    public static String createEmailTimeStamp() {
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        return timeStamp;
    }

    public static String createEmailAddressWithTimeStamp(String brand, String timeStamp) {
        return String.format("%s%s@bigggg.com", brand, timeStamp);
    }


    public static void screenshotOnFailForSureFireReports(ITestResult testResult, RemoteWebDriver driver) throws IOException {
        String timeStamp = new SimpleDateFormat("HHmmssddMMyyyy").format(new java.util.Date());
        System.out.println(testResult.getStatus());
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String filename = "target/surefire-reports/html/" + testResult.getName() + timeStamp + ".png";
        //String filename = "target/screenshot/"+ testResult.getName() + timeStamp +  ".png";
        FileUtils.copyFile(scrFile, new File(filename));

        String screen_shot_path = /*"target\\surefire-reports\\html\\" + */  /*testResult.getName() + timeStamp + ".png";
        //String screen_shot_path = System.getProperty("user.dir") + "\\target\\screenshot\\"+ testResult.getName() + timeStamp +  ".png";
  //      System.out.println(screen_shot_path);

        //String filePath = scrFile.toString();
        //String path = "<img src=\"file://" + filePath + "\" alt=\"\"/>";;
        //Reporter.log(path);

        //String screen_shot_path = System.getProperty("user.dir") + "\\screen_shot\\filename";
 //       System.setProperty("org.uncommons.reportng.escape-output", "false");
 //       Reporter.log("<td><a href='" + screen_shot_path
 //               + "'><img src='" + screen_shot_path
 //               + "' height='100' width='100' /></a></td>");
 //       Reporter.log(testResult.getName());
 //       System.out.print("This is the name of the failed test " + testResult.getName());

 //   }

 //   public static void switchOutOfAllFrames (WebDriver webDriver) { webDriver.switchTo().defaultContent(); }

*/

}


