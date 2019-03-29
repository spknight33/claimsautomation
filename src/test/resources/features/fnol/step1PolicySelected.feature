@Ignore
Feature: Policy selected in step1, I want to see the claims loss fields and progress to step 2 of FNOL


Background:
Given As a "ADClaimsHandlerTm1" I am at step1 for FNOL

@Ignore
Scenario: CBPCL-?? ClaimsHandler Claim Fields are mandatory after selecting a policy
When I set the policy search criteria field at step1 FNOL "policynumber" to "3936932782"
And I Click Search at step1 FNOL
Then I click next button at step1 FNOL
Then Mandatory field error messages will be shown at step1 FNOL
| Loss Date : Missing required field "Loss Date" | Loss Time : Missing required field "Loss Time" |

@Ignore
Scenario: ClaimsHandler can proceed to step2 if all mandatory fields are supplied
When I set the policy search criteria field at step1 FNOL "policynumber" to "3936932782"
And I Click Search at step1 FNOL
And I Set the Loss Date to "05/12/2018" at step1 FNOL
And I Set the Loss Time to "03:00 PM" at step1 FNOL
And I click next button at step1 FNOL
Then I will be on step2 for FNOL


