package TestCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.BaseClass;
import PageObject.login;
import utils.getScreenShot;

public class TC_01 extends BaseClass {


	
	@Test
	public void TC_1_ValideLogin() throws IOException {
		
		driver.get(BaseURL);
	
		login lp = new login(driver);
		//System.out.println(Getattribute() );

		
		
		lp.SetUserName(Username);
		lp.SetPassword(paassword);
		lp.clickSubmit();
		

	}
	
	@Test
	public void TC_2_InValideLogin() throws InterruptedException, IOException {
		
		driver.get(BaseURL);
		login lp = new login(driver);
		lp.SetUserName(InvalideUname);
		lp.SetPassword(Invalidepwd);
		lp.clickSubmit();
		Thread.sleep(5000);
		getScreenShot sc =new getScreenShot();
		sc.TakeScreenshot(driver, "C://Users//cstechmk02//Desktop//sharaf_Screenshot//TC_Login");

	}
	
	public void TC_3_LoginToDashBoard() {
		driver.get(BaseURL);
		login lp = new login(driver);
		lp.SetUserName(Username);
		lp.SetPassword(paassword);
		lp.clickSubmit();
		
	
	}
	
}
