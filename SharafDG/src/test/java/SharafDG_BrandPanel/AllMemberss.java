package SharafDG_BrandPanel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllMemberss {

	
	
	public static void main(String[] args) {
		
		WebDriver driver;
		int i;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://sharafdguat.cstechns.com/");
		

		
	}

}
