package stepDefinitions;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.MyntraPage;
import utilities.ExcelDataUtil;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class ShopCluesProduct extends KeywordUtil {


	@SuppressWarnings("rawtypes")
	static Class thisClass = ShopCluesProduct.class;
	static String testCaseID = thisClass.getSimpleName();

	static String logStep;
	public WebDriver driver;
	public static HashMap<String, String> dataMap = new HashMap<String, String>();

	String email = "testing" + KeywordUtil.getCurrentDateTime() + "@testing.com";

	
	@Given("Read the {string} From Excle File")
	public void read_the_from_excle_file(String arg1) {
		try {
			 KeywordUtil.cucumberTagName = "Web";
			dataMap = ExcelDataUtil.getTestDataWithTestCaseID(arg1, "ShopClues");
			
			

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@When("Navigate the Shopclues Website")
	public void navigate_the_shopclues_website() {
try {
			
			navigateToUrl(dataMap.get("URL"));

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}
	
}