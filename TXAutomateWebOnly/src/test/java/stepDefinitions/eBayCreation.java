package stepDefinitions;

import java.awt.RenderingHints.Key;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import modules.AmazonRegistration;
import pages.eBayCreationPage;
import utilities.ExcelDataUtil;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class eBayCreation extends KeywordUtil{

	
	@SuppressWarnings("rawtypes")
	static Class thisClass = eBayCreation.class;
	static String testCaseID = thisClass.getSimpleName();

	static String logStep;
	public WebDriver driver;
	public static HashMap<String, String> dataMap = new HashMap<String, String>();
	
	@Given("Read the test data {string} from Excel file on Sheet")
	public void read_the_test_data_from_excel_file_on_sheet(String arg1) {
	
	try {
		KeywordUtil.cucumberTagName = "Web";
		dataMap = ExcelDataUtil.getTestDataWithTestCaseID(arg1, "eBay");
		
	}catch (Throwable e) {
		GlobalUtil.e = e;
		GlobalUtil.errorMsg = e.getMessage();
		Assert.fail(e.getMessage());
		}
	}

	@When("Navigate the URL of eBay")
	public void navigate_the_url_of_e_bay() {
	   try {
		
		   navigateToUrl(dataMap.get("URL"));
		   
	} catch (Throwable e) {
		GlobalUtil.e = e;
		GlobalUtil.errorMsg = e.getMessage();
		Assert.fail(e.getMessage());
		}
	   
	   
	}
	@And("Click on Register Button")
	public void click_on_register_button() {
	   try{KeywordUtil.click(eBayCreationPage.Register, "Clicked on Register Link");
	  
	   
	   }catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
			}
	}

	@And("Click on Personal Account Button")
	public void click_on_personal_account_button() {
	   try {
		   
		   if(KeywordUtil.isWebElementPresent(eBayCreationPage.PersonalAccount, "Clicked on Personal Account Button")) {
			   KeywordUtil.delay(3000);
		KeywordUtil.click(eBayCreationPage.PersonalAccount, "Clicked on Personal Account Button");
		 KeywordUtil.delay(3000);
		 }
	} catch (Throwable e) {
		GlobalUtil.e=e;
		GlobalUtil.errorMsg=e.getMessage();
		Assert.fail(e.getMessage());
	}
	   
}
	@And("Enter the Mandatory Fields on Page")
	public void enter_the_mandatory_fields_on_page() {
		 try {
			   
		modules.eBayCreation.FillRequiredColums(dataMap);
		KeywordUtil.delay(3000);
		
		
		} catch (Throwable e) {
			GlobalUtil.e=e;
			GlobalUtil.errorMsg=e.getMessage();
			Assert.fail(e.getMessage());
		} 
	}
	
	
	
}