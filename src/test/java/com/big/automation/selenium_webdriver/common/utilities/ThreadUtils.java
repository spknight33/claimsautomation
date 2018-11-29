package com.big.automation.selenium_webdriver.common.utilities;

public class ThreadUtils {
    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
