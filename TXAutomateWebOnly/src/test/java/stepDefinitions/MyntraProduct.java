package stepDefinitions;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.MyntraPage;
import utilities.ExcelDataUtil;
import utilities.GlobalUtil;
import utilities.KeywordUtil;


public class MyntraProduct extends KeywordUtil {


	@SuppressWarnings("rawtypes")
	static Class thisClass = MyntraProduct.class;
	static String testCaseID = thisClass.getSimpleName();

	static String logStep;
	public WebDriver driver;
	public static HashMap<String, String> dataMap = new HashMap<String, String>();

	String email = "testing" + KeywordUtil.getCurrentDateTime() + "@testing.com";
	
	@Given("Read the test data {string} from Excel file on TestData Sheet")
	public void read_the_test_data_from_excel_file_on_test_data_sheet(String arg1) {
		try {
			KeywordUtil.cucumberTagName = "Web";
			dataMap = ExcelDataUtil.getTestDataWithTestCaseID(arg1, "Myntra");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@When("Navigate to the url on Myntra Page")
	public void navigate_to_the_url_on_myntra_page() {
		try {
			
			navigateToUrl(dataMap.get("URL"));

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@Then("Verify My Profile Link is Visible or Not")
	public void verify_my_profile_link_is_visible_or_not() {
try {
			if(KeywordUtil.isWebElementPresent(MyntraPage.Profile, "Profile Element is Displayed")) {
				Assert.assertTrue(true);
			}else {
				Assert.assertFalse(false);
			}
			

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}
	}
	
	
	
	

