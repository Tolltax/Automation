package com.vedsonmemberPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage   {

	
     WebDriver ldriver;	
	public RegistrationPage(WebDriver rdriver) 
	
	{       ldriver = rdriver;
	
	        PageFactory.initElements(rdriver, this);
		
		
	}

	
	@FindBy(id ="right_txtname")
	WebElement FullName;
	
	@FindBy(id ="right_txtcontact")
	WebElement MobileNo;
	
	@FindBy(id ="right_txtemailid")
	WebElement Emailid;
	
	@FindBy(id ="right_txtpwd")
	WebElement Password;
	

	@FindBy(id ="right_txtcpwd")
	WebElement confirmPassword;
	
	@FindBy(className ="login_row agree")
	WebElement checkbox;
	
	
	
	
	
	
	
}
