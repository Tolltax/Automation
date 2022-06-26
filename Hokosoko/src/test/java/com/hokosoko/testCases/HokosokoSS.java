package com.hokosoko.testCases;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class HokosokoSS {

	public static void main(String[] args) throws IOException, InterruptedException {
			
				int i,j;
				
				
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Webdriver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
        driver.get("https://hokosoko.com/sitemap.xml");
		        
		        
		        /*      Desktop / Laptop
		                1366 X 768
		                1920 X 1080----
		                1440 X 900
		                1680 X 1050

		                Mobile
		                240 X 274
		                320 X 480
		                320 X 568
		                320 X 570
		                320 X 640
		                320 X 712
		                360 X 480
		                375 X 667

		                Tablet 
		                
		                iPad Pro 1024 X 1366
		                iPad 768 X 1024
		                
		               
		         */
		        
		        
		 //mentioned size of browser 
				
		 int width = 1024;              
		 int height = 768;
	     Dimension dimension = new Dimension(width,height);
		 driver.manage().window().setSize(dimension);
				
				
			List<WebElement> links =driver.findElements(By.tagName("loc"));
			int linksCount = links.size();
				
			System.out.println("Total No of link available  Hokosoko  Store: "  +linksCount);
			
			String n [] = new String[linksCount]; 
				
				
				
			for(i=0; i<linksCount;i++)  
			
			{
				n[i] = links.get(i).getAttribute("innerHTML");
				//System.out.println(n[i]);
				
			        
		    }
				
			 for (i=0;i < linksCount ;i++) 
			 
			   {
				 
				 System.out.println("link get2");
				 System.out.println(n[i]);
				 driver.navigate().to(n[i]);
		          
		          Thread.sleep(10);
 		          Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
		    	  ImageIO.write(fpScreenshot.getImage(),"jpeg",new File("C://Users//cstechmk02//Desktop//Hokosoko//1024 X 768//"+ i+".jpeg"));
		            	    	 
		         }
		            	     
		            	     
	}		          
		            	   
}	            
		


	
