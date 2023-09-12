package stepDefinitions;


import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.FlipkartRegistartion;
import pages.AccountCreationPage;
import pages.FlipkartLoginPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductDetailPage;
import pages.ProductListPage;
import utilities.ExcelDataUtil;
import utilities.GlobalUtil;
import utilities.KeywordUtil;
 

public class FlipkartRegistration extends KeywordUtil {
	@SuppressWarnings("rawtypes")
	static Class thisClass = FlipkartRegistration.class;
	static String testCaseID = thisClass.getSimpleName();

	static String logStep;
	public WebDriver driver;
	public static HashMap<String, String> dataMap = new HashMap<String, String>();

	
	@Given("Read the test data  {string} from Excel file  on File")
	public void read_the_test_data_from_excel_file_on_file(String arg1) {
		try {
			KeywordUtil.cucumberTagName = "Web";
			dataMap = ExcelDataUtil.getTestDataWithTestCaseID(arg1, "Flipkart");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	
	  
	}

	@When("Navigate to the url on Page")
	public void navigate_to_the_url_on_page() {
		try {
			
			navigateToUrl(dataMap.get("URL"));

		} catch (Exception e) {
			
		}
	
	}

	@When("Validate the popup on Login Screen")
	public void validate_the_popup_on_login_screen() {
		try {
			KeywordUtil.delay(2000);
			KeywordUtil.click(FlipkartLoginPage.LoginCancelBtn, "Cancel the Login Popup on The Screen");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	
	}

	@When("Search on item on the cart of the product")
	public void search_on_item_on_the_cart_of_the_product() {
		try {
			
			FlipkartRegistartion.searchForAnItem(dataMap);
			

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@Then("Verify item added in the Cart page")
	public void verify_item_added_in_the_cart_page() {
		try {
			
			KeywordUtil.switchToWindow();
			if (KeywordUtil.isWebElementPresent(FlipkartLoginPage.AddtoCart, "Find add to cart button to click and add product to cart."))
				KeywordUtil.clickCart(FlipkartLoginPage.AddtoCart, "Click on Add to Cart");
		        
			else
				KeywordUtil.clickCart(FlipkartLoginPage.AddtoCart, "Click on Add to Cart");		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@Then("Navigate to home Page on Flipkart")
	public void navigate_to_home_page_on_flipkart() {
		try {
			KeywordUtil.click(FlipkartLoginPage.LoginLink, "Click on home page");
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}
	
	

}
