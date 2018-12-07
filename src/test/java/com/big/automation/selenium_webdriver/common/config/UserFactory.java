package com.big.automation.selenium_webdriver.common.config;

public class UserFactory {

	public static final String CLAIMSHANDLER = "ClaimsHandler";
	public static final String TEAMMANAGER = "TeamManager";
	public static final String CLAIMSMANAGER = "ClaimsManager";
	public static final String OPSADMIN = "OpsAdmin";
	public static final String ITADMIN = "ITAdmin";

	public static UserConfig getUserConfig(String role) {
		switch (role) {
		case (CLAIMSHANDLER):
			return new UserConfig("sthomson", "gw");

		case (TEAMMANAGER):
			return new UserConfig("rhenderson", "gw");

		case (CLAIMSMANAGER):
			return new UserConfig("bchmielewska", "gw");
		case (OPSADMIN):
			return new UserConfig("awilson", "gw");
		case (ITADMIN):
			return new UserConfig("jbutler", "gw");
		}

		return null;
	}

}
