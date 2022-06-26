package Demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIRun {

	WebDriver driver;
	
	@BeforeTest
	public void Setup() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		int Height[] = {600,700};
		int width [] = {1200,1500};
		
		Dimension d = new Dimension(600,900);
		driver.manage().window().setSize(d);
		//driver.manage().window().maximize();
		driver.get("https://testng.org/doc/");
		
	}
	
	@Test
	public void Test() {
		
		
		System.out.println("Url lauched");
		
	}
	
	@AfterTest
	public void teardown() {
		
		driver.close();
		
		
	}
}
