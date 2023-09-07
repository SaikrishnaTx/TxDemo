package modules;

import java.util.HashMap;

import pages.AccountCreationPage;
import pages.FlipkartLoginPage;
import pages.LoginPage;
import pages.ProductListPage;
import pages.SnapDealProduct;
import stepDefinitions.SnapDealPrice;
import utilities.KeywordUtil;

public class FlipkartRegistartion {

	public static void searchForAnItem(HashMap<String, String> dataMap) throws Exception {
		KeywordUtil.inputText(FlipkartLoginPage.SearchItem, dataMap.get("SearchText"), "Enter the search text");
		KeywordUtil.delay(1000);
		KeywordUtil.pressEnter(FlipkartLoginPage.SearchItem);
		KeywordUtil.click(FlipkartLoginPage.ProductItem, "Select the Book");
		KeywordUtil.delay(2000);

	}
	
	
	public static void searchForAnItemonSnapdeal(HashMap<String, String> dataMap) throws Exception {
		KeywordUtil.inputText(SnapDealProduct.SearchBar, dataMap.get("SearchText"), "Enter the search text");
		KeywordUtil.delay(1000);
		KeywordUtil.pressEnter(SnapDealProduct.SearchBar);
		//KeywordUtil.click(FlipkartLoginPage.ProductItem, "Select the Book");
		KeywordUtil.delay(2000);

	}
}
