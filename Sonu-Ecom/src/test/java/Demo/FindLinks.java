package Demo;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLinks {

	WebDriver driver;

	@BeforeTest
	public void Setup() {

		WebDriverManager.chromedriver().setup();

		 driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://testng.org/doc/");

	}

	@Test 
	public void Test() {

		List<WebElement> links = driver.findElements(By.tagName("a"));


		System.out.println("total links count " + links.size());

	}

	//	@Test
	//	public void Test1() {
	//		
	//		
	//		System.out.println("Url lauched");
	//		
	//	}

	//	@AfterTest
	//	public void teardown() {
	//		
	//		driver.close();
	//		
	//		
	//	}
}
