package modules;

import java.util.HashMap;

import pages.eBayCreationPage;
import utilities.KeywordUtil;

public class eBayCreation {

	static boolean flag;

	public static void FillRequiredColums(HashMap<String, String> dataMap)throws Exception {
		
		KeywordUtil.inputText(eBayCreationPage.FirstName, dataMap.get("FirstName"),"Entered First Name");
		KeywordUtil.inputText(eBayCreationPage.LastName, dataMap.get("LastName"), "Entered Last Name");
		KeywordUtil.inputText(eBayCreationPage.Email,  dataMap.get("Email"), "Entered Email");
		KeywordUtil.inputText(eBayCreationPage.Password,  dataMap.get("Password"), "Entered Password");
		KeywordUtil.click(eBayCreationPage.RegisterBtn, "Clicked on Register Button");
	}
	
}
