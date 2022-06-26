package SharafDG_BrandPanel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPro {

	WebDriver driver;

	@BeforeTest
	public void Setup()

	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://igsindia.net/");
	}



	@Test
	public void TC12() {

		


		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//*[@class='nav-link dropdown-toggle' and @href='https://igsindia.net/managed-test-house/']"))).build().perform();



	}


	@AfterTest
	public void teardown()

	{

		System.out.println("pass");
	}


}

