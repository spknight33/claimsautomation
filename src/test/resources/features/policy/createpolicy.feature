@Ignore
Feature: tests


Scenario: test policy create
 Given I use test data set "regress_fnol_accident_fault"
 Given I access PolicyCenter login page
    When I login to PolicyCenter as "su" with "gw"
    And I select the Desktop Actions Popup Menu Hierarchy "New Account"
And I set the policy account field "FirstName" to "Steve"
And I set the policy account field "LastName" to "Knight-itb1"
And I Click Search at account create
And I Click create new person account
And I set the policy create account field "Brand" to "Insure The Box"
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
And I set the submission step3 field "Title" to "Miss"
And I set the submission step3 field "Occupation" to "Accommodation Officer"