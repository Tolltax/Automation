package pageobject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import UtilsHelpers.GetScreenShot;
import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class BaseClass {


	public String BaseURL = "https://dgbusiness.com/login";
	public String Username = "sonu@cstech.in";
	public String paassword = "12345";
	protected String Product1 = "https://stg.dgbusiness.com/products/iPhone-13-Pro-Max-1TB-Gold-m4gFaceTime--Japan-Specsm5gABD3/Black/BMP-S1084919#.YfdlXOpBzIU";
	protected String Product2 = "https://stg.dgbusiness.com/products/Apple-iPhone-12-Mini-MJQF3AAm2gA-64GB-Purple7873/Purple/BMP-S1121233";
	public String ActualProductName ="APPLE iPhone 13 Pro Max (Graphite, 256 GB)";
	public String SiteMapXml1 = "http://sharafdguat.cstechns.com/sitemap.xml";
	protected String path = "C:\\Users\\cstechmk02\\Desktop\\SS\\";

	public String  uid= "sonu@cstech.in";
	public String pwd= "12345";
	///////////////////////////////////////////

	public String SellerRegistration ="Arvind ba";
	protected String SellerFullName ="Anmol p";

	
	//String ReturnOrder ="//stg.dgbusiness.com/orderdetailsreturns/427-S1121233";

	/* <-----------------<Admin >------------ */


	protected String BaseUrladmin ="https://siteadmin.dgbusiness.com/";
	protected String AdminUsername = "sharafdg@cstech.in";
	protected String Adminpwd = "Sharaf@1";
	
	protected String CartRemoveEmil = "sonu@cstech.in";
	
	/* <-----------------<Seller >------------ */
	protected String SellerURL = "https://seller.dgbusiness.com/";
	
	protected String SellerEmail = "pssonugupta@gmail.com";
	protected String Sellerpwd = "123456";
	

	protected String Seller2Email = "yocapek837@mainctu.com";
	protected String Seller2pwd = "12345";

	public static WebDriver driver;



	@BeforeTest
	public void Setup() throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		driver=new ChromeDriver();
//		driver = new FirefoxDriver();
//		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



		//		BuyerLoginPO bl = new BuyerLoginPO(driver);
		//		bl.Buyer_login(uid, pwd);
		//		Thread.sleep(4000);
		//		
		//		//PRODUCT 1 ADD
		//		   driver.navigate().to(Product1);
		//		   Thread.sleep(4000);
		//		   
		//		   GetScreenShot.TakeScreenshot(driver, "C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_001\\"+driver.getTitle() +".png");
		//
		//		   ProductDescription pd = new ProductDescription(driver);
		//		   pd.Addcart();
		//		   Thread.sleep(1000);
		//		   pd.ButtonConfirm();
		//		
		//		   
		//		   
		//		 //PRODUCT 2 ADD
		//		   driver.navigate().to(Product2);
		//		   Thread.sleep(2000);
		//		  GetScreenShot.TakeScreenshot(driver, "C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_001\\"+driver.getTitle() +".png");
		//
		//		   ProductDescription pd1 = new ProductDescription(driver);
		//		   pd1.Addcart();
		//		   Thread.sleep(1000);
		//		   pd1.ButtonConfirm();
		//		
		//		   Thread.sleep(3000);
		//		   
		//		   driver.navigate().to("http://sharafdguat.cstechns.com/shoppingcart");		
		//
		//	    
		//		
		//			JavascriptExecutor js1 = (JavascriptExecutor) driver;
		//	        js1.executeScript("window.scrollBy(0,80)");
		//	        
		//			 GetScreenShot.TakeScreenshot(driver, "C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_001\\"+" Shoppingcart"+".png");
		//
		//	        
		//	        Thread.sleep(2000);
		//	         
		//	        ShoppingCart ProcTocheckout = new ShoppingCart(driver);
		//	        
		//	        
		//	        ProcTocheckout.AddToCart();
		//	        Thread.sleep(2000);
		//	        
		//	        
		//
		//		GetScreenShot.TakeScreenshot(driver, "C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_001\\"+driver.getTitle() +".png");


		//		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		//		js3.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");
		//		Thread.sleep(4000);

		//		Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
		//		ImageIO.write(fpScreenshot.getImage(),"PNG",new File("C:\\Users\\cstechmk02\\Desktop\\sharaf_Screenshot\\TC_001\\"+ "ShoppingCart"+".png"));

	}




	@AfterTest
	public void Teardown() {

		//driver.quit();

	}



}
