@Myweb
Feature: Validate the Login of eBay



  @eBayWeb
  Scenario Outline: Enter the Valid credentials of eBay
    Given Read the test data  "<TestData>" from Excel file  on ExcelPath
    When Navigate to the url on EBay Page
    And Click on the SignIn Link
    And Enter Valid username & Password
    And Click on SignIn Button
    Then Verify Login Successfully
    And Click on Logout

    Examples: 
      | TestData  |
      | TestData1 |

  @eBayWeb
  Scenario Outline:Add to the Cart Item
  
    Given Read the test data  "<TestData>" from Excel file  on ExcelPath
    When Navigate to the url on EBay Page
    And  Select the Books of dropdown
    And  Search of Item in eBay

    Examples: 
      | TestData  |
      | TestData1 |
