package com.sharafdgMember.TestCase;

import org.testng.annotations.Test;

import com.sharafdgMember.PageObject.BaseClass;
import com.sharafdgMember.PageObject.LoginBuyerPO;

public class RefqRaiedByBuyer extends BaseClass {

	
/*  Steps -
 * 
 * >>>>>PDP PAGE
 * 1. Login to Member Panel
 * 2. Go to PDP Page
 * 3. Click on REQUEST FOR A QUOTE
 * 4. Click On Quantity
 * 5. Select Target Date of Delivery
 * 6. Fill the Address
 * 7. Fill the Requirement *
 */
	
	@Test
	public void RfqRaidedByBuyer() {
		
		
		/* -------Login--------*/
	    driver.get(BaseURL);
		LoginBuyerPO BL = new LoginBuyerPO(driver);
		BL.Buyer_login(uid, pwd);
		
		driver.navigate().to("https://stg.dgbusiness.com/myaccount");
		

		
	}
	
	
	
	
	
	
	
	
}
