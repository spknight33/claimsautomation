@Ignore @regressionlossdetails
Feature: POST FNOL REGRESSION - various test of the Loss Details pages

  Background: 
    Given I use test data set "postfnol_set1"
    And I access ClaimCenter login page
    And I login to ClaimCenter as role "ADClaimsHandlerTm1"
    And I Select existing Claim "300000002"
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details

 
  Scenario: LOSS DETAILS POST FNOL Regression TC1 - ClaimsHandler can edit field in LOSS DETAILS screen post FNOL
    And I click edit button on post FNOL loss details
    When I input "Purpose changed by regression script test" into the "Journey Purpose" field on Loss Details post FNOL
    And I click update button on post FNOL loss details
 
 
  Scenario: LOSS DETAILS POST FNOL Regression TC2  - ClaimsHandler can add and re-edit TP VEHICLE from Loss Details post FNOL and VRN lookup works
    And I click edit button on post FNOL loss details
    And I click add Vehicle on post FNOL loss details
    And I will be on new vehicle screen on post FNOL
    And I select "Motor Car" from "Style" on new vehicle screen on post FNOL
    And I select "Owned" from "Vehicle Type" on new vehicle screen on post FNOL
    And I input "CY17NBX" into the "VRN" box on new vehicle screen on post FNOL
    And The value is "TRANSPORTER" for field "Model" on new vehicle screen on post FNOL
    And I select "Yes" from "Foreign" on new vehicle screen on post FNOL
    And I input "16000" into the "Mileage" box on new vehicle screen on post FNOL
    And I input "DAMAGE DESC ADDED BY REGRESSION SCRIPT" into the "Damage Description" box on new vehicle screen on post FNOL
    And I select "Yes" from "Credit Hire" on new vehicle screen on post FNOL
    And I select "Yes" from "Protocol Hire" on new vehicle screen on post FNOL
    And I select "Yes" from "Occupants Known" on new vehicle screen on post FNOL
    And I input "1" into the "Occupants Number" box on new vehicle screen on post FNOL
    And I click "Update" on new vehicle screen on post FNOL
    When I click edit TP Vehicle on post FNOL loss details
    Then I will be on edit vehicle screen on post FNOL
    And I input "26000" into the "Mileage" box on edit vehicle screen on post FNOL
    And I input "New details about the damage description" into the "Damage Description" box on edit vehicle screen on post FNOL
    And I select "Yes" from "TP Insurer Details Available" on edit vehicle screen on post FNOL
    And I click "Search Insurance Company" on edit vehicle screen on post FNOL
    And I input "Walsingham Motor Insurance" into the "Search Name" box on search address book screen
    And I select "Search" on search address book screen
    And I select "Select First Result" on search address book screen
    And I click "Ok" on edit vehicle screen on post FNOL

    Scenario: LOSS DETAILS POST FNOL Regression TC3 - ClaimsHandler can edit PH VEHICLE from Loss Details post FNOL for FIRE case
    And I click edit button on post FNOL loss details
    And I select "Fire" from "Incident Type" field on Loss Details post FNOL
    And I select "Vehicle Damaged By Fire" from "Cause" field on Loss Details post FNOL
    And I select "Arson attack" from "Sub Cause" field on Loss Details post FNOL
    And I click edit PH Vehicle on post FNOL loss details
    And I will be on edit vehicle screen on post FNOL
    And I select "Yes" from "Fire Visited Garage" on edit vehicle screen on post FNOL
    And I input "Took the car into garage last week" into the "Fire Visited Garage Details" box on edit vehicle screen on post FNOL
    And I click "Ok" on edit vehicle screen on post FNOL
    
    
    Scenario: LOSS DETAILS POST FNOL Regression TC4 - ClaimsHandler can edit PH VEHICLE from Loss Details post FNOL for THEFT case
    And I click edit button on post FNOL loss details
    And I select "Theft" from "Incident Type" field on Loss Details post FNOL
    And I select "Theft From Vehicle" from "Cause" field on Loss Details post FNOL
    And I select "Audio from locked vehicle" from "Sub Cause" field on Loss Details post FNOL
    And I click edit PH Vehicle on post FNOL loss details
    And I will be on edit vehicle screen on post FNOL
    And I select "Yes" from "Theft Windows Locked" on edit vehicle screen on post FNOL
    And I select "Yes" from "Theft Security Devices" on edit vehicle screen on post FNOL
    And I input "I have a crooklock" into the "Theft Security Devices Details" box on edit vehicle screen on post FNOL
    And I select "2" from "Theft Keys Purchased" on edit vehicle screen on post FNOL
    And I select "1" from "Theft Keys Possessed" on edit vehicle screen on post FNOL
    And I click "Ok" on edit vehicle screen on post FNOL
    
 
    Scenario: LOSS DETAILS POST FNOL Regression TC5 - ClaimsHandler can add and re-edit PEDESTRIAN from Loss Details post FNOL
    When I click edit button on post FNOL loss details
    When I click add Pedestrian on post FNOL loss details
    Then I will be on pedestrian screen on post FNOL
    And I select "Mr." from "Prefix" on pedestrian screen on post FNOL
    And I input "Johny" into the "Firstname" box on pedestrian screen on post FNOL
    And I input "Cash" into the "Lastname" box on pedestrian screen on post FNOL
    And I input "NE31PX" into the "Postcode" box on pedestrian screen on post FNOL
    And I select "11 Dene Grove, Newcastle upon Tyne, Tyne and Wear, NE3 1PX" from "Postcode Address" on pedestrian screen on post FNOL
    And I input "These are some notes" into the "Notes" box on pedestrian screen on post FNOL
    And I click "Injuries Tab" on pedestrian screen on post FNOL
    And I select "Yes" from "Injured" on pedestrian screen on post FNOL
    And I input "I was badly hurt" into the "Injury Description" box on pedestrian screen on post FNOL
	  And I click "Ok" on pedestrian screen on post FNOL
	  And I click edit Pedestrian on post FNOL loss details
	  And I will be on pedestrian screen on post FNOL
    And I click "Injuries Tab" on pedestrian screen on post FNOL
    And I input "50" into the "Moj Insured Liability" box on pedestrian screen on post FNOL
    And I input "50" into the "Moj Claimant Liability" box on pedestrian screen on post FNOL
    And I click "Add Moj Status" on pedestrian screen on post FNOL
    And I set moj entry for status "MOJ Stage 3 Settled Infant Approval" and date "01042019" on pedestrian screen on post FNOL
    And I click "Update" on pedestrian screen on post FNOL
    #And I click update button on post FNOL loss details

   
   Scenario: LOSS DETAILS POST FNOL Regression TC6 - ClaimsHandler can add and re-edit PROPERTY from Loss Details post FNOL
    When I click edit button on post FNOL loss details
    When I click add Property Damage on post FNOL loss details
    Then I will be on new property screen on post FNOL
    And I input "This is my house" into the "Property Description" box on new property screen on post FNOL
    And I input "Loads of damage" into the "Damage Description" box on new property screen on post FNOL
    And I input "5000" into the "Loss Estimate" box on new property screen on post FNOL
    And I input "NE31PX" into the "Postcode" box on new property screen on post FNOL
    And I select "12 Dene Grove, Newcastle upon Tyne, Tyne and Wear, NE3 1PX" from "Postcode Address" on new property screen on post FNOL
    And I select "Yes" from "Estimate Received" on new property screen on post FNOL
    And I input "4399" into the "Estimated Repair Cost" box on new property screen on post FNOL
    And I select "Yes" from "Already Repaired" on new property screen on post FNOL
    And I click "New Person Owner" on new property screen on post FNOL
    And I select "Mr." from "Prefix" on person details screen for Post FNOL
    And I input "Francois" into the "First Name" box on person details screen for Post FNOL
    And I input "Leblanc" into the "Last Name" box on person details screen for Post FNOL
    And I input "Lives in the property" into the "Location Description" box on person details screen for Post FNOL
    And I select "Update" on person details screen for Post FNOL
    And I click "Ok" on new property screen on post FNOL
    And I click edit Property on post FNOL loss details
    Then I will be on edit property screen on post FNOL
    And I select "Yes" from "Estimate Received" on edit property screen on post FNOL
    And I input "5300" into the "Estimated Repair Cost" box on edit property screen on post FNOL
    And I input "This is my new house" into the "Property Description" box on edit property screen on post FNOL
    And I input "NE31PX" into the "Postcode" box on edit property screen on post FNOL
    And I select "14 Dene Grove, Newcastle upon Tyne, Tyne and Wear, NE3 1PX" from "Postcode Address" on edit property screen on post FNOL
    And I click "Update" on edit property screen on post FNOL
    #And I click update button on post FNOL loss details

 
  Scenario: LOSS DETAILS POST FNOL Regression TC7 - ClaimsHandler can edit PH DRIVER from Loss Details post FNOL, to include changing PH indemnity values and injury details
    When I click edit button on post FNOL loss details
    When I click edit PH Driver on post FNOL loss details
    Then I will be on driver screen on post FNOL
    And I click "Edit" on driver screen on post FNOL
    And I select "Mr." from "Prefix" on driver screen on post FNOL
    And I select "Male" from "Gender" on driver screen on post FNOL
    And I input "These are some notes about the driver" into the "Notes" box on driver screen on post FNOL
    And I select "Amusement Arcade Owner" from "Indemnity Occupation" on driver screen on post FNOL
    And I select "DVLA aware - No licence restriction" from "Indemnity Medicals" on driver screen on post FNOL
    And I select "10 Years or More" from "Indemnity License Length" on driver screen on post FNOL
    And I select "No" from "Indemnity Incidents 5Years" on driver screen on post FNOL
    And I select "Yes" from "Indemnity Tested At Scene" on driver screen on post FNOL
   And I select "Yes" from "Indemnity Prosecutions" on driver screen on post FNOL
    And I select "Yes" from "Indemnity Seatbelt" on driver screen on post FNOL
    And I click "Injuries Tab" on driver screen on post FNOL
    And I select "Yes" from "Injured" on driver screen on post FNOL
    And I input "This is a pretty bad injury" into the "Injury Description" box on driver screen on post FNOL
    And I click "Update" on driver screen on post FNOL
    And I click update button on post FNOL loss details


 Scenario: LOSS DETAILS POST FNOL Regression TC8 - ClaimsHandler can edit TP DRIVER from Loss Details post FNOL, to include changing TP injury details
    When I click edit button on post FNOL loss details
    When I click edit TP Driver on post FNOL loss details
    Then I will be on driver screen on post FNOL
    And I click "Edit" on driver screen on post FNOL
    And I select "Mr." from "Prefix" on driver screen on post FNOL
    And I select "Male" from "Gender" on driver screen on post FNOL
    And I select "Yes" from "ThirdParty Seatbelt" on driver screen on post FNOL
    And I input "These are some notes about the TP driver" into the "Notes" box on driver screen on post FNOL
    And I click "Injuries Tab" on driver screen on post FNOL
    And I select "Yes" from "Injured" on driver screen on post FNOL
    And I input "This is a pretty bad injury for a TP driver" into the "Injury Description" box on driver screen on post FNOL
    And I click "Update" on driver screen on post FNOL
    And I click update button on post FNOL loss details


  Scenario: LOSS DETAILS POST FNOL Regression TC9 - ClaimsHandler can add/edit PH PASSENGER DRIVER from Loss Details post FNOL, to include changing PH Passenger injury details
    When I click edit button on post FNOL loss details
    And I click edit PH Vehicle on post FNOL loss details
    And I click "AddPassenger" on edit vehicle screen on post FNOL
     Then I will be on passenger screen on post FNOL
     And I select "Mrs." from "Prefix" on passenger screen on post FNOL
    And I input "Jimmy" into the "Firstname" box on passenger screen on post FNOL
    And I input "Todd" into the "Lastname" box on passenger screen on post FNOL
    And I input "NE31PX" into the "Postcode" box on passenger screen on post FNOL
    And I select "21 Dene Grove, Newcastle upon Tyne, Tyne and Wear, NE3 1PX" from "Postcode Address" on passenger screen on post FNOL
    And I input "These are some notes" into the "Notes" box on passenger screen on post FNOL
    And I click "Injuries Tab" on passenger screen on post FNOL
    And I select "Yes" from "Injured" on passenger screen on post FNOL
    And I input "I was badly hurt as a passenger" into the "Injury Description" box on passenger screen on post FNOL
	  And I click "Ok" on passenger screen on post FNOL
	  And I click "Ok" on edit vehicle screen on post FNOL
	  And I click edit PH Passenger on post FNOL loss details
    And I click "Edit" on passenger screen on post FNOL
    And I input "Toddy" into the "Lastname" box on passenger screen on post FNOL
    And I click "Ok" on passenger screen on post FNOL
    
    #And I click update button on post FNOL loss details 

  Scenario: LOSS DETAILS POST FNOL Regression TC10 - ClaimsHandler can add/edit TP PASSENGER DRIVER from Loss Details post FNOL, to include changing PH Passenger injury details
    When I click edit button on post FNOL loss details
    And I click edit TP Vehicle on post FNOL loss details
    And I click "AddPassenger" on edit vehicle screen on post FNOL
     Then I will be on passenger screen on post FNOL
     And I select "Mr." from "Prefix" on passenger screen on post FNOL
    And I input "Jeremiah" into the "Firstname" box on passenger screen on post FNOL
    And I input "Jones" into the "Lastname" box on passenger screen on post FNOL
    And I input "NE31PX" into the "Postcode" box on passenger screen on post FNOL
    And I select "29 Dene Grove, Newcastle upon Tyne, Tyne and Wear, NE3 1PX" from "Postcode Address" on passenger screen on post FNOL
    And I input "These are some notes" into the "Notes" box on passenger screen on post FNOL
    And I click "Injuries Tab" on passenger screen on post FNOL
    And I select "Yes" from "Injured" on passenger screen on post FNOL
    And I input "I was badly hurt as a TP passenger" into the "Injury Description" box on passenger screen on post FNOL
	  And I click "Ok" on passenger screen on post FNOL
	  And I click "Ok" on edit vehicle screen on post FNOL
	  And I click edit TP Passenger on post FNOL loss details
    And I click "Edit" on passenger screen on post FNOL
    And I input "Jones-smith" into the "Lastname" box on passenger screen on post FNOL
    And I click "Ok" on passenger screen on post FNOL
    

  