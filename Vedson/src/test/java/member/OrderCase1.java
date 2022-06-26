package member;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderCase1 {
	
	WebDriver driver;
	


	           @BeforeTest
	           public void setup()
	            
	           {
			
		       System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");

		       ChromeDriver driver=new ChromeDriver();
			   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			   driver.manage().window().maximize();
			   
			   
	            }
	            
	           
	            
	           @Test(priority =1)
			   public void login() throws InterruptedException
			   
			   {
	        	   
	        	
	           driver.get("http://vedson.cstechns.com/login");   
			   driver.findElement(By.id("left_txtemail")).sendKeys("sonu@cstech.in");
			   driver.findElement(By.id("left_txtpwd")).sendKeys("12345");
			   driver.findElement(By.id("signin_btnlogin")).click();
			   Thread.sleep(2000);


			   driver.navigate().to("http://vedson.cstechns.com/products/Bagpackwildcraft/Orange/BMP-S1344649#.YRgN2ogzbIU");
			   driver.findElement(By.id("Color_1")).click();
			   Thread.sleep(2000);
			   driver.findElement(By.id("Size_1")).click();
			   driver.findElement(By.id("QtyAdd")).click();
			   driver.findElement(By.xpath("//*[@id=\"addtocartnew\"]/span[2]/a")).click();
			
			
			   driver.navigate().to("http://vedson.cstechns.com/products/Babymosquitonetwithpadandpillow/Light%20Blue/BMP-S1366502");
			   driver.findElement(By.id("Color_0")).click();
			   Thread.sleep(2000);
			   driver.findElement(By.id("Size_1")).click();
			   driver.findElement(By.id("QtyAdd")).click();
			   driver.findElement(By.xpath("//*[@id=\"addtocartnew\"]/span[2]/a")).click();
			   
			   driver.findElement(By.className("sa-confirm-button-container")).click();
			   driver.navigate().to("http://vedson.cstechns.com/shoppingcart");
			   driver.findElement(By.xpath("//*[@class= 'button_01']")).click();
			   driver.findElement(By.className("btncontinue-nd")).click();
			   driver.findElement(By.xpath("//*[@id='cod_mop']")).click();
			
			   WebElement element = driver.findElement(By.xpath("//*[@id='btnplaceorder']"));

			   Actions actions = new Actions(driver);

			   actions.moveToElement(element).click().perform();
			   
			  //driver.findElement(By.xpath("//*[@id='btnplaceorder']")).click();
			
			   
			   driver.findElement(By.id("txtcodnumber")).sendKeys("4582");
			   
			   driver.findElement(By.id("btncodsubmit")).sendKeys("4582");
			   
			   
			   }
	  
			   
			   @AfterClass
				public void tearDown() throws InterruptedException 
				{
			        Thread.sleep(6000);
					//driver.quit();
				}




	}




