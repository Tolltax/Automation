package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	protected WebDriver driver;
	
	@BeforeTest
	public void Setup() {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions s = new ChromeOptions();
		s.addArguments("incognoto");
		
		
		driver = new ChromeDriver(s);
		driver.manage().window().maximize();
		
		
		
	}
	
	
	
	
	@AfterTest
	public void teardown() {
		
		
	}
	
}
