package com.big.automation.selenium_webdriver.claimcenter.testdata;

public class ClaimCenterDataBuilder {
	
	public static ClaimCenterData createDataSet()
	{
		// hard coded for now - read from config file later
		ClaimCenterTestData data = new ClaimCenterTestData();
		
		//data.policyNumber = "2647106169";
		data.policyNumber = "2180708729";
		data.firstName = "Paul";
		data.lastName = "Milligan";
		data.insuredVRN = "ND58PFL";
		//data.address = "5 The Grove, Newcastle, NE31PX";
		data.address = "12 The grove, newcastle, NE31PX";
		data.lossDate = "20/12/2018";
		data.lossTime = "09:00 AM";
		data.claimNumber ="000-00-000005";
		
		return data;
	}

}
