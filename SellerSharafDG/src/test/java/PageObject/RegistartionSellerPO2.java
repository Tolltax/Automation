package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistartionSellerPO2 {

	
	
	WebDriver ldriver;

	public RegistartionSellerPO2 (WebDriver rdriver) {

		ldriver=ldriver;
		PageFactory.initElements(rdriver, this);

	}
	
	

	//Seller Name
	@FindBy(id="right_txtname")
	WebElement TxtName;
	
	
	public void SetSellerName(String sellerName) {
		
		TxtName.sendKeys(sellerName);
		
	}
	
	
	//Seller Email
	@FindBy(id="right_txtemailid")
	WebElement txtEmail;
	
	
	public void SellerEmail(String sellerEmail) {
		
		TxtName.sendKeys(sellerEmail);
		
	}
	
	
	
	//Seller Password
	@FindBy(id="right_txtpwd")
	WebElement txtPassword;
	
	
	public void SellerPassword(String sellerpassword) {
		
		TxtName.sendKeys(sellerpassword);
		
	}
	
	//Seller Reenter Password
	@FindBy(id="right_txtcpwd")
	WebElement txtrepassword;
	
	
	public void SellerRePassword(String sellerrepassword) {
		
		txtrepassword.sendKeys(sellerrepassword);
		
	}
	
	
	
	//SellerMobile
	@FindBy(id="right_txtcontact")
	WebElement MobileNo;
	
	
	public void SellerMobile(String MobileNumber) {
		
		MobileNo.sendKeys(MobileNumber);
		
	}
	
	
	
	
	//Sellercheckbox 
	@FindBy(id="Agree")
	WebElement Checkbox;
	
	
	public void Sellerchek(String MobileNumber) {
		
		Checkbox.click();	
	}
	
	
	
	
	
	
	
	
}
