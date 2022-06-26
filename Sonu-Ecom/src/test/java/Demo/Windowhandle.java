package Demo;

import java.lang.StackWalker.Option;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandle {

	WebDriver driver;
	
	@BeforeTest
	public void Setup() {
		
		
     WebDriverManager.chromedriver().setup();
     
//     ChromeOptions optio = new ChromeOptions();
//     Option.
     
     driver =new ChromeDriver();
     driver.manage().window().maximize();
     
   
     
	
	}
	
	
	@Test
	public void Test() {
	
		  driver.get("google");
		
		
	}
	
	
}
