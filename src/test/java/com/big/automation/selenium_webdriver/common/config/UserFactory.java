package com.big.automation.selenium_webdriver.common.config;

public class UserFactory {

	public static final String CLAIMSHANDLER = "ClaimsHandler";
	public static final String CLAIMSSUPPORT = "ClaimsSupport";
	public static final String TEAMMANAGER = "TeamManager";
	public static final String CLAIMSMANAGER = "ClaimsManager";
	public static final String OPSADMIN = "OpsAdmin";
	public static final String ITADMIN = "ITAdmin";
	//public static final String DEFAULT = "Default";

	public static UserConfig getUserConfig(String role) {
		switch (role) {
		case (CLAIMSHANDLER):
			return new UserConfig("sthomson", "gw","unknown");
		case (CLAIMSSUPPORT):
			return new UserConfig("sh1", "gw","unknown");

		case (TEAMMANAGER):
			return new UserConfig("rhenderson", "gw","unknown");

		case (CLAIMSMANAGER):
			return new UserConfig("bchmielewska", "gw","unknown");
		case (OPSADMIN):
			return new UserConfig("awilson", "gw","unknown");
		case (ITADMIN):
			return new UserConfig("jbutler", "gw","unknonw");
		}

		return null;
	}

}
