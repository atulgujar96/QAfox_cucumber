
Feature: parameter without example keyword

Scenario: hardcoding paramteres
        Given I am on facebook login page.
        When I enter username as "atul.mae@gmail.com" and password as "Jerry"
        And Click on login button
        Then Login should fail for incorrect credentials 
        But Relogin option should be available