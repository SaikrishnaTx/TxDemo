@ShopClues
Feature: Add to the cart any Item of Shopclues

  @ShopClues
  Scenario Outline: Search the Product and Add to the Cart Item of the Product in SHopclues
    Given Read the "TestData" From Excle File
    When Navigate the Shopclues Website

    Examples: 
      | TestData  |
      | TestData1 |
