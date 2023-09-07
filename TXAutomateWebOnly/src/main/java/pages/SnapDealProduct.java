package pages;

import org.openqa.selenium.By;

public class SnapDealProduct {

	
	public static By ItemPrice=By.xpath("//*[contains(text(),'HomeStore-YEP Single PVC Green TV Cover for Other')]//parent::a//div[@class='product-price-row clearfix']/div[@class='lfloat marR10']//following-sibling::span[@class='lfloat product-price']");
    public static By SearchBar=By.xpath("//input[@name='keyword' and @id='inputValEnter']");
    public static By ListofPrices=By.xpath("//span[@class='lfloat product-price']");
    public static By Item=By.xpath("//p[contains(text(),'HomeStore-YEP Single PVC Multi TV Cover for Mi 81cm')]");
    public static By AddCart=By.xpath("//span[text()='add to cart']");
    public static By ProceedtoCheckOut=By.xpath("//a[@class='btn marR5']");
    public static By LoginorSignUp=By.xpath("//*[contains(text(),'Log In / Sign Up')]");
    public static By SnapdealIcon=By.xpath("//img[@title='Snapdeal']//preceding::a/img");
    public static By SignIn=By.xpath("//*[@class='sd-icon sd-icon-user']");
    public static By YourAccount=By.xpath("//a[text()='Your Account']");
    public static By Menu=By.xpath("//div[@class='menuIconBar']");
    public static By Sportsshoes=By.xpath("//*[@id='category1Data']/div/div/div/p/a/span[text()='Sports Shoes']");
    public static By MensFashion=By.xpath("(//a[@class='menuLinks leftCategoriesProduct ']//span//following-sibling::span)[1]");
    public static By sportshoesforMen=By.xpath("//h1[@itemprop='name']");
    
    
    
    
}
