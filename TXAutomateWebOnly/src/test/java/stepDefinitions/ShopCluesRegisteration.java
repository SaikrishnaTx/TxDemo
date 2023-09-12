package stepDefinitions;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.ShopCLuesProduct;
import utilities.ExcelDataUtil;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class ShopCluesRegisteration extends KeywordUtil{

	@SuppressWarnings("rawtypes")
	static Class thisClass = ShopCluesRegisteration.class;
	static String testCaseID = thisClass.getSimpleName();

	static String logStep;
	public WebDriver driver;
	public static HashMap<String, String> dataMap = new HashMap<String, String>();
	
	
	@Given("Read the test data {string} from Excel file on My Excel Data")
	public void read_the_test_data_from_excel_file_on_my_excel_data(String arg1) {
		try {
			KeywordUtil.cucumberTagName = "Web";
			dataMap = ExcelDataUtil.getTestDataWithTestCaseID(arg1, "ShopClues");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	 @When("Navigate to the url on ShopClues")
	public void navigate_to_the_url_on_shop_clues() {
       try {
			System.out.println(dataMap.get("URL"));
			navigateToUrl(dataMap.get("URL"));

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	
	}
	 @And("Enter Item of the Product")
	 public void enter_item_of_the_product() {
		 try {
				KeywordUtil.inputText(ShopCLuesProduct.SerachItemtile, dataMap.get("SearchItem"), "Entered Item of the Product");
                KeywordUtil.pressEnter(ShopCLuesProduct.SerachItemtile);
				KeywordUtil.delay(3000);
		 }catch (Throwable e) {
					GlobalUtil.e = e;
					GlobalUtil.errorMsg = e.getMessage();
					Assert.fail(e.getMessage());
				}
	
	 }
}
