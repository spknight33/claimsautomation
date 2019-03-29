@Ignore
Feature: CBPCL-47 As a Claims Handler during FNOL step 3, I want to be able to record police details

  Background: 
   Given As a "ADClaimsHandlerTm1" I am at step3 for FNOL

   Scenario: CBPCL-47 TC2 Police details can be added at step3 of FNOL
   And I click add Police Details on step3
   And I will be on new police details screen for FNOL
   And I complete fields on FNOL new police details screen
  
   