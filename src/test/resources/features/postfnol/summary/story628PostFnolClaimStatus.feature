@Ignore
Feature: CBPCL-628 todo

  Background: 
    Given I use test data set "postfnol_set1"
    And I access ClaimCenter login page
    And I login to ClaimCenter as role "ADClaimsHandlerTm1"

  Scenario: CBPCL-628
    And I Select an existing Claim
    And I select "Status" submenu for "Summary" on the Claim Navigator
    And I will see post FNOL summary status screen
    And I click edit on post FNOL summary status screen
    And I set the post FNOL claim status screen field "IncidentOnly" to "true"
    And I set the post FNOL claim status screen field "DateReported" to "04/04/2019 09:29"
   #  And I set the post FNOL claim status screen field "CoverageInQuestion" to "false"
    And I click update on post FNOL summary status screen
    #TODO new fields when story ready

