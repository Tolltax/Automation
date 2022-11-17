package com.sharafdgMember.TestCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.sharafdgMember.PageObject.BaseClass;
import com.sharafdgMember.PageObject.LoginBrand;

import UtilitiesHelpers.GetScreenShot;

public class CheckOutProcess extends BaseClass { 

	
	//WebDriver driver;
	
	@Test
	public void Checkout() throws IOException {
		

		driver.get(BaseURL);
		LoginBrand lp = new LoginBrand(driver);
		lp.SetUserName(Username);
		lp.SetPassword(paassword);
		lp.clickSubmit();
        
		driver.navigate().to(Product1);
		
		GetScreenShot GS = new GetScreenShot();
		
		
		GS.FullSS(driver, "C:\\Users\\cstechmk02\\Desktop\\Order Process\\TC_001\\"+"PDP");
		
		
		
	}
	
	
	
}
