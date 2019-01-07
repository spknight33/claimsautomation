package com.big.automation.selenium_webdriver.claimcenter.testdata;

public class ClaimCenterTestData implements ClaimCenterData {

	public String policyNumber;
	public String claimNumber;
	public String firstName;
	public String lastName;
	public String insuredVRN;
	public String address;
	public String lossDate;
	public String lossTime;
	
	
	public boolean atStep2FNOLPHVehicleRequired;
	
	public String step3FNOLIncidentType;
	public String step3FNOLCause;
	public String step3FNOLSubCause;
	
	public boolean atStep3FNOLPedestrianRequired;
	public boolean atStep3FNOLPropertyRequired;
	public boolean atStep3FNOLTPVehicleRequired;
	public boolean atStep3FNOLPoliceRequired;
    
	public boolean atStep2FNOLInsuredVehicleRequired;
    
	public boolean atTPVehicleStep3FNOLDriverRequired;
	public boolean atTPVehicleStep3FNOLPassengerRequired;
    
	public boolean atPHVehicleStep3FNOLDriverRequired;
	public boolean atPHVehicleStep3FNOLPassengerRequired;
    
	public boolean atPedestrianStep3FNOLInjuryRequired;
	
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
	@Override
	public String getClaimNumber() {
		
		return claimNumber;
	}

	@Override
	public boolean atStep3FNOLPedestrianRequired() {
		
		return this.atStep3FNOLPedestrianRequired;
	}

	@Override
	public boolean atStep3FNOLPropertyRequired() {
		
		return this.atStep3FNOLPropertyRequired;
	}

	@Override
	public boolean atStep3FNOLTPVehicleRequired() {
		
		return this.atStep3FNOLTPVehicleRequired;
	}

	@Override
	public boolean atStep3FNOLPoliceRequired() {
		
		return this.atStep3FNOLPoliceRequired;
	}

	@Override
	public boolean atStep2FNOLInsuredVehicleRequired() {
		
		return this.atStep2FNOLInsuredVehicleRequired;
	}

	@Override
	public boolean atTPVehicleStep3FNOLDriverRequired() {
		
		return this.atTPVehicleStep3FNOLDriverRequired;
	}

	@Override
	public boolean atTPVehicleStep3FNOLPassengerRequired() {
		
		return this.atTPVehicleStep3FNOLPassengerRequired;
	}

	@Override
	public boolean atPHVehicleStep3FNOLDriverRequired() {
		
		return this.atPHVehicleStep3FNOLDriverRequired;
	}

	@Override
	public boolean atPHVehicleStep3FNOLPassengerRequired() {
		
		return this.atPHVehicleStep3FNOLPassengerRequired;
	}

	@Override
	public boolean atPedestrianStep3FNOLInjuryRequired() {
		
		return this.atPedestrianStep3FNOLInjuryRequired;
	}

	@Override
	public String getStep3FNOLIncidentType() {
		
		return this.step3FNOLIncidentType;
	}

	@Override
	public String getStep3FNOLCause() {
		
		return this.step3FNOLCause;
	}

	@Override
	public String getStep3FNOLSubCause() {
		
		return this.step3FNOLSubCause;
	}

	@Override
	public boolean atStep2FNOLPHVehicleRequired() {
		
		return this.atStep2FNOLPHVehicleRequired;
	}
   
}
