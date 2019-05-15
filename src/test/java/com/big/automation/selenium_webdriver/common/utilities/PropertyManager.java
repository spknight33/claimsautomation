package com.big.automation.selenium_webdriver.common.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertyManager {

    private static PropertyManager instance;
    private static final Object lock = new Object();
    private static String propertyFilePath = System.getProperty("user.dir")+
            "\\src\\test\\resources\\configuration.properties";
    private static String devClaimsUrl;
    private static String testClaimsUrl;
    private static String preProdClaimsUrl;
    private static String devPolicyUrl;
    private static String testPolicyUrl;
    private static String preProdPolicyUrl;
    private static String envType;

    //Create a Singleton instance. We need only one instance of Property Manager.
    public static PropertyManager getInstance () {
        if (instance == null) {
            synchronized (lock) {
                instance = new PropertyManager();
                instance.loadData();
            }
        }
        return instance;
    }

    //Get all configuration data and assign to related fields.
    private void loadData() {
        //Declare a properties object
        Properties prop = new Properties();

        //Read configuration.properties file
        try {
            prop.load(new FileInputStream(propertyFilePath));
            //prop.load(this.getClass().getClassLoader().getResourceAsStream("configuration.properties"));
        } catch (IOException e) {
            System.out.println("Configuration properties file cannot be found");
        }

        envType = prop.getProperty("envType");
        devClaimsUrl = prop.getProperty("devClaimsUrl");
        testClaimsUrl = prop.getProperty("testClaimsUrl");
        preProdClaimsUrl = prop.getProperty("preProdClaimsUrl");
        devPolicyUrl = prop.getProperty("devPolicyUrl");
        testPolicyUrl = prop.getProperty("testPolicyUrl");
        preProdPolicyUrl = prop.getProperty("preProdPolicyUrl");
    
    }
    public String getEnvType () {
        return envType;
      }

    public String getDevClaimsURL () {
        return devClaimsUrl;
      }
    public String getTestClaimsURL () {
        return testClaimsUrl;
      }
    public String getPreProdClaimsURL () {
        return preProdClaimsUrl;
      }
    
    public String getDevPolicyURL () {
        return devPolicyUrl;
      }
    public String getTestPolicyURL () {
        return testPolicyUrl;
      }
    public String getPreProdPolicyURL () {
        return preProdPolicyUrl;
      }
    
}