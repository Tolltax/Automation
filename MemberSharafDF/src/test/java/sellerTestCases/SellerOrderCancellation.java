package sellerTestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobject.BaseClass;
import pageobject.OrderConfirmationPage;
import sellerPO.SellerDashboardPObject;
import sellerPO.SellerHomePObject;
import sellerPO.SellerManageOrderPO;

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
