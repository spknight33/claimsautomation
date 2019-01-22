package com.big.automation.selenium_webdriver.common.config;

public class UserToGroupMap {

	
	

	public static String getGroupForUser(String user) throws Throwable{
		// these are Carlos test user - to be changed later
		switch (user)
		{
		case ("Handler 1"):
			return "Accidental Damage";
		case ("Handler 2"):
			return "Accidental Damage";	
		case ("Support Handler 1"):
			return "Claims Support";
		case ("Support Handler 2"):
			return "Claims Support";
		case ("Handler 3"):
			return "Personal Injury - MOJ";	
		case ("Handler 4"):
			return "Personal Injury - MOJ";	
		case ("Handler 5"):
			return "Third Party Property damage";	
		case ("Handler 6"):
			return "Third Party Property damage";
		case ("Handler 7"):
			return "Credit Hire";
		case ("Handler 8"):
			return "Credit Hire";
		case ("Handler 9"):
			return "Third Party Capture";
		case ("Handler 10"):
			return "Third Party Capture";
		case ("Handler 11"):
			return "Credit Hire Protocol";
		case ("Handler 12"):
			return "Credit Hire Protocol";
		case ("Team Manager 1"):
			return "Claims Support";
		
		default:
		throw new Exception("Cannot find user");
		
	}
	}

}
