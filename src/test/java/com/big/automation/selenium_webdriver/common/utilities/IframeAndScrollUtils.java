package com.big.automation.selenium_webdriver.common.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;

public class IframeAndScrollUtils {

    private IframeAndScrollUtils() {
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

    public static void switchOutOfAllFrames (WebDriver webDriver) {
        webDriver.switchTo().defaultContent();
    }

    public static void scrollToTopOfIframeTbbScpNewQuote(WebDriver webDriver) {
        webDriver.switchTo().defaultContent();
        sleep(1);
        WebElement webElement;
        webElement = webDriver.findElement(By.linkText("New TBB Quote"));
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", webElement);
        webDriver.switchTo().frame(webDriver.findElement(By.className("bfFrame")));
    }

    public static void scrollToTopOfIframeItbScpNewQuote(WebDriver webDriver) {
        webDriver.switchTo().defaultContent();
        sleep(1);
        WebElement webElement;
        webElement = webDriver.findElement(By.linkText("New Quote"));
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", webElement);
        webDriver.switchTo().frame(webDriver.findElement(By.className("bfFrame")));
    }

    public static void scrollToTopOfIframeDgtScpNewQuote(WebDriver webDriver) {
        webDriver.switchTo().defaultContent();
        sleep(1);
        WebElement webElement;
        webElement = webDriver.findElement(By.linkText("New DGT Quote"));
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", webElement);
        webDriver.switchTo().frame(webDriver.findElement(By.className("bfFrame")));
    }

    public static void scrollToTopOfIframeDlgScpNewQuote(WebDriver webDriver) {
        webDriver.switchTo().defaultContent();
        sleep(1);
        WebElement webElement;
        webElement = webDriver.findElement(By.linkText("New DLG Quote"));
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", webElement);
        webDriver.switchTo().frame(webDriver.findElement(By.className("bfFrame")));
    }

    public static void scrollToTopOfIframeOnScpMta(WebDriver webDriver) {
        webDriver.switchTo().defaultContent();
        sleep(1);
        WebElement webElement;
        webElement = webDriver.findElement(By.xpath("//div[@id='customerDetails-1']/div[3]/div/a/button"));
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", webElement);
        webDriver.switchTo().frame(0);
    }

    public static void scrollToTopOfIframeOnScpRenewal(WebDriver webDriver) {
        webDriver.switchTo().defaultContent();
        sleep(1);
        WebElement webElement;
        webElement = webDriver.findElement(By.name("messageNotEncoded"));
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", webElement);
        webDriver.switchTo().frame(webDriver.findElement(By.className("bfFrame")));
    }

    public static void windowSizeToPageSize(WebDriver webDriver) {
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        int contentHeight = ((Number) js.executeScript("return document.body.scrollHeight")).intValue();
        Dimension fullWindowHeight = new Dimension(1300, contentHeight);
        webDriver.manage().window().setSize(fullWindowHeight);
    }

    public static void restoreWindowSize(WebDriver webDriver) {
        Dimension dimension = new Dimension(1300, 700);
        webDriver.manage().window().setSize(dimension);
    }


}



