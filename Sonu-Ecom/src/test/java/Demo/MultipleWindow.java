package Demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindow  {

		WebDriver driver;
	
	@BeforeTest
	public void Setuup() {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions opti =new ChromeOptions();
		opti.addArguments("disable-infobars");
		
		driver = new ChromeDriver(opti);
		driver.manage().window().maximize();
		
		
		
	}
	
	
	@Test
	public void Test1() {
		
		
		driver.get("https://google.com");
		
	}
	
	@AfterTest
	public void teardoen() {
		
		System.out.println("Test Complete");
		
	}
}
