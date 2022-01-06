Feature: Test Hooks uses common before and after method for all scenarios

Scenario: This is tutorialsninja register account
          Given I open tutorialsninja application
          When I click on my account dropdown menu
          And click on register option
          Then I should be taken to register account page
          When I enter the details required for user registration on register account page
          Then user account should be created and user should get logged in
 