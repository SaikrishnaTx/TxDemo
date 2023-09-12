@MyShopclues
Feature: Validate the Login of ShopCLues



  @MyShopclues
  Scenario Outline: Enter the Valid credentials of ShopCLues
    Given Read the test data "<TestData>" from Excel file on My Excel Data
    When Navigate to the url on ShopClues
    And Enter Item of the Product

    Examples: 
      | TestData  |
      | TestData2 |
