Feature: Facebook Logo

Background:
          Given User launch chrome browser

Scenario: Verify Logo presence on Facebook Home page
          When User open Facebook home page 
          Then User verify that Facebook logo is present or not
          And  User close browser