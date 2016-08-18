Feature: First scenario with rest assured

  Scenario Positive scenario - enquiry
    Given registration is existent in MPP
    When i send a valid enquiry request
    Then i should receive details of  registration as response