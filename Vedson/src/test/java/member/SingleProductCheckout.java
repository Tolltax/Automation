package member;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.IOException;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vedsonmemberPageObject.BaseClass;
import com.vedsonmemberPageObject.CheckoutPO;

import com.vedsonmemberPageObject.OTPVeri;
import com.vedsonmemberPageObject.ProductDescriptionVed;
import com.vedsonmemberPageObject.ShoppingCartVed;

import AdminOrderTest.AdminOrderPageVed;
import AdminOrderTest.RemovCart;
import SellerPanelPO.SellerDashBoardVedPO;
import SellerPanelPO.SellerHomePageVed;
import SellerPanelPO.SellerManageOrderVedPO;
import utilVed.JavaScriptCD;
import utilVed.ScreenShotVed;

public class SingleProductCheckout extends BaseClass {
	
	int ik=1;
	String OnlinePath= "C:\\Users\\cstechmk02\\Desktop\\VedsonOrderProcess\\OrderProcess\\";	



	@Test (priority =1)
	public void AllOrders() throws InterruptedException, IOException {


		LoginBuyer();

		Thread.sleep(2000);
		driver.navigate().to(Product2);
		Thread.sleep(2000);

		//Add to cart from pdp page
		
		ProductDescriptionVed pd =  new ProductDescriptionVed(driver);
		
		pd.Addcart();
			
		pd.ButtonConfirm();

		driver.navigate().to("http://vedson.cstechns.com/shoppingcart");
		Thread.sleep(3000);
		ScreenShotVed.TakeScreenshot(OnlinePath+ "0_ShoppingCart" +".jpg");
		// Proceed to checkout 

		ShoppingCartVed SC = new ShoppingCartVed(driver);
		SC.ProceedTcheckout();

		// checkout page 
		

		CheckoutPO ck= new CheckoutPO(driver);
		ck.chout();

		//ck.ApplyFinalCoupone();
		//ck.StoreCredit();
		//ck.LPApply();


		Thread.sleep(5000);

		JavaScriptCD.HideHeader();
	
		ScreenShotVed.FullSS(OnlinePath+ "1_Checkout");


		ck.PAYCOD();
		ck.OrderPlace(driver);

		OTPVeri otp = new OTPVeri(driver);
		otp.OTPVerification();
		//order place Checkout  

		
	

     	 //Online();
		//Online2();

		Thread.sleep(10000);
		String s =driver.findElement(By.xpath("//*[@class='number']")).getText();


		JavaScriptCD.HideHeader();
		Thread.sleep(3000);

		ScreenShotVed.FullSS(OnlinePath+ "3_ThankyouPage");

		//Buyer Myaccount

		driver.navigate().to("http://vedson.cstechns.com/myaccount");

		Thread.sleep(5000);

		JavascriptExecutor jsp = (JavascriptExecutor)driver;
		jsp.executeScript("window.scrollBy(0, 200)");

		// Admin

		ScreenShotVed.TakeScreenshot(OnlinePath+ "4_Myaccount" +".jpg");


		List <WebElement> AllOrders = driver.findElements(By.partialLinkText(s));

		ArrayList<String> targets = new ArrayList<String>();
		ArrayList<String> targets1 = new ArrayList<String>();

		for(WebElement E:AllOrders) {

			targets.add(E.getAttribute("href"));

			targets1.add(E.getText());
		}


		for (String target : targets) {
			driver.get(target);
			ScreenShotVed.FullSS(OnlinePath+"SellerOrders"+ik+".jpg");
			ik++;


		}


    	AdminOrderPageVed.AdminOrderSS();
		ScreenShotVed.TakeScreenshot(OnlinePath+ "5_AdminOrder" +".jpg");
//    	/*NEW Code ===============================================================*/
//
		driver.navigate().to("http://siteadminvedson.cstechns.com//orderupdate.aspx?id="+targets1.get(0)+"&pid=0");
		JavascriptExecutor jspp = (JavascriptExecutor)driver;
		jspp.executeScript("window.scrollBy(0, 250)");

		ScreenShotVed.TakeScreenshot(OnlinePath+"AdminOrderdetails"+".jpg");

		
//		//		/*---------Seller 1 Page------------*/

		driver.get(SellerURL);
		SellerHomePageVed SH = new SellerHomePageVed(driver);
		//SH.SellerLogin("vicod87879@nobitcoin.net", "12345");
		SH.SellerLogin("sonu@cstech.in", "123456");

		//		/*-------Order list page  Navigation------------*/

		SellerDashBoardVedPO SD = new SellerDashBoardVedPO(driver);
		SD.ClickOrders();
		ScreenShotVed.TakeScreenshot(OnlinePath+"6_Seller1Order"+".jpg");

		
		driver.navigate().to("http://sellervedson.cstechns.com/supplierorderdetails/supplier&orderid="+s);
		SellerManageOrderVedPO MS = new SellerManageOrderVedPO(driver);
		ScreenShotVed.FullSS(OnlinePath+ "7_Seller1_Pending");
		MS.SelectRTS();

		JavascriptExecutor jspl = (JavascriptExecutor)driver;
		jspl.executeScript("window.scrollBy(0, 170)");

		//MS.logisticSelect();
		MS.shippingheight();
		MS.shippinGLENGTH();
		MS.Width();
		//Thread.sleep(4000);
		MS.AWB();
		ScreenShotVed.TakeScreenshot(OnlinePath+ "8_Seller1_Rts" +".jpg");
		JavascriptExecutor jsj = (JavascriptExecutor)driver;
		jsj.executeScript("window.scrollBy(0, 140)");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"btnshipping\"]/div[2]/span")).click();


		//RTS Confirmed 


		////////////////////// Order Shipped //////////////////////////

		Thread.sleep(2000);
		//

		driver.navigate().to(SellerURL);
		driver.navigate().to("http://sellervedson.cstechns.com/supplierorderdetails/supplier&orderid="+s);

	

		JavascriptExecutor jsj1 = (JavascriptExecutor)driver;
		jsj1.executeScript("window.scrollBy(0, 930)");

		driver.findElement(By.id("manifestli")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("filetomenfest")).sendKeys("C:\\Users\\cstechmk02\\Pictures\\dam.jpg");
		Thread.sleep(8000);


		driver.findElement(By.id("btn_ship")).click();

		driver.findElement(By.xpath("//*[@class='sa-confirm-button-container']")).click();

		driver.navigate().to("https://seller.dgbusiness.com/logout.aspx");


		
//
//		driver.get(SellerURL);
//		SellerHomePObject Seller2 = new SellerHomePObject(driver);
//		Seller2.SellerLogin(Seller2Email, Seller2pwd);
//
//		/*-------Order list page  Navigation------------*/
//
//		SellerDashboardPObject Sell20 = new SellerDashboardPObject(driver);
//		Sell20.ClickOrders();
//		ScreenShotVed.TakeScreenshot("C:\\Users\\cstechmk02\\Desktop\\SharafDG OrderProcess\\OnlieOrder\\"+"9_Seller1_Order"+".jpg");
//
//
//
//		driver.navigate().to("https://seller.dgbusiness.com/supplierorderdetails/supplier&orderid="+s.substring(1));
//		SellerManageOrderPO Sellert = new SellerManageOrderPO(driver);
//		ScreenShotVed.FullSS(OnlinePath+ "10_Seller2_Pending");
//		Sellert.SelectRTS();

		JavascriptExecutor jkl = (JavascriptExecutor)driver;
		jkl.executeScript("window.scrollBy(0, 140)");
//
//		Sellert.logisticSelect();
//		Sellert.shippingheight();
//		Sellert.shippinGLENGTH();
//		Sellert.Width();
//		Thread.sleep(2000);
//		Sellert.AWB();

		ScreenShotVed.TakeScreenshot(OnlinePath+ "11_Seller2_Rts" +".jpg");

		JavascriptExecutor kk = (JavascriptExecutor)driver;
		kk.executeScript("window.scrollBy(0, 140)");

		driver.findElement(By.xpath("//*[@id=\"btnshipping\"]/div[2]/span")).click();
		Thread.sleep(2000);

		////////////////////// Order Shipped seller 2//////////////////////////


		driver.navigate().to(SellerURL);

		driver.navigate().to("https://seller.dgbusiness.com/supplierorderdetails/supplier&orderid="+s);

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

    		
        	
        	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']")));
    		driver.findElement(By.xpath("//button[@class='instrument slotted-option svelte-1u727jy'][1]")).click();
    		driver.findElement(By.id("vpa-upi")).clear();
    		driver.findElement(By.id("vpa-upi")).sendKeys("8287729020@okaxis");
    		driver.findElement(By.id("footer-cta")).click();
        	
    	}
		
	
	
	
	public void Online2() throws InterruptedException, IOException {

		
    	
    	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='razorpay-checkout-frame']")));
		driver.findElement(By.xpath("//div[text()='Wallet']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"form-wallet\"]/div/button[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"footer-cta\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"otp\"]")).sendKeys("12345");
		
		driver.findElement(By.id("footer-cta")).click();
		
//		driver.findElement(By.xpath("//*[@id=\"footer-cta\"]")).click();
    	
	}
	
	
	
	
	
	

		
//		String mainWindow = driver.getWindowHandle();
//		Set<String> allwindows =driver.getWindowHandles();
//		Iterator<String> ite = allwindows.iterator();
//		
//		//Here we will check Child window
//		
//	 while(ite.hasNext()) {
//		 
//		 String Child =ite.next();
//		 if(!mainWindow.equalsIgnoreCase(Child)) {
//			 
//			 driver.switchTo().window(Child);
//			 driver.findElement(By.xpath("//button[@class='success']")).click();
//			 //driver.close();  
//			 
//			 
//			// driver.switchTo().window(Child);
//			 
//		 }
//		 
//		 
//	 }

	

//		driver.switchTo().parentFrame();
//
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id='pay-button']")).click();



	public void LoginBuyer() throws InterruptedException {

		RemovCart Rc= new RemovCart();
		Rc.RemovCart();

		//Launching browser
		driver.get(BaseURL);
		
//		  ChromeOptions o= new ChromeOptions();
//		  o.addArguments("--incognito");
//		  DesiredCapabilities c = DesiredCapabilities.chrome();
//		  c.setCapability(ChromeOptions.CAPABILITY, o);
//		  WebDriver driver = new ChromeDriver(o);
		

		Login lp = new Login(driver);
		lp.Buyer_login(Username, paassword);

	}

    }
