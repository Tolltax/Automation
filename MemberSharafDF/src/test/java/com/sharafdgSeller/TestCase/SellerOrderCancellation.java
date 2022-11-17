package com.sharafdgSeller.TestCase;

import java.io.IOException;

import org.testng.annotations.Test;

import com.sharafdgMember.PageObject.BaseClass;
import com.sharafdgMember.PageObject.OrderConfirmationPage;
import com.sharafdgSeller.PageObject.SellerDashboardPObject;
import com.sharafdgSeller.PageObject.SellerHomePObject;
import com.sharafdgSeller.PageObject.SellerManageOrderPO;

public class SellerOrderCancellation extends BaseClass {

	
	
	public void OrderCacelledBySeller() throws InterruptedException, IOException
	{
		
		
		
		/*-------Seller Login------------*/
		
		driver.get(SellerURL);
		SellerHomePObject SH = new SellerHomePObject(driver);
		SH.SellerLogin(SellerEmail, Sellerpwd);
		
		/*-------Order list page  Navigation------------*/
		
		SellerDashboardPObject SD = new SellerDashboardPObject(driver);
		SD.ClickOrders();
		

	//	driver.navigate().to("http://sellersharafdguat.cstechns.com/supplierorderdetails/supplier&orderid="+o);
		
		SellerManageOrderPO SM = new SellerManageOrderPO(driver);
		SM.OrderCancellationSeller();
		
	}
	
	
	
	
	
	
	
	
}
