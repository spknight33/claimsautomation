@Ignore @createpolicy
Feature: TBB Policy Creation - Single Driver

  Scenario: test policy create - single driver
    Given I use test data set "policycreate_tbb1"
    Given I access PolicyCenter login page
    When I login to PolicyCenter as "tu1" with "Password1"
    And I select the Desktop Actions Popup Menu Hierarchy "New Account"
    And I set the policy account field "FirstName" to "Paul"
    And I set the policy account field "LastName" to "Knight-tbb1"
    And I Click Search at account create
    And I Click create new person account
    And I set the policy create account field "Brand" to "Tesco Bank Box"
    And I set the policy create account field "AddressType" to "Garaging Address"
    And I set the policy create account field "PrimaryPhone" to "Mobile"
    And I set the policy create account field "Mobile" to "07791438888"
    And I set the policy create account field "Email" to "sktbb@gmail.com"
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
    And I click the Add Claim button at submission step 3
    And I set the Claim Type field to "Theft of Car" at submission step 3
    And I set the Claim Date field to "11112016" at submission step 3
    And I set the submission step3 field "Convictions5Years" to "true"
    And I click the Add Conviction button at submission step 3
    And I set the Conviction Date field to "11112016" at submission step 3
    And I set the Conviction Code field to "AC12" at submission step 3
    And I set the Conviction Points field to "6" at submission step 3
    And I set the Conviction Months Disqualified field to "None" at submission step 3
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
    And I set the submission step4 field "ProductMiles" to "6000"
    And I set the submission step4 field "EstimateMiles" to "5000"
    And I set the submission step4 field "VolExcess" to "225"
    And I set the submission step4 field "Ncd" to "10+"
    And I Click AssignDriver at submission step4
    And I Click Quote at submission step4
    And I Click Issue Policy at submission step5
    And I Click Confirm Issue Policy at submission step5
