package SellerPanelPO;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.vedsonmemberPageObject.BaseClass;

import utilVed.ScreenShotVed;


public class SellerManageOrderVedPO extends BaseClass{

	
	WebDriver ldriver;


	public SellerManageOrderVedPO(WebDriver rdriver) {

		ldriver=ldriver;
		PageFactory.initElements(rdriver, this);

	}


	@FindBy(id="orderstatustype")
	WebElement status;


	//	@FindBy(id="orderstatustype")
	//	WebElement statusCancel;
	//	
	@FindBy(linkText="Submit")
	WebElement btnSubmit;


	
	
	@FindBy(id="txtshippingheight")
	WebElement Height;


	//Seller Confirm dropdown choose

	public void shippingheight() {

		
		Height.sendKeys("20");

	}
	


	@FindBy(id="txtpackagelength")
	WebElement LT;


	//Seller Confirm dropdown choose

	public void shippinGLENGTH() {

		
		LT.sendKeys("20");

	}
	
	
	

	@FindBy(id="txtpackagewidth")
	WebElement Width;


	//Seller Confirm dropdown choose

	public void Width () {

		
		Width.sendKeys("20");

	}
	
	
	@FindBy(linkText="Click here for AWB number")
	WebElement AWB;


	//Seller Confirm dropdown choose

	public void AWB () throws InterruptedException {

		
		AWB.click();
		Thread.sleep(10000);

	}
	
	
	
	
	
	
	
	
	
	@FindBy(id="ddl_logistic")
	WebElement logistic;


	//Seller Confirm dropdown choose

	public void logisticSelect() {

		Select Confirm = new Select(logistic);
		Confirm.selectByVisibleText("Emirates");


	}
	

	
	//Seller Confirm dropdown choose

	public void SelectRTS() {

		Select Confirm = new Select(status);
		Confirm.selectByVisibleText("Ready To Ship");


	}
	
	
	public void RTS() {

		Select Confirm = new Select(status);
		Confirm.selectByVisibleText("Ready To Ship");


	}



	//Reason of cancellation
	@FindBy(id="txt_rejection_reason")
	WebElement ReasonSeller;


	//Seller Confirm dropdown choose

	public void CancelReason() {


		ReasonSeller.sendKeys("Order Cancelled by Seller");

	}






	//Seller Cancellation dropdown choose


	public void CancelOrderBySeller() {

		Select Cancel = new Select(status);
		Cancel.selectByVisibleText("Seller Cancellation");


	}


	// Submit Button

	public void btnConfirm() {

		btnSubmit.click();

	}



	// Order Confirm
	public void OrderConfirmSeller() throws IOException {
		//SelectConfirm();
		ScreenShotVed.FullSS("C:\\Users\\cstechmk02\\Desktop\\SharafDG OrderProcess\\OnlieOrder\\"+ "Orderconfirmed");

		btnConfirm();
	}


	// Order Cancellation
	public void OrderCancellationSeller() throws IOException {


		CancelOrderBySeller();
		CancelReason();

		JavascriptExecutor Toppage = (JavascriptExecutor)driver;
		Toppage.executeScript("window.scrollBy(0, 0)");


		ScreenShotVed.FullSS("C:\\Users\\cstechmk02\\Desktop\\Youtube1\\"+ "SellerOrderCancelled");
		btnConfirm();

	}


	public void OrderConfirmedSeller() throws IOException {


		//SelectConfirm();
		ScreenShotVed.FullSS("C:\\Users\\cstechmk02\\Desktop\\SharafDG OrderProcess\\OnlieOrder\\"+ "SellerOrderCancelled");

		btnConfirm();


	}


	public void OrderRTS() throws IOException {


		
		ScreenShotVed.FullSS("C:\\Users\\cstechmk02\\Desktop\\SharafDG OrderProcess\\OnlieOrder\\"+ "SellerOrderConfirmed");

		btnConfirm();


	}


	
	
	
	
	
	
	
	
}
