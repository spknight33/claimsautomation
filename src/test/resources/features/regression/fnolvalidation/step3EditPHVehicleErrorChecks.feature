@Ignore
Feature: Regression test for errors for step3 edit PH Vehicle - Theft and Fire

  Background: 
    Given I use test data set "regression_set1"
    And As a "ClaimsHandler" I am at step3 for FNOL

 @Ignore
  Scenario: FNOL Regression for PH vehicle - check error messages for Accident type
    And I will be on step3 for FNOL
    And I select "Accident" from "Incident Type" field on step3
    And I select the insureds vehicle at step3
     And I click ok button on vehicle screen
  #  Then Mandatory field error messages will be shown for Vehicle screen in FNOL
  
   @Ignore
  Scenario: FNOL Regression for PH vehicle - check error messages for Fire type
    And I will be on step3 for FNOL
    And I select "Fire" from "Incident Type" field on step3
    And I select the insureds vehicle at step3
     And I click ok button on vehicle screen
  #  Then Mandatory field error messages will be shown for Vehicle screen in FNOL
 

 Scenario: FNOL Regression for PH vehicle - check error messages for Theft type
    And I will be on step3 for FNOL
    And I select "Theft" from "Incident Type" field on step3
    And I select the insureds vehicle at step3
     And I click ok button on vehicle screen
    Then Mandatory field error messages will be shown for Vehicle screen in FNOL
    | How many sets of keys were you provided with upon vehicle purchase? : Missing required field "How many sets of keys were you provided with upon vehicle purchase?"|
    | How many sets of keys are currently in your possession? : Missing required field "How many sets of keys are currently in your possession?" |