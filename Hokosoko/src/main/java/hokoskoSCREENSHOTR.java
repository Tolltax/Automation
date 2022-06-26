import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hokoskoSCREENSHOTR {
	
	 WebDriver driver;
		
	    @BeforeTest
		public void setup() throws InterruptedException {
			
	    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Webdriver//chromedriver.exe");

	        
	        driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://hokosoko.com/sitemap.xml");
			Thread.sleep(10000);
			
		}
		

	    @Test
	    public void SCREENTEST() {
	    	
	    	
	    	System.out.println("test");
	    	
	    	
	    }
	
	

}
