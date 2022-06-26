package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import UtilsHelpers.GetScreenShot;
import pageobject.BaseClass;
import pageobject.LoginBrand;

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
