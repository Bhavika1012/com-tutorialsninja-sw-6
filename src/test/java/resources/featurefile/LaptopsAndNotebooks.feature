Feature: Account Login Test
  As user I want to login into TutorialsNinja website

  @sanity @regression
  Scenario: verify user should navigate to login page successfully
    Given   I am on the homePage
    And     I click on 'myaccount' tab
    And     I select 'login' option from my account
    Then    I verify "Returning Customer" message on account login page

  @smoke @regression
  Scenario: Verify that user should login and Logout Successfully
    Given   I am on the homePage
    And     I click on 'myaccount' tab
    And     I select 'login' option from my account
    And     I enter email address "johnsmith@gmail.com"
    And     I enter password "Jsmith@123"
    And     I click On Login Button
    And     I click on 'myaccount' tab
    And     I select "logout" option from my account option
    Then    I verify "Account Logout" message