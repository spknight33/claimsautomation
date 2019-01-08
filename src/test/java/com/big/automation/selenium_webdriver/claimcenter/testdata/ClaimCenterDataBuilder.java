package com.big.automation.selenium_webdriver.claimcenter.testdata;

public class ClaimCenterDataBuilder {
	
	public static ClaimCenterData createDataSet()
	{
		// hard coded for now - read from config file later
		ClaimCenterTestData data = new ClaimCenterTestData();
		
		data.policyNumber = "2647106169";
		
		
		//data.policyNumber = "2180708729"; 
		//TST policy
		
		data.firstName = "Paul";
		data.lastName = "Milligan";
		data.insuredVRN = "ND58PFL";
		data.address = "5 The Grove, Newcastle, NE31PX";
		//data.address = "12 The grove, newcastle, NE31PX";
		data.lossDate = "20/12/2018";
		data.lossTime = "09:00 AM";
		data.claimNumber ="000-00-000009";
		
		data.atStep2FNOLPHVehicleRequired = true;
		
		//step3 FNOL
		data.step3FNOLIncidentType = "Accident";
		data.step3FNOLCause = "Accident Involving Animal";
		data.step3FNOLSubCause = "Collided with animal - owner known";
		
		
		data.atStep3FNOLPedestrianRequired = false;
		data.atStep3FNOLPropertyRequired= false;
		data.atStep3FNOLTPVehicleRequired= false;
		data.atStep3FNOLPoliceRequired= false;
	    
		data.atStep2FNOLInsuredVehicleRequired= true;
	    
		data.atTPVehicleStep3FNOLDriverRequired= false;
		data.atTPVehicleStep3FNOLPassengerRequired= false;
	    
		data.atPHVehicleStep3FNOLDriverRequired= true;
		data.atPHVehicleStep3FNOLPassengerRequired= false;
		
		return data;
	}

}
