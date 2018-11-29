package com.big.automation.selenium_webdriver.common.rules;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class WebDriverRule {

   public RemoteWebDriver driver;

   public RemoteWebDriver getDriver() {

      return driver;
   }

   public WebDriverRule() {

      String os = System.getProperty("os.name");

      if ("Linux".equals(os)) {
         System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
         System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
      } else {
         System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
         System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
      }
      Optional<String> browser = Optional.ofNullable(System.getProperty("browser"));

      switch ((browser.orElse("chrome")).toLowerCase()) {
         case "chrome":
            driver = new ChromeDriver();
            break;
         case "firefox":
            DesiredCapabilities dc = DesiredCapabilities.firefox();
            FirefoxProfile profile = new FirefoxProfile();
            profile.setPreference("dom.disable_beforeunload", true);

                /*
                //
                //*******!!!!!!!!!!!!!!!!
                //
                // DO NOT UNCOMMENT OUT THE BELOW CODE
                //
                //**********!!!!!!!!!!!!!!!
                //
                profile.setPreference("toolkit.startup.max_resumed_crashes", "-1");
                profile.setPreference("security.ssl.enable_ocsp_stapling", false);
                profile.setPreference("security.ssl3.dhe_rsa_aes_256_sha", false);
                profile.setPreference("security.ssl3.dhe_rsa_aes_128_sha", false);
                profile.setPreference("security.tls.version.min", 2);

                profile.setPreference("security.tls.version.min", 0);
                profile.setPreference("security.tls.version.max", 0);
                profile.setPreference(" security.tls.version.fallback-limit", 0);

                profile.setPreference("security.ssl.enable_ocsp_stapling", false);
                profile.setPreference("network.http.spdy.enabled", true);
                profile.setPreference("network.http.spdy.enabled.v2", true);
                profile.setPreference("network.http.spdy.enabled.v3", true);
                */

            dc.setCapability(FirefoxDriver.PROFILE, profile);
            driver = new FirefoxDriver(dc);
            break;
      }

     // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

   }

   public void quitDriver() {

      driver.quit();
   }
}
