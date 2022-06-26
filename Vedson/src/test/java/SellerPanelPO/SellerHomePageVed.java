package SellerPanelPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellerHomePageVed {


	WebDriver ldriver;
	
	
	public SellerHomePageVed(WebDriver rdriver) {
		
		ldriver=ldriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	@FindBy(linkText="Seller Login")
	WebElement btnSignIn;
	
	
	public void ClickSingIN () {
		btnSignIn.click();
		
	}
	
	
	//Login to DG Business

	
	// Email Filed 
	@FindBy(id="left_txtemail")
	WebElement txtEmailSeller;
	
	
	public void SellerEmailtxt(String SellerEmail) {
		txtEmailSeller.sendKeys(SellerEmail);
		
	}
	
	
	//Password  field 
	@FindBy(id="left_txtpwd")
	WebElement txtpwdSeller;
	
	
	public void Sellerpasswordtxt(String Sellerpwd) {
		txtpwdSeller.sendKeys(Sellerpwd);
		
	}
	
	
	//login button    
	@FindBy(id="signin_btnlogin")
	WebElement btnlogin;
	
	
	public void SellerbtnClick() {
		btnlogin.click();
		
	}
	
	// Seller LoginMethode
	
	public void SellerLogin(String SellerEmail, String Sellerpwd) {
		
		ClickSingIN();
		SellerEmailtxt(SellerEmail);
		Sellerpasswordtxt(Sellerpwd);
		SellerbtnClick();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
