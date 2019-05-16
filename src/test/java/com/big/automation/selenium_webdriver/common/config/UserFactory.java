package com.big.automation.selenium_webdriver.common.config;

import com.big.automation.selenium_webdriver.common.utilities.PropertyManager;

public class UserFactory {

	//public static final String ADHANDLERTM1 = "ADClaimsHandlerTm1";
	//public static final String ADHANDLERTM2 = "ADClaimsHandlerTm2";
	//public static final String TPCHANDLERTM1 = "TPCClaimsHandlerTm1";
	//public static final String PIHANDLERTM1 = "PIClaimsHandlerTm1";
	//public static final String PIHANDLERTM2 = "PIClaimsHandlerTm2";
	//public static final String CREDITHIREHANDLERTM1 = "CHClaimsHandlerTm1";
	//public static final String SIUHANDLERTM1 = "SIUUserTm1";	
	//public static final String CLAIMSSUPPORTTM1 = "ClaimsSupportHandlerTm1";
	//public static final String CLAIMSSUPPORTTM2 = "ClaimsSupportHandlerTm2";
	//public static final String TPDHANDLERTM1 = "TPDClaimsHandlerTm1";
	
	//public static final String ADTEAMMANAGERTM1 = "ADTeamManagerTm1";
	//public static final String ADTEAMMANAGERTM2 = "ADTeamManagerTm2";
//	public static final String TPCTEAMMANAGERTM1 = "TPCTeamManagerTm1";
	//public static final String TPDTEAMMANAGERTM1 = "TPDTeamManagerTm1";
	//public static final String PITEAMMANAGERTM1 = "PITeamManagerTm1";
	//public static final String PITEAMMANAGERTM2 = "PITeamManagerTm2";
	//public static final String CHTEAMMANAGERTM1 = "CHTeamManagerTm1";
	//public static final String CSTEAMMANAGERTM1 = "CSTeamManagerTm1";
	//public static final String CSTEAMMANAGERTM2 = "CSTeamManagerTm2";
	//public static final String SIUMANAGERTM1 = "SIUManagerTm1";
	
	//public static final String CUSTOMEROPSMANAGER = "CustOpsTeamManager";
	//public static final String TECHOPSMANAGER = "TechOpsTeamManager";
	//public static final String OPSADMIN = "OpsAdmin";
	//public static final String ITADMIN = "ITAdmin";

	
	//public static final String DEFAULT = "Default";

	public static UserConfig getUserConfig(String team) {
		
		
		return PropertyManager.getInstance().getUserForTeam(team);
		/*
		switch (role) {
		case (ADHANDLERTM1):
			return new UserConfig("had1", "gw","unknown",null);
		case (ADHANDLERTM2):
			return new UserConfig("had2", "gw","unknown",null);
		case (TPCHANDLERTM1):
			return new UserConfig("htpc1", "gw","unknown",null);
		case (PIHANDLERTM1):
			return new UserConfig("hpi1", "gw","unknown",null);
		case (PIHANDLERTM2):
			return new UserConfig("hpi2", "gw","unknown",null);
		case (CREDITHIREHANDLERTM1):
			return new UserConfig("hch1", "gw","unknown",null);
		case (CLAIMSSUPPORTTM1):
			return new UserConfig("hcs1", "gw","unknown",null);
		case (CLAIMSSUPPORTTM2):
			return new UserConfig("hcs2", "gw","unknown",null);
		case (TPDHANDLERTM1):
			return new UserConfig("htpd1", "gw","unknown",null);
		case (SIUHANDLERTM1):
			return new UserConfig("hsiu1", "gw","unknown",null);

		case (ADTEAMMANAGERTM1):
			return new UserConfig("mad1", "gw","unknown",null);
		case (ADTEAMMANAGERTM2):
			return new UserConfig("mad2", "gw","unknown",null);
		case (CSTEAMMANAGERTM1):
			return new UserConfig("mcs1", "gw","unknown",null);
		case (CSTEAMMANAGERTM2):
			return new UserConfig("mcs2", "gw","unknown",null);
		case (TPDTEAMMANAGERTM1):
			return new UserConfig("mtpd1", "gw","unknown",null);
		case (PITEAMMANAGERTM1):
			return new UserConfig("mpi1", "gw","unknown",null);
		case (PITEAMMANAGERTM2):
			return new UserConfig("mpi2", "gw","unknown",null);
		case (TPCTEAMMANAGERTM1):
			return new UserConfig("mtpc2", "gw","unknown",null); // way it has been setup
		case (CHTEAMMANAGERTM1):
			return new UserConfig("mch1", "gw","unknown",null);

		case (CUSTOMEROPSMANAGER):
			return new UserConfig("cm1", "gw","unknown",null);
		case (TECHOPSMANAGER):
			return new UserConfig("cm2", "gw","unknown",null);
		//case (OPSADMIN):
		//	return new UserConfig("awilson", "gw","unknown",null);
		case (ITADMIN):
			return new UserConfig("hit1", "gw","unknown",null);
		
		case (SIUMANAGERTM1):
			return new UserConfig("msiu1", "gw","unknown",null);
		}

		return null;
		
		*/
	}

}
