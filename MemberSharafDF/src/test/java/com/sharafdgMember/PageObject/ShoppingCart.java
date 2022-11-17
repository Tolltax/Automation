package com.sharafdgMember.PageObject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import UtilitiesHelpers.GetScreenShot;

public class ShoppingCart {

	
	WebDriver ldriver;

    public ShoppingCart (WebDriver rdriver) {
	
	ldriver=ldriver;
	PageFactory.initElements(rdriver, this);
	
   	}
			
			
    @FindBy(how=How.XPATH,using="//*[text()='Proceed to Checkout']")
    WebElement AddCart;
    
    
    public void ProceedTcheckout() throws IOException {
    	
    	//GetScreenShot.TakeScreenshot("C:\\Users\\cstechmk02\\Desktop\\Youtube1\\"+ "Add to cart" +".jpg");
    	AddCart.click();
    	
    }
	
	
    @FindBy(how=How.XPATH,using="//*[@class='button_01']")
    WebElement ProceedToCheckOut;
    
    public void ProceedTocheck() {
    	
    	ProceedToCheckOut.click();
    }
    

    
    
}
