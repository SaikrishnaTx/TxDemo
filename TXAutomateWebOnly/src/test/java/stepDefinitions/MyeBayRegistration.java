package stepDefinitions;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.api.robot.Keyboard;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.eBayCreationPage;
import utilities.ExcelDataUtil;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class MyeBayRegistration  extends KeywordUtil{

	
	@SuppressWarnings("rawtypes")
	static Class thisClass = MyeBayRegistration.class;
	static String testCaseID = thisClass.getSimpleName();

	static String logStep;
	public WebDriver driver;
	public static HashMap<String, String> dataMap = new HashMap<String, String>();
	
	
	
	
	@Given("Read the test data  {string} from Excel file  on ExcelPath")
	public void read_the_test_data_from_excel_file_on_excel_path(String arg1) {
		try {
			KeywordUtil.cucumberTagName = "Web";
			dataMap = ExcelDataUtil.getTestDataWithTestCaseID(arg1, "MyeBay");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@When("Navigate to the url on EBay Page")
	public void navigate_to_the_url_on_e_bay_page() {
try {
			
			navigateToUrl(dataMap.get("URL"));

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@And("Click on the SignIn Link")
	public void click_on_the_sign_in_link() {
try {
			
			KeywordUtil.click(eBayCreationPage.SignIn, "Click on Sign in Link");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@And("Enter Valid username & Password")
	public void enter_valid_username_password() {
try {
			
			KeywordUtil.inputText(eBayCreationPage.UserName, dataMap.get("UserName"), "Entered the username on Field");
            KeywordUtil.delay(2000);
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}
	
	@And("Click on SignIn Button")
	public void click_on_sign_in_button() {
try {
			
			KeywordUtil.click(eBayCreationPage.ContinueBtn, "CLicked on Continue Button");
			KeywordUtil.delay(2000);
			KeywordUtil.inputText(eBayCreationPage.SignInPassword, dataMap.get("Password"), "Entered Password");
			KeywordUtil.click(eBayCreationPage.Signin, "Clicked on Sign In Button");
			KeywordUtil.delay(2000);
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@Then("Verify Login Successfully")
	public void verify_login_successfully() {
try {
	  KeywordUtil.selectByVisibleText(eBayCreationPage.dropdown, "Baby", "Select the Baby");
	  KeywordUtil.delay(2000);
			if(KeywordUtil.isWebElementVisible(eBayCreationPage.Profiletext, "Hi Text is Displayed")) {
				
				Assert.assertTrue(true);
			}else {
				Assert.assertFalse(false);;
			}
			
			
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@And("Click on Logout")
	public void click_on_logout() {
		try {
			
			KeywordUtil.hoverOnElement(eBayCreationPage.Profiletext);
			KeywordUtil.click(eBayCreationPage.Signout, "Clicked on Signout Link");
		
			
			KeywordUtil.delay(5000);
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}
	
	@And("Select the Books of dropdown")
	public void select_the_books_of_dropdown() {
   try {
	   KeywordUtil.inputText(eBayCreationPage.SerachItem, dataMap.get("SearchItem"), "Entered the Product of in Field");
			KeywordUtil.selectByVisibleText(eBayCreationPage.dropdown, dataMap.get("SelectItem"), "Select the Cameras & Photo");
			KeywordUtil.delay(5000);
			
			
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}
	
	@And("Search of Item in eBay")
	public void search_of_item_in_e_bay() {
	    
	
		 try {
				
				
				KeywordUtil.pressEnter(eBayCreationPage.SerachItem);
				
			List<WebElement> item=	KeywordUtil.getListElements(eBayCreationPage.Items, "ALl items of the on Menu");
			KeywordUtil.delay(5000);
			System.out.println(item.size());
			for (WebElement webElement : item) {
				System.out.println(webElement.getText());
				KeywordUtil.delay(5000);
			}
			} catch (Throwable e) {
				GlobalUtil.e = e;
				GlobalUtil.errorMsg = e.getMessage();
				Assert.fail(e.getMessage());
			}
	
	
	
	
	}
	
	
}
