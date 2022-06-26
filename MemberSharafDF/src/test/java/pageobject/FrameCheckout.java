package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FrameCheckout {

	
	
	
	WebDriver ldriver;

	public FrameCheckout (WebDriver rdriver) {

		ldriver=ldriver;
		PageFactory.initElements(rdriver, this);

	}
	
	
	@FindBy(how=How.ID,using="checkout-frames-card-number")
	WebElement CartNumber;
	
	
	@FindBy(how=How.XPATH,using="//*[@class='expiry-date field']")
	WebElement Expairy;
	
	@FindBy(how=How.XPATH,using="//*[@class='cvv field']")
	WebElement CVV;
	
	

	@FindBy(how=How.XPATH,using="//*[@id='pay-button']")
	WebElement btnClick;
	
	
	
	public void BTN() {
		
		btnClick.click();
		
		
	}
	
	
	

	public void CVV(String ExpairyCVV) {
		
		Expairy.sendKeys(ExpairyCVV);
		
		
	}
	
	
	
	public void ExpairyNo(String ExpairyNo) {
		
		Expairy.sendKeys(ExpairyNo);
		
	}
	

	
	public void SendCardNo( ) {
	
		CartNumber.sendKeys("4242424242424242");
		
	}
	
	
}
