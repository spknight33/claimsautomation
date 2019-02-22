
@Ignore
Feature: CBPCL-528 We require the attached users to be created.The users will all have the ability to make payments and create reserves.
  All managers will have the ability to authorise payments and authorise reserves as well as create payments and reserves.

  Background: 
    Given I use test data set "regression_accident_fault"
    Given I access ClaimCenter login page

  Scenario Outline: CBPCL-528 TC1 User has access to Create a Reserve
    When I login to ClaimCenter as "<user>" with "<password>"
    And I Select an existing Claim
    And I select the Actions Popup Menu Hierarchy "Reserve"
    Then I will see post FNOL Reserves screen

    Examples: 
      | user  | password | user info                |
      | HIT1  | gw       | Handler IT Admin user1   |
      | HIT2  | gw       | Handler IT Admin user2   |
      | HCS1  | gw       | Claims Support Handler 1 |
      | HCS2  | gw       | Claims Support Hanlder 2 |
      | HAD1  | gw       | AD Handler 1             |
      | HAD2  | gw       | AD Handler 2             |
      | HTPC1 | gw       | TP Capture Handler 1     |
      | HTPC2 | gw       | TP Capture Handler 2     |
      | HPI1  | gw       | PI Handler 1             |
      | HPI2  | gw       | PI Handler 2             |
      | HCH1  | gw       | Credit Hire Handler 1    |
      | HCH2  | gw       | Credit Hire Handler 2    |
      | HSIU1 | gw       | SIU Handler 1            |
      | HSIU2 | gw       | SIU Handler 2            |
      | HTPD1 | gw       | TPPD Handler 1           |
      | HTPD2 | gw       | TPPD Handler 2           |
      | MAD1  | gw       | AD Team Manager 1        |
      | MAD2  | gw       | AD Team Manager 2        |
      | MCS1  | gw       | Claims Support Manager 1 |
      | MCS2  | gw       | Claims Support Manager 2 |
      | MTPD1 | gw       | TPPD Manager 1           |
      | MTPD2 | gw       | TPPD Manager 2           |
      | MPI1  | gw       | PI Team Manager 1        |
      | MPI2  | gw       | PI Team Manager 2        |
      | MTPC1 | gw       | TP Capture Manager 1     |
      | MTPC2 | gw       | TP Capture Manager 2     |
      | MCH1  | gw       | Credit Hire Manager 1    |
      | MCH2  | gw       | Credit Hire Manager 2    |
      | MSIU1 | gw       | SIU Manager 1            |
      | MSIU2 | gw       | SIU Manager 2            |
      | CM1   | gw       | Claims Manager 1         |
      | CM2   | gw       | Claims Manager 2         |
      
      
      Scenario Outline: CBPCL-528 TC2 User has access to Create a System Cheque
    When I login to ClaimCenter as "<user>" with "<password>"
    And I Select an existing Claim
    And I select the Actions Popup Menu Hierarchy "Cheque"
    Then I will see post FNOL New System Cheque Step1 screen


    Examples: 
      | user  | password | user info                |
      | HIT1  | gw       | Handler IT Admin user1   |
      | HIT2  | gw       | Handler IT Admin user2   |
      | HCS1  | gw       | Claims Support Handler 1 |
      | HCS2  | gw       | Claims Support Hanlder 2 |
      | HAD1  | gw       | AD Handler 1             |
      | HAD2  | gw       | AD Handler 2             |
      | HTPC1 | gw       | TP Capture Handler 1     |
      | HTPC2 | gw       | TP Capture Handler 2     |
      | HPI1  | gw       | PI Handler 1             |
      | HPI2  | gw       | PI Handler 2             |
      | HCH1  | gw       | Credit Hire Handler 1    |
      | HCH2  | gw       | Credit Hire Handler 2    |
      | HSIU1 | gw       | SIU Handler 1            |
      | HSIU2 | gw       | SIU Handler 2            |
      | HTPD1 | gw       | TPPD Handler 1           |
      | HTPD2 | gw       | TPPD Handler 2           |
      | MAD1  | gw       | AD Team Manager 1        |
      | MAD2  | gw       | AD Team Manager 2        |
      | MCS1  | gw       | Claims Support Manager 1 |
      | MCS2  | gw       | Claims Support Manager 2 |
      | MTPD1 | gw       | TPPD Manager 1           |
      | MTPD2 | gw       | TPPD Manager 2           |
      | MPI1  | gw       | PI Team Manager 1        |
      | MPI2  | gw       | PI Team Manager 2        |
      | MTPC1 | gw       | TP Capture Manager 1     |
      | MTPC2 | gw       | TP Capture Manager 2     |
      | MCH1  | gw       | Credit Hire Manager 1    |
      | MCH2  | gw       | Credit Hire Manager 2    |
      | MSIU1 | gw       | SIU Manager 1            |
      | MSIU2 | gw       | SIU Manager 2            |
      | CM1   | gw       | Claims Manager 1         |
      | CM2   | gw       | Claims Manager 2         |
      
      
      
