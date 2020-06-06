Feature: Search product on Amazon searchBox
  As a customer I want to search product on Amazon site to purchase


  Scenario: Search product
    Given I am at Amazon Home Page
    And I enter IPhone in search input field
    When I click on search button
    Then I should see IPhone

#  Scenario: Search product by quantity
#    Given I am at Amazon Home Page
#    And I enter IPhone in search input field
#    When I click on search button
#    Then I should see IPhone
#
#  Scenario: Search product by color
#    Given I am at Amazon Home Page
#    And I enter IPhone in search input field
#    When I click on search button
#    Then I should see IPhone