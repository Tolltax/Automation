package SharafDG_BrandPanel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cdpSs {
	
	WebDriver driver;
	
	@BeforeTest
	public void Setup()
	
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		driver.get("http://brandsharafdguat.cstechns.com/login");
	}
	
	
	@Test
	public void TC1() {
		
		driver.get("https://www.selenium.dev/documentation/support_packages/chrome_devtools/");
		
	}
	
	@AfterTest
	public void Teandown() {
		
		System.out.println("Done");
	}
	
	

}
