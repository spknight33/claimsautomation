package com.big.automation.selenium_webdriver.common.config;

public class UserToGroupMap {

	
	

	public static String getGroupForUser(String user) throws Throwable{
		// these are Carlos test user - to be changed later
		switch (user)
		{
		case ("HAD1"):
		case ("HAD2"):
		case ("MAD1"): // temp uintil fix done
		case ("MAD2"): // temp uintil fix done
			return "Accidental Damage";	
		case ("HCS1"):
		case ("HCS2"):
		case ("MCS1"):
			return "Claims Support";
		case ("HPI1"):
		case ("HPI2"):
		case ("MPI1"): // temp until fix done
		case ("MPI2"): // temp until fix done
			return "Personal Injury - MOJ";	
		case ("HTPD1"):
		case ("HTPD2"):
			return "Third Party Property damage";
		case ("HCH1"):
		case ("HCH2"):
		case ("MCH1"): // temp until fix done
		case ("MCH2"): // temp until fix done
			return "Credit Hire";
		case ("HTPC1"):
		case ("HTPC2"):
			return "Third Party Capture";
		case ("Pending Assignment"):
			return "Credit Hire Protocol";
	
		
			
		
		default:
		throw new Exception("Cannot find expected user "+user);
		
	}
	}

}
