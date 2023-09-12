Feature: Getting the Price of the Item

  @Snapdeal
  Scenario Outline: Price of the Item on Snapdeal
    Given Read the test data  "<TestData>" from Excel file Data
    When Navigate to the url on Page on Snapdeal
    And Search on Any Product of the Item
    Then Verify The Price of Item

    Examples: 
      | TestData  |
      | TestData2 |

  @Snapdeal
  Scenario Outline: Added to the Cart of Item
    Given Read the test data  "<TestData>" from Excel file Data
    When Navigate to the url on Page on Snapdeal
    And Search on Any Product of the Item
    Then Add to the Item on Cart on Page
    And Click on Proceed Checkout

    Examples: 
      | TestData  |
      | TestData2 |

  @Snapdeal
  Scenario Outline: Create Account for Snapdeal
    Given Read the test data  "<TestData>" from Excel file Data
    When Navigate to the url on Page on Snapdeal
    And However to SignUp Button
    And Click on your Account

    Examples: 
      | TestData  |
      | TestData2 |

  @Snapdeal
  Scenario Outline: Create Account for Snapdeal
    Given Read the test data  "<TestData>" from Excel file Data
    When Navigate to the url on Page on Snapdeal
    And However to Men's Fashion
    And Click on Sports Shoes
    Then Verify Sports Shoes for Men tab

    Examples: 
      | TestData  |
      | TestData2 |
