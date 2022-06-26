package member;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class SellerLogin  {

	WebDriver driver;

	  @BeforeTest 
	  public void setup() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+
	  "//Driver//chromedriver.exe"); driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  }

	@Test(priority=2)
	public void SellerLogin() throws InterruptedException, IOException

	{

		driver.get("http://sellervedson.cstechns.com/login");
		driver.findElement(By.id("left_txtemail")).sendKeys("sonu@cstech.in");
		driver.findElement(By.id("left_txtpwd")).sendKeys("123456");
		driver.findElement(By.id("signin_btnlogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/nav/div[1]/ul/li[3]/a")).click();
		
		ViewScreenshot();
		
		driver.findElement(By.xpath("//*[@id=\"order_grid_order\"]/div/div[2]/div[9]/a")).click();
		
		Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        
        WebElement testDropDown = driver.findElement(By.id("orderstatustype"));  
        
        Select dropdown = new Select(testDropDown);  
        dropdown.selectByValue("C"); 
		
		driver.findElement(By.id("txtshippingheight")).sendKeys("12");
		driver.findElement(By.id("txtpackagelength")).sendKeys("12");
		driver.findElement(By.id("txtpackagewidth")).sendKeys("12");
		
		
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,1000)");
        FullScreenshot1();
        
		driver.findElement(By.partialLinkText("Click here for AWB number")).click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		driver.findElement(By.linkText("Submit")).click();
		
		driver.findElement(By.xpath("//*[@id=\"order_grid_order\"]/div/div[2]/div[9]/a[1]")).click();
		Thread.sleep(5000);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,1000)");
        
        driver.findElement(By.id("manifestli")).click();
        
        driver.findElement(By.id("filetomenfest")).sendKeys("C:\\Users\\cstechmk02\\Pictures\\bridge.jpg");
        Thread.sleep(3000);
        driver.findElement(By.id("btn_ship")).click();
        
        
        driver.findElement(By.className("sa-confirm-button-container")).click();
        
        
        driver.findElement(By.xpath("//*[@id=\"order_grid_order\"]/div/div[2]/div[9]/a[3]")).click();
        
        
        
        
		
		//*[@id="order_grid_order"]/div/div[2]/div[9]/a[1]
		

	}

	@AfterTest
	public void TearDown()

	{

		System.out.println("pass");

	}

       int  n = 10;
       public int  FullScreenshot1() throws IOException

     {
	  
	  n++;
	  String pg =driver.getTitle();
	  Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(60)).takeScreenshot(driver);
     ImageIO.write(fpScreenshot.getImage(),"jpeg",new File("C://Users//cstechmk02//Desktop//Vedson//OrderCase1//"+ pg+ +n+".jpeg"));
     return n;
   
	 }
       

	    int j=7;
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
       
       
       
}