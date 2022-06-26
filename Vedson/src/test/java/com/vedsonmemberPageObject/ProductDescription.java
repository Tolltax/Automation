package com.vedsonmemberPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductDescription  {
	
	
	
	 	WebDriver ldriver;
	
	    public ProductDescription (WebDriver rdriver) {
		
		ldriver=ldriver;
		PageFactory.initElements(rdriver, this);
		
	   	}
	    
	    
	    @FindBy(how=How.XPATH, using="//*[@id='pr_name']")
	    WebElement ProductName;
	    
	    @FindBy(how=How.XPATH,using="//*[@id='pr_price_new']")
	    WebElement OfferPriceNew;
	    
	    
	    @FindBy(how=How.XPATH,using="//*[@class='PercentOff']")
	    WebElement Percentoff;
	    
	    
	    @FindBy(how=How.XPATH, using="//*[@class='GreyLight']")
	    WebElement SuggestPrice;
	    
	    @FindBy(how=How.XPATH,using="//*[@id=\"prpending\"]/div[1]/div[3]/span[1]/a")
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
	    
	    
	
	     public String  GetProductName() {
	    	 
	    	 return ProductName.getText();
	     }
	     
	     
	      public String GetSuggestedPrice() {
	    	 
	    	 return SuggestPrice.getText();
	     }
	     
	     public String GetOfferPrice() {
			return OfferPriceNew.getText();
	    	 
	     }
	    
	  
	     
	     
	     public String PercentageOff() {
	    	 
	    	return  Percentoff.getText();
	     }
	     
}

