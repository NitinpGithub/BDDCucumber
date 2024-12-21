Feature: Search functionality

Scenario: User search for valid products
Given User open the application
When User enter valid product "HP" into search box
And User clicks on search button
Then User should get valid products displayed on screen


Scenario: User search for Invalid products
Given User open the application
When User enter invalid product "Honda" into search box
And User clicks on search button
Then User should get message about no product matching

Scenario: User search without any products
Given User open the application
When User does not enter anything into search box
And User clicks on search button
Then User should get message about no product matching