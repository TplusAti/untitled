Feature: Data Table POJO example

  @pojo
  Scenario:FB login
    Given user is on FB page
    And enter following info
    |EmailOrPhoneNumber|Password  |
    |test@test.com     |qwerty123!|