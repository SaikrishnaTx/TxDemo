package pages;

import org.openqa.selenium.By;

public class eBayCreationPage {

	
	public static By Register        = By.xpath("//a[text()='register']");
	public static By PersonalAccount = By.xpath("(//*[@class='radio'])[1]");
	public static By FirstName       = By.id("firstname");
	public static By LastName        = By.id("lastname");
	public static By Email           = By.id("Email");
	public static By Password        = By.id("password");
	public static By RegisterBtn     =By.xpath("//button[@name='EMAIL_REG_FORM_SUBMIT']");
	public static By SerachItem      =By.xpath("//input[@id='gh-ac']"); 
	public static By SignIn          =By.xpath("//span[@id='gh-ug']/a[text()='Sign in']");
	public static By UserName        =By.xpath("//input[@id='userid']");
	public static By ContinueBtn =By.xpath("//*[@name='signin-continue-btn']");
	public static By SignInPassword=By.xpath("//Input[@type='password']");
	public static By Signin=By.xpath("//button[@id='sgnBt']");
	public static By Profiletext=By.xpath("//button[contains(text(),'Hi')]");
	public static By Signout=By.linkText("Sign out");
	public static By dropdown=By.xpath("//select[@name='_sacat']");
	public static By Items=By.xpath("//div[@class='s-item__title']/span/span");
	
	
	
	
	
}
