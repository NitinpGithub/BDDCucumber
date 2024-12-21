Feature: login for a new user
user should able to login
Scenario: login a new user
When the following user credential
|	username			|	abc@gmail.com	|
| password	      |	1234		    	|
And click login button
Then user should login successfully