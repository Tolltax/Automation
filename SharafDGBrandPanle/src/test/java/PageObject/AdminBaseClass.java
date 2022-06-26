package PageObject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdminBaseClass {

	
	String BaseUrladmin ="http://siteadminsharafdguat.cstechns.com/";
	
	public static  WebDriver driver;
	
	public String Username = "sharafdg@cstech.in";
	public String pwd = "Sharaf@1";
	public String inalidepwd = "Sharaf1";
	
	
	
	
	@BeforeTest
	public void Setup() {
		

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
	}
	
	@AfterTest
	public void TearDown() {
		
  //	driver.quit();
		
	}
	

}
