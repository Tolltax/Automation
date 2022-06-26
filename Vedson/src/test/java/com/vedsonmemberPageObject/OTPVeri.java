package com.vedsonmemberPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OTPVeri {


	WebDriver ldriver;

	public OTPVeri (WebDriver rdriver) {

		ldriver=ldriver;
		//pdriver-pdriver;
		PageFactory.initElements(rdriver, this);

	}

	  
	  @FindBy(xpath="//*[@id='txtcodnumber']")
	  WebElement CodVeri;
	  
	 
	  
	  
	  public void OTPVerification()
	     {
	    	 
		  CodVeri.click();
		  CodVeri.sendKeys("4582");
		  SubmitCOD();
		  
	    	 
	     }
	  
	  
	  @FindBy(xpath="//input[@id='btncodsubmit']")
	  WebElement CODsub;
	  
	 
	  
	  
	  public void SubmitCOD()
	     {
	    	 
		  CODsub.click();
	    	 
	     }
	  
	  
}
