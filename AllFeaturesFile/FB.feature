Feature: Test the Facebook Application

  Scenario: Test the RegisterPage Functionality
    Given user is on Facebook Register Page and validate the RegisterPage URL

  Scenario: Validate the FirstName and LastName
    And user enters the valid firstname and lastname

  Scenario: validate Email ID and Password Functionality
    And user enters a valid emailId and Password

  Scenario: Validate DOB Functionality
    And user enters a valid date , month and year

  Scenario: Validate Gender Functionality
    And user select a valid gender radiobutton
