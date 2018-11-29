package com.big.automation.selenium_webdriver.common.utilities;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.big.automation.selenium_webdriver.common.types.Brand;
import com.big.automation.selenium_webdriver.common.types.Environment;
import com.big.automation.selenium_webdriver.common.types.Portal;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static com.big.automation.selenium_webdriver.common.types.Portal.SQE;

public class URLUtility {

   private Properties properties = null;
   private static URLUtility instance = null;
   //ExtentTest logger;

   private URLUtility() {

      loadProperties();
   }

   public static URLUtility getInstance() {

      if (instance == null) {
         instance = new URLUtility();
      }
      return instance;
   }

   public String getUrl(ExtentTest logger, Brand brand, Environment environment, Portal portal) {

      String urlPattern = String.format("%s.%s.%s", brand.name(), environment.name(), portal.name());

      if (urlPattern == null) {
         throw new IllegalStateException(String.format("URL property not found %s.%s.%s", brand.name(), environment.name(), portal.name()));
      } else if (portal.equals(SQE))
      {}
      else {
         System.out.println(properties.getProperty(urlPattern));
         logger.log(Status.INFO, "Attempting to open URL - " + properties.getProperty(urlPattern));
      }
      return properties.getProperty(urlPattern);
   }


   private void loadProperties() {


      ClassLoader classLoader = getClass().getClassLoader();
      properties = new Properties();
      InputStream inputStream = null;

      try {
         inputStream = classLoader.getResourceAsStream("url.properties");
         properties.load(classLoader.getResourceAsStream("url.properties"));

      } catch (IOException e) {
         e.printStackTrace();
         throw new IllegalStateException("Unable to load URL properties");
      } finally {
         if (inputStream != null) {
            try {
               inputStream.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
         }
      }

   }

}
