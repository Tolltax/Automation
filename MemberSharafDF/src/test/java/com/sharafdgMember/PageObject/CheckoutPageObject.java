package com.sharafdgMember.PageObject;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPageObject extends BaseClass {




	WebDriver ldriver;

	public CheckoutPageObject (WebDriver rdriver) {

		ldriver=rdriver;
		//pdriver-pdriver;
		PageFactory.initElements(rdriver, this);

	}


	@FindBy(how=How.XPATH,using="//*[@name='Mop']")
	WebElement COD;


	@FindBy(how=How.XPATH,using="//*[text()='Place Order']")
	WebElement ConfirmOrder;


	@FindBy(how=How.ID,using="checkoutterm")
	WebElement CheckBx;


	@FindBy(how=How.XPATH,using="//*[@id=\"BodyCheck\"]/div/div[3]/div[2]/p/a[1]")
	WebElement BillingSame;

	
	@FindBy(how=How.XPATH,using="//*[@id=\"Applycon\"]/a")
	WebElement ClickApplyTextCoupne;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"txtcoupon\"]")
	WebElement txtCouponeFound;
	
	
	@FindBy(how=How.ID,using="fetchcouponcode")
	WebElement ApplyCoupne;
	
	
	/*STORE CREDIT
	 * 
	 * 
	 * 
	

	
	@FindBy(how=How.ID,using="Applystorecra")
	
	List<WebElement> myElements;
	
	
	
	public void StoreCredittxtClick()
	{
		
		myElements.size();
		myElements.get(0).click();
		myElements.get(1).click();
		
		
	}
	
	 */

	/*Coupone
	 * 
	 * 
	 * 
	 */
	
	 public void AplyCoupne(){
			
		 ApplyCoupne.click();
		
	}
     
	
     public void SendCoupone(){
		
    	 txtCouponeFound.sendKeys("FLAT100");
		
	}
     
     
	public void ClickCouponetext(){
		
		ClickApplyTextCoupne.click();
		
	}
	
	

	public void CheckBoxcLICKED() {

		
		Actions actions = new Actions(ldriver);
		actions.moveToElement(CheckBx);
		actions.perform();
	    CheckBx.click();
	}

	public void CODClick() {

		COD.click();

	}

	public void OrderPlace() {

		
		Actions action1 = new Actions(ldriver);
		action1.moveToElement(ConfirmOrder).perform();
		
		
		ConfirmOrder.click();

	}


	public void BillingYes() {

		BillingSame.click();

	}
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"accordion\"]/div[1]/div/input")
	
	WebElement Online;
	
	public void OnlineClick() {
		
		Online.click();
		
	}
	
	
	
	//Have a Coupon Code

	  public void ApplyFinalCoupone() throws InterruptedException
	     {
	    	 
		  ClickCouponetext();  
		  //System.out.println("Coupoen code Apply Now Text Clicked");
		  SendCoupone();
		//  System.out.println("Coupoen code Sent");

		  AplyCoupne(); 
		  Thread.sleep(2000);
	        Alert alert = ldriver.switchTo().alert();	
	        alert.accept();
	        Thread.sleep(3000);

	     }
	  
	  
	  
	  // LP : 

	  
	  @FindBy(xpath="//*[@id=\"Applyloyaltypoints\"]/a")
	  WebElement AppltLP;
	  
	  @FindBy(xpath="//*[@id=\"txt_promotionalcreditsNEW\"]")
	  WebElement sendLP;
	  
	  
	  @FindBy(xpath="//*[@id=\"fetchpromotionalcredits\"]")
	  WebElement aplylp;
	  
	 

	  public void LPApply()
	     {
	    	 
		  AppltLP.click();
		  sendLP.sendKeys("100");
		  aplylp.click();
	     }
	  
	  
	  
	 // Storecredit: 

	  
	  
	  @FindBy(xpath="//*[@id=\"Applystorecra\"]/a")
	  WebElement AppltSC;
	  
	  
	  @FindBy(xpath="//*[@id=\"display_storecredit\"]")
	  WebElement SendSC;
	  
	  @FindBy(xpath="//*[@id=\"applystorecredit\"]")
	  WebElement AplySc;
	  
	 
	  
	  
	  public void StoreCredit()
	     {
	    	 
		  AppltSC.click();
		  SendSC.clear();
		  SendSC.sendKeys("100");
		  AplySc.click();
	    	 
	     }
	  
	  
	  
	  
	  
	     

}
