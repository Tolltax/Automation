package Demo;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshotFull {

	public String child_window;

	WebDriver driver;

	@BeforeTest
	public void Setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	

		
	@AfterTest
	public void teardown() {

		//driver.close();


	}
	
	
	@Test
	public void Test() {
		
		
		driver.get("https://www.browserstack.com/");
		String  paraentwindow=driver.getWindowHandle();
		System.out.println(paraentwindow);
		Set<String> s =driver.getWindowHandles();
		
	  Iterator<String> p =  s.iterator();
	
	  while(p.hasNext()) {
		  
		    child_window=  p.next();
		  
		  
	  }if(!paraentwindow.equals(child_window)) {
		  
		  
		  driver.switchTo().window(child_window);
		  
		  driver.close();
		  
	  }
	  
	  driver.switchTo().window(paraentwindow);
	  
	  
	}
	
	
	
}



