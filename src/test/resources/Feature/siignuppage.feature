@tag
Feature: signup page features

  Scenario: verification of Field is Required message
    Given you are on the Signup Page of Datocms
    When Any field is Empty
    Then should give message, Field is Required

  Scenario: verification of Terms and Conditions  button
    Given you are on the Signup Page of Datocms
    When Not Accepted Terms and Conditions
    Then should give message, Field needs to be checked

  Scenario: verification of email invalid message
    Given you are on the Signup Page of Datocms
    When Entered email without @gmail.com
    Then should give message, email invalid

  Scenario: verification of Signup button
    Given you are on the Signup Page of Datocms
    When user clicks on Signup after entering all details
    Then User is redirected to dashboard

  Scenario: verification of Login button
    Given you are on the Signup Page of Datocms
    When user clicks on Login Link
    Then User is redirected to Login Page
