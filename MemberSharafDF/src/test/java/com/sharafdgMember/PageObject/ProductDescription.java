package com.sharafdgMember.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductDescription {

  //https://www.seleniumeasy.com/selenium-tutorials/how-to-get-attribute-values-using-webdriver
	// Handle attribute value 
	
	//https://docs.oracle.com/javase/tutorial/java/javaOO/returnvalue.html
		
 	WebDriver driver;

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
