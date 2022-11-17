package com.sharafdgMember.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationSeller{


	WebDriver ldriver;



	public void RegistrationSeller(WebDriver rdriver) {

		ldriver = ldriver;
		PageFactory.initElements(rdriver, this);
 
	}



	@FindBy(how=How.ID,using="right_txtname")
	WebElement FullName;

	@FindBy(how=How.ID,using="right_txtemailid")
	WebElement Email;

	@FindBy(how=How.ID,using="right_txtpwd")
	WebElement pwd;

	@FindBy(how=How.ID,using="right_txtcpwd")
	WebElement txtRepwd;

	@FindBy(how=How.ID,using="right_txtcontact")
	WebElement txtMobile;


	@FindBy(how=How.XPATH,using="//*[@class='login_row agree']")
	WebElement checkBOx;

	@FindBy(how=How.ID,using="reg_btnlogin")
	WebElement btnclick;



	public void SetName(String SellerFullName) {

		FullName.sendKeys(SellerFullName);


	}


	public void SetEmail(String SellerEmail) {

		Email.sendKeys(SellerEmail);

	}


	public void SetPassword(String Passwprd) {

		Email.sendKeys(Passwprd);

	}



	public void ResetPassword(String RePasswprd) {

		Email.sendKeys(RePasswprd);

	}


	public void SetMobile(String MobileNumber) {
 
		txtMobile.sendKeys(MobileNumber);


	}


	public void SetCheckBOx() {


		checkBOx.click();
	}


	public void btnClicked() {


		btnclick.click();
	}



}
