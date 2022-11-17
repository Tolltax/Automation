package com.sharafdgMember.TestCase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.sharafdgAdmin.TestCase.AdminOrderPage;
import com.sharafdgAdmin.TestCase.RemoveSpecificCart;
import com.sharafdgMember.PageObject.BaseClass;
import com.sharafdgMember.PageObject.CheckoutPageObject;
import com.sharafdgMember.PageObject.LoginBuyerPO;
import com.sharafdgMember.PageObject.ProductDescription;
import com.sharafdgMember.PageObject.ShoppingCart;
import com.sharafdgSeller.PageObject.SellerDashboardPObject;
import com.sharafdgSeller.PageObject.SellerHomePObject;
import com.sharafdgSeller.PageObject.SellerManageOrderPO;

import UtilitiesHelpers.GetScreenShot;
import UtilitiesHelpers.JavaScriptManage;


public class Checkout extends BaseClass {

	int ik=1;
	String OnlinePath= "C:\\Users\\cstechmk02\\Desktop\\SharafDG OrderProcess\\OnlieOrder\\";	

	
	//Online Payment 
	@Test (priority=10)
	public void TC_001() throws InterruptedException, IOException {


		LoginBuyer();

		Thread.sleep(2000);
		driver.navigate().to(Product1);
		Thread.sleep(2000);

		//Add to cart from pdp page
		ProductDescription pd =  new ProductDescription(driver);
		pd.Addcart();

		// 2nd Product add 
		
//		driver.navigate().to(Product2);
//		Thread.sleep(2000);
//		pd.Addcart();
		pd.ButtonConfirm();

		driver.navigate().to("https://stg.dgbusiness.com/shoppingcart");
		Thread.sleep(3000);
		GetScreenShot.TakeScreenshot(OnlinePath+ "0_ShoppingCart" +".jpg");
		// Proceed to checkout 

		ShoppingCart SC = new ShoppingCart(driver);
		SC.ProceedTcheckout();

		// checkout page 

		CheckoutPageObject ck= new CheckoutPageObject(driver);
		ck.BillingYes();
		ck.OnlineClick();
		ck.CheckBoxcLICKED(driver);

		Thread.sleep(1000);

		JavaScriptManage.HideHeader();
		GetScreenShot.FullSS(OnlinePath+ "1_Checkout");
		ck.OrderPlace(driver);
		//order place Checkout  
		Thread.sleep(5000);
		Online();


		Thread.sleep(5000);

		String s =driver.findElement(By.xpath("//*[@class='number']")).getText();


		JavaScriptManage.HideHeader();
		Thread.sleep(5000);

		GetScreenShot.FullSS(OnlinePath+ "3_ThankyouPage");

		//Buyer Myaccount

		driver.navigate().to("https://stg.dgbusiness.com/myaccount");

		Thread.sleep(5000);

		JavascriptExecutor jsp = (JavascriptExecutor)driver;
		jsp.executeScript("window.scrollBy(0, 200)");

		// Admin

		GetScreenShot.TakeScreenshot(OnlinePath+ "4_Myaccount" +".jpg");




		List <WebElement> AllOrders = driver.findElements(By.partialLinkText(s.substring(1)));

		ArrayList<String> targets = new ArrayList<String>();

		for(WebElement E:AllOrders) {

			targets.add(E.getAttribute("href"));

		}


		for (String target : targets) {
			driver.get(target);
			GetScreenShot.FullSS(OnlinePath+"SellerOrders"+ik+".jpg");
			ik++;


		}



		AdminOrderPage.AdminOrderSS();
		GetScreenShot.TakeScreenshot(OnlinePath+ "5_AdminOrder" +".jpg");


		//		/*---------Seller 1 Page------------*/

		driver.get(SellerURL);
		SellerHomePObject SH = new SellerHomePObject(driver);
		SH.SellerLogin(SellerEmail, Sellerpwd);

		//		/*-------Order list page  Navigation------------*/

		SellerDashboardPObject SD = new SellerDashboardPObject(driver);
		SD.ClickOrders();
		//GetScreenShot.TakeScreenshot(OnlinePath+"6_Seller1_Order"+".jpg");



		driver.navigate().to("https://seller.dgbusiness.com/supplierorderdetails/supplier&orderid="+s.substring(1));
		SellerManageOrderPO MS = new SellerManageOrderPO(driver);
		GetScreenShot.FullSS(OnlinePath+ "7_Seller1_Pending");
		MS.SelectRTS();

		JavascriptExecutor jspl = (JavascriptExecutor)driver;
		jspl.executeScript("window.scrollBy(0, 170)");

		MS.logisticSelect();
		MS.shippingheight();
		MS.shippinGLENGTH();
		MS.Width();
		Thread.sleep(2000);
		MS.AWB();
		GetScreenShot.TakeScreenshot(OnlinePath+ "8_Seller1_Rts" +".jpg");
		JavascriptExecutor jsj = (JavascriptExecutor)driver;
		jsj.executeScript("window.scrollBy(0, 140)");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"btnshipping\"]/div[2]/span")).click();


		//RTS Confirmed 


		////////////////////// Order Shipped //////////////////////////

		Thread.sleep(2000);
		//

		driver.navigate().to(SellerURL);
		driver.navigate().to("https://seller.dgbusiness.com/supplierorderdetails/supplier&orderid="+s.substring(1));

		System.out.println("Pass");

		JavascriptExecutor jsj1 = (JavascriptExecutor)driver;
		jsj1.executeScript("window.scrollBy(0, 920)");

		driver.findElement(By.id("manifestli")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("filetomenfest")).sendKeys("C:\\Users\\cstechmk02\\Pictures\\dam.jpg");
		Thread.sleep(4000);


		driver.findElement(By.id("btn_ship")).click();

		driver.findElement(By.xpath("//*[@class='sa-confirm-button-container']")).click();

		driver.navigate().to("https://seller.dgbusiness.com/logout.aspx");


		
		//	2nd seller OrderFulfilment 

		driver.get(SellerURL);
		SellerHomePObject Seller2 = new SellerHomePObject(driver);
		Seller2.SellerLogin(Seller2Email, Seller2pwd);

		//		------Order list page  Navigation------------

		SellerDashboardPObject Sell20 = new SellerDashboardPObject(driver);
		Sell20.ClickOrders();
		GetScreenShot.TakeScreenshot(OnlinePath+"9_Seller1_Order"+".jpg");



		driver.navigate().to("https://seller.dgbusiness.com/supplierorderdetails/supplier&orderid="+s.substring(1));
		SellerManageOrderPO Sellert = new SellerManageOrderPO(driver);
		GetScreenShot.FullSS(OnlinePath+ "10_Seller2_Pending");
		Sellert.SelectRTS();

		JavascriptExecutor jkl = (JavascriptExecutor)driver;
		jkl.executeScript("window.scrollBy(0, 140)");

		Sellert.logisticSelect();
		Sellert.shippingheight();
		Sellert.shippinGLENGTH();
		Sellert.Width();
		Thread.sleep(2000);
		Sellert.AWB();

		GetScreenShot.TakeScreenshot(OnlinePath+ "11_Seller2_Rts" +".jpg");

		JavascriptExecutor kk = (JavascriptExecutor)driver;
		kk.executeScript("window.scrollBy(0, 140)");

		driver.findElement(By.xpath("//*[@id=\"btnshipping\"]/div[2]/span")).click();
		Thread.sleep(2000);

		////////////////////// Order Shipped seller 2//////////////////////////


		driver.navigate().to(SellerURL);
		driver.navigate().to("https://seller.dgbusiness.com/supplierorderdetails/supplier&orderid="+s.substring(1));
		JavascriptExecutor kkl = (JavascriptExecutor)driver;
		kkl.executeScript("window.scrollBy(0, 920)");

		driver.findElement(By.id("manifestli")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("filetomenfest")).sendKeys("C:\\Users\\cstechmk02\\Pictures\\dam.jpg");
		Thread.sleep(4000);
		driver.findElement(By.id("btn_ship")).click();
		driver.findElement(By.xpath("//*[@class='sa-confirm-button-container']")).click();



	}



    // Promo Applicable 
	@Test (priority=21)
	public void TC_002() throws InterruptedException, IOException {

		LoginBuyer();
		Thread.sleep(2000);
		driver.navigate().to(Product1);
		Thread.sleep(2000);

		//Add to cart from pdp page
		ProductDescription pd =  new ProductDescription(driver);
		pd.Addcart();

		driver.navigate().to(Product2);
		Thread.sleep(2000);
		pd.Addcart();
		pd.ButtonConfirm();

		driver.navigate().to("https://stg.dgbusiness.com/shoppingcart");
		Thread.sleep(3000);
		GetScreenShot.TakeScreenshot(OnlinePath+ "0_ShoppingCart" +".jpg");
		// Proceed to checkout 

		ShoppingCart SC = new ShoppingCart(driver);
		SC.ProceedTcheckout();

		// checkout page 

		CheckoutPageObject ck= new CheckoutPageObject(driver);
		ck.BillingYes();
		ck.OnlineClick();


		ck.CheckBoxcLICKED(driver);
		Thread.sleep(1000);
		JavaScriptManage.HideHeader();
		GetScreenShot.FullSS(OnlinePath+ "1_Checkout");
		ck.OrderPlace(driver);

		//order place Checkout  
		Thread.sleep(5000);
		Online();


		Thread.sleep(5000);

		String s =driver.findElement(By.xpath("//*[@id=\"order_confirmation\"]/div/div[1]/div[2]/div[1]/span")).getText();

		System.out.println(s.substring(1));


		JavaScriptManage.HideHeader();
		Thread.sleep(5000);

		GetScreenShot.FullSS(OnlinePath+ "3_ThankyouPage");

		//Buyer Myaccount

		driver.navigate().to("https://stg.dgbusiness.com/myaccount");

		Thread.sleep(5000);

		JavascriptExecutor jsp = (JavascriptExecutor)driver;
		jsp.executeScript("window.scrollBy(0, 200)");

		GetScreenShot.TakeScreenshot(OnlinePath+ "4_Myaccount" +".jpg");
		
		
		
		List <WebElement> AllOrders = driver.findElements(By.partialLinkText(s.substring(1)));

		ArrayList<String> targets = new ArrayList<String>();

		for(WebElement E:AllOrders) {

			targets.add(E.getAttribute("href"));

		}


		for (String target : targets) {
			driver.get(target);
			GetScreenShot.FullSS(OnlinePath+"SellerOrders"+ik+".jpg");
			ik++;


		}

		
		AdminOrderPage.AdminOrderSS();
		GetScreenShot.TakeScreenshot(OnlinePath+ "5_AdminOrder" +".jpg");


		//		/*---------Seller 1 Page------------*/

		driver.get(SellerURL);
		SellerHomePObject SH = new SellerHomePObject(driver);
		SH.SellerLogin(SellerEmail, Sellerpwd);

		//		/*-------Order list page  Navigation------------*/

		SellerDashboardPObject SD = new SellerDashboardPObject(driver);
		SD.ClickOrders();
		//GetScreenShot.TakeScreenshot("C:\\Users\\cstechmk02\\Desktop\\SharafDG OrderProcess\\OnlieOrder\\"+"6_Seller1Order"+".jpg");



		driver.navigate().to("https://seller.dgbusiness.com/supplierorderdetails/supplier&orderid="+s.substring(1));
		SellerManageOrderPO MS = new SellerManageOrderPO(driver);
		GetScreenShot.FullSS(OnlinePath+ "7_Seller1_Pending");
		MS.SelectRTS();

		JavascriptExecutor jspl = (JavascriptExecutor)driver;
		jspl.executeScript("window.scrollBy(0, 170)");

		MS.logisticSelect();
		MS.shippingheight();
		MS.shippinGLENGTH();
		MS.Width();
		Thread.sleep(2000);
		MS.AWB();
		GetScreenShot.TakeScreenshot(OnlinePath+ "8_Seller1_Rts" +".jpg");
		JavascriptExecutor jsj = (JavascriptExecutor)driver;
		jsj.executeScript("window.scrollBy(0, 140)");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"btnshipping\"]/div[2]/span")).click();


		//RTS Confirmed 


		////////////////////// Order Shipped //////////////////////////

		Thread.sleep(2000);
		//

		driver.navigate().to(SellerURL);
		driver.navigate().to("https://seller.dgbusiness.com/supplierorderdetails/supplier&orderid="+s.substring(1));

		System.out.println("Pass");

		JavascriptExecutor jsj1 = (JavascriptExecutor)driver;
		jsj1.executeScript("window.scrollBy(0, 920)");

		driver.findElement(By.id("manifestli")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("filetomenfest")).sendKeys("C:\\Users\\cstechmk02\\Pictures\\dam.jpg");
		Thread.sleep(4000);


		driver.findElement(By.id("btn_ship")).click();

		driver.findElement(By.xpath("//*[@class='sa-confirm-button-container']")).click();

		driver.navigate().to("https://seller.dgbusiness.com/logout.aspx");






		//	2nd seller OrderFulfilment 

		driver.get(SellerURL);
		SellerHomePObject Seller2 = new SellerHomePObject(driver);
		Seller2.SellerLogin(Seller2Email, Seller2pwd);

		//		/*-------Order list page  Navigation------------*/

		SellerDashboardPObject Sell20 = new SellerDashboardPObject(driver);
		Sell20.ClickOrders();
		GetScreenShot.TakeScreenshot("C:\\Users\\cstechmk02\\Desktop\\SharafDG OrderProcess\\OnlieOrder\\"+"9_Seller1_Order"+".jpg");



		driver.navigate().to("https://seller.dgbusiness.com/supplierorderdetails/supplier&orderid="+s.substring(1));
		SellerManageOrderPO Sellert = new SellerManageOrderPO(driver);
		GetScreenShot.FullSS(OnlinePath+ "10_Seller2_Pending");
		Sellert.SelectRTS();

		JavascriptExecutor jkl = (JavascriptExecutor)driver;
		jkl.executeScript("window.scrollBy(0, 140)");

		Sellert.logisticSelect();
		Sellert.shippingheight();
		Sellert.shippinGLENGTH();
		Sellert.Width();
		Thread.sleep(2000);
		Sellert.AWB();

		GetScreenShot.TakeScreenshot(OnlinePath+ "11_Seller2_Rts" +".jpg");

		JavascriptExecutor kk = (JavascriptExecutor)driver;
		kk.executeScript("window.scrollBy(0, 140)");

		driver.findElement(By.xpath("//*[@id=\"btnshipping\"]/div[2]/span")).click();
		Thread.sleep(2000);

		////////////////////// Order Shipped seller 2//////////////////////////


		driver.navigate().to(SellerURL);

		driver.navigate().to("https://seller.dgbusiness.com/supplierorderdetails/supplier&orderid="+s.substring(1));

		JavascriptExecutor kkl = (JavascriptExecutor)driver;
		kkl.executeScript("window.scrollBy(0, 920)");

		driver.findElement(By.id("manifestli")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("filetomenfest")).sendKeys("C:\\Users\\cstechmk02\\Pictures\\dam.jpg");
		Thread.sleep(4000);


		driver.findElement(By.id("btn_ship")).click();

		driver.findElement(By.xpath("//*[@class='sa-confirm-button-container']")).click();



	}



	@Test (enabled=false)
	public void TC_003() throws InterruptedException, IOException {

		LoginBuyer();

		Thread.sleep(2000);
		driver.navigate().to(Product1);
		Thread.sleep(2000);

		//Add to cart from pdp page
		ProductDescription pd =  new ProductDescription(driver);
		pd.Addcart();

		driver.navigate().to(Product2);
		Thread.sleep(2000);
		pd.Addcart();
		pd.ButtonConfirm();

		driver.navigate().to("https://stg.dgbusiness.com/shoppingcart");
		Thread.sleep(3000);
		GetScreenShot.TakeScreenshot(OnlinePath+ "0_ShoppingCart" +".jpg");
		// Proceed to checkout 

		ShoppingCart SC = new ShoppingCart(driver);
		SC.ProceedTcheckout();

		// checkout page 

		CheckoutPageObject ck= new CheckoutPageObject(driver);
		ck.BillingYes();
		ck.OnlineClick();


		ck.CheckBoxcLICKED(driver);

		Thread.sleep(5000);


		JavaScriptManage.HideHeader();

		//GetScreenShot.FullSS(OnlinePath+ "1_Checkout");------------------------



		ck.OrderPlace(driver);


		//order place Checkout  

		Thread.sleep(5000);

		Online();



		Thread.sleep(5000);


		String s =driver.findElement(By.xpath("//*[@class='number']")).getText();

		System.out.println(s.substring(1));


		JavaScriptManage.HideHeader();
		Thread.sleep(5000);

		GetScreenShot.FullSS(OnlinePath+ "3_ThankyouPage");

		//Buyer Myaccount

		driver.navigate().to("https://stg.dgbusiness.com/myaccount");

		Thread.sleep(5000);

		JavascriptExecutor jsp = (JavascriptExecutor)driver;
		jsp.executeScript("window.scrollBy(0, 200)");

		// Admin

		GetScreenShot.TakeScreenshot(OnlinePath+ "4_Myaccount" +".jpg");

		AdminOrderPage.AdminOrderSS();
		GetScreenShot.TakeScreenshot(OnlinePath+ "5_AdminOrder" +".jpg");


		//		/*---------Seller 1 Page------------*/

		driver.get(SellerURL);
		SellerHomePObject SH = new SellerHomePObject(driver);
		SH.SellerLogin(SellerEmail, Sellerpwd);

		//		/*-------Order list page  Navigation------------*/

		SellerDashboardPObject SD = new SellerDashboardPObject(driver);
		SD.ClickOrders();
		GetScreenShot.TakeScreenshot("C:\\Users\\cstechmk02\\Desktop\\SharafDG OrderProcess\\OnlieOrder\\"+"6_Seller1Order"+".jpg");



		driver.navigate().to("https://seller.dgbusiness.com/supplierorderdetails/supplier&orderid="+s.substring(1));
		SellerManageOrderPO MS = new SellerManageOrderPO(driver);
		GetScreenShot.FullSS(OnlinePath+ "7_Seller1_Pending");
		MS.SelectRTS();

		JavascriptExecutor jspl = (JavascriptExecutor)driver;
		jspl.executeScript("window.scrollBy(0, 170)");

		MS.logisticSelect();
		MS.shippingheight();
		MS.shippinGLENGTH();
		MS.Width();
		Thread.sleep(2000);
		MS.AWB();
		GetScreenShot.TakeScreenshot(OnlinePath+ "8_Seller1_Rts" +".jpg");
		JavascriptExecutor jsj = (JavascriptExecutor)driver;
		jsj.executeScript("window.scrollBy(0, 140)");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"btnshipping\"]/div[2]/span")).click();


		//RTS Confirmed 


		////////////////////// Order Shipped //////////////////////////

		Thread.sleep(2000);
		//

		driver.navigate().to(SellerURL);
		driver.navigate().to("https://seller.dgbusiness.com/supplierorderdetails/supplier&orderid="+s.substring(1));

		System.out.println("Pass");

		JavascriptExecutor jsj1 = (JavascriptExecutor)driver;
		jsj1.executeScript("window.scrollBy(0, 920)");

		driver.findElement(By.id("manifestli")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("filetomenfest")).sendKeys("C:\\Users\\cstechmk02\\Pictures\\dam.jpg");
		Thread.sleep(4000);


		driver.findElement(By.id("btn_ship")).click();

		driver.findElement(By.xpath("//*[@class='sa-confirm-button-container']")).click();

		driver.navigate().to("https://seller.dgbusiness.com/logout.aspx");


		//	2nd seller OrderFulfilment 

		driver.get(SellerURL);
		SellerHomePObject Seller2 = new SellerHomePObject(driver);
		Seller2.SellerLogin(Seller2Email, Seller2pwd);

		//		/*-------Order list page  Navigation------------*/

		SellerDashboardPObject Sell20 = new SellerDashboardPObject(driver);
		Sell20.ClickOrders();
		GetScreenShot.TakeScreenshot("C:\\Users\\cstechmk02\\Desktop\\SharafDG OrderProcess\\OnlieOrder\\"+"9_Seller1_Order"+".jpg");



		driver.navigate().to("https://seller.dgbusiness.com/supplierorderdetails/supplier&orderid="+s.substring(1));
		SellerManageOrderPO Sellert = new SellerManageOrderPO(driver);
		GetScreenShot.FullSS(OnlinePath+ "10_Seller2_Pending");
		Sellert.SelectRTS();

		JavascriptExecutor jkl = (JavascriptExecutor)driver;
		jkl.executeScript("window.scrollBy(0, 140)");

		Sellert.logisticSelect();
		Sellert.shippingheight();
		Sellert.shippinGLENGTH();
		Sellert.Width();
		Thread.sleep(2000);
		Sellert.AWB();

		GetScreenShot.TakeScreenshot(OnlinePath+ "11_Seller2_Rts" +".jpg");

		JavascriptExecutor kk = (JavascriptExecutor)driver;
		kk.executeScript("window.scrollBy(0, 140)");

		driver.findElement(By.xpath("//*[@id=\"btnshipping\"]/div[2]/span")).click();
		Thread.sleep(2000);

		////////////////////// Order Shipped seller 2//////////////////////////


		driver.navigate().to(SellerURL);

		driver.navigate().to("https://seller.dgbusiness.com/supplierorderdetails/supplier&orderid="+s.substring(1));

		JavascriptExecutor kkl = (JavascriptExecutor)driver;
		kkl.executeScript("window.scrollBy(0, 920)");

		driver.findElement(By.id("manifestli")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("filetomenfest")).sendKeys("C:\\Users\\cstechmk02\\Pictures\\dam.jpg");
		Thread.sleep(4000);


		driver.findElement(By.id("btn_ship")).click();

		driver.findElement(By.xpath("//*[@class='sa-confirm-button-container']")).click();

	}



	@Test (priority =1)
	public void AllOrders() throws InterruptedException, IOException {


		LoginBuyer();

		Thread.sleep(2000);
		driver.navigate().to(Product1);
		Thread.sleep(2000);

		//Add to cart from pdp page
		ProductDescription pd =  new ProductDescription(driver);
		pd.Addcart();

		driver.navigate().to(Product2);
		Thread.sleep(2000);
    	pd.Addcart();
    	
	    	
		pd.ButtonConfirm();

		driver.navigate().to("https://stg.dgbusiness.com/shoppingcart");
		Thread.sleep(3000);
		GetScreenShot.TakeScreenshot(OnlinePath+ "0_ShoppingCart" +".jpg");
		// Proceed to checkout 

		ShoppingCart SC = new ShoppingCart(driver);
		SC.ProceedTcheckout();

		// checkout page 

		CheckoutPageObject ck= new CheckoutPageObject(driver);
		ck.BillingYes();
		ck.OnlineClick();

		//////////////////////////////////////////////////////////////////////
		
		ck.ApplyFinalCoupone();
		ck.StoreCredit();
//		ck.LPApply();

		//////////////////////////////////////////////////////////////////////
		ck.CheckBoxcLICKED(driver);

		Thread.sleep(5000);


		JavaScriptManage.HideHeader();

		GetScreenShot.FullSS(OnlinePath+ "1_Checkout");



		ck.OrderPlace(driver);	

		//order place Checkout  

		Thread.sleep(5000);

		Online();


		

		Thread.sleep(5000);


		String s =driver.findElement(By.xpath("//*[@class='number']")).getText();

		System.out.println(s.substring(1));


		JavaScriptManage.HideHeader();
		Thread.sleep(5000);

		GetScreenShot.FullSS(OnlinePath+ "3_ThankyouPage");

		//Buyer Myaccount

		driver.navigate().to("https://stg.dgbusiness.com/myaccount");

		Thread.sleep(5000);

		JavascriptExecutor jsp = (JavascriptExecutor)driver;
		jsp.executeScript("window.scrollBy(0, 200)");

		// Admin

		GetScreenShot.TakeScreenshot(OnlinePath+ "4_Myaccount" +".jpg");
		
		
		List <WebElement> AllOrders = driver.findElements(By.partialLinkText(s.substring(1)));

		ArrayList<String> targets = new ArrayList<String>();
		ArrayList<String> targets1 = new ArrayList<String>();

		for(WebElement E:AllOrders) {

			targets.add(E.getAttribute("href"));
			
			targets1.add(E.getText());
		}


		for (String target : targets) {
			driver.get(target);
			GetScreenShot.FullSS(OnlinePath+"SellerOrders"+ik+".jpg");
			ik++;


		}


		AdminOrderPage.AdminOrderSS();
		GetScreenShot.TakeScreenshot(OnlinePath+ "5_AdminOrder" +".jpg");
		/*NEW Code ===============================================================*/
		
		driver.navigate().to("https://siteadmin.dgbusiness.com/orderupdate.aspx?id="+targets1.get(0)+"&pid=0");
		JavascriptExecutor jspp = (JavascriptExecutor)driver;
		jspp.executeScript("window.scrollBy(0, 250)");
		
		GetScreenShot.TakeScreenshot(OnlinePath+"AdminOrderdetails"+".jpg");
		driver.navigate().to("https://siteadmin.dgbusiness.com/orderupdate.aspx?id="+targets1.get(1)+"&pid=0");
		
		JavascriptExecutor jsppl = (JavascriptExecutor)driver;
		jsppl.executeScript("window.scrollBy(0, 250)");
		GetScreenShot.TakeScreenshot(OnlinePath+"AdminOrder2details"+".jpg");
		
		
		/*NEW Code end===============================================================*/
		
		
		


		//		/*---------Seller 1 Page------------*/

		driver.get(SellerURL);
		SellerHomePObject SH = new SellerHomePObject(driver);
		SH.SellerLogin(SellerEmail, Sellerpwd);

		//		/*-------Order list page  Navigation------------*/

		SellerDashboardPObject SD = new SellerDashboardPObject(driver);
		SD.ClickOrders();
		GetScreenShot.TakeScreenshot("C:\\Users\\cstechmk02\\Desktop\\SharafDG OrderProcess\\OnlieOrder\\"+"6_Seller1Order"+".jpg");



		driver.navigate().to("https://seller.dgbusiness.com/supplierorderdetails/supplier&orderid="+s.substring(1));
		SellerManageOrderPO MS = new SellerManageOrderPO(driver);
		GetScreenShot.FullSS(OnlinePath+ "7_Seller1_Pending");
		MS.SelectRTS();

		JavascriptExecutor jspl = (JavascriptExecutor)driver;
		jspl.executeScript("window.scrollBy(0, 170)");

		MS.logisticSelect();
		MS.shippingheight();
		MS.shippinGLENGTH();
		MS.Width();
		Thread.sleep(4000);
		MS.AWB();
		GetScreenShot.TakeScreenshot(OnlinePath+ "8_Seller1_Rts" +".jpg");
		JavascriptExecutor jsj = (JavascriptExecutor)driver;
		jsj.executeScript("window.scrollBy(0, 140)");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"btnshipping\"]/div[2]/span")).click();


		//RTS Confirmed 


		////////////////////// Order Shipped //////////////////////////

		Thread.sleep(2000);
		//

		driver.navigate().to(SellerURL);
		driver.navigate().to("https://seller.dgbusiness.com/supplierorderdetails/supplier&orderid="+s.substring(1));

		System.out.println("Pass");

		JavascriptExecutor jsj1 = (JavascriptExecutor)driver;
		jsj1.executeScript("window.scrollBy(0, 930)");

		driver.findElement(By.id("manifestli")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("filetomenfest")).sendKeys("C:\\Users\\cstechmk02\\Pictures\\dam.jpg");
		Thread.sleep(8000);


		driver.findElement(By.id("btn_ship")).click();

		driver.findElement(By.xpath("//*[@class='sa-confirm-button-container']")).click();

		driver.navigate().to("https://seller.dgbusiness.com/logout.aspx");


		//	2nd seller OrderFulfilment 

		driver.get(SellerURL);
		SellerHomePObject Seller2 = new SellerHomePObject(driver);
		Seller2.SellerLogin(Seller2Email, Seller2pwd);

		//		/*-------Order list page  Navigation------------*/

		SellerDashboardPObject Sell20 = new SellerDashboardPObject(driver);
		Sell20.ClickOrders();
		GetScreenShot.TakeScreenshot("C:\\Users\\cstechmk02\\Desktop\\SharafDG OrderProcess\\OnlieOrder\\"+"9_Seller1_Order"+".jpg");



		driver.navigate().to("https://seller.dgbusiness.com/supplierorderdetails/supplier&orderid="+s.substring(1));
		SellerManageOrderPO Sellert = new SellerManageOrderPO(driver);
		GetScreenShot.FullSS(OnlinePath+ "10_Seller2_Pending");
		Sellert.SelectRTS();

		JavascriptExecutor jkl = (JavascriptExecutor)driver;
		jkl.executeScript("window.scrollBy(0, 140)");

		Sellert.logisticSelect();
		Sellert.shippingheight();
		Sellert.shippinGLENGTH();
		Sellert.Width();
		Thread.sleep(2000);
		Sellert.AWB();

		GetScreenShot.TakeScreenshot(OnlinePath+ "11_Seller2_Rts" +".jpg");

		JavascriptExecutor kk = (JavascriptExecutor)driver;
		kk.executeScript("window.scrollBy(0, 140)");

		driver.findElement(By.xpath("//*[@id=\"btnshipping\"]/div[2]/span")).click();
		Thread.sleep(2000);

		////////////////////// Order Shipped seller 2//////////////////////////


		driver.navigate().to(SellerURL);

		driver.navigate().to("https://seller.dgbusiness.com/supplierorderdetails/supplier&orderid="+s.substring(1));

		JavascriptExecutor kkl = (JavascriptExecutor)driver;
		kkl.executeScript("window.scrollBy(0, 920)");

		driver.findElement(By.id("manifestli")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("filetomenfest")).sendKeys("C:\\Users\\cstechmk02\\Pictures\\dam.jpg");
		Thread.sleep(4000);


		driver.findElement(By.id("btn_ship")).click();

		driver.findElement(By.xpath("//*[@class='sa-confirm-button-container']")).click();





	}


	public void Online() throws InterruptedException, IOException {

		driver.switchTo().frame(0);

		driver.findElement(By.id("checkout-frames-card-number")).sendKeys("4242424242424242");
		driver.findElement(By.id("checkout-frames-expiry-date")).sendKeys("1234");


		driver.findElement(By.id("checkout-frames-cvv")).sendKeys("100");

		Thread.sleep(4000);

		GetScreenShot.TakeScreenshot(OnlinePath+ "2_CheckoutpaymentGateway" +".jpg");

		driver.switchTo().parentFrame();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='pay-button']")).click();


	}

	
	
	public void LoginBuyer() throws InterruptedException {


		//ClearCartProduct
		RemoveSpecificCart Rc= new RemoveSpecificCart();
		Rc.CartRemoveSpecific();


		//Launching browser
		driver.get(BaseURL);


		LoginBuyerPO lp = new LoginBuyerPO(driver);
		lp.Buyer_login("sonu@cstech.in", "12345");


	}


}
