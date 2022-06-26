package PractiseSelenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakemyTripSearcFlight {

	WebDriver driver;



	@BeforeTest
	public void Setup() {


		WebDriverManager.chromedriver().setup();
		driver=  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}

	@Test
	public void SearchFlight() {
		driver.get("https://www.google.co.in/");
		WebElement p =driver.findElement(By.className("gLFyf gsfi"));
		//driver.findElement(by.)


	}

	@AfterTest
	public void TearDown() {

		System.out.println("Done");
		//driver.close();

	}

}
