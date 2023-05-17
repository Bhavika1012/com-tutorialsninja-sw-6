Feature: Products Test
  As a user I want to check that there are six products displayed on the products page


  @smoke @regression
  Scenario: Verify that six products are displayed on the page
    Given I am on homepage
    When I enter username "standard_user"
    And I enter password "secret_sauce"
    And I click on login button
    Then I should login successfully
    And I should verify the product text is displayed on the page
    Then    I verify '6' number of products displayed on page