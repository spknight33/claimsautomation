@Ignore
Feature: CBPCL-xxx As an Operator, I want to be able to add theft detail to insured vehicle

 
    

  @Ignore
  Scenario: CBPCL-176 TC1
   Given As a "ClaimsHandler" I am at step3 without insured vehicle for FNOL
    And I input "Some idiot crashed into me!" into the "Circumstances" box on step3
    And I input "Mainly for going to work" into the "Journey Purpose" box on step3
    And I select "Theft" from "Incident Type" field on step3
    And I select "Theft From Vehicle" from "Cause" field on step3
    And I select "Audio from locked vehicle" from "Sub Cause" field on step3
    And I select "Business" from "Vehicle Used For" field on step3
    And I select "5 The Grove, Newcastle, NE31PX" from "Address Location" field on step3
    And I click add Vehicle on step3
    And I input "ND58HFL" into the "VRN" box on vehicle screen
    And I input "2007" into the "Year" box on vehicle screen
    And I input "BMW" into the "Make" box on vehicle screen
    And I input "3 Series" into the "Model" box on vehicle screen
    And I select "Garage" from "Usual Location" on vehicle screen
    And I select "Policyholder Address" from "Actual Location" on vehicle screen
    And I select "2" from "Keys Purchased" on vehicle screen
    And I select "6" from "Keys Possessed" on vehicle screen
    And I select "AddDriver" on vehicle screen
    And I select "Paul Milligan" from "Driver Name" on driver screen
    And I click ok button on driver screen
    And I click ok button on vehicle screen
    And I click add Vehicle on step3
    And I input "ND58HFL" into the "VRN" box on vehicle screen
    And I input "2007" into the "Year" box on vehicle screen
    And I input "BMW" into the "Make" box on vehicle screen
    And I input "3 Series" into the "Model" box on vehicle screen
    And I click "New Person" on owner picker
    And I select "Mr." from "Prefix" on person details screen
    And I input "Jimmy" into the "First Name" box on person details screen
    And I input "Mack" into the "Last Name" box on person details screen
    And I input "07771234567" into the "Mobile" box on person details screen
    And I input "gmack@gmail.com" into the "Email" box on person details screen
    And I input "55 The Wynd" into the "Address Line1" box on person details screen
    And I select "Update" on person details screen
    And I click ok button on vehicle screen
    And I click finish button on step3
