package sportalook;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class OrderCase1 {

	WebDriver driver;

	public class OrdrCase1  {


		    @BeforeTest
			public void setup() throws InterruptedException {
				
		    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		        
		        driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.manage().window().maximize();

	     		}

			
			@Test(priority =1)
			public void Orderplaced() throws InterruptedException, IOException
			{
				
				/////////////* Login to Member Panel *//////////////
				
				
				driver.get("https://www.sportalook.com/login");
				
				driver.findElement(By.id("left_txtemail")).sendKeys("sonu@cstech.in");
				driver.findElement(By.id("left_txtpwd")).sendKeys("12345");
				
				////////* Calling Screenshot methods login page *///////////

				RemoveHeader();
				ViewScreenshot();
				 
				driver.findElement(By.id("signin_btnlogin")).click();
				Thread.sleep(3000);
				 
				///////* Navigation to product seller 1 *////////////
				
				 driver.navigate().to("https://www.sportalook.com/products/PunchTop63B0/Punch/BMP-S1003861");
			 	 // driver.findElement(By.xpath("//*[@id=\"Color_1\"]/a")).click();
				 //driver.findElement(By.xpath("//*[@id=\"Size_1\"]/a")).click();
				 
				 /*Adding QTY 2 */
				 
				 driver.findElement(By.id("QtyAdd")).click();
				 RemoveHeader();
				 ViewScreenshot();
				 driver.findElement(By.xpath("//*[@id=\"addtocartnew\"]/span[2]/a")).click();
				  
					///////* Navigation to product seller 2 *////////////

				 driver.navigate().to("https://www.sportalook.com/products/Shirt-for-MensNewF451/Beige/BMP-S1758847");
				 driver.findElement(By.id("QtyAdd")).click();
				   
				 //////////*pdp page screenshpt  *///////////
				 RemoveHeader();
				 ViewScreenshot();
				 
				 driver.findElement(By.xpath("//*[@id=\"addtocartnew\"]/span[2]/a")).click();
				 
				 driver.navigate().to("https://www.sportalook.com/shoppingcart");
				   
			     //////////*pdp page screenshpt  *///////////
				  RemoveHeader();
				  ViewScreenshot();

				  driver.findElement(By.className("button_01")).click();
				  driver.findElement(By.className("btncontinue-nd")).click();
				  
				  /////////////Finalpage/////////
				  
				  Thread.sleep(5000);
		
				  
				 driver.findElement(By.id("cod_mop")).click();
				 Thread.sleep(5000);
				   //////////*pdp page screenshpt  *///////////
//				   RemoveHeader();
//				   ViewScreenshot();
				   
				   
				   driver.findElement(By.id("btnplaceorder")).click();
				   
			       WebElement OTP =  driver.findElement(By.id("txtcodnumber"));
				   OTP.sendKeys("4582");
				 
				   driver.findElement(By.id("btncodsubmit")).click();
			       ///*pdp page screenshpt  *///////////
				   Thread.sleep(3000);

					JavascriptExecutor js1 = (JavascriptExecutor) driver;
			        js1.executeScript("window.scrollBy(0,800)");
				   
			        ViewScreenshot();

				//   SellerLogin obj= new SellerLogin();
				//   obj.SellerLogin();
			
			    }


			@AfterClass
			public void tearDown() throws InterruptedException
			
			{
		        Thread.sleep(6000);
				//driver.quit();
			}

		}

		////////////////////////////////////////////////////////
		

		   int  n = 0;
		   public int  FullScreenshot() throws IOException
		
		
		    {
			  
			  n++;
			  String pg =driver.getTitle();
			  Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(60)).takeScreenshot(driver);
	          ImageIO.write(fpScreenshot.getImage(),"jpeg",new File("C://Users//cstechmk02//Desktop//Vedson//OrderCase1//"+ pg+ +n+".jpeg"));
	          return n;
	          
	    	}
		////////////////////////////////////////////
		
		    int j=0;
		    public int ViewScreenshot()
		
	     	{
			
			   j++;
			   String str= driver.getTitle();
	           String  s= str.substring(0, Math.min(str.length(), 18));
	           
	           File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	   	        
	   	        try {
	   	            FileUtils.copyFile(screenshot, new File("C://Users//cstechmk02//Desktop//Vedson//OrderCase1//"+j+".jpeg"));
	   	            
	   	        } catch (IOException e) {
	   	            System.out.println(e.getMessage());
	   	        }
				return j;
	           }
		
		
	           ///////////////////////////////////////////////
		 public void RemoveHeader()
		
		   {
			 JavascriptExecutor js = (JavascriptExecutor) driver;
	         js.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");
			
		  }
		
	}

	
