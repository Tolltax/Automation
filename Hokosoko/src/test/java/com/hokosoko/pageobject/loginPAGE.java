package com.hokosoko.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPAGE {
	
	
	WebDriver ldriver;
	
	
	public loginPAGE(WebDriver rdriver) {
		{
			
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
		}

	}


//	public void LoginPage(WebDriver rdriver)
	
	
	
	
	@FindBy(name="contactMobileField")
	@CacheLookup
	WebElement textMOBILENO;
	
	
	@FindBy(id="btn_get_otp1")
	@CacheLookup
	WebElement GetOTP;
	
	
	@FindBy(name="right_txtOTP1")
	@CacheLookup
	WebElement textOTP;
	
	
	@FindBy(xpath="//*[@id=\"ampTabs\"]/amp-selector/div[2]/div/form/fieldset/div[5]/input")
	@CacheLookup
	WebElement Verify;


public void setEnterMobileNO(String MobileNumber)
{
	
	textMOBILENO.sendKeys(MobileNumber);
}


public void setGETOTP(String MobileNumber)
{
	
	GetOTP.click();
		
}


public void setENTEROTP(String MobileNumber)
{
	
	textOTP.sendKeys("4582");
}


public void setVerify(String MobileNumber)
{
	
	Verify.click();
}


}
