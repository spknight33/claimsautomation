package com.big.automation.selenium_webdriver.claimcenter.testdata;


public interface ClaimCenterData  {


	// For Step1 FNOL
    String getPolicyNumber();
    String getFirstLastName();
    String getFirstName();
    String getInsuredVRN();
    String getAddress();
    String getLossDate();
    String getLossTime();

    String getClaimNumber();
    
    
    String getStep3FNOLIncidentType();
    String getStep3FNOLCause();
    String getStep3FNOLSubCause();
    
    boolean atStep2FNOLPHVehicleRequired();
    
    boolean atStep3FNOLPedestrianRequired();
    boolean atStep3FNOLPropertyRequired();
    boolean atStep3FNOLTPVehicleRequired();
    boolean atStep3FNOLPoliceRequired();
    
    boolean atStep2FNOLInsuredVehicleRequired();
    
    boolean atTPVehicleStep3FNOLDriverRequired();
    boolean atTPVehicleStep3FNOLPassengerRequired();
    
    boolean atPHVehicleStep3FNOLDriverRequired();
    boolean atPHVehicleStep3FNOLPassengerRequired();
    
    boolean atPedestrianStep3FNOLInjuryRequired();
    
}
