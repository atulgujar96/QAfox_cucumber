Feature: Login functionality of facebook

Scenario Outline: Correct email and password
         Given user opens facebook login page
         When user enters "<uname>" and "<pass>" fields
         And clicks on login button
         Then user is navigated to home page
         Examples: 
         |uname|pass|
				 |first|firstpass|
				 |Second|otherPass|
				 |third|thirdpass|
				 |fourth|fourthpass|
				 |atul.mae@gmail.com|anderson@123|