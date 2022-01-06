Feature: Test tagged hook

@First
Scenario: This is first scenario
          Given this is first step
          When this is second step
          Then this is third step
          
@Second
Scenario: This is second scenario
          Given this is first step
          When this is second step
          Then this is third step
          
@Third
Scenario: This is third scenario
          Given this is first step
          When this is second step
          Then this is third step