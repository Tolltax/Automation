package com.sharafdgMember.TestCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.sharafdgMember.PageObject.BaseClass;
import com.sharafdgMember.PageObject.RegistrationSeller;

import UtilitiesHelpers.GetScreenShot;

public class Seller1stStepRegistration extends BaseClass {


	
	@Test
	public void TC_101_SellerAccountCreation() throws IOException, InterruptedException {
		
		
		driver.get("sharaf");
		
		Thread.sleep(5000);
		
		RegistrationSeller Sr = new RegistrationSeller();
		
		Sr.SetName(SellerFullName);
		Sr.SetEmail("cawoj93086@suggerin.com");
		
		Sr.SetPassword("12345");
		Sr.ResetPassword("12345");
		
		Sr.SetMobile("888886657");
		Sr.SetCheckBOx();
		
		GetScreenShot ss = new GetScreenShot();
		
		ss.FullSS(driver, "C:\\Users\\cstechmk02\\eclipse-workspace\\MemberSharafDF\\Screenshot");
		
		Sr.btnClicked();
		 
		
		
		
	}
	
	
	
	
	
	
	
	
}
