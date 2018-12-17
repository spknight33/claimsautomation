Feature: CBPCL-xxx As an Operator, I want to be able to add theft detail to insured vehicle

  
  Background: 
    Given As a ClaimsHandler I am at step3 for FNOL

 
  Scenario: CBPCL-176 TC1 
    And I input "Some idiot crashed into me!" into the "Circumstances" box on step3
    And I input "Mainly for going to work" into the "Journey Purpose" box on step3
    And I select "Theft" from "Incident Type" field on step3
    And I select "Theft From Vehicle" from "Cause" field on step3
    And I select "Audio from locked vehicle" from "Sub Cause" field on step3
    And I select "Business" from "Vehicle Used For" field on step3
    And I select "5 The Grove, Newcastle, NE31PX" from "Address Location" field on step3
    #  And I select "0-6 MPH" from "Impact Speed" field on step3
  #  And I select "Clear" from "Weather" field on step3
  #  And I select "Dry" from "Road Conditions" field on step3
  #  And I select "Yes" from "Photos" field on step3
  #  And I select "No" from "cctv" field on step3
  # And I select "Non fault" from "Fault Type" field on step3
    And I select the insureds vehicle at step3
    And I will be on vehicle screen for FNOL
     And I select "Garage" from "Usual Location" on vehicle screen
     And I select "Policyholder Address" from "Actual Location" on vehicle screen
      And I select "2" from "Keys Purchased" on vehicle screen
       And I select "6" from "Keys Possessed" on vehicle screen
    And I select "AddDriver" on vehicle screen
    And I select "Paul Milligan" from "Driver Name" on driver screen
    And I click ok button on driver screen
    And I click ok button on vehicle screen
    And I click add Vehicle on step3
    
    And I click finish button on step3
    
