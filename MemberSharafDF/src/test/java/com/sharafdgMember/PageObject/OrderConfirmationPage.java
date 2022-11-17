package com.sharafdgMember.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrderConfirmationPage {



	WebDriver ldriver;


	public OrderConfirmationPage(WebDriver rdriver) {

		ldriver=ldriver;
		PageFactory.initElements(rdriver, this);

	}


	@FindBy(xpath="//*[@class='number']")
	WebElement OrderNumber;


	//Seller Confirm dropdown choose

	public String GetOrderNumber() {

		return OrderNumber.getText();

	}









}

