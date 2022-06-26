package com.vedsonmemberPageObject;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {




	public String BaseURL = "http://vedson.cstechns.com/login";
	public String Username = "sonu@cstech.in";
	public String paassword = "123456";
	protected String Product1 = "http://vedson.cstechns.com/products/Bagpackwildcraft/Orange/BMP-S1344649";
	protected String Product2 = "http://vedson.cstechns.com/products/Babymosquitonetwithpadandpillow/Light%20Blue/BMP-S1366502";



	public String  uid= "sonu@cstech.in";
	public String pwd= "12345";
	///////////////////////////////////////////



	/* <-----------------<Admin >------------ */


	protected String BaseUrladmin ="http://siteadminvedson.cstechns.com/";
	protected String AdminUsername = "vedson@cstech.in";
	protected String Adminpwd = "45824582";

	protected String CartRemoveEmil = "sonu@cstech.in";

	/* <-----------------<Seller >------------ */
	protected String SellerURL = "http://sellervedson.cstechns.com/";

	protected String SellerEmail = "sonu@cstech.in";
	protected String Sellerpwd = "123456";


	protected String Seller2Email = "vicod87879@nobitcoin.net";
	protected String Seller2pwd = "12345";

	public static WebDriver driver;



	@BeforeTest
	public void Setup() throws InterruptedException, IOException {


		WebDriverManager.chromedriver().setup();
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("incognito");
//
//		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability(ChromeOptions.CAPABILITY, option);
//		option.merge(cap);
//
//		driver=new ChromeDriver(option);
		
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	}




	@AfterTest
	public void Teardown() {

		driver.quit();

	}






}
