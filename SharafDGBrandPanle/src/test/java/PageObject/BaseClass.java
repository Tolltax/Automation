package PageObject;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public String BaseURL = "http://brandsharafdguat.cstechns.com/login";
	public String MemberURL = "http://sharafdguat.cstechns.com/";
	public String Username = "test.apple1@apple.com";
	public String paassword = "12345";
	public static WebDriver driver;
	public String InvalideUname = "sonu@cstech1.in";
	public String Invalidepwd = "1234";
	//public String Values;
	//public String path = "C://Users//cstechmk02//Desktop//sharaf_Screenshot//TC_Login";
	
	
	@BeforeTest
	public void Setup() {
		
		// WebDriverManager.chromedriver().setup();
		 WebDriverManager.iedriver().setup();
	 	 //driver=new ChromeDriver();
	 	 driver =new InternetExplorerDriver(); 
		//Logger logger =Logger.getLogger("SharafDGBrandPanel");
		//PropertyConfigurator.configure("Log4j.properties");
		driver.manage().window().maximize();
		
		
	}
	
	
	
    @AfterTest
	public void Teardown() {
		
		driver.quit();
		
	}
	
	
	
}
