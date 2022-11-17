package com.sharafdgMember.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPOMember {


	WebDriver ldriver;


	public MyAccountPOMember(WebDriver rdriver) {

		ldriver=ldriver;
		PageFactory.initElements(rdriver, this);

	}


	  
    @FindBy(how=How.PARTIAL_LINK_TEXT,using="458")
    WebElement OrderNo;
    
    
    
    
    public void ButtonConfirm()
    {
    	
    	OrderNo.click();
    }
    
    
	
	
	
}
