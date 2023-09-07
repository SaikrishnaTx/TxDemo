@eBay
Feature: Create The eBay Account
 
  @eBay
  Scenario Outline: Create the New Account for eBay
    Given Read the test data "<TestData>" from Excel file on Sheet
    When  Navigate the URL of eBay
    And   Click on Register Button
    And   Click on Personal Account Button
    And   Enter the Mandatory Fields on Page

      Examples: 
      | TestData  |
      | TestData1 |
      
      
    @eBay
    Scenario Outline: Add to the Product of the cart in eBay
    Given Read the test data "<TestData>" from Excel file on Sheet
    When  Navigate the URL of eBay
    And   Search on Item of the Product
    
      Examples: 
      | TestData  |
      | TestData1 |
