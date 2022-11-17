package com.sharafdgMember.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePageMemberPO {

	
	
	WebDriver ldriver;


	public HomePageMemberPO(WebDriver rdriver) {

		ldriver=ldriver;
		PageFactory.initElements(rdriver, this);

	}

	
	
    /* Sort By Filter 

	@FindBy(id="ddl_order_status")
	WebElement ProfileIcon;

	public void shippingheight() {

		Select sort = new Select(SortBy);
		sort.selectByVisibleText("Delivered");

		
	}
	
	
	
	*/
	
	
	
	
	
}
