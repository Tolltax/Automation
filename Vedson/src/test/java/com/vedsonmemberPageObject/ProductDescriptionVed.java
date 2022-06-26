package com.vedsonmemberPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductDescriptionVed  {
	
	
	
	 	WebDriver ldriver;
	
	    public ProductDescriptionVed (WebDriver rdriver) {
		
		ldriver=ldriver;
		PageFactory.initElements(rdriver, this);
		
	   	}
	    

	    @FindBy(how=How.XPATH,using="//*[@id=\"addtocartnew\"]/span[2]/a")
	    WebElement AddtoCART;
	    
	    
	    @FindBy(how=How.XPATH,using="//*[@class='sa-confirm-button-container']")
	    WebElement Btnconfirm;
	    
	    
	    
	    
	    public void ButtonConfirm()
	    {
	    	
	    	Btnconfirm.click();
	    }
	    
	    
	
	    
	    public void Addcart()
	    {
	    	
	    	AddtoCART.click();
	    }
	    

}

