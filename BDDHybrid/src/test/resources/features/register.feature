Feature: Registration functionality

Scenario: User create account only with mandatory field
Given User navigates to the Registration URL
When user enter below fields
|	firstName					|Indra|
|	lastName					|Patil|
|	email							|Nitin@gmail.com|
|	telephone					|1122334455|
|	password					|Indra@1234|
And User Mark checkbox of privacy policy
When User click on continue button
Then User account should get created


Scenario: User create account all field
Given User navigates to the Registration URL
When user enter below fields
|	firstName					|Indra|
|	lastName					|Patil|
|	email							|indra@gmail.com|
|	telephone					|1122334455|
|	password					|Indra@1234|
And user select Yes for Newsletter 
And User Mark checkbox of privacy policy
And User click on continue button
Then User account should get created


Scenario: User create duplicate account
Given User navigates to the Registration URL
When user enter below fields
|	firstName					|Indra|
|	lastName					|Patil|
|	email							|indra@gmail.com|
|	telephone					|1122334455|
|	password					|Indra@1234|
And user select Yes for Newsletter 
And User Mark checkbox of privacy policy
And User click on continue button
Then User should get proper warning message about duplicate account

Scenario: User create account withought filling any details
Given User navigates to the Registration URL
When user does not enter any details into mandatory field
And User click on continue button
Then User should get proper warning message for entering mandatory field