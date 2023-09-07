Feature: Add to the cart of the item

  @Flipkart
  Scenario Outline: Searching a product and add to cart for Valid Login
    Given Read the test data  "<TestData>" from Excel file  on File
    When Navigate to the url on Page
    And Validate the popup on Login Screen
    And Search on item on the cart of the product
    Then Verify item added in the Cart page
    And Navigate to home Page on Flipkart

    Examples: 
      | TestData  |
      | TestData3 |
