package com.big.automation.selenium_webdriver.common.config;

public class UserToGroupMap {

	
	

	public static String getGroupForUser(String user) throws Throwable{
		// these are Carlos test user - to be changed later
		switch (user)
		{
		case ("HAD1"):
			return "Accidental Damage";
		case ("HAD2"):
			return "Accidental Damage";	
		case ("HCS1"):
			return "Claims Support";
		case ("HCS2"):
			return "Claims Support";
		case ("HPI1"):
			return "Personal Injury - MOJ";	
		case ("HPI2"):
			return "Personal Injury - MOJ";	
		case ("HTPD1"):
			return "Third Party Property damage";	
		case ("HTPD2"):
			return "Third Party Property damage";
		case ("HCH1"):
			return "Credit Hire";
		case ("HCH2"):
			return "Credit Hire";
		case ("HTPC1"):
			return "Third Party Capture";
		case ("HTPC2"):
			return "Third Party Capture";
		case ("Pending Assignment"):
			return "Credit Hire Protocol";
	
		case ("MCS1"):
			return "Claims Support";
		
		default:
		throw new Exception("Cannot find user");
		
	}
	}

}
