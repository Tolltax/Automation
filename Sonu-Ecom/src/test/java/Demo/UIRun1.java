package Demo;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIRun1 {

	 WebDriver driver;

	@BeforeTest
	public void Setup() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://igsindia.net/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@class='nav-link dropdown-toggle' and @href='https://igsindia.net/managed-test-house/']")))
		.build().perform();
			
	}

	@Test 
	public void Test() {

	
		
		System.out.println("Url lauched");

	}

	//	@Test
	//	public void Test1() {
	//		
	//		
	//		System.out.println("Url lauched");
	//		
	//	}

	@AfterTest
	public void teardown() {

		driver.close();


	}
}
