package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	WebDriver driver;
	
	public  WebDriver StartBrowser(String BrowserName, String url) {
		
		
	     	if(BrowserName.equalsIgnoreCase("chrome"))
			    {
	     		  driver=new ChromeDriver();
			    }
	     	
	            else if(BrowserName.equalsIgnoreCase("firefox"))
	                {
	        	 
	            	 driver=new FirefoxDriver();
	                 }
	
	     	driver.manage().window().maximize();
	     	driver.get(" ");
	     	return driver;
	     	
}          
}