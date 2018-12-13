Feature: CBPCL-xxx As an Operator, I want to be able to add theft detail to insured vehicle

  
  Background: 
    Given As a ClaimsHandler I am at step3 for FNOL

 
  Scenario: CBPCL-176 TC1 
    And I input "Some idiot crashed into me!" into the "Circumstances" box on step3
 #   And I input "Mainly for going to work" into the "Journey Purpose" box on step3
    And I select "Theft" from "Incident Type" field on step3
    And I select "Theft From Vehicle" from "Cause" field on step3
    And I select "Audio from locked vehicle" from "Sub Cause" field on step3
    And I select "Business" from "Vehicle Used For" field on step3
    And I select the insureds vehicle at step3
    Then I will be on vehicle screen for FNOL
