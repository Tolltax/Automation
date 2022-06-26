package com.hokosoko.testCases;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class MobileRESPONSIVE {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		int i,j;
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Webdriver//chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Vedson
        driver.get("https://hokosoko.com/sitemap.xml");
        
     
        
        //mentioned size of browser 
		
		int width = 1024;              
        int height = 768;
		Dimension dimension = new Dimension(width,height);
		
		
		
		driver.manage().window().setSize(dimension);
		
		
		
		
		List<WebElement> links =driver.findElements(By.tagName("loc"));
		int linksCount = links.size();
		
		System.out.println("Total No of link available  Hokosoko  Store: "  +linksCount);
		
		String n [] = new String[linksCount]; 
		
		
		// intialization
		
		
		 
		for(i=0; i<linksCount;i++)  {
		
		
			n[i] = links.get(i).getAttribute("innerHTML");
			       //System.out.println(n[i]);
	        
			    }
		
		
		
			for (i=0;i < linksCount ;i++) {
			
			
                driver.navigate().to(n[i]);
                Thread.sleep(3000);
                
                // If header is fixed we can manage this thru Javascript below code written
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("document.getElementById('fixedElement_relative').setAttribute('class', 'hide')");
                
                
               
                
//                WebDriverWait waiter = new WebDriverWait(driver, 3000);
//                WebElement s= waiter.until(ExpectedConditions.presenceOfElementLocated(By.id("pagesize_ddl")));
                 //return driver.findElement("pagesize_ddl");
                
                
               /////////////////////////// Page Open  with all modification ///////////////////////
                
                
               Boolean isPresent= driver.findElements(By.id("pagesize_ddl")).size()>0; 
               
               
               if (isPresent == true)  // true
            	   
               {
            	   
            	   WebElement s =driver.findElement(By.id("pagesize_ddl"));
                   String p=  s.getAttribute("innerHTML");
            	   
            	     if(p.equals("Total <b>0</b> Products."))
            	     
            	        {
            	    	 
            	    	   System.out.println("product no associted with list " + driver.getCurrentUrl());
            	    	 
            	        }
            	     
            	     
            	            else 
            	     
            	               {
            	    	 
            	    	          Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
    	    	                  ImageIO.write(fpScreenshot.getImage(),"PNG",new File("C://Users//cstechmk02//Desktop//Vedson//1080by1080//"+ i+".png"));
            	    	 
                        	     }
            	     
            	     
               } 
               
               
               else 
               
               {
            	   
            	   
            	     Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
	    	         ImageIO.write(fpScreenshot.getImage(),"PNG",new File("C://Users//cstechmk02//Desktop//Vedson//1080by1080//"+ i+".png"));
            	   
            	   
               }
               
               
//               WebElement s =driver.findElement(By.id("pagesize_ddl"));
//               String p=  s.getAttribute("innerHTML");
//               
               
               
               
//               
//               if(isPresent == true ||   ) 
//               
//               {  
//            	   
//            	   
//            	   
//     	             Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10)).takeScreenshot(driver);
//	    	         ImageIO.write(fpScreenshot.getImage(),"PNG",new File("C://Users//cstechmk02//Desktop//Vedson//1080by1080//"+ i+".png"));
//	    	         
//	    	         
//	    	            
//            	   
//            	   
//            	      if(p.equals("Total <b>0</b> Products.")) 
//            	      
//            	      
//            	           {
//                   	
//                  	
//                   	
//            	        
//                           }
//            	   
            	   
            	   
               }
               
              
               
       }
		
	}
                
	    
	
