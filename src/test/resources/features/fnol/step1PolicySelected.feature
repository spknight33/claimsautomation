@Ignore
Feature: Policy selected in step1, I want to see the claims loss fields and progress to step 2 of FNOL


Background:
Given As a ClaimsHandler I am at step1 for FNOL

@Ignore
Scenario: CBPCL-?? ClaimsHandler Claim Fields are mandatory after selecting a policy
When I set the policy search criteria fields "policynumber" to "3936932782"
And I Click Search
Then I click next button on step1
Then Mandatory field error messages will be shown
| Loss Date : Missing required field "Loss Date" | Loss Time : Missing required field "Loss Time" |

@Ignore
Scenario: ClaimsHandler can proceed to step2 if all mandatory fields are supplied
When I set the policy search criteria fields "policynumber" to "3936932782"
And I Click Search 
And I Set the Loss Date to "05/12/2018"
And I Set the Loss Time to "03:00 PM"
And I click next button on step1
Then I will be on step2 for FNOL


