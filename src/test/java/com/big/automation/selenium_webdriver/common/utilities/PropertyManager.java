package com.big.automation.selenium_webdriver.common.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.big.automation.selenium_webdriver.common.config.UserConfig;


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
    private static Map<String, UserConfig> userMap = new HashMap<>();

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
        
        userMap = new HashMap<>();
        
        // read each group properties and add to map
        List<String> items = Arrays.asList(prop.getProperty("ADHandlers").split("\\s*,\\s*"));
        setUserMap(items,"Accidental Damage");
        items = Arrays.asList(prop.getProperty("CSHandlers").split("\\s*,\\s*"));
        setUserMap(items,"Claims Support");
        items = Arrays.asList(prop.getProperty("PIHandlers").split("\\s*,\\s*"));
        setUserMap(items,"Personal Injury - MOJ");
        items = Arrays.asList(prop.getProperty("TPPDHandlers").split("\\s*,\\s*"));
        setUserMap(items,"Third Party Property Damage");
        items = Arrays.asList(prop.getProperty("CHHandlers").split("\\s*,\\s*"));
        setUserMap(items,"Credit Hire");
        items = Arrays.asList(prop.getProperty("TPCHandlers").split("\\s*,\\s*"));
        setUserMap(items,"Third Party Capture");
        items = Arrays.asList(prop.getProperty("CHProtocolHandlers").split("\\s*,\\s*"));
        setUserMap(items,"Credit Hire Protocol");
        items = Arrays.asList(prop.getProperty("SIUHandlers").split("\\s*,\\s*"));
        setUserMap(items,"SIU");
        items = Arrays.asList(prop.getProperty("ITAdminUsers").split("\\s*,\\s*"));
        setUserMap(items,"ITAdmin");
        items = Arrays.asList(prop.getProperty("FinanceUsers").split("\\s*,\\s*"));
        setUserMap(items,"Finance");
        items = Arrays.asList(prop.getProperty("LargeLossUsers").split("\\s*,\\s*"));
        setUserMap(items,"LargeLoss");
    
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
    
    
    
    public UserConfig getUserForTeam(String team)
    {
    	
    	Collection<UserConfig> configs = userMap.values();
   
    	for (UserConfig config : configs) {
    	    if (config.getTeam().equalsIgnoreCase(team))
    	    {
    	    	// found a match return a user
    	    	return config;
    	    }
    	}
    	return null;
    	
    }
    
    public String getGroupForUser(String user)
    {
    	UserConfig userConfig = userMap.get(user);
    	return userConfig.getGroup();
    }
    
    private void setUserMap(List<String> items,String group)
    {
    	UserConfig userConfig=null;
    	String user=null;
    	String password=null;
    	String team=null;
    	for (int i=0; i<items.size(); i++){
    		
    		List<String> userDetails = Arrays.asList(items.get(i).split("\\s*\\$\\s*"));
    		
    		user=userDetails.get(0).trim();
    		password=userDetails.get(1);
    		team=userDetails.get(2);
    		
    		// format of entry is user/password/team
    		userConfig = new UserConfig(user,password,group,team);
            userMap.put(user, userConfig);
    	}
    	
    }
    
}