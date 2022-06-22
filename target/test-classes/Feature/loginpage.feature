@tag
Feature: login page features

  Scenario: verification of Field Required messages
    Given you are on the Login Page of Datocms
    When Email field is empty
    Then should give message, FieldisRequired

  Scenario: verification of Email not valid message
    Given you are on the Login Page of Datocms
    When Entered not valid email
    Then should give message, Email not valid

  Scenario: verification of Invalid Credentials message
    Given you are on the Login Page of Datocms
    When Entered invalid credentials
    Then should give message, Credentials are incorrect!

  Scenario: verification of DatoCMS Link
    Given you are on the Login Page of Datocms
    When user clicks on DatoCMS Link
    Then User is redirected to new tab of DatoCMS homepage

  Scenario: verification of Reset Password button
    Given you are on the Login Page of Datocms
    When user clicks on Reset Password Link
    Then User is redirected to Forgot Password Page
