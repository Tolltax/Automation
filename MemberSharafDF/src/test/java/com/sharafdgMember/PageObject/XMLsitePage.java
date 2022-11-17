package com.sharafdgMember.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class XMLsitePage {

	
	WebDriver ldriver;
	
	
	
    public XMLsitePage (WebDriver rdriver) {
	
	ldriver=ldriver;
	PageFactory.initElements(rdriver, this);
	
   	}
	
    
    @FindBy(how=How.TAG_NAME,using="loc")
    WebElement We;
    
    
    public void Getlink() {
    	
    	We.getAttribute("innerHTML");
    	
    }
    
    public void GetSize() {
    	
    	
    	
    }
    
	
}
