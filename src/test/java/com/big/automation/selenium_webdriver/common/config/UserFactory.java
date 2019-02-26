package com.big.automation.selenium_webdriver.common.config;

public class UserFactory {

	public static final String ADHANDLER = "ADClaimsHandler";
	public static final String TPCHANDLER = "TPCClaimsHandler";
	public static final String PIHANDLER = "PIClaimsHandler";
	public static final String CREDITHIREHANDLER = "CHClaimsHandler";
	public static final String SIUHANDLER = "SIUUser";	
	public static final String CLAIMSSUPPORT = "ClaimsSupportHandler";
	public static final String TPDHANDLER = "TPDClaimsHandler";
	
	public static final String ADTEAMMANAGER = "ADTeamManager";
	public static final String TPCTEAMMANAGER = "TPCTeamManager";
	public static final String TPDTEAMMANAGER = "TPDTeamHandler";
	public static final String PITEAMMANAGER = "PITeamManager";
	public static final String CHTEAMMANAGER = "TCHTeamManager";
	public static final String CSTEAMMANAGER = "CSTeamManager";
	public static final String SIUMANAGER = "SIUManager";
	
	public static final String CLAIMSMANAGER = "ClaimsManager";
	//public static final String OPSADMIN = "OpsAdmin";
	public static final String ITADMIN = "ITAdmin";

	
	//public static final String DEFAULT = "Default";

	public static UserConfig getUserConfig(String role) {
		switch (role) {
		case (ADHANDLER):
			return new UserConfig("had1", "gw","unknown");
		case (TPCHANDLER):
			return new UserConfig("htpc1", "gw","unknown");
		case (PIHANDLER):
			return new UserConfig("hpi1", "gw","unknown");
		case (CREDITHIREHANDLER):
			return new UserConfig("hch1", "gw","unknown");
		case (CLAIMSSUPPORT):
			return new UserConfig("hcs1", "gw","unknown");
		case (TPDHANDLER):
			return new UserConfig("htpd1", "gw","unknown");
		case (SIUHANDLER):
			return new UserConfig("hsiu1", "gw","unknown");

		case (ADTEAMMANAGER):
			return new UserConfig("mad1", "gw","unknown");
		case (CSTEAMMANAGER):
			return new UserConfig("mcs1", "gw","unknown");
		case (TPDTEAMMANAGER):
			return new UserConfig("mtpd1", "gw","unknown");
		case (PITEAMMANAGER):
			return new UserConfig("mpi1", "gw","unknown");
		case (TPCTEAMMANAGER):
			return new UserConfig("mtpc1", "gw","unknown");
		case (CHTEAMMANAGER):
			return new UserConfig("mch1", "gw","unknown");

		case (CLAIMSMANAGER):
			return new UserConfig("cm1", "gw","unknown");
		//case (OPSADMIN):
		//	return new UserConfig("awilson", "gw","unknown");
		case (ITADMIN):
			return new UserConfig("hit1", "gw","unknown");
		
		case (SIUMANAGER):
			return new UserConfig("msiu1", "gw","unknown");
		}

		return null;
	}

}
