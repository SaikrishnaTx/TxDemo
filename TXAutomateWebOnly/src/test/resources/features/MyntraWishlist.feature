Feature: Add to the cart of Product


    @Myntra
    Scenario Outline: Add to the Cart of Product
    Given Read the test data "<TestData>" from Excel file on TestData Sheet
    When  Navigate to the url on Myntra Page
    Then  Verify My Profile Link is Visible or Not

    Examples: 
      | TestData  |
      | TestData1 |
