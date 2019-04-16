@Ignore
Feature: POST FNOL REGRESSION - various test of the Loss Details pages

  Background: 
    Given I use test data set "postfnol_set1"
    And I access ClaimCenter login page
    And I login to ClaimCenter as role "ADClaimsHandlerTm1"
    And I Select existing Claim "000-00-000143"
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details


  Scenario: LOSS DETAILS POST FNOL Regression TC1 - ClaimsHandler can edit field in Loss Details screen post FNOL
    And I click edit button on post FNOL loss details
    When I input "Purpose changed by regression script test" into the "Journey Purpose" field on Loss Details post FNOL
    And I click update button on post FNOL loss details
 
  
  Scenario: LOSS DETAILS POST FNOL Regression TC2  - ClaimsHandler can add TP Vehicle from Loss Details post FNOL and VRN lookup works
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
    And I click "Update" on new vehicle screen on post FNOL
    

    Scenario: LOSS DETAILS POST FNOL Regression TC3 - ClaimsHandler can edit PH Vehicle from Loss Details post FNOL for FIRE case
    And I click edit button on post FNOL loss details
    And I select "Fire" from "Incident Type" field on Loss Details post FNOL
    And I select "Vehicle Damaged By Fire" from "Cause" field on Loss Details post FNOL
    And I select "Arson attack" from "Sub Cause" field on Loss Details post FNOL
    And I click edit PH Vehicle on post FNOL loss details
    And I will be on edit vehicle screen on post FNOL
    And I select "Yes" from "Fire Visited Garage" on edit vehicle screen on post FNOL
    And I input "Took the car into garage last week" into the "Fire Visited Garage Details" box on edit vehicle screen on post FNOL
    And I click "Ok" on edit vehicle screen on post FNOL
    
   
    Scenario: LOSS DETAILS POST FNOL Regression TC4 - ClaimsHandler can edit PH Vehicle from Loss Details post FNOL for THEFT case
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
    
   @inprogress
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
    And I click update button on post FNOL loss details

  Scenario: CBPCL-216 TC3 ClaimsHandler can add Property from Loss Details post FNOL
      When I click edit button on post FNOL loss details
    When I click add Property Damage on post FNOL loss details
    Then I will be on new property screen
    And I complete all fields on post FNOL new property incident
    And I click update button on post FNOL loss details

 

   
 
  Scenario: CBPCL-216 TC13  ClaimsHandler can edit PH Vehicle from Loss Details post FNOL
    And I Select an existing Claim
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details
    When I click edit button on post FNOL loss details
    When I click edit PH Vehicle on post FNOL loss details
    Then I will be on edit vehicle screen on post FNOL
    And I click cancel button on edit vehicle screen on post FNOL edit

  
  Scenario: CBPCL-216 TC14  ClaimsHandler can edit TP Vehicle from Loss Details post FNOL
    And I Select an existing Claim
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details
    When I click edit button on post FNOL loss details
    When I click edit TP Vehicle on post FNOL loss details
    Then I will be on edit vehicle screen on post FNOL
    And I click cancel button on edit vehicle screen on post FNOL edit


  Scenario: CBPCL-216 TC15  ClaimsHandler can edit Pedestrian from Loss Details post FNOL
    And I Select an existing Claim
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details
    When I click edit button on post FNOL loss details
    When I click edit Pedestrian on post FNOL loss details
    Then I will be on edit pedestrian screen on post FNOL
    And I change fields on post FNOL edit pedestrian incident
    And I click update button on post FNOL loss details 


  Scenario: CBPCL-216 TC16  ClaimsHandler can edit property from Loss Details post FNOL
    And I Select an existing Claim
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details
    When I click edit button on post FNOL loss details
    When I click edit Property on post FNOL loss details
    Then I will be on edit property screen on post FNOL
    And I click cancel button on edit property screen on post FNOL

 
  Scenario: CBPCL-216 TC17  ClaimsHandler can edit PH driver from Loss Details post FNOL
    And I Select an existing Claim
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details
    When I click edit button on post FNOL loss details
    When I click edit PH Driver on post FNOL loss details
    Then I will be on edit Driver screen for post FNOL
    And I change fields on post FNOL edit PH driver incident
    And I click update button on post FNOL loss details 


  Scenario: CBPCL-216 TC18  ClaimsHandler can edit TP driver from Loss Details post FNOL
    And I Select an existing Claim
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details
    When I click edit button on post FNOL loss details
    When I click edit TP Driver on post FNOL loss details
    Then I will be on edit Driver screen for post FNOL
    And I change fields on post FNOL edit TP driver incident
     And I click update button on post FNOL loss details 


  Scenario: CBPCL-216 TC19  ClaimsHandler can edit PH passenger from Loss Details post FNOL
    And I Select an existing Claim
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details
    When I click edit button on post FNOL loss details
    When I click edit PH Passenger on post FNOL loss details
    Then I will be on Edit Passenger screen for post FNOL
    And I click edit button on edit passenger screen on post FNOL
    And I change fields on post FNOL edit PH passenger incident
    And I click ok button on edit passenger screen for post FNOL
    And I click update button on post FNOL loss details 


  Scenario: CBPCL-216 TC20  ClaimsHandler can edit TP passenger from Loss Details post FNOL
    And I Select an existing Claim
    And I select "Loss Details" on the Claim Navigator
    And I will see post FNOL loss details
    When I click edit button on post FNOL loss details
    When I click edit TP Passenger on post FNOL loss details
    Then I will be on Edit Passenger screen for post FNOL
    And I click cancel button on edit passenger screen for post FNOL
