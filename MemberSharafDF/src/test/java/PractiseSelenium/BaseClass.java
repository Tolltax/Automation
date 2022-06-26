package PractiseSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	WebDriver driver;
	
	@BeforeTest
	public void Setup() {
		
		
		WebDriverManager.edgedriver().setup();
		driver =new EdgeDriver();
		driver.manage().window().maximize();
		
		
	}
	
	
	
	
	@AfterTest
	public void tearDown() {
		
		System.out.println("Pass");
		
		
	}
	
	
}
