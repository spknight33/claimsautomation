package com.big.automation.selenium_webdriver.claimcenter.testdata;

public class ClaimCenterTestData implements ClaimCenterData {

	public String policyNumber;
	public String firstName;
	public String lastName;
	public String insuredVRN;
	public String address;
	public String lossDate;
	public String lossTime;
	
	@Override
	public String getPolicyNumber() {
		
		return policyNumber;
	}

	@Override
	public String getFirstLastName() {
		
		return firstName + " " + lastName;
	}

	@Override
	public String getFirstName() {
		
		return lastName;
	}

	

	@Override
	public String getInsuredVRN() {
		
		return insuredVRN;
	}

	@Override
	public String getAddress() {
		
		return address;
	}
	
	@Override
	public String getLossDate() {
		
		return lossDate;
	}
	
	@Override
	public String getLossTime() {
		
		return lossTime;
	}

   
}
