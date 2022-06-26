package SharafDG_BrandPanel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.reactivex.rxjava3.functions.Action;

public class BrandRegistration{
	
	WebDriver driver;
	
	@BeforeTest
	public void Setup() throws InterruptedException

	
	{
		
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//SDriver//chromedriver.exe");
 
        
        driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://siteadminsharafdgv1.cstechns.com/");

	}
		
		/* Verifying login page */


		  @Test(priority =1)
		  public void BrandLoginPageOpen()
		  
	     	{
		      WebElement Signup = driver.findElement(By.xpath("//*[@class='tab-pane fade active in']/h3"));
		      String expectedLogin = Signup.getAttribute("innerText");
     	      String ActualLogin= "Sign in with your ID";
		      Assert.assertEquals(expectedLogin , ActualLogin);
		      System.out.println("Admin Login page lauched");
		      
	     	}
		  
		  
		  
		  /* Verifying dashboard page */
		   
		   @Test(priority =2)  
		   public void BrandLoggedSuccessful() 
		   
 
		    {
		      
		      driver.findElement(By.id("txtLogin")).sendKeys("sharafdg@cstech.in");
		      driver.findElement(By.id("txtPassword")).sendKeys("45824582");
		      driver.findElement(By.id("btnSubmit")).click();
		      WebElement Login =   driver.findElement(By.xpath("//*[@class='welcome']"));
		      String loginpage = Login.getAttribute("innerText");
		      String se= "Welcome";
		      Assert.assertEquals(loginpage, se);
		      System.out.println("Admin login successful");
		    
          
		   }   
		      

	
	
	        @Test(priority =3)
	        public void BrandRegistrationPageOpen() {
	        	
	        	
		    WebElement we= driver.findElement(By.xpath("//*[@id='liCatalog']/a/text()"));
		    Actions action = new Actions(driver);
		    action.moveToElement(we).build().perform();
		    System.out.println("pass");
		    
		    driver.findElement(By.xpath("//*[@id=\"liBrand\"]/a/text()"));
		  
		    
//			driver.findElement(By.xpath("*//button[@class='confirm']")).click();
//			driver.findElement(By.xpath("//div[@id='header-wrap']//div[@id='fixedElement_fixed']//div[@id='head']//div[@id='container']//div[@id='right']//div[@id='cart']//a[@href='shoppingcart']//div[@title='Cart']//span[@class='cart_item_count']")).click();
//			driver.findElement(By.linkText("Proceed to Checkout")).click();
		    
		    
			   
		
	}
	
	
	
	
	public void TearDown() throws InterruptedException
	
	
	{
		
		Thread.sleep(9000);
		
	}
		
		
		
		
	
	
}
