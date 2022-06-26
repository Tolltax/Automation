package Sportalook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hokosoko.pageobject.loginPAGE;

public class SingleOrderbelow1499 {
	WebDriver driver;

    @BeforeTest
	public void setup() throws InterruptedException {
		
    	
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Webdriver//chromedriver.exe");

        
        driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	

	
	
	@Test
	public void logintext() throws InterruptedException
	{
		
		/* Login to Member Panel */
		
		driver.get("https://www.sportalook.com/login");
		driver.findElement(By.id("left_txtemail")).sendKeys("sonu@cstech.in");
		driver.findElement(By.id("left_txtpwd")).sendKeys("12345");
		driver.findElement(By.id("signin_btnlogin")).click();
		Thread.sleep(3000);
		
		/*pop up close */
		driver.findElement(By.xpath("//*[@class='close']"));
		
		/* Navigation to product seller 1 */
		 driver.navigate().to("https://www.sportalook.com/products/BMPilatesShapewearCropTop/Green/BMP-S1636066#.YSn4SY4zbIU");
		 
		 /*Adding QTY 2 */
		 
		 driver.findElement(By.id("QtyAdd")).click();
		 WebElement element= driver.findElement(By.id("Size_0"));
		 element.click();
		 
		 System.out.println("done1");
		 
		// String val= element.getAttribute("innerText"))
		 
		//String  expexted_Offer_price = "1,299.00";
		
		 WebElement element1= driver.findElement(By.xpath("//*[@id=\"addtocartnew\"]/span[2]/a"));
		 element1.click();
		 
		 System.out.println("done2");
		 
		 driver.findElement(By.xpath("//*[@class='sa-confirm-button-container']")).click();
		 
		 System.out.println("done3");
		 
//		 String val1= element.getAttribute("innerText");
//		 
//		 String  expexted_mrp = "899.00";
		

		
	}
	
	
	
	
	@AfterClass
	public void tearDown() throws InterruptedException
	
	{
        Thread.sleep(6000);
		//driver.quit();
	}

}
