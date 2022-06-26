package TestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.internal.reflect.ConstantPool.Tag;

public class Screenshot {

	WebDriver driver;
	
	@Test
	public void Setup() {
		
		WebDriverManager.chromedriver().setup();
		
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		
	   List<WebElement> alllink = driver.findElements(By.tagName("a"));
		
		int a= alllink.size();
		
		System.out.println(a);
		
     }
		
		
	}
	
	
	

