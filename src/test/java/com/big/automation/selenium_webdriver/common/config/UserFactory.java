package com.big.automation.selenium_webdriver.common.config;

public class UserFactory {

	public static final String CLAIMSHANDLER = "ClaimsHandler";
	public static final String TPCHANDLER = "TpcHandler";
	public static final String PIHANDLER = "PIHandler";
	public static final String CREDITHIREHANDLER = "CreditHireHandler";
	public static final String CLAIMSSUPPORT = "ClaimsSupport";
	public static final String TEAMMANAGER = "TeamManager";
	public static final String CLAIMSMANAGER = "ClaimsManager";
	public static final String OPSADMIN = "OpsAdmin";
	public static final String ITADMIN = "ITAdmin";
	public static final String SIUHANDLER = "SIUUser";
	public static final String SIUMANAGER = "SIUManager";
	//public static final String DEFAULT = "Default";

	public static UserConfig getUserConfig(String role) {
		switch (role) {
		case (CLAIMSHANDLER):
			return new UserConfig("had1", "gw","unknown");
		case (TPCHANDLER):
			return new UserConfig("htpc1", "gw","unknown");
		case (PIHANDLER):
			return new UserConfig("hpi1", "gw","unknown");
		case (CREDITHIREHANDLER):
			return new UserConfig("hch1", "gw","unknown");
		case (CLAIMSSUPPORT):
			return new UserConfig("hcs1", "gw","unknown");

		case (TEAMMANAGER):
			return new UserConfig("rhenderson", "gw","unknown");

		case (CLAIMSMANAGER):
			return new UserConfig("bchmielewska", "gw","unknown");
		case (OPSADMIN):
			return new UserConfig("awilson", "gw","unknown");
		case (ITADMIN):
			return new UserConfig("hit1", "gw","unknown");
		case (SIUHANDLER):
			return new UserConfig("sknight", "gw","unknown");
		case (SIUMANAGER):
			return new UserConfig("siumanager", "gw","unknown");
		}

		return null;
	}

}
