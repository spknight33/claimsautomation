package com.big.automation.selenium_webdriver.common.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButtonUtils {


    public static void assertsRadioButtonIsSelected(WebElement webElement) throws Exception{
        Boolean radioSelection = webElement.isSelected();
        if(radioSelection){}
        else{throw new Exception("radio button is NOT selected");}
    }

    public static void assertsRadioButtonIsNotSelected(WebElement webElement) throws Exception{
        Boolean radio1 = !webElement.isSelected();
        if(radio1){}
        else{throw new Exception("radio button IS selected");}
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

    public static void populateByAttributeValue(WebElement webElement, String expectedButtonValue) {
        if (webElement.getAttribute("value").equals(expectedButtonValue)) {
            webElement.click();
        }

    }
}


