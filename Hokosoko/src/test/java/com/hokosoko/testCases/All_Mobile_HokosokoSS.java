package com.hokosoko.testCases;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class All_Mobile_HokosokoSS {

	public static void main(String[] args) throws IOException, InterruptedException {
		
					
				int i,j;
						
		       System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Webdriver//chromedriver.exe");
		        
				//IE
				//System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//Webdriver//IEDriverServer.exe");
		        
		        
		        
		       // Instantiate a IEDriver class. 
		       // WebDriver driver=new InternetExplorerDriver();
		        
				 ChromeDriver driver=new ChromeDriver();
			     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
			     /*-----Login -------*/
			     driver.get("https://hokosoko.com/");
			     driver.findElement(By.linkText("Sign In")).click();
			     driver.findElement(By.id("contactMobileField")).sendKeys("8287729020");
			     driver.findElement(By.id("btn_get_otp1")).click();
			     Thread.sleep(3000);
			     Alert alert = driver.switchTo().alert();
			     alert.accept();

			     driver.findElement(By.id("right_txtOTP1")).sendKeys("4582");
			     driver.findElement(By.xpath("//*[@id='ampTabs']/amp-selector/div[2]/div/form/fieldset/div[5]/input")).click();
			     
			     
			    // String n [] = new String[] {"https://hokosoko.com/","https://hokosoko.com/list/all","https://hokosoko.com/dp/Cortina-spandex-Elastic-Royal-Blue-Chair-Cover/Standard/BMP-S1135645"};
			     
		        
	            int[] width =   new int[]   {800,  1024, 768 , 1280, 1366 , 1024,  1366, 1920, 1440, 1680, 1920, 2000, 2048, 2393, 2560, 2560, 3440, 5120 };
	            
	            int[] height = new int []   {1280, 1366, 1024, 800,  1024,  768,   768,  1080,  900, 1050, 1200, 2000, 1152, 1346, 1080,  1440, 1440, 1440  };

	            String str= driver.getTitle();
  	            String  s= str.substring(0, Math.min(str.length(), 18));

  	            
			     for(i = 0 ; i<width.length;i++)	 
				
		             	{	        
			    	                 driver.navigate().to("https://hokosoko.com/");
			    	                 Thread.sleep(3000);
			    	  
			                          Dimension dimension = new Dimension( width[i],height[i]);
			                          driver.manage().window().setSize(dimension);
			     
		 		                     Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
				                     ImageIO.write(fpScreenshot.getImage(),"jpeg",new File("C://Users//cstechmk02//Desktop//Hokosko_Screenshot//1_home_page//"+ width[i] +"X" +height[i]+ ".jpeg"));
				
			                }		
			
  	                 
				            	   
			 driver.close(); 

	}
	
}	

		
		
