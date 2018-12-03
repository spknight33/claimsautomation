Feature: CBPCL-62 As a claims handler searching for a policy (Step 1 of the FNOL wizard) 
I want to see the required search fields so we can easily identify the correct policy.


Background:
Given As a ClaimsHandler I am at step1 for FNOL


Scenario: CBPCL-62 TC1 OOTB policy search fields are hidden/visible from user
Then I will see the policy search input fields
| PolicyNumber | First Name | Last Name | Policy Type | Loss Date | Country | Town/City | Postcode | VRN |
And I will not see the policy search input fields
|SSN or Tax id | VIN | Organisation name |



Scenario: CBPCL-62 TC4 ClaimsHandler can select a search for policy and will see claims fields
When I Click Search 
And I select the first policy in the results
Then I will see the New Claim fields
|  Claim Loss Date | Time | Type Of Claim |


Scenario: CBPCL-62 TC5 ClaimsHandler Claim Fields are mandatory after selecting a policy
When I Click Search 
And I select the first policy in the results
Then I click next button on step1
Then Mandatory field error message will be shown


Scenario: CBPCL-62 TC9 ClaimsHandler can select a search for policy and will see claims fields