package SharafDG_BrandPanel;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadExcel {

	
	public static void main(String [] args)
	
	{
		
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://google.com");

		//System.out.println("Test");
		
		
	}
	
	
	
}
