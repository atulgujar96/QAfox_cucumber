Feature: login functionality

@Sanity
Scenario: verifying login with valid username and valid password
      Given I open the tutorialsninja application
      When I click on My Account drop menu and click on login option
      And I enter valid email address and valid password in the text fields on login page
      And click on login button
      Then user gets logged in and user is taken to my accounts page.