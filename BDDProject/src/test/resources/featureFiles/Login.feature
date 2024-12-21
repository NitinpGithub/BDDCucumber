Feature: user login
user should able to login
Background:Given user navigate to login page
Scenario: login with valid credential
When user enter valid email address"abc@gmail.com"
And enter valid password "1234"
And click on login button
Then user should login successfully

     