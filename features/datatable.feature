Feature: My Data Table for google search

Scenario: Google search with data from Data Table
         Given User is on Google search page
         When user searches for data using data in data table appropriate results are displayed
         | word |
         | India | 
         | Swatch Bharat |
         | Selenium |
         | Core Java |
      