Feature: Getting reques url

  Scenario: Getting request from reques website
    Given Hit the APi
    When Get the response from website
    And print the response
    Then print the particular path
