Feature: user Register
user should able to login
  Scenario: login with valid credential
    Given user navigate to Register page
    When user enter valid email  "abs@gmail.com"
    And enter  password "1234"
    And click login button
    Then user should login successfully