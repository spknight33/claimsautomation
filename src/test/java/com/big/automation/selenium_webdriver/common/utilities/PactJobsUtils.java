package com.big.automation.selenium_webdriver.common.utilities;

import com.aventstack.extentreports.ExtentTest;
import com.big.automation.selenium_webdriver.common.types.Brand;
import com.big.automation.selenium_webdriver.common.types.Environment;
import com.big.automation.selenium_webdriver.common.types.Portal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

public class PactJobsUtils {


    public static void runSetPolsLive(WebDriver webDriver, String brandInCapitals, ExtentTest logger) {

        logger.info(format("Triggering PACT job SetPolsLive - will only proceed if success returns 'true', timeout set to 60secs."));

        sleep(10);
        Environment environment = EnvironmentUtils.getEnvironment();
        webDriver.get(URLUtility.getInstance().getUrl(logger, Brand.valueOf(brandInCapitals), environment, Portal.SETPOLSLIVE));
        sleep(10);

        WebDriverWait wait = new WebDriverWait(webDriver, 60);
        wait.until(x -> {
            try {
                String textValue = x.findElement(By.xpath("//response")).getText();
                return textValue.matches("^true[\\s\\S]*$");
            } catch (Exception e) {
                return false;
            }
        });
    }

}