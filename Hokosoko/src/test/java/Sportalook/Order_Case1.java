package Sportalook;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Order_Case1 {



	public static void main(String[] args) throws InterruptedException {
		
		
	       System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Webdriver//chromedriver.exe");

	       ChromeDriver driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.get("https://www.sportalook.com/login");
		   
		   
		   /* Login */
		   
		   driver.findElement(By.id("left_txtemail")).sendKeys("sonu@cstech.in");
		   driver.findElement(By.id("left_txtpwd")).sendKeys("12345");
		   driver.findElement(By.id("signin_btnlogin")).click();
		   Thread.sleep(2000);
		   
		   
		   
		   driver.navigate().to("https://www.sportalook.com/products/PunchTop63B0/Punch/BMP-S1003861");
		   //driver.findElement(By.id("Color_1")).click();
		   Thread.sleep(2000);
		   //driver.findElement(By.id("Size_1")).click();
		   driver.findElement(By.id("QtyAdd")).click();
		   driver.findElement(By.xpath("//*[@id=\"addtocartnew\"]/span[2]/a")).click();
		
		   /* Product Navigation  */
		   
		   driver.navigate().to("https://www.sportalook.com/products/Shirt-for-MensNew/Beige/BMP-S1755281");
		  // driver.findElement(By.id("Color_0")).click();
		   //Thread.sleep(2000);
		   //driver.findElement(By.id("Size_1")).click();
		   driver.findElement(By.id("QtyAdd")).click();
		   driver.findElement(By.xpath("//*[@id=\"addtocartnew\"]/span[2]/a")).click();
		   
		   
		   
		   driver.findElement(By.className("sa-confirm-button-container")).click();
		   driver.navigate().to("https://www.sportalook.com/shoppingcart");
		   driver.findElement(By.xpath("//*[@class= 'button_01']")).click();
		   driver.findElement(By.className("btncontinue-nd")).click();
		   //driver.findElement(By.xpath("//*[@id='cod_mop']")).click();
		   
		   System.out.println("PASS1");
		
		   WebElement element = driver.findElement(By.xpath("//*[@id='btnplaceorder']"));

		   
		   System.out.println("PASS2");
		   Actions actions = new Actions(driver);

		   actions.moveToElement(element).click().perform();
		   
		  //driver.findElement(By.xpath("//*[@id='btnplaceorder']")).click();
		
		   
		   driver.findElement(By.id("txtcodnumber")).sendKeys("4582");
		   
		   driver.findElement(By.id("btncodsubmit")).sendKeys("4582");
		   
		   
		   
		  
		  
	}

}


