package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import UtilsHelpers.GetScreenShot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.BaseClass;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class UItest  {

	
	WebDriver driver ;
	
	@BeforeTest
	    public void setup() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public  void Test() throws IOException {
		
		
		driver.get("https://dgbusiness.com");
		

		 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 FileUtils.copyFile(scrFile, new File("C://Users//cstechmk02//Desktop//Sharafdg//.png"));
		
		
	}
	
	
//	@AfterTest
//	public static void teardown() {
//		
//		
//	}
	
}
