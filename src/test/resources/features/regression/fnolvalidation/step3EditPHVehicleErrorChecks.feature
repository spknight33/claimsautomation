@Ignore @regressionmandatoryfields 
Feature: Regression test for errors for step3 edit PH Vehicle - Theft and Fire

  Background: 
    Given I use test data set "regress_fnol_accident_fault"
    And As a "ADClaimsHandlerTm1" I am at step3 for FNOL


  Scenario: FNOL Regression for PH vehicle - TC1 - check error messages for Accident type
    And I will be on step3 for FNOL
    And I select "Accident" from "Incident Type" field on step3
    And I select the insureds vehicle at step3
    And I click ok button on vehicle screen
    Then Mandatory field error messages will be shown for Vehicle screen in FNOL
    | Do you know the number of occupants, including the driver? : Missing required field "Do you know the number of occupants, including the driver?" |
 
    
  
  Scenario: FNOL Regression for PH vehicle - TC2 - check error messages for Accident type when known number of occupants
    And I will be on step3 for FNOL
    And I select "Accident" from "Incident Type" field on step3
    And I select the insureds vehicle at step3
    And I select "Yes" from "Occupants Known" on vehicle screen
    And I click ok button on vehicle screen
   Then Mandatory field error messages will be shown for Vehicle screen in FNOL
    | Number of Occupants : Missing required field "Number of Occupants" |
 
  Scenario: FNOL Regression for PH vehicle - TC3 - check error messages for Fire type
    And I will be on step3 for FNOL
    And I select "Fire" from "Incident Type" field on step3
    And I select the insureds vehicle at step3
     And I click ok button on vehicle screen
    Then Mandatory field error messages will be shown for Vehicle screen in FNOL
    | Do you know the number of occupants, including the driver? : Missing required field "Do you know the number of occupants, including the driver?" |

 

 Scenario: FNOL Regression for PH vehicle - TC4 - check error messages for Theft type
    And I will be on step3 for FNOL
    And I select "Theft" from "Incident Type" field on step3
    And I select the insureds vehicle at step3
     And I click ok button on vehicle screen
    Then Mandatory field error messages will be shown for Vehicle screen in FNOL
    | How many sets of keys were you provided with upon vehicle purchase? : Missing required field "How many sets of keys were you provided with upon vehicle purchase?"|
    | How many sets of keys are currently in your possession? : Missing required field "How many sets of keys are currently in your possession?" |
    | Do you know the number of occupants, including the driver? : Missing required field "Do you know the number of occupants, including the driver?" |