package sellerTestCases;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import UtilsHelpers.GetScreenShot;
import pageobject.BaseClass;
import sellerPO.SellerDashboardPObject;
import sellerPO.SellerHomePObject;
import sellerPO.SellerManageOrderPO;

public class SellerOrderFulfilment extends BaseClass {




	@Test
	public void SellerAllOrders() throws InterruptedException, IOException {

		driver.get(SellerURL);


		SellerHomePObject sl = new SellerHomePObject(driver);
		sl.ClickSingIN();
		sl.SellerLogin(SellerEmail, Sellerpwd);

		//  Thread.sleep(3000);

		SellerDashboardPObject SD = new SellerDashboardPObject(driver);
		SD.ClickOrders();

		GetScreenShot.TakeScreenshot("C:\\Users\\cstechmk02\\Desktop\\Youtube1\\"+ "SellerOrder"+".jpg");
		PendingOrders();
		OrderConfirm();



	}




	public void  PendingOrders() throws IOException {

		int i=447;

		driver.navigate().to("http://sellersharafdguat.cstechns.com/supplierorderdetails/supplier&orderid="+i);
		GetScreenShot.FullSS("C:\\Users\\cstechmk02\\Desktop\\Youtube1\\"+ "PendingOrders");



	}


	public void  OrderConfirm(){


		SellerManageOrderPO Sm =new SellerManageOrderPO(driver);
		//Sm.OrderConfirmSeller1();


	}

	
	public void  OrderRTS(){


		SellerManageOrderPO Sm =new SellerManageOrderPO(driver);
		//Sm.OrderConfirmSeller1();


	}
	


}
