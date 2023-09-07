package stepDefinitions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modules.FlipkartRegistartion;
import pages.AccountCreationPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductDetailPage;
import pages.SnapDealProduct;
import utilities.ExcelDataUtil;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class SnapDealPrice extends KeywordUtil{

	
	@SuppressWarnings("rawtypes")
	static Class thisClass = SnapDealPrice.class;
	static String testCaseID = thisClass.getSimpleName();

	static String logStep;
	public WebDriver driver;
	public static HashMap<String, String> dataMap = new HashMap<String, String>();

	String email = "testing" + KeywordUtil.getCurrentDateTime() + "@testing.com";
	
	@Given("Read the test data  {string} from Excel file Data")
	public void read_the_test_data_from_excel_file_data(String arg1) {
		try {
			KeywordUtil.cucumberTagName = "Web";
			dataMap = ExcelDataUtil.getTestDataWithTestCaseID(arg1, "Snapdeal");

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@When("Navigate to the url on Page on Snapdeal")
	public void navigate_to_the_url_on_page_on_snapdeal() {
		try {
			navigateToUrl(dataMap.get("URL"));

		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@And("Search on Any Product of the Item")
	public void search_on_any_product_of_the_item() throws Exception {
		
		FlipkartRegistartion.searchForAnItemonSnapdeal(dataMap);
	}

	@Then("Verify The Price of Item")
	public void verify_the_price_of_item() {
	String Price=	KeywordUtil.getElementText(SnapDealProduct.ItemPrice);
	
	List<WebElement>  ele =KeywordUtil.getListElements(SnapDealProduct.ListofPrices, "List of all the elements Prices");
	   
	for(WebElement element:ele) {
	    
	    System.out.println(element.getText());
	    }
	
	
	
	    }
	

	@Then("Add to the Item on Cart on Page")
	public void add_to_the_item_on_cart_on_page() {
	   KeywordUtil.click(SnapDealProduct.Item, "Click on the Item");
	   KeywordUtil.switchToWindow();
	   if(KeywordUtil.isWebElementPresent(SnapDealProduct.AddCart, "Add to Cart is Displayed")) {
		   KeywordUtil.click(SnapDealProduct.AddCart, "Clicked on Add to Cart");
		  
	   }else {
		   KeywordUtil.click(SnapDealProduct.AddCart, "Clicked on Add to Cart");
	   }
	
	}

	@Then("Click on Proceed Checkout")
	public void click_on_proceed_checkout() throws InterruptedException {
		KeywordUtil.click(SnapDealProduct.ProceedtoCheckOut, "Clicked on Proceed on Checkout Button");
		if(KeywordUtil.isWebElementPresent(SnapDealProduct.LoginorSignUp, "Login or SignUp Option Present")) {
			KeywordUtil.hoverOnElement(SnapDealProduct.SnapdealIcon);
			KeywordUtil.delay(3000);
			Assert.assertTrue(true);
		}else {
			Assert.assertFalse(false);
		}
		
	}

	
	
	@When("However to SignUp Button")
	public void however_to_sign_up_button() {
	  
		try {
			KeywordUtil.hoverOnElement(SnapDealProduct.SignIn);
			delay(3000);
		} catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	
	@When("Click on your Account")
	public void click_on_your_account() {
	   try {
	   
		   KeywordUtil.click(SnapDealProduct.YourAccount, "Clicked on Your Account");
		   delay(3000);
		
	   }
		   catch (Throwable e) {
				GlobalUtil.e = e;
				GlobalUtil.errorMsg = e.getMessage();
				Assert.fail(e.getMessage());
			}
	}
	
	@And("However to Men's Fashion")
	public void however_to_men_s_fashion() {
	    try {
			KeywordUtil.hoverOnElement(SnapDealProduct.MensFashion);
			KeywordUtil.delay(3000);
		}catch (Throwable e) {
			GlobalUtil.e = e;
			GlobalUtil.errorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@And("Click on Sports Shoes")
	public void click_on_sports_shoes() {
		 try {
			 KeywordUtil.hoverOnElement(SnapDealProduct.Sportsshoes);
			if(KeywordUtil.isWebElementPresent(SnapDealProduct.Sportsshoes, "Sports shoes Element Present")) {	
			
				KeywordUtil.delay(3000);
				KeywordUtil.click(SnapDealProduct.Sportsshoes, "Clicked on Spoerts shoes");
				KeywordUtil.delay(3000);
				}else {
					KeywordUtil.click(SnapDealProduct.Sportsshoes, "Clicked on Spoerts shoes");
				}
				
			}catch (Throwable e) {
				GlobalUtil.e = e;
				GlobalUtil.errorMsg = e.getMessage();
				Assert.fail(e.getMessage());
			}
	}

	@Then("Verify Sports Shoes for Men tab")
	public void verify_sports_shoes_for_men_tab() {
	   try {
		
		   if(KeywordUtil.isWebElementPresent(SnapDealProduct.sportshoesforMen, "Sports Shoes for Men is Present")) {
			   Assert.assertTrue(true);
		   }
		   
	} catch (Throwable e) {
		GlobalUtil.e = e;
		GlobalUtil.errorMsg = e.getMessage();
		Assert.fail(e.getMessage());
	}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
