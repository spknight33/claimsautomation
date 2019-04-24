@Ignore @createpolicy 
Feature: Create DGT Policy with two drivers

  Scenario: test policy with two DGT drivers create
    Given I use test data set "policycreate_dgt1"
    Given I access PolicyCenter login page
    When I login to PolicyCenter as "tu1" with "Password1"
    And I select the Desktop Actions Popup Menu Hierarchy "New Account"
    And I set the policy account field "FirstName" to "Steve"
    And I set the policy account field "LastName" to "Knight-dgt1TwoDrivers"
    And I Click Search at account create
    And I Click create new person account
    And I set the policy create account field "Brand" to "Drive Like A Girl"
    And I set the policy create account field "AddressType" to "Garaging Address"
    And I set the policy create account field "PrimaryPhone" to "Mobile"
    And I set the policy create account field "Mobile" to "07791438888"
    And I set the policy create account field "Email" to "sk@gmail.com"
    And I set the policy create account field "Postcode" to "NE31PX"
    And I set the policy create account field "PostcodeAddress" to "6 Dene Grove, Newcastle upon Tyne, Tyne and Wear, NE3 1PX"
    And I Click Update at create person account
    And I select the Account Actions Popup Menu Hierarchy "New Submission"
    And I select product at step1 of submission create
    And I set the submission step2 field "HeardAbout" to "Endsleigh"
    And I Click Next at submission step2
    And I Click AddDriver at submission step3
    And I set the submission step3 field "Title" to "Mr."
    And I set the submission step3 field "Occupation" to "Accommodation Officer"
    And I set the submission step3 field "MaritalStatus" to "Single"
    And I set the submission step3 field "Gender" to "Male"
    And I set the submission step3 field "Resident" to "true"
    And I set the submission step3 field "OwnHome" to "true"
    And I set the submission step3 field "Dob" to "21/01/1990"
    And I Click Roles at submission step3
    And I set the submission step3 field "LicenseType" to "Full UK Licence"
    And I set the submission step3 field "License10Years" to "true"
    And I set the submission step3 field "OtherVehicles" to "true"
    And I set the submission step3 field "AddQuals" to "Pass Plus"
    And I set the submission step3 field "Medicals" to "DVLA aware - No licence restriction"
    And I set the submission step3 field "Rehab" to "false"
    And I set the submission step3 field "Cancelled" to "false"
    And I set the submission step3 field "Claims5Years" to "true"
    And I add multiple claims at submission step3
      | Claims                                           | Claim Date |
      | Accident will be or has been settled against you |   12112014 |
      | Accident will be or has been settled against you |   12112015 |
    And I set the submission step3 field "Convictions5Years" to "true"
    And I add multiple convictions at submission step3
      | points | disqualified | code | date     |
      |     10 | 0-6 Months   | AC10 | 11122014 |
    And I create New Person for a new Driver at submission step3
    And I set the Driver First Name field to "Mary" at new driver creation
    And I set the Driver DOB field to "11121990" at new driver creation
    And I set the Driver Title field to "Mrs." at new driver creation
    And I set the Driver Last Name field to "NamedDriver1" at new driver creation
    And I set the Driver Gender field to "Female" at new driver creation
    And I set the Driver Primary Occupation field to "Actor" at new driver creation
    And I set the Driver Marital Status field to "Single" at new driver creation
    And I set the Driver UK Resident for 5 Years field to "True" at new driver creation
    And I set the Driver Own their own home field to "True" at new driver creation
    And I set the Driver relationship to policyholder field to "Partner" at new driver creation
    And I set the Driver Primary Phone field to "Mobile" at new driver creation
    And I set the Driver Home Phone field to "07877676767" at new driver creation
    And I set the Driver Work Phone field to "07866565656" at new driver creation
    And I set the Driver Mobile Phone field to "07866565656" at new driver creation
    And I set the Driver Primary Email field to "nameddriver1@gmail.com" at new driver creation
    And I set the Driver Secondary Email field to "named@gmail.com" at new driver creation
    And I set the Driver License Type field to "Full Uk Licence" at new driver creation
    And I set the Driver License Number field to "11121112" at new driver creation
    And I set the Driver passed Driving test over 10 years ago field to "True" at new driver creation
    And I set the Driver Access to other Vehicles field to "false" at new driver creation
    And I set the Driver Additional Qualifications field to "No" at new driver creation
    And I set the Driver Medical Conditions field to "DVLA aware - no licence restriction" at new driver creation
    And I set the Driver Non Motoring Offences field to "false" at new driver creation
    And I set the Driver Policy Cancelled field to "false" at new driver creation
    And I set the Driver Other Claims field to "false" at new driver creation
  #  And I add multiple claims at new driver creation
  #    | Claims                                           | Claim Date |
  #    | Accident will be or has been settled against you |   12112016 |
    And I set the Driver Convictions field to "false" at new driver creation
  #  And I add multiple convictions at new driver creation
  #    | points | disqualified | code | date     |
  #    |     10 | 0-6 Months   | AC10 | 11122015 |
    And I Click Ok at new driver creation
    And I Click Next at submission step3
    And I Click AddVehicle at submission step4
    And I set the submission step4 field "Vrn" to "S99SJA"
    And I set the submission step4 field "SecurityDevice" to "Alarm"
    And I set the submission step4 field "Tracker" to "true"
    And I set the submission step4 field "Value" to "3575"
    And I set the submission step4 field "Modified" to "false"
    And I set the submission step4 field "DayParking" to "On Drive At Home"
    And I set the submission step4 field "NightParking" to "Garaged Overnight"
    And I set the submission step4 field "BuyMonth" to "January"
    And I set the submission step4 field "BuyYear" to "2017"
    And I set the submission step4 field "UseCar" to "Social Domestic and Pleasure only (including commuting)"
    And I set the submission step4 field "RegKeeper" to "true"
    And I set the submission step4 field "RhDrive" to "true"
    And I set the submission step4 field "Imported" to "false"
    And I set the submission step4 field "Less8Seats" to "true"
    And I set the submission step4 field "ProductMiles" to "7000"
    And I set the submission step4 field "EstimateMiles" to "5000"
    And I set the submission step4 field "VolExcess" to "225"
    And I set the submission step4 field "Ncd" to "10+"
    And I Click AssignDriver at submission step4
    And I Click AssignDriver who is not main driver at submission step4
    And I Click Quote at submission step4
    And I Click Issue Policy at submission step5
    And I Click Confirm Issue Policy at submission step5
