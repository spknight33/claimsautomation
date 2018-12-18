package com.big.automation.selenium_webdriver.claimcenter.testdata;

public class ClaimCenterDataBuilder {
	
	public static ClaimCenterData createDataSet()
	{
		// hard coded for now - read from config file later
		ClaimCenterTestData data = new ClaimCenterTestData();
		
		data.policyNumber = "2647106169";
		data.firstName = "Paul";
		data.lastName = "Milligan";
		data.insuredVRN = "ND58PFL";
		data.address = "5 The Grove, Newcastle, NE31PX";
		
		return data;
	}

}
