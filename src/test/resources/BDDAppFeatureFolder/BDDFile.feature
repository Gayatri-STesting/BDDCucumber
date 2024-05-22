Feature: login functionality
Scenario: login to application
Given I am at login page
When I enter username
And I enter password
And I click login button
Then I should get logged into application

