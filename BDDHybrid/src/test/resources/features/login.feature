Feature: Login functionality

Scenario: login with valid credeitial
Given User navigates to login page
When User enter valid Email "np4026@gmail.com" into email field
And User enter valid password "Swapnali@2201" into password field
And User click login button
Then User is able to login successful

Scenario: login with Invalid credeitial
Given User navigates to login page
When User enter Invalid Email "abc@gmail.com" into email field
And User enter Invalid password "Nitin@2201" into password field
And User click login button
Then User should get a warning message about credential mismatch

Scenario: login with valid Email and Invalid password 
Given User navigates to login page
When User enter valid Email "np4026@gmail.com" into email field
And User enter Invalid password "Nitin@2201" into password field
And User click login button
Then User should get a warning message about credential mismatch

Scenario: login with Invalid Email and valid password 
Given User navigates to login page
When User enter Invalid Email "nnpatil1122@gmail.com" into email field
And User enter valid password "Swapnali@2201" into password field
And User click login button
Then User should get a warning message about credential mismatch

Scenario: login without any credential
Given User navigates to login page
When User enter nothing into email field
And User enter nothing into password field
And User click login button
Then User should get a warning message about credential mismatch








