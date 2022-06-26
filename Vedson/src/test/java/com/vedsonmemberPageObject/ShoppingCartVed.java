package com.vedsonmemberPageObject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartVed {

	
	WebDriver ldriver;

    public ShoppingCartVed (WebDriver rdriver) {
	
	ldriver=ldriver;
	PageFactory.initElements(rdriver, this);
	
   	}
			
			
    @FindBy(how=How.XPATH,using="//div[@class='button_01']")
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
