@Ignore
Feature: CBPCL-62 As a claims handler searching for a policy (Step 1 of the FNOL wizard) 
I want to see the required search fields so we can easily identify the correct policy.


Background:
Given As a "ClaimsHandler" I am at step1 for FNOL

@Ignore
Scenario: CBPCL-62 TC1 OOTB policy search fields are hidden/visible from user
Then I will see the policy search input fields at step1 FNOL
| PolicyNumber | First Name | Last Name | Policy Type | Loss Date | Country | Town/City | Postcode | VRN | 
And I will not see the policy search input fields at step1 FNOL
|SSN or Tax id |  Organisation name |

@Ignore
Scenario: CBPCL-62 TC3 ClaimsHandler can find the policy on policy center by searching VRN
When I set the policy search criteria field at step1 FNOL "vrn" to "12563"
When I Click Search at step1 FNOL 
Then I will see policy search results at step1 FNOL which contains value "12563" for the "VRN"

@Ignore
Scenario: CBPCL-62 TC4 ClaimsHandler can select a search for policy and will see claims fields
When I Click Search at step1 FNOL
And I select the first policy in the results at step1 FNOL
Then I will see the New Claim fields at step1 FNOL
|  Claim Loss Date | Time | Type Of Claim |

@Ignore
Scenario: CBPCL-62 TC5 ClaimsHandler Claim Fields are mandatory after selecting a policy
When I Click Search at step1 FNOL
And I select the first policy in the results at step1 FNOL
Then I click next button at step1 FNOL
Then Mandatory field error message will be shown at step1 FNOL

@Ignore
Scenario: CBPCL-62 TC6 ClaimsHandler can find the policy on policy center by searching first name and last name
When I set the policy search criteria field at step1 FNOL "firstname" to "John"
And I set the policy search criteria field at step1 FNOL "lastname" to "Smith"
When I Click Search at step1 FNOL
Then I will see policy search results at step1 FNOL which contains value "John Smith" for the "insured"

@Ignore
Scenario: CBPCL-62 TC7 ClaimsHandler can find the policy on policy center by searching policy number
When I set the policy search criteria field at step1 FNOL "policynumber" to "1596588080"
When I Click Search at step1 FNOL
Then I will see policy search results at step1 FNOL which contains value "1596588080" for the "policynumber"

@Ignore
Scenario: CBPCL-62 TC8 ClaimsHandler can find the policy on policy center by searching VRN in lowercase
When I set the policy search criteria field at step1 FNOL "vrn" to "ls54cyw"
When I Click Search at step1 FNOL
Then I will see policy search results at step1 FNOL which contains value "LS54CYW" for the "VRN"

@Ignore
Scenario: ClaimsHandler can proceed to step2 if all mandatory fields are supplied
When I Click Search at step1 FNOL
And I select the first policy in the results at step1 FNOL
And I Set the Loss Date to "03/12/2018" at step1 FNOL
And I Set the Loss Time to "03:00 PM" at step1 FNOL
And I click next button at step1 FNOL
Then I will be on step2 for FNOL


