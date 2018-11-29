package com.big.automation.selenium_webdriver.common.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtilityExamples {

	/*
	Functions....  
	selectByVisibleTextById
	clickByXpath

	 
	 */


    //example
    //OLD -- new Select(driver.findElement(By.id("title"))).selectByVisibleText("Mr");
    //NEW -- WebdriverUtilityExamples.selectByVisibleTextById(driver, "title", "Mr");

    public static By byId(String id) {
        return By.id(id);
    }

    public static WebElement findElementById(WebDriver driver, String id) {
        return driver.findElement(byId(id));
    }

    public static void selectByVisibleTextById(WebDriver driver, String id, String visibleText) {
        new Select(findElementById(driver, id)).selectByVisibleText(visibleText);
    }

    //example
    //OLD -- driver.findElement(By.xpath("//div[@id='findaddress']/input")).click();
    //new -- WebdriverUtilityExamples.clickByXpath(driver, "//div[@id='findaddress']/input");

    public static By byXpath(String xpath) {
        return By.xpath(xpath);
    }

    public static WebElement findElementByXpath(WebDriver driver, String xpath) {
        return driver.findElement(byXpath(xpath));
    }

    public static void clickByXpath(WebDriver driver, String xpath) {
        findElementByXpath(driver, xpath).click();
    }

}
