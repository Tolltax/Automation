package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;
public class Fact21 {

	public static void main(String[] args) {


		/* Make my trip i need
		 * 
		 * 1. open website- https://www.makemytrip.com/
		 * 2. Select from Patna
		 * 3. Select to Bengaluru
		 * 4. Select Departure date 10 june
		 * 5. click on search
		 */

		// this is my comment 
	}
	
	WebDriver driver;
	
	@BeforeTest
	void Setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	
	@Test
	void Url  (){
		
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.id("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("Patna");
	}
	
	

	@AfterTest
	void TearDown() {
      System.out.println("completed");
		
	}
	
	
}



