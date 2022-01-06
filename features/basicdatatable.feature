Feature: Simple Data table for single input1

Scenario: Successful login with valid credentials
          Given User is on the Home page
          When User navigates to login page
          And enters credentials to login
          | atul.mae@gmail.com | abc@123 |
          Then User is taken to My account page.
          