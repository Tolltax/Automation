package PageObject;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClassSeller1 {
 
	
	   protected WebDriver driver;
 
	  public String SellerURL ="http://sellersharafdguat.cstechns.com/";
	  
	  protected String SellerEmail ="pssonugupta@gmail.com";
	  protected String Sellerpwd = "123456";
	 
	
    
		@BeforeTest
		public void Setup() {

			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		}


		@AfterTest
		public void Teardown1() {

			//driver.quit();
		
		}

}	
	
	
	
	

