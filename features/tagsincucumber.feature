Feature: Tag in selenium1
Background:
    Given User navigates to Facebook webpage1

@Test1	
Scenario: 
   When User enter username1
   And User enter password1 
   And User click on login button1
   Then Login should fail1
   
@Test2 @Test3
Scenario: Search Word1
Given I am on google page1
When I enter search word in searchBox1
And press search Button1
Then I navigate to result page1

@Test3 @Test1
Scenario: Google Seach1 
Given User is on Google Home Page1 
When User searches appropriate result get displayed1 
|word| 
| India | 
| Swatch Bharat |
| Selenium |
| Core Java |
