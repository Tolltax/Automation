package member;
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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class OrdrCase1 extends SellerLogin  {

	WebDriver driver;

	public class OrderCase1 {

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
			
			
			driver.get("http://vedson.cstechns.com/login");
			
			driver.findElement(By.id("left_txtemail")).sendKeys("sonu@cstech.in");
			driver.findElement(By.id("left_txtpwd")).sendKeys("123456");
			
			////////* Calling Screenshot methods login page *///////////

			 RemoveHeader();
			 FullScreenshot();
			 
			driver.findElement(By.id("signin_btnlogin")).click();
			Thread.sleep(3000);
			 
			///////* Navigation to product seller 1 *////////////
			 driver.navigate().to("http://vedson.cstechns.com/products/Bagpackwildcraft/Orange/BMP-S1344649#.YRgN2ogzbIU");
			 driver.findElement(By.xpath("//*[@id=\"Color_1\"]/a")).click();
			 driver.findElement(By.xpath("//*[@id=\"Size_1\"]/a")).click();
			 
			 /*pdp page screenshpt  */
			 RemoveHeader();
			 ViewScreenshot();
			 
			 /*Adding QTY 2 */
			 
			 driver.findElement(By.id("QtyAdd")).click();
			 driver.findElement(By.xpath("//*[@id=\"addtocartnew\"]/span[2]/a")).click();
			  

			 driver.navigate().to("http://vedson.cstechns.com/products/Babymosquitonetwithpadandpillow/Light%20Blue/BMP-S1366502");
			 driver.findElement(By.id("QtyAdd")).click();
			   
			 //////////*pdp page screenshpt  *///////////
			 RemoveHeader();
			 ViewScreenshot();
			 
			 driver.findElement(By.xpath("//*[@id=\"addtocartnew\"]/span[2]/a")).click();
			 driver.navigate().to("http://vedson.cstechns.com/shoppingcart");
			   
		     //////////*pdp page screenshpt  *///////////
			  RemoveHeader();
			  ViewScreenshot();
			   
			  driver.findElement(By.className("button_01")).click();
			  driver.findElement(By.className("btncontinue-nd")).click();
			  driver.findElement(By.id("coddiv_heading")).click();
			   
			   //////////*pdp page screenshpt  *///////////
			   RemoveHeader();
			   FullScreenshot();
			   
			   Thread.sleep(3000);
			   driver.findElement(By.id("btnplaceorder")).click();
			   
		       WebElement OTP =  driver.findElement(By.id("txtcodnumber"));
			   OTP.sendKeys("4582");
			 
			   driver.findElement(By.id("btncodsubmit")).click();
		       ///*pdp page screenshpt  *///////////
			   Thread.sleep(3000);

				JavascriptExecutor js1 = (JavascriptExecutor) driver;
		        js1.executeScript("window.scrollBy(0,800)");
			   
		        ViewScreenshot();
			   
			   
			   
			   
			   SellerLogin obj= new SellerLogin();
			   obj.SellerLogin();
		
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
