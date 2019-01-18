package com.big.automation.selenium_webdriver.common.config;

public class UserToGroupMap {

	
	

	public static String getGroupForUser(String user) throws Throwable{
		
		switch (user)
		{
		case ("Default Owner"):
			return "Accidental Damage";
			
		
		
		
		}
		
		throw new Exception("Cannot find user");
		
	}

}
